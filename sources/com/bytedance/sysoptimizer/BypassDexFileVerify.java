package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class BypassDexFileVerify {
    public static boolean sInited;

    public static native int bypassVerifyNative();

    public static boolean isTargetOSVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 27) {
            return true;
        }
        return false;
    }

    public static synchronized int bypassVerify(Context context) {
        synchronized (BypassDexFileVerify.class) {
            int i = -1;
            if (sInited) {
                return -1;
            }
            if (!isTargetOSVersion()) {
                return -1;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                C79527VJb c79527VJb = new C79527VJb();
                c79527VJb.LIZ = VJZ.SHARED.value;
                c79527VJb.LIZIZ = true;
                ShadowHook.init(c79527VJb.LIZ());
                try {
                    i = bypassVerifyNative();
                    sInited = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
            return i;
        }
    }
}
