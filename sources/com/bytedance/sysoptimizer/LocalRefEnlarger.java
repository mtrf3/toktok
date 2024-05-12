package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class LocalRefEnlarger {
    public static boolean sOptimized;

    public static native boolean optimize(int i);

    public static native void test();

    public static synchronized void fix(Context context) {
        synchronized (LocalRefEnlarger.class) {
            if (sOptimized) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 26) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    C79527VJb c79527VJb = new C79527VJb();
                    c79527VJb.LIZ = VJZ.SHARED.value;
                    c79527VJb.LIZIZ = true;
                    ShadowHook.init(c79527VJb.LIZ());
                    optimize(i);
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
