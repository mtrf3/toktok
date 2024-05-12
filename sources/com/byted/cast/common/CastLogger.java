package com.byted.cast.common;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ILogger;

/* loaded from: classes29.dex */
public class CastLogger {
    public static int NO_LOG = 10;
    public static String TAG = "ByteCast";
    public static volatile CastLogger sInstance;
    public int logLevel = 3;
    public ILogger logger;
    public ContextManager.CastContext mCastContext;

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

    public static CastLogger getInstance() {
        if (sInstance == null) {
            synchronized (CastLogger.class) {
                if (sInstance == null) {
                    sInstance = new CastLogger(null);
                }
            }
        }
        return sInstance;
    }

    public CastLogger(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
    }

    public static CastLogger createInstance(ContextManager.CastContext castContext) {
        if (castContext == null) {
            return getInstance();
        }
        return new CastLogger(castContext);
    }

    private String prefix(String str) {
        String str2;
        int indexOf;
        String projectId;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(str);
            LIZ.append(":");
            str2 = X1D.LIZIZ(LIZ);
        }
        ContextManager.CastContext castContext = this.mCastContext;
        if (castContext != null) {
            if (TextUtils.isEmpty(castContext.getProjectId())) {
                indexOf = -2;
            } else {
                indexOf = this.mCastContext.getProjectId().indexOf("-");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            if (indexOf != -2) {
                StringBuilder LIZ3 = X1D.LIZ();
                if (indexOf > 0) {
                    projectId = this.mCastContext.getProjectId().substring(0, indexOf);
                } else {
                    projectId = this.mCastContext.getProjectId();
                }
                LIZ3.append(projectId);
                LIZ3.append(":");
                str3 = X1D.LIZIZ(LIZ3);
            }
            LIZ2.append(str3);
            return X1D.LIZIZ(LIZ2);
        }
        return str2;
    }

    public void d(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 3 && (iLogger = this.logger) != null) {
            iLogger.onDebug(TAG, LIZIZ);
        }
    }

    public void e(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 6 && (iLogger = this.logger) != null) {
            iLogger.onError(TAG, LIZIZ);
        }
    }

    public void i(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 4 && (iLogger = this.logger) != null) {
            iLogger.onInfo(TAG, LIZIZ);
        }
    }

    public void setEnable(boolean z) {
        if (z) {
            setLogLevel(this.logLevel);
        } else {
            setLogLevel(NO_LOG);
        }
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger;
    }

    public void v(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 2 && (iLogger = this.logger) != null) {
            iLogger.onVerbose(TAG, LIZIZ);
        }
    }

    public void w(String str) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(TAG));
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 5 && (iLogger = this.logger) != null) {
            iLogger.onWarn(TAG, LIZIZ);
        }
    }

    public void d(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 3 && (iLogger = this.logger) != null) {
            iLogger.onDebug(TAG, LIZIZ);
        }
    }

    public void e(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 6 && (iLogger = this.logger) != null) {
            iLogger.onError(TAG, LIZIZ);
        }
    }

    public void i(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 4 && (iLogger = this.logger) != null) {
            iLogger.onInfo(TAG, LIZIZ);
        }
    }

    public void v(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 2 && (iLogger = this.logger) != null) {
            iLogger.onVerbose(TAG, LIZIZ);
        }
    }

    public void w(String str, String str2) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 5 && (iLogger = this.logger) != null) {
            iLogger.onWarn(TAG, LIZIZ);
        }
    }

    public void e(String str, String str2, Throwable th) {
        ILogger iLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(prefix(str));
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LogDumper.d(TAG, LIZIZ);
        if (this.logLevel <= 6 && (iLogger = this.logger) != null) {
            iLogger.onError(TAG, LIZIZ, th);
        }
    }

    public static void logger(String str, int i, String str2, String str3) {
        ContextManager.CastContext castContext;
        if (TextUtils.equals("bytelink_sink", str)) {
            castContext = null;
        } else {
            castContext = new ContextManager.CastContext(str);
        }
        CastLogger logger = ContextManager.getLogger(castContext);
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
