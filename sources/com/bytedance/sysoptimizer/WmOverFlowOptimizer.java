package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class WmOverFlowOptimizer {
    public static boolean mOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (WmOverFlowOptimizer.class) {
            if (mOptimized) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i <= 23 || i > 25) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize();
                    mOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
