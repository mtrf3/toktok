package com.bytedance.sysoptimizer;

import X.C79527VJb;
import X.VJZ;
import android.content.Context;
import android.os.Build;
import com.bytedance.shadowhook.ShadowHook;

/* loaded from: classes15.dex */
public class JitDebugInfoOptimizer {
    public static volatile boolean isOptimized;

    public static native void doOptimize(int i, boolean z);

    public static synchronized void install(Context context, boolean z) {
        int i;
        synchronized (JitDebugInfoOptimizer.class) {
            if (!isOptimized && (i = Build.VERSION.SDK_INT) >= 28 && SysOptimizer.loadOptimizerLibrary(context)) {
                C79527VJb c79527VJb = new C79527VJb();
                c79527VJb.LIZ = VJZ.SHARED.value;
                c79527VJb.LIZIZ = true;
                ShadowHook.init(c79527VJb.LIZ());
                doOptimize(i, z);
                isOptimized = true;
            }
        }
    }
}
