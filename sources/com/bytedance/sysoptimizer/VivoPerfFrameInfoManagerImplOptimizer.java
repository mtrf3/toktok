package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class VivoPerfFrameInfoManagerImplOptimizer {
    public static boolean sOptimized;

    public static native boolean optimize();

    public static synchronized void fix(Context context) {
        synchronized (VivoPerfFrameInfoManagerImplOptimizer.class) {
            if (sOptimized) {
                return;
            }
            String trim = Build.MODEL.toLowerCase().trim();
            if (Build.VERSION.SDK_INT >= 27 && ((trim.contains("vivo") || trim.contains("oppo")) && SysOptimizer.loadOptimizerLibrary(context))) {
                try {
                    optimize();
                    sOptimized = true;
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
