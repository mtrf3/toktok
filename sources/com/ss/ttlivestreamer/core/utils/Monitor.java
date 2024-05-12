package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import java.io.File;
import java.io.IOException;

/* loaded from: classes12.dex */
public class Monitor {
    public static TEBundle sMonitorDataBase = new TEBundle();
    public static boolean sInitLogDone = false;
    public static boolean sEnableCPULoadWithTop = false;

    public static native void nativeDisableLogFile(boolean z);

    public static native double nativeGetAppPrecentageOnCPU();

    public static native long nativeGetAppRSSKB();

    public static native long nativeGetAppVSSKB();

    public static native double nativeGetCPUPrecentage();

    public static native double nativeGetSystemPrecentageOnCPU();

    public static native int nativeGetThreadCount();

    public static native double nativeGetUserPrecentageOnCPU();

    public static native boolean nativeInitLogFile(String str, int i);

    public static native boolean nativeIsDisableLogFile();

    public static native void nativeWriteLog(String str, int i, String str2);

    public static TEBundle staticsCPUInfoOnTop(long j) {
        return null;
    }

    public Monitor() {
        MediaEngineFactory.nativeGetVersion();
    }

    public static double getAppPrecentageOnCPU() {
        return nativeGetAppPrecentageOnCPU() * 100.0d;
    }

    public static long getAppRSSKB() {
        return nativeGetAppRSSKB();
    }

    public static long getAppVSSKB() {
        return nativeGetAppVSSKB();
    }

    public static double getCPUPrecentage() {
        return nativeGetCPUPrecentage() * 100.0d;
    }

    public static double getSystemPrecentageOnCPU() {
        return nativeGetSystemPrecentageOnCPU() * 100.0d;
    }

    public static int getThreadCount() {
        return nativeGetThreadCount();
    }

    public static double getUserPrecentageOnCPU() {
        return nativeGetUserPrecentageOnCPU() * 100.0d;
    }

    public static boolean isDisableLogFile() {
        return nativeIsDisableLogFile();
    }

    public static void disableLogFile(boolean z) {
        nativeDisableLogFile(z);
    }

    public static void enableCPULoadStaticsWithTop(boolean z) {
        sEnableCPULoadWithTop = z;
    }

    public static void initLogFile(Context context, int i) {
        if (context == null) {
            return;
        }
        if (sInitLogDone) {
            nativeInitLogFile("", i);
            return;
        }
        String str = null;
        File LLIIJI = C16880lQ.LLIIJI(context, null);
        if (LLIIJI == null) {
            return;
        }
        if (!LLIIJI.exists()) {
            try {
                LLIIJI.createNewFile();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (LLIIJI.exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LLIIJI.getAbsolutePath());
            LIZ.append("/ttlivestreamer.bin");
            String LIZIZ = X1D.LIZIZ(LIZ);
            File file = new File(LIZIZ);
            if (file.exists()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LLIIJI.getAbsolutePath());
                LIZ2.append("/ttlivestreamer.old.bin");
                try {
                    file.renameTo(new File(X1D.LIZIZ(LIZ2)));
                } catch (Throwable unused) {
                }
                file = new File(LIZIZ);
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException unused2) {
                }
            }
            str = LIZIZ;
        }
        if (!TextUtils.isEmpty(str)) {
            sInitLogDone = nativeInitLogFile(str, i);
        }
    }

    public static void writeLog(String str, int i, String str2) {
        nativeWriteLog(str, i, str2);
    }
}
