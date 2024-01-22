package com.example.samples;

public class ExportDataFormatConstants {

    private ExportDataFormatConstants() {

    }

    public static final String EXPORT_DEFAULT_DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm";
    public static final String EXPORT_DEFAULT_DATE_FORMAT = "dd.MM.yyyy";
    public static final String EXPORT_ON_MONTH_YEAR_FORMAT = "MM.yyyy";
    public static final String EXPORT_ON_MONTH_FORMAT = "MM-yyyy";
    public static final String EXPORT_ON_MONTH_YEAR_SEPERATED_FORMAT = "MMMM-yyyy";
    public static final String EXPORT_SLASH_DATE_FORMAT = "dd/MM/yyyy";
    public static final String EXPORT_SLASH_DATE_FORMAT_ONLY_MONTH = "MM/yyyy";

    /**
     * Excel exportlarda @ExportAware anotasyonu için varsayılan 2 ondalık basamaklı sayı gösterim
     * veri formatı.
     */
    public static final String EXPORT_DEFAULT_2_DECIMALS_NUMBER_FORMAT = "#,#0.00";

    /**
     * Excel exportlarda @ExportAware anotasyonu için varsayılan 3 ondalık basamaklı sayı gösterim
     * veri formatı.
     */
    public static final String EXPORT_DEFAULT_3_DECIMALS_NUMBER_FORMAT = "#,#0.000";

    /**
     * Excel exportlarda @ExportAware anotasyonu için varsayılan 4 ondalık basamaklı sayı gösterim
     * veri formatı.
     */
    public static final String EXPORT_DEFAULT_4_DECIMALS_NUMBER_FORMAT = "#,#0.0000";

    public static final String EXPORT_DEFAULT_8_DECIMALS_NUMBER_FORMAT = "#,#0.00000000";

    public static final String EXPORT_DEFAULT_5_DECIMALS_NUMBER_FORMAT = "#,#0.00000";

    /**
     * Excel exportlarda @ExportAware anotasyonu için varsayılan ondalık basamaksız sayı gösterim veri
     * formatı.
     */
    public static final String EXPORT_DEFAULT_WITHOUT_DECIMALS_NUMBER_FORMAT = "#,#0";
}
