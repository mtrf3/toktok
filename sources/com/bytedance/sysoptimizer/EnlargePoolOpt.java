package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes15.dex */
public class EnlargePoolOpt {
    public static boolean sOptimized;

    public static native boolean optimize(int i);

    public static synchronized void fix(Context context, int i) {
        synchronized (EnlargePoolOpt.class) {
            if (sOptimized) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize(i);
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
