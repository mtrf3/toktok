package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;

/* loaded from: classes7.dex */
public class CfiCheckOptimizer {
    public static boolean mOptimized;

    public static native boolean disableCfiCheck();

    public static boolean loadOptimizerOnNeed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 30 || !Process.is64Bit()) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (CfiCheckOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean disableCfiCheck = disableCfiCheck();
                    mOptimized = disableCfiCheck;
                    return disableCfiCheck;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            return false;
        }
    }
}
