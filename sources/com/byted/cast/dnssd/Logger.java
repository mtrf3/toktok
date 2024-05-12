package com.byted.cast.dnssd;

import X.X1D;
import com.byted.cast.common.discovery.IDnssdLogger;

/* loaded from: classes29.dex */
public class Logger {
    public static int LOG_LEVEL = 4;
    public static String TAG = "DNSSD";
    public static IDnssdLogger sLogger;

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

    public static void setLogger(IDnssdLogger iDnssdLogger) {
        sLogger = iDnssdLogger;
    }

    public static void d(String str, String str2) {
        IDnssdLogger iDnssdLogger;
        if (LOG_LEVEL <= 3 && (iDnssdLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iDnssdLogger.d(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void e(String str, String str2) {
        IDnssdLogger iDnssdLogger;
        if (LOG_LEVEL <= 6 && (iDnssdLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iDnssdLogger.e(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void i(String str, String str2) {
        IDnssdLogger iDnssdLogger;
        if (LOG_LEVEL <= 4 && (iDnssdLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iDnssdLogger.i(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void v(String str, String str2) {
        IDnssdLogger iDnssdLogger;
        if (LOG_LEVEL <= 2 && (iDnssdLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iDnssdLogger.v(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void w(String str, String str2) {
        IDnssdLogger iDnssdLogger;
        if (LOG_LEVEL <= 5 && (iDnssdLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iDnssdLogger.w(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void logger(int i, String str, String str2) {
        switch (i) {
            case 2:
            case 7:
                v(str, str2);
                return;
            case 3:
                d(str, str2);
                return;
            case 4:
                i(str, str2);
                return;
            case 5:
                w(str, str2);
                return;
            case 6:
                e(str, str2);
                return;
            default:
                return;
        }
    }
}
