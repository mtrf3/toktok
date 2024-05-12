package com.bytedance.sysoptimizer.fake.name;

import android.content.Context;
import android.os.Build;
import com.bytedance.sysoptimizer.SysOptimizer;

/* loaded from: classes7.dex */
public class SmFakeNameHandler {
    public static String TAG = "SYSOPTIMIZER";
    public static volatile boolean inited;

    public static native void replace(int i);

    public static boolean inAndroid5x() {
        int i = Build.VERSION.SDK_INT;
        if (i == 22 || i == 21) {
            return true;
        }
        return false;
    }

    public static boolean shouldFix() {
        if (inAndroid5x() && Build.MODEL.startsWith("SM-")) {
            return true;
        }
        return false;
    }

    public static synchronized void start(Context context) {
        synchronized (SmFakeNameHandler.class) {
            if (!shouldFix()) {
                return;
            }
            if (inited) {
                return;
            }
            inited = true;
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    replace(Build.VERSION.SDK_INT);
                } catch (NoSuchMethodError | UnsatisfiedLinkError unused) {
                }
            }
        }
    }
}
