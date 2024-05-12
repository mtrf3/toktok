package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes15.dex */
public class MTK_PVR_Optimizer {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mOptimized;
    public static boolean sAlwaysCatchSIGSEGV;
    public static boolean sCatchSIGSEGV;

    public static native void optimize();

    public static native void setCatchOption(boolean z);

    public static synchronized void enable(Context context) {
        boolean z;
        synchronized (MTK_PVR_Optimizer.class) {
            if (mOptimized) {
                return;
            }
            if (loadOptimizerOnNeed(context)) {
                try {
                    if (!sAlwaysCatchSIGSEGV && !sCatchSIGSEGV) {
                        z = false;
                        setCatchOption(z);
                        optimize();
                        mOptimized = true;
                    }
                    z = true;
                    setCatchOption(z);
                    optimize();
                    mOptimized = true;
                } catch (UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void setAlwaysCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            if (sAlwaysCatchSIGSEGV == z) {
                return;
            }
            sAlwaysCatchSIGSEGV = z;
            if (mOptimized) {
                if (!z && !sCatchSIGSEGV) {
                    z2 = false;
                    setCatchOption(z2);
                }
                z2 = true;
                setCatchOption(z2);
            }
        }
    }

    public static synchronized void setCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            if (sCatchSIGSEGV == z) {
                return;
            }
            sCatchSIGSEGV = z;
            if (mOptimized) {
                if (sAlwaysCatchSIGSEGV || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setCatchOption(z2);
            }
        }
    }
}
