package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes15.dex */
public class TestMteReport {
    public static native int test(int i);

    public static synchronized void testSigSegv(Context context, int i) {
        synchronized (TestMteReport.class) {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    test(i);
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
