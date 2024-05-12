package com.bytedance.android.livesdk.util;

import android.content.Context;

/* loaded from: classes6.dex */
public class GlobalContext {
    public static Context sApplication;

    public static Context getApplicationContext() {
        return sApplication;
    }

    public static void setApplicationContext(Context context) {
        sApplication = context;
    }
}
