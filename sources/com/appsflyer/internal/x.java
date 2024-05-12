package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;

/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static final class d {
        public static final x AFInAppEventType = new x();
    }

    public final Location AFInAppEventType(Context context) {
        try {
            AFKeystoreWrapper(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            AFKeystoreWrapper(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean AFKeystoreWrapper(Context context, String[] strArr) {
        for (String str : strArr) {
            if (ac.AFKeystoreWrapper(context, str)) {
                return true;
            }
        }
        return false;
    }
}
