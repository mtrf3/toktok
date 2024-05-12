package com.bytedance.realx.base;

import X.C16880lQ;
import android.content.Context;

/* loaded from: classes7.dex */
public class RtcContextUtils {
    public static Context applicationContext;

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static void initialize(Context context) {
        if (context != null) {
            ContextUtils.initialize(C16880lQ.LLLLL(context));
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
