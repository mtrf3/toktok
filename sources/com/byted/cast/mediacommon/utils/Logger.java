package com.byted.cast.mediacommon.utils;

import X.X1D;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.ILogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes29.dex */
public class Logger {
    public static int LOG_LEVEL = 4;
    public static String TAG = "MediaCapture";
    public static ILogger sLogger;
    public static final Object mLoggerLock = new Object();
    public static ArrayList<CastLogger> CastLoggers = new ArrayList<>();

    public static void addLogger(CastLogger castLogger) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() == castLogger) {
                        return;
                    }
                }
                CastLoggers.add(castLogger);
            }
        }
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

    public static void removeLogger(CastLogger castLogger) {
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    CastLogger next = it.next();
                    if (next == castLogger) {
                        CastLoggers.remove(next);
                        return;
                    }
                }
            }
        }
    }

    public static void setLogLevel(int i) {
        LOG_LEVEL = i;
    }

    public static void setLogger(ILogger iLogger) {
        sLogger = iLogger;
    }

    public static void d(String str, String str2) {
        if (LOG_LEVEL > 3) {
            return;
        }
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().d(TAG, str2);
                }
            }
        }
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onDebug(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void e(String str, String str2) {
        if (LOG_LEVEL > 6) {
            return;
        }
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(TAG, str2);
                }
            }
        }
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onError(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void i(String str, String str2) {
        if (LOG_LEVEL > 4) {
            return;
        }
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().i(TAG, str2);
                }
            }
        }
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onInfo(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void v(String str, String str2) {
        if (LOG_LEVEL > 2) {
            return;
        }
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().v(TAG, str2);
                }
            }
        }
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onVerbose(str3, X1D.LIZIZ(LIZ));
        }
    }

    public static void w(String str, String str2) {
        if (LOG_LEVEL > 5) {
            return;
        }
        synchronized (mLoggerLock) {
            ArrayList<CastLogger> arrayList = CastLoggers;
            if (arrayList != null) {
                Iterator<CastLogger> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().w(TAG, str2);
                }
            }
        }
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            String str3 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(prefix(str));
            LIZ.append(str2);
            iLogger.onWarn(str3, X1D.LIZIZ(LIZ));
        }
    }
}
