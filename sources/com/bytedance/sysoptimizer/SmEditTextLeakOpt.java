package com.bytedance.sysoptimizer;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class SmEditTextLeakOpt {
    public static final String TAG = SmEditTextLeakOpt.class.getName();

    public static void optimize(Application application) {
        try {
            if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
                Method declaredMethod = Class.forName("android.sec.clipboard.ClipboardUIManager").getDeclaredMethod("getInstance", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, application);
            }
        } catch (Throwable unused) {
        }
    }
}
