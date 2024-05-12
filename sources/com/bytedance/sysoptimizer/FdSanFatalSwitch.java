package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public class FdSanFatalSwitch {
    public static volatile boolean mFdSanFatalSwitch;

    public static native void openAndroidQFdsan();

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return SysOptimizer.loadOptimizerLibrary(context);
        }
        return false;
    }

    public static synchronized void openAndroidQFdsan(Context context) {
        synchronized (FdSanFatalSwitch.class) {
            if (!mFdSanFatalSwitch && loadOptimizerOnNeed(context)) {
                openAndroidQFdsan();
                mFdSanFatalSwitch = true;
            }
        }
    }
}
