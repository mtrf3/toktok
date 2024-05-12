package com.ss.mediakit.vcnlib;

import android.content.Context;

/* loaded from: classes9.dex */
public class NetUtils {
    public static Context gContext;

    public static Context getApplicationContext() {
        return gContext;
    }

    public static void setApplicationContext(Context context) {
        if (gContext == null) {
            gContext = context;
        }
    }
}
