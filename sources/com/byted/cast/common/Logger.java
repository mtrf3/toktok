package com.byted.cast.common;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.api.ILogger;

/* loaded from: classes29.dex */
public class Logger {
    public static int LOG_LEVEL = 3;
    public static int NO_LOG = 10;
    public static String TAG = "ByteCast";
    public static ILogger logger;

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

    public static int getLogLevel() {
        return LOG_LEVEL;
    }

    public static void d(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 3 && (iLogger = logger) != null) {
            iLogger.onDebug(TAG, LIZIZ);
        }
    }

    public static void e(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 6 && (iLogger = logger) != null) {
            iLogger.onError(TAG, LIZIZ);
        }
    }

    public static void i(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 4 && (iLogger = logger) != null) {
            iLogger.onInfo(TAG, LIZIZ);
        }
    }

    public static String prefix(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(str);
        LIZ.append(":");
        return X1D.LIZIZ(LIZ);
    }

    public static void setEnable(boolean z) {
        if (z) {
            setLogLevel(LOG_LEVEL);
        } else {
            setLogLevel(NO_LOG);
        }
    }

    public static void setLogLevel(int i) {
        LOG_LEVEL = i;
    }

    public static void setLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static void v(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 2 && (iLogger = logger) != null) {
            iLogger.onVerbose(TAG, LIZIZ);
        }
    }

    public static void w(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 5 && (iLogger = logger) != null) {
            iLogger.onWarn(TAG, LIZIZ);
        }
    }

    public static void d(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 3 && (iLogger = logger) != null) {
            iLogger.onDebug(TAG, LIZIZ);
        }
    }

    public static void e(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 6 && (iLogger = logger) != null) {
            iLogger.onError(TAG, LIZIZ);
        }
    }

    public static void i(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 4 && (iLogger = logger) != null) {
            iLogger.onInfo(TAG, LIZIZ);
        }
    }

    public static void v(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 2 && (iLogger = logger) != null) {
            iLogger.onVerbose(TAG, LIZIZ);
        }
    }

    public static void w(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 5 && (iLogger = logger) != null) {
            iLogger.onWarn(TAG, LIZIZ);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (LOG_LEVEL <= 6 && (iLogger = logger) != null) {
            iLogger.onError(TAG, LIZIZ, th);
        }
    }

    public static void logger(String str, int i, String str2, String str3) {
        switch (transNativeLogLevelToJava(i)) {
            case 2:
            case 7:
                v(str2, str3);
                return;
            case 3:
                d(str2, str3);
                return;
            case 4:
                i(str2, str3);
                return;
            case 5:
                w(str2, str3);
                return;
            case 6:
                e(str2, str3);
                return;
            default:
                return;
        }
    }
}
