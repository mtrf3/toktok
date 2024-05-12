package com.byted.cast.common;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes29.dex */
public class TimeUtils {
    public static final ThreadLocal<SimpleDateFormat> millisFormatter = new ThreadLocal<SimpleDateFormat>() { // from class: com.byted.cast.common.TimeUtils.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault());
        }
    };
    public static final ThreadLocal<SimpleDateFormat> millsFormatterWithUnderline = new ThreadLocal<SimpleDateFormat>() { // from class: com.byted.cast.common.TimeUtils.2
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS", Locale.getDefault());
        }
    };

    public static String getCurrentMillisTime() {
        SimpleDateFormat simpleDateFormat = millisFormatter.get();
        if (simpleDateFormat == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return simpleDateFormat.format(new java.util.Date(System.currentTimeMillis()));
    }

    public static String getCurrentMillisTimeWithUnderline() {
        SimpleDateFormat simpleDateFormat = millsFormatterWithUnderline.get();
        if (simpleDateFormat == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return simpleDateFormat.format(new java.util.Date(System.currentTimeMillis()));
    }
}
