package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class GraphicsEnvOpt {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (GraphicsEnvOpt.class) {
            if (sOptimized) {
                return;
            }
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                C79527VJb c79527VJb = new C79527VJb();
                c79527VJb.LIZ = VJZ.SHARED.value;
                c79527VJb.LIZIZ = true;
                ShadowHook.init(c79527VJb.LIZ());
                try {
                    optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
