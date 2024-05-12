package com.amazon.device.iap.internal.util;

import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class b {
    public static final String a;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(b.class.getName());
        LIZ.append("_PREFS");
        a = X1D.LIZIZ(LIZ);
    }

    public static String a(String str) {
        d.a((Object) str, "userId");
        Context b = com.amazon.device.iap.internal.d.d().b();
        d.a(b, "context");
        return F9J.LIZIZ(b, 0, a).getString(str, null);
    }

    public static void a(String str, String str2) {
        d.a((Object) str, "userId");
        Context b = com.amazon.device.iap.internal.d.d().b();
        d.a(b, "context");
        SharedPreferences.Editor edit = F9J.LIZIZ(b, 0, a).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
