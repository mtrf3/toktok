package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class ONativeCryptoCRLOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (ONativeCryptoCRLOptimizer.class) {
            if (sOptimized) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if ((i == 27 || i == 26) && SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
