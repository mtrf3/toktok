package com.ss.ttlivestreamer.core.utils;

import X.C012403c;
import X.C06830Op;
import X.C16880lQ;
import X.Q7L;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.EarlyAVLog;
import defpackage.a1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class AVLog {
    public static boolean mDisableKibanaLogs;
    public static boolean mDisableLogFile;
    public static boolean mDisableLogIODevice;
    public static ILogFilter mLogConsoleFilter;
    public static ILogFilter mLogIODeviceFilter;
    public static ILogFilter mLogKibanaDeviceFilter;
    public static int mLogLevel;
    public static Map<String, RedunancyChecker> sRedundancyCheckerMap;

    /* loaded from: classes12.dex */
    public interface ILogFilter {
        void print(int i, String str, String str2, String str3, Throwable th);

        void print(int i, String str, String str2, Throwable th);
    }

    /* loaded from: classes12.dex */
    public static class RedunancyChecker {
        public long lastPrintTime;
        public int redundantCount;
    }

    static {
        int i;
        MediaEngineFactory.nativeSetupClassLoader();
        final EarlyAVLog.IEarlyLogPrint earlyLogPrint = EarlyAVLog.getEarlyLogPrint();
        if (earlyLogPrint != null) {
            mLogIODeviceFilter = new ILogFilter() { // from class: com.ss.ttlivestreamer.core.utils.AVLog.1
                @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
                public void print(int i2, String str, String str2, Throwable th) {
                    EarlyAVLog.IEarlyLogPrint.this.print(i2, str, str2, th);
                }

                @Override // com.ss.ttlivestreamer.core.utils.AVLog.ILogFilter
                public void print(int i2, String str, String str2, String str3, Throwable th) {
                    EarlyAVLog.IEarlyLogPrint.this.print(i2, str, a1.LJ(str2, " ", str3), th);
                }
            };
        }
        mDisableLogFile = false;
        mDisableLogIODevice = false;
        if (DebugLogUtils.isEnableDebugLog()) {
            i = 3;
        } else {
            i = 5;
        }
        mLogLevel = i;
        sRedundancyCheckerMap = new ConcurrentHashMap();
    }

    public static boolean isDisableLogFile() {
        boolean nativeIsDisableLogFile = Monitor.nativeIsDisableLogFile();
        mDisableLogFile = nativeIsDisableLogFile;
        return nativeIsDisableLogFile;
    }

    public static native void nativePrintln(int i, String str, String str2);

    public static native void nativeSetPrintLevel(int i);

    public static boolean isLogConsoleSet() {
        if (mLogConsoleFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogIODeviceSet() {
        if (mLogIODeviceFilter != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogKibanaDeviceSet() {
        if (mLogKibanaDeviceFilter != null) {
            return true;
        }
        return false;
    }

    public static String getLogDeRedundancyString() {
        try {
            StackTraceElement stackTraceElement = C16880lQ.LLLLIIIILLL().getStackTrace()[3];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(stackTraceElement.getFileName());
            LIZ.append(":");
            LIZ.append(stackTraceElement.getLineNumber());
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ILogFilter getConsoleFilter() {
        return mLogConsoleFilter;
    }

    public static int getLevel() {
        return mLogLevel;
    }

    public static ILogFilter getLogIODevice() {
        return mLogIODeviceFilter;
    }

    public static ILogFilter getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    public static void debugTrace(Object... objArr) {
        String str;
        String str2;
        String str3;
        if (DebugLogUtils.isEnableDebugLog()) {
            try {
                StackTraceElement stackTraceElement = C16880lQ.LLLLIIIILLL().getStackTrace()[3];
                String className = stackTraceElement.getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                int lineNumber = stackTraceElement.getLineNumber();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(substring);
                LIZ.append(".");
                LIZ.append(C16880lQ.LLLLIIIILLL().getStackTrace()[3].getMethodName());
                LIZ.append(":");
                LIZ.append(lineNumber);
                str = X1D.LIZIZ(LIZ);
            } catch (Exception unused) {
                str = "";
            }
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    if (i == 0) {
                        str2 = " (";
                    } else {
                        str2 = ", ";
                    }
                    LIZ2.append(str2);
                    LIZ2.append(objArr[i]);
                    if (i != objArr.length - 1) {
                        str3 = "";
                    } else {
                        str3 = ")";
                    }
                    LIZ2.append(str3);
                    str = X1D.LIZIZ(LIZ2);
                }
            }
        }
    }

    public static void disableKibanaLogs(boolean z) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(5, "AVLog", Q7L.LIZJ("AVLog:disableKibanaLogs : ", z), null);
        }
        Exception exc = new Exception(Q7L.LIZJ("AVLog:disableKibanaLogs,disable:", z));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cause: ");
        LIZ.append(exc.getMessage());
        LIZ.append("\n");
        LIZ.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, X1D.LIZIZ(LIZ));
        mDisableKibanaLogs = z;
    }

    public static void disableLogFile(boolean z) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(5, "AVLog", Q7L.LIZJ("AVLog:disableLogIODevice : ", z), null);
        }
        Exception exc = new Exception(Q7L.LIZJ("AVLog:disableLogFile,disable:", z));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cause: ");
        LIZ.append(exc.getMessage());
        LIZ.append("\n");
        LIZ.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, X1D.LIZIZ(LIZ));
        Monitor.nativeDisableLogFile(z);
        mDisableLogFile = z;
    }

    public static void disableLogIODevice(boolean z) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(5, "AVLog", Q7L.LIZJ("AVLog:disableLogIODevice : ", z), null);
        }
        Exception exc = new Exception(Q7L.LIZJ("AVLog:disableLogIODevice,disable:", z));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cause: ");
        LIZ.append(exc.getMessage());
        LIZ.append("\n");
        LIZ.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, X1D.LIZIZ(LIZ));
        mDisableLogIODevice = z;
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        nativeSetPrintLevel(i);
    }

    public static ILogFilter setupConsole(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogConsoleFilter;
        mLogConsoleFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogIODevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogIODeviceFilter;
        mLogIODeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static ILogFilter setupLogKibanaDevice(ILogFilter iLogFilter) {
        ILogFilter iLogFilter2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = iLogFilter;
        return iLogFilter2;
    }

    public static int checkRedundancy(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!sRedundancyCheckerMap.containsKey(str)) {
            sRedundancyCheckerMap.put(str, new RedunancyChecker());
        }
        RedunancyChecker redunancyChecker = sRedundancyCheckerMap.get(str);
        if (redunancyChecker == null) {
            return -1;
        }
        int i2 = redunancyChecker.redundantCount + 1;
        redunancyChecker.redundantCount = i2;
        if (currentTimeMillis - redunancyChecker.lastPrintTime < i) {
            return -1;
        }
        redunancyChecker.redundantCount = 0;
        redunancyChecker.lastPrintTime = currentTimeMillis;
        return i2;
    }

    public static void d(String str, String str2) {
        nativePrintln(3, str, str2);
    }

    public static void e(String str, String str2) {
        nativePrintln(6, str, str2);
    }

    public static void i(String str, String str2) {
        nativePrintln(4, str, str2);
    }

    public static void initLogFile(Context context, int i) {
        Monitor.initLogFile(context, i);
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODevice(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    public static void v(String str, String str2) {
        nativePrintln(2, str, str2);
    }

    public static void w(String str, String str2) {
        nativePrintln(5, str, str2);
    }

    public static void ioe(String str, String str2, Throwable th) {
        logToIODevice(6, str, str2, th);
    }

    public static void logKibana(int i, String str, String str2, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null && !mDisableKibanaLogs) {
            iLogFilter.print(i, str, str2, th);
        }
        logToIODevice(i, str, str2, th);
    }

    public static void logToConsole(int i, String str, String str2, Throwable th) {
        if (i < mLogLevel) {
            return;
        }
        ILogFilter iLogFilter = mLogConsoleFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, th);
        } else {
            if (!DebugLogUtils.isEnableDebugLog() || i != 7) {
                return;
            }
            Log.wtf(str, str2, th);
        }
    }

    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        String str3;
        if (!mDisableLogFile) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            if (th != null) {
                str3 = Log.getStackTraceString(th);
            } else {
                str3 = "";
            }
            LIZ.append(str3);
            Monitor.nativeWriteLog(str, i, X1D.LIZIZ(LIZ));
        }
        if (i >= mLogLevel && !mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                iLogFilter.print(5, str, C012403c.LIZLLL("[", i, "] ", str2), th);
            } else {
                logToConsole(i, str, str2, th);
            }
        }
    }

    public static void logToConsoleEvent(int i, String str, String str2, String str3, Throwable th) {
        logToConsole(i, str, a1.LJ(str2, " ", str3), th);
    }

    public static void logToIODeviceEvent(int i, String str, String str2, String str3, Throwable th) {
        String str4;
        if (!mDisableLogFile) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str3);
            if (th != null) {
                str4 = Log.getStackTraceString(th);
            } else {
                str4 = "";
            }
            LIZ.append(str4);
            Monitor.nativeWriteLog(str, i, X1D.LIZIZ(LIZ));
        }
        if (i >= mLogLevel && !mDisableLogIODevice) {
            ILogFilter iLogFilter = mLogIODeviceFilter;
            if (iLogFilter != null) {
                StringBuilder LIZ2 = C06830Op.LIZ("[", i, "] ", str2, " ");
                LIZ2.append(str3);
                iLogFilter.print(5, str, X1D.LIZIZ(LIZ2), th);
                return;
            }
            logToConsole(i, str, str3, th);
        }
    }

    public static void logKibanaEvent(int i, String str, String str2, boolean z, String str3, Throwable th) {
        ILogFilter iLogFilter = mLogKibanaDeviceFilter;
        if (iLogFilter != null) {
            iLogFilter.print(i, str, str2, str3, th);
        }
        if (z) {
            logToIODeviceEvent(i, str, str2, str3, th);
        }
    }

    public static int logToIODevice2(int i, String str, String str2, Throwable th, String str3, int i2) {
        if (i < mLogLevel) {
            return -1;
        }
        int checkRedundancy = checkRedundancy(str3, i2);
        if (checkRedundancy > 0) {
            if (checkRedundancy > 1) {
                str2 = C012403c.LIZLLL("[repeat ", checkRedundancy, " times] ", str2);
            }
            logToIODevice(i, str, str2, th);
        }
        return checkRedundancy;
    }

    public static int logToIODevice2(int i, String str, String str2, Throwable th, int i2, int i3) {
        return AVLog2.logToIODevice2(i, str, str2, th, i2, i3);
    }
}
