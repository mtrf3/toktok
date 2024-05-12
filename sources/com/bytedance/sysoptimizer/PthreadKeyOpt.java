package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class PthreadKeyOpt {
    public static native int nStart(int i, boolean z, String str);

    public static int start(Context context, int i, boolean z, String str) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C79527VJb c79527VJb = new C79527VJb();
            c79527VJb.LIZ = VJZ.SHARED.value;
            c79527VJb.LIZIZ = true;
            ShadowHook.init(c79527VJb.LIZ());
            return nStart(i, z, str);
        }
        return -1;
    }
}
