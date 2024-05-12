package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class VdexDupLoadOptimizer {
    public static boolean sOptimized;

    public static native boolean native_optimize();

    public static boolean isTargetOSVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && i <= 30) {
            return true;
        }
        return false;
    }

    public static synchronized void optimize(Context context) {
        synchronized (VdexDupLoadOptimizer.class) {
            if (sOptimized) {
                return;
            }
            if (!isTargetOSVersion()) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    sOptimized = native_optimize();
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
