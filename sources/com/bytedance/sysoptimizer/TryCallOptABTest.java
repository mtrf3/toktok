package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes15.dex */
public class TryCallOptABTest {
    public static boolean sOptimized;

    public static native void optimize(boolean z);

    public static synchronized void newTryOPt(Context context, boolean z) {
        synchronized (TryCallOptABTest.class) {
            if (sOptimized) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize(z);
                    sOptimized = true;
                } catch (Throwable unused) {
                }
            }
        }
    }
}
