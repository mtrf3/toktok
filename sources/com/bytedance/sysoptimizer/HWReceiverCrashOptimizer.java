package com.bytedance.sysoptimizer;

import android.content.ContextWrapper;
import android.os.Build;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class HWReceiverCrashOptimizer {
    public static volatile boolean sHasFix;

    public static void fix(ContextWrapper contextWrapper) {
        int i = Build.VERSION.SDK_INT;
        if (i == 22 || i == 23) {
            synchronized (HWReceiverCrashOptimizer.class) {
                if (sHasFix) {
                    return;
                }
                sHasFix = true;
                try {
                    Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mPackageInfo");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(contextWrapper.getBaseContext());
                    Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceiverResource");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, null);
                } catch (Exception unused) {
                }
            }
        }
    }
}
