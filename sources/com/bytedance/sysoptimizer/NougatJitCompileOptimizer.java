package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class NougatJitCompileOptimizer {
    public static boolean sOptimized;

    public static native void optimize();

    public static synchronized void fix(Context context) {
        synchronized (NougatJitCompileOptimizer.class) {
            if (sOptimized) {
                return;
            }
            if (Build.VERSION.SDK_INT != 24) {
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
