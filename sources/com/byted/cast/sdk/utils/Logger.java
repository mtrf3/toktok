package com.byted.cast.sdk.utils;

import X.X1D;
import com.byted.cast.common.api.ILogger;

/* loaded from: classes29.dex */
public class Logger {
    public static int LOG_LEVEL = 4;
    public static String TAG = "BYTELINK";
    public static ILogger sLogger;

    public static int transNativeLogLevelToJava(int i) {
        if (i == -1) {
            return 7;
        }
        if (i == 0) {
            return 6;
        }
        if (i == 1) {
            return 5;
        }
        if (i != 3) {
            return i != 4 ? 4 : 2;
        }
        return 3;
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

    public static void setLogger(ILogger iLogger) {
        sLogger = iLogger;
    }

    public static void d(String str, String str2) {
        ILogger iLogger;
        if (LOG_LEVEL <= 3 && (iLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onDebug(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void e(String str, String str2) {
        ILogger iLogger;
        if (LOG_LEVEL <= 6 && (iLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onError(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void i(String str, String str2) {
        ILogger iLogger;
        if (LOG_LEVEL <= 4 && (iLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onInfo(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void v(String str, String str2) {
        ILogger iLogger;
        if (LOG_LEVEL <= 2 && (iLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onVerbose(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void w(String str, String str2) {
        ILogger iLogger;
        if (LOG_LEVEL <= 5 && (iLogger = sLogger) != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onWarn(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void logger(int i, String str, String str2) {
        switch (transNativeLogLevelToJava(i)) {
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
