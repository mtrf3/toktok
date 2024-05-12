package com.ss.bytertc.engine.utils;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes33.dex */
public class LogUtil {
    public static AtomicReference<LoggerSink> sLoggerSink = new AtomicReference<>();
    public static String sDeviceID = null;
    public static LogLevel sLogLevel = LogLevel.LOG_LEVEL_INFO;
    public static String sLogDir = null;

    /* loaded from: classes33.dex */
    public interface LoggerSink {
        void onLoggerMessage(LogLevel logLevel, String str, Throwable th);
    }

    public static void setDebug(boolean z) {
    }

    public static LoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    /* loaded from: classes33.dex */
    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR;

        public static LogLevel valueOf(String str) {
            return (LogLevel) V0N.LJJJ(LogLevel.class, str);
        }
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJI(context, null));
        String str2 = File.separator;
        LIZ.append(str2);
        LIZ.append("RTCEngine");
        LIZ.append(str2);
        LIZ.append("Log");
        LIZ.append(str2);
        LIZ.append("logs");
        String LIZIZ = X1D.LIZIZ(LIZ);
        sLogDir = LIZIZ;
        return LIZIZ;
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogDir(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append("logs");
        sLogDir = X1D.LIZIZ(LIZ);
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLoggerSink(LoggerSink loggerSink) {
        if (loggerSink != null) {
            sLoggerSink.set(loggerSink);
            return;
        }
        AtomicReference<LoggerSink> atomicReference = sLoggerSink;
        LoggerSink loggerSink2 = getLoggerSink();
        while (!atomicReference.compareAndSet(loggerSink2, null) && atomicReference.get() == loggerSink2) {
        }
    }

    public static void d(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_DEBUG;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void e(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void i(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_INFO;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void w(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), th);
        }
    }

    public static void notifyLoggerSinks(LogLevel logLevel, String str, Throwable th) {
        LoggerSink loggerSink;
        if (sLoggerSink != null && (loggerSink = getLoggerSink()) != null) {
            loggerSink.onLoggerMessage(logLevel, str, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C16880lQ.LLLZ("[%s:%s]:%s", new Object[]{"ByteRTC", str, C16880lQ.LLLZ("[msg:%s]", new Object[]{str2})}), th);
        }
    }
}
