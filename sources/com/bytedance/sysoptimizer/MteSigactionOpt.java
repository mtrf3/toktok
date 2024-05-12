package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class MteSigactionOpt {
    public static boolean ret;
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized boolean fix(Context context) {
        synchronized (MteSigactionOpt.class) {
            if (sOptimized) {
                return ret;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                C79527VJb c79527VJb = new C79527VJb();
                c79527VJb.LIZ = VJZ.SHARED.value;
                c79527VJb.LIZIZ = true;
                ShadowHook.init(c79527VJb.LIZ());
                try {
                    ret = optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
            return ret;
        }
    }
}
