package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes12.dex */
public class RedmiTypeFaceOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize(boolean z);

    public static void fixOnAndroidQ(Context context) {
        fixOnAndroidQ(context, false);
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static void fixOnAndroidQ(Context context, boolean z) {
        if (!mOptimized && Build.VERSION.SDK_INT == 29 && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                optimize(z);
                mOptimized = true;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }
}
