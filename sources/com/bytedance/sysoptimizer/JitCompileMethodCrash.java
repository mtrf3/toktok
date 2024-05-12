package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class JitCompileMethodCrash {
    public static String TAG = "OPTIMIZER-JIT";
    public static boolean mOptimized;

    public static native boolean optimize(int i);

    public static boolean loadOptimizerOnNeed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 27 || i > 32) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean optimize(Context context) {
        synchronized (JitCompileMethodCrash.class) {
            if (mOptimized) {
                return true;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    C79527VJb c79527VJb = new C79527VJb();
                    c79527VJb.LIZ = VJZ.SHARED.value;
                    c79527VJb.LIZIZ = true;
                    ShadowHook.init(c79527VJb.LIZ());
                    boolean optimize = optimize(Build.VERSION.SDK_INT);
                    mOptimized = optimize;
                    return optimize;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            return false;
        }
    }
}
