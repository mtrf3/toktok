package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class HighLevelTrimMemory {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static native boolean disable();

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (HighLevelTrimMemory.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disable = disable();
                    mOptimized = disable;
                    return disable;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            return false;
        }
    }
}
