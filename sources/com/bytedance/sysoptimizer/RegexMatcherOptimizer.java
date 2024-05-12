package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class RegexMatcherOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (RegexMatcherOptimizer.class) {
            if (sOptimized) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i != 21 && i != 22) {
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
