package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes16.dex */
public class DvmGlesOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (DvmGlesOptimizer.class) {
            if (mOptimized) {
            }
        }
    }
}
