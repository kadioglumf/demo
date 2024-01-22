package com.example.samples;

import com.kadioglumf.core.ConvertToLocaleText;
import com.kadioglumf.core.exception.BusinessException;
import com.kadioglumf.export.dto.ExportType;
import com.kadioglumf.export.service.ExportService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DemoController {

    @Value("${etcd-test-field}")
    private String test;

    @Autowired private final ExportService exportService;
    @Autowired private final ConvertToLocaleText convertToLocaleText;

    @PostMapping("/export")
    public ModelAndView exportDemo() {
        List<DemoResponse> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            DemoResponse response = new DemoResponse();
            response.setDate(ZonedDateTime.now().plusDays(i));
            response.setPrice(BigDecimal.valueOf(random.nextLong(0, 100000)));
            list.add(response);
        }
        return exportService.exportToGenericFile(list,
                convertToLocaleText.convertToText("export.fileName",
                        new String[] {DateTimeFormatter.ofPattern("ddMMyyyy").format(ZonedDateTime.now())},"DefaultFile"),
                ExportType.XLSX, convertToLocaleText.convertToText("export.sheetName" ,null, "DefaultFile"));

    }

    @GetMapping("/exception")
    public ResponseEntity<?> exceptionDemo() {
        throw new BusinessException("SAM1111");
    }

    @GetMapping("/etcd")
    public ResponseEntity<Void> etcdTest() {
        System.out.println("etcd-test: " + test);
        return ResponseEntity.ok().build();
    }
}
