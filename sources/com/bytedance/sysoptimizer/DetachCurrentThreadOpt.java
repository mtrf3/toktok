package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class DetachCurrentThreadOpt {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static boolean isTargetOSVersion() {
        if (Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        return false;
    }

    public static synchronized void fix(Context context) {
        synchronized (DetachCurrentThreadOpt.class) {
            if (sOptimized) {
                return;
            }
            if (!isTargetOSVersion()) {
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

    public static void fix(Context context, int i) {
        fix(context);
    }
}
