package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class MaliGpuExtIsSupportOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (MaliGpuExtIsSupportOptimizer.class) {
            if (sOptimized) {
                return;
            }
            if (Build.VERSION.SDK_INT != 21) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
