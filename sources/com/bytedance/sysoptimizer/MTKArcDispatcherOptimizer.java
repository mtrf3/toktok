package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.Locale;

/* loaded from: classes7.dex */
public class MTKArcDispatcherOptimizer {
    public static boolean sOptimized;

    public static native void banMTKArcDispatcher();

    public static void fix(Context context) {
        if (Build.VERSION.SDK_INT == 28 && !sOptimized && Build.BRAND.toLowerCase(Locale.ROOT).contains("oppo") && Process.is64Bit() && SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                banMTKArcDispatcher();
                sOptimized = true;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
            }
        }
    }
}
