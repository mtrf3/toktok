package com.ss.bduploader.util;

import android.content.Context;

/* loaded from: classes17.dex */
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
