package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class VMDebugDumpHprofOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (VMDebugDumpHprofOptimizer.class) {
            if (sOptimized) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if ((i == 22 || i == 23) && SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}