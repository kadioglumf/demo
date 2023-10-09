package com.example.demo;

import com.kadioglumf.export.annotation.ExcelSummary;
import com.kadioglumf.export.annotation.ExcelSummaryEnum;
import com.kadioglumf.export.annotation.ExportAware;
import com.kadioglumf.export.dto.BaseDto;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class DemoResponse implements BaseDto {

    @ExportAware(columnOrder = 0,
            localeCode = "export.date",
            autoSizeColumn = true,
            dataFormat = ExportDataFormatConstants.EXPORT_DEFAULT_DATE_TIME_FORMAT)
    private ZonedDateTime date;

    @ExportAware(columnOrder = 1,
            localeCode = "export.price",
            autoSizeColumn = true,
            dataFormat = ExportDataFormatConstants.EXPORT_DEFAULT_2_DECIMALS_NUMBER_FORMAT)
    @ExcelSummary(summary = ExcelSummaryEnum.AVERAGE)
    private BigDecimal price;
}
