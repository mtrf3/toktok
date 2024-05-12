package com.bytedance.realx.base;

import X.V0N;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes12.dex */
public class RXLogging {
    public static Severity loggableSeverity = null;
    public static volatile boolean loggingEnabled = true;

    public static native void nativeEnableLogThreads();

    public static native void nativeEnableLogTimeStamps();

    public static native void nativeEnableLogToDebugOutput(int i);

    public static native void nativeLog(int i, String str, String str2);

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    /* loaded from: classes12.dex */
    public enum Severity {
        LS_DEBUG,
        LS_TRACE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE;

        public static Severity valueOf(String str) {
            return (Severity) V0N.LJJJ(Severity.class, str);
        }
    }

    /* loaded from: classes2.dex */
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(FileUtils.BUFFER_SIZE),
        TRACE_ALL(65535);

        public final int level;

        public static TraceLevel valueOf(String str) {
            return (TraceLevel) V0N.LJJJ(TraceLevel.class, str);
        }

        TraceLevel(int i) {
            this.level = i;
        }
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (RXLogging.class) {
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void d(String str, String str2) {
        log(Severity.LS_DEBUG, str, str2);
    }

    public static void e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static void i(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void t(String str, String str2) {
        log(Severity.LS_TRACE, str, str2);
    }

    public static void w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    public static void log(Severity severity, String str, String str2) {
        if (str != null && str2 != null) {
            if (loggingEnabled) {
                nativeLog(severity.ordinal(), str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Logging tag or message may not be null.");
    }

    public static void w(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }
}
