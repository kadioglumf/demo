package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.kadioglumf.core.adapter.JsonZonedDateTimeDeserializer;
import com.kadioglumf.core.adapter.JsonZonedDateTimeSerializer;
import com.kadioglumf.export.annotation.*;
import com.kadioglumf.export.dto.BaseDto;
import lombok.Data;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class DemoResponse implements BaseDto {

    @JsonDeserialize(using = JsonZonedDateTimeDeserializer.class)
    @JsonSerialize(using = JsonZonedDateTimeSerializer.class)
    @ExportAware(columnOrder = 0,
            localeCode = "export.date",
            autoSizeColumn = true,
            dataFormat = ExportDataFormatConstants.EXPORT_DEFAULT_DATE_TIME_FORMAT)
    private ZonedDateTime date;

    @ExportAware(columnOrder = 1,
            localeCode = "export.price",
            autoSizeColumn = true,
            dataFormat = ExportDataFormatConstants.EXPORT_DEFAULT_2_DECIMALS_NUMBER_FORMAT)
    @ExcelStyle(headerStyle = {@ExcelCellStyle(
                    fillPattern = FillPatternType.SOLID_FOREGROUND,
                    font = {@ExcelFont(fontItalic = true)},
                    backgroundHexColor = "#3489eb")},
                cellStyle = {@ExcelCellStyle(
                        evenOdd = EvenOddEnum.EVEN,
                    fillPattern = FillPatternType.SOLID_FOREGROUND,
                    font = {@ExcelFont(fontItalic = true)},
                    backgroundHexColor = "#3489eb",
                    borderStyle = {@ExcelBorderStyle(borderStyle = BorderStyle.DASH_DOT, borders = BorderType.TOP)})})
    @ExcelSummary(summary = ExcelSummaryEnum.AVERAGE, style = {@ExcelCellStyle(font = @ExcelFont(fontBold = true, fontColor = "#3489eb"))})
    private BigDecimal price;
}
