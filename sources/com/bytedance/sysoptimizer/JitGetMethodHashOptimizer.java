package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes7.dex */
public class JitGetMethodHashOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static void fix(Context context) {
        if (!mOptimized && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                optimize();
                mOptimized = true;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }
}
