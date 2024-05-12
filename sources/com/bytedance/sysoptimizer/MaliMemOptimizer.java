package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes12.dex */
public class MaliMemOptimizer {
    public static volatile boolean hasEnableEglSetDamageRegionKHRErrorSkip;
    public static volatile boolean hasEnableMaliGLErrorRegionSpaceSkip;
    public static volatile boolean hasEnableMaliGLErrorSkip;
    public static volatile boolean hasSetTimeMillsDelayed;

    public static native void enable_egl_set_damage_region_khr_error_skip(boolean z);

    public static native void enable_gl_error_region_space_skip();

    public static native void enable_gl_error_skip(boolean z);

    public static native void set_time_mills_delayed(int i, int i2);

    public static synchronized void enableMaliGLErrorRegionSpaceSkip(Context context) {
        synchronized (MaliMemOptimizer.class) {
            if (hasEnableMaliGLErrorRegionSpaceSkip) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                ByteHook.init();
                try {
                    enable_gl_error_region_space_skip();
                } catch (NoSuchMethodError unused) {
                    return;
                } catch (UnsatisfiedLinkError unused2) {
                    return;
                }
            }
            hasEnableMaliGLErrorRegionSpaceSkip = true;
        }
    }

    public static synchronized void enableEglSetDamageRegionKHRErrorSkip(Context context, boolean z) {
        synchronized (MaliMemOptimizer.class) {
            if (hasEnableEglSetDamageRegionKHRErrorSkip) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                ByteHook.init();
                try {
                    enable_egl_set_damage_region_khr_error_skip(z);
                } catch (NoSuchMethodError unused) {
                    return;
                } catch (UnsatisfiedLinkError unused2) {
                    return;
                }
            }
            hasEnableEglSetDamageRegionKHRErrorSkip = true;
        }
    }

    public static synchronized void enableMaliGLErrorSkip(Context context, boolean z) {
        synchronized (MaliMemOptimizer.class) {
            if (hasEnableMaliGLErrorSkip) {
                return;
            }
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                ByteHook.init();
                try {
                    enable_gl_error_skip(z);
                } catch (NoSuchMethodError unused) {
                    return;
                } catch (UnsatisfiedLinkError unused2) {
                    return;
                }
            }
            hasEnableMaliGLErrorSkip = true;
        }
    }

    public static synchronized void setTimeMillsDelayed(int i, int i2, Context context) {
        synchronized (MaliMemOptimizer.class) {
            if (hasSetTimeMillsDelayed) {
                return;
            }
            ByteHook.init();
            SysOptimizer.loadOptimizerLibrary(context);
            set_time_mills_delayed(i, i2);
            hasSetTimeMillsDelayed = true;
        }
    }
}
