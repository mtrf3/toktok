package com.ttnet.org.chromium.base;

import X.FIY;
import X.VGF;

/* loaded from: classes15.dex */
public class EarlyTraceEvent {
    public static volatile int LIZ = 0;
    public static final Object LIZIZ = new Object();

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    public static boolean LIZIZ() {
        if (LIZ == 1) {
            return true;
        }
        return false;
    }

    public static void setBackgroundStartupTracingFlag(boolean z) {
        FIY.LIZ.edit().putBoolean("bg_startup_tracing", z).apply();
    }

    public static void LIZ(String str, boolean z) {
        if (!LIZIZ()) {
            return;
        }
        new VGF(str, true, z);
        synchronized (LIZIZ) {
            if (LIZIZ()) {
                throw null;
            }
        }
    }

    public static void LIZJ(String str, boolean z) {
        if (!LIZIZ()) {
            return;
        }
        new VGF(str, false, z);
        synchronized (LIZIZ) {
            if (LIZIZ()) {
                throw null;
            }
        }
    }
}
