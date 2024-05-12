package com.bytedance.sysoptimizer;

import android.content.Context;

/* loaded from: classes12.dex */
public class BadParcelableCrashOptimizer {
    public static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    public static void fix(Context context) {
        sContext = context;
    }
}
