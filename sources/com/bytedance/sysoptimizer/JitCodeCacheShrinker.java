package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes12.dex */
public class JitCodeCacheShrinker {
    public static String TAG = "OPTIMIZER-JitCodeCacheShrinker";
    public static boolean mOptimized;

    public static native boolean native_shrink(int i, int i2, int i3);

    public static boolean loadOptimizerOnNeed(Context context) {
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void shrink(Context context, int i, int i2) {
        synchronized (JitCodeCacheShrinker.class) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 29 || i3 > 33) {
                return;
            }
            if (mOptimized) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    ByteHook.init();
                    mOptimized = native_shrink(i3, i, i2);
                } catch (UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
