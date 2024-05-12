package com.byted.cast.sdk.log;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.api.ILogger;

/* loaded from: classes29.dex */
public class Logger {
    public static String TAG = "BYTELINK";
    public int LOG_LEVEL = 4;
    public ILogger mLogger;
    public String mMirrorId;

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

    public Logger(String str) {
        this.mMirrorId = str;
    }

    private String prefix(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mMirrorId);
        LIZ.append(":");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append(str);
            LIZ2.append(":");
            return X1D.LIZIZ(LIZ2);
        }
        return LIZIZ;
    }

    public void setLogLevel(int i) {
        this.LOG_LEVEL = i;
    }

    public void setLogger(ILogger iLogger) {
        this.mLogger = iLogger;
    }

    public void d(String str, String str2) {
        if (this.LOG_LEVEL > 3) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ILogger iLogger = this.mLogger;
        if (iLogger != null) {
            iLogger.onDebug(TAG, LIZIZ);
        }
    }

    public void e(String str, String str2) {
        if (this.LOG_LEVEL > 6) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ILogger iLogger = this.mLogger;
        if (iLogger != null) {
            iLogger.onError(TAG, LIZIZ);
        }
    }

    public void i(String str, String str2) {
        if (this.LOG_LEVEL > 4) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ILogger iLogger = this.mLogger;
        if (iLogger != null) {
            iLogger.onInfo(TAG, LIZIZ);
        }
    }

    public void v(String str, String str2) {
        if (this.LOG_LEVEL > 2) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ILogger iLogger = this.mLogger;
        if (iLogger != null) {
            iLogger.onVerbose(TAG, LIZIZ);
        }
    }

    public void w(String str, String str2) {
        if (this.LOG_LEVEL > 5) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ILogger iLogger = this.mLogger;
        if (iLogger != null) {
            iLogger.onWarn(TAG, LIZIZ);
        }
    }

    public static void logger(String str, int i, String str2, String str3) {
        Logger logger = LoggerManager.getLogger(str);
        switch (transNativeLogLevelToJava(i)) {
            case 2:
            case 7:
                logger.v(str2, str3);
                return;
            case 3:
                logger.d(str2, str3);
                return;
            case 4:
                logger.i(str2, str3);
                return;
            case 5:
                logger.w(str2, str3);
                return;
            case 6:
                logger.e(str2, str3);
                return;
            default:
                return;
        }
    }
}
