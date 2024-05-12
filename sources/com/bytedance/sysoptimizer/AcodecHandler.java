package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;

/* loaded from: classes12.dex */
public class AcodecHandler {
    public static volatile boolean mInit;

    public static native void fixAcodecMessage();

    public static boolean inAndroid4x() {
        return false;
    }

    public static boolean inAndroid5x() {
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            return true;
        }
        return false;
    }

    public static synchronized void fixAcodecMessage(Context context) {
        synchronized (AcodecHandler.class) {
            if ((inAndroid4x() || inAndroid5x()) && SysOptimizer.loadOptimizerLibrary(context)) {
                ByteHook.init();
                fixAcodecMessage();
            }
        }
    }
}
