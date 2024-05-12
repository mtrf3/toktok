package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes15.dex */
public class DvmDeadLockOptimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;

    public static boolean loadOptimizerOnNeed(Context context) {
        return false;
    }

    public static native boolean optimize();

    public static synchronized boolean optimize(Context context) {
        synchronized (DvmDeadLockOptimizer.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    boolean optimize = optimize();
                    mOptimized = optimize;
                    return optimize;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            return false;
        }
    }
}
