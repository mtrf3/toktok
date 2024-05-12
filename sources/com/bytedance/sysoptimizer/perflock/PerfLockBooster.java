package com.bytedance.sysoptimizer.perflock;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.sysoptimizer.SysOptimizer;

/* loaded from: classes12.dex */
public class PerfLockBooster {
    public static native int boos_mtk_with_params_by_perfservice(int[] iArr, int i);

    public static native int boost_dev_with_params(int[] iArr, int i);

    public static native int boost_mtk_dev_with_params(int[] iArr, int i);

    public static native boolean is_mtk_perfd_valid();

    public static native boolean is_mtk_perfservice_valid();

    public static native boolean is_qti_perfd_valid();

    public static native void release_perflock_handle(int i);

    public static boolean isMTKPerdValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_mtk_perfd_valid();
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean isMTKPerfServiceValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_mtk_perfservice_valid();
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean isQtiPerdValid(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return is_qti_perfd_valid();
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static void releasePerflockHandle(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                release_perflock_handle(i);
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
            }
        }
    }

    public static int boostDevWithParams(Context context, int[] iArr, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boost_dev_with_params(iArr, i);
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return 0;
            }
        }
        return 0;
    }

    public static int boostMTKByPerfservice(Context context, int[] iArr, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boos_mtk_with_params_by_perfservice(iArr, i);
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return 0;
            }
        }
        return 0;
    }

    public static int boostMTKDEVWithParams(Context context, int[] iArr, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                return boost_mtk_dev_with_params(iArr, i);
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return 0;
            }
        }
        return 0;
    }
}
