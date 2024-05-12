package com.bytedance.common.jato.logcut;

import X.InterfaceC36130EFy;
import X.X1D;
import android.os.Build;

/* loaded from: classes7.dex */
public class LogCut {
    public static int LOGCUT_ALL_LOG = 20002;
    public static int LOGCUT_JNI_LOG = 20001;
    public static int LOGCUT_NATIVE_LOG = 20000;
    public static String TAG = "LogCut";
    public static volatile boolean sIsLoadError = false;
    public static volatile boolean sIsLoaded = false;
    public static InterfaceC36130EFy sMonitor = null;
    public static int sType = 20002;

    public static native int initLogCutInternal(int i, int i2);

    public static native void logCutStartInternal();

    public static native void logCutStopInternal();

    public static boolean checkEnable() {
        if (!sIsLoaded || sIsLoadError) {
            return false;
        }
        return true;
    }

    public static void logCutStart() {
        if (checkEnable()) {
            logCutStartInternal();
        }
    }

    public static void logCutStop() {
        if (checkEnable()) {
            logCutStopInternal();
        }
    }

    public static void initLogCut(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 32) {
            return;
        }
        if (sType != i) {
            sIsLoaded = false;
            sIsLoadError = false;
        }
        if (sIsLoaded || sIsLoadError) {
            return;
        }
        try {
            int initLogCutInternal = initLogCutInternal(i, i2);
            if (initLogCutInternal != 0) {
                InterfaceC36130EFy interfaceC36130EFy = sMonitor;
                if (interfaceC36130EFy != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("logcut init failed:");
                    LIZ.append(initLogCutInternal);
                    X1D.LIZIZ(LIZ);
                    interfaceC36130EFy.LIZ();
                }
                sIsLoadError = true;
            }
            sIsLoaded = true;
            sType = i;
        } catch (Throwable unused) {
        }
    }

    public static void setMonitor(InterfaceC36130EFy interfaceC36130EFy) {
        sMonitor = interfaceC36130EFy;
    }
}
