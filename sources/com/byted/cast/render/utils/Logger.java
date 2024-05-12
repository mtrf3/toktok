package com.byted.cast.render.utils;

import X.X1D;

/* loaded from: classes29.dex */
public class Logger {
    public static int LOG_LEVEL = 2;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void i(String str, String str2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static String prefix(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(str);
        LIZ.append(":");
        return X1D.LIZIZ(LIZ);
    }

    public static void setLogLevel(int i) {
        LOG_LEVEL = i;
    }
}
