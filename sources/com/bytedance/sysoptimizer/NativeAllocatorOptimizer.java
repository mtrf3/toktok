package com.bytedance.sysoptimizer;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.keva.Keva;

/* loaded from: classes16.dex */
public class NativeAllocatorOptimizer {
    public static native boolean do_jemalloc_decay_opt(int i);

    public static native boolean do_jemalloc_purge();

    public static native boolean do_set_extra_graphic_buffer(int i);

    public static native boolean do_set_gui_extra_graphic_buffer(int i);

    public static native boolean do_shrink_java_native_thread(int i, boolean z);

    public static native boolean do_shrink_native_thread(int i, boolean z);

    public static native boolean is_jemalloc_allocator();

    public static native boolean optimize(int i);

    public static int getIsJemallocAllocatorFromKeva() {
        return Keva.getRepo("jemalloc_repo").getInt("is_jemalloc_allocator", 0);
    }

    public static boolean doJemallocPurge() {
        try {
            if (do_jemalloc_purge()) {
                return true;
            }
            return false;
        } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public static boolean isJemallocAllocator(Context context) {
        int isJemallocAllocatorFromKeva = getIsJemallocAllocatorFromKeva();
        if (isJemallocAllocatorFromKeva != 0) {
            if (isJemallocAllocatorFromKeva == 2) {
                return true;
            }
            return false;
        }
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                if (is_jemalloc_allocator()) {
                    setIsJemallocAllocatorToKeva(2);
                    return true;
                }
                setIsJemallocAllocatorToKeva(1);
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }

    public static void setIsJemallocAllocatorToKeva(int i) {
        Keva.getRepo("jemalloc_repo").storeInt("is_jemalloc_allocator", i);
    }

    public static boolean doJemallocDecayOpt(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            try {
                if (do_jemalloc_decay_opt(i)) {
                    return true;
                }
                return false;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean doSetExtraGraphicBuffer(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (do_set_extra_graphic_buffer(i)) {
                    return true;
                }
                return false;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean doSetGUIExtraGraphicBuffer(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (do_set_gui_extra_graphic_buffer(i)) {
                    return true;
                }
                return false;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean doShrinkNativeThread(Context context, int i) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (do_shrink_native_thread(i, false)) {
                    return true;
                }
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
            }
        }
        return false;
    }

    public static synchronized void optimize(Context context, int i) {
        synchronized (NativeAllocatorOptimizer.class) {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    optimize(i);
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }

    public static boolean doShrinkJavaNativeThread(Context context, int i, boolean z) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (do_shrink_java_native_thread(i, z)) {
                    return true;
                }
                return false;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean doShrinkNativeThread(Context context, int i, boolean z) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            try {
                if (do_shrink_native_thread(i, z)) {
                    return true;
                }
                return false;
            } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                return false;
            }
        }
        return false;
    }
}
