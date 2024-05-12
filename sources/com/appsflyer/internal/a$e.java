package com.appsflyer.internal;

import X.V0N;

/* loaded from: classes.dex */
public enum a$e {
    XPOSED("xps"),
    FRIDA("frd");

    public String AFInAppEventParameterName;

    public static a$e valueOf(String str) {
        return (a$e) V0N.LJJJ(a$e.class, str);
    }

    a$e(String str) {
        this.AFInAppEventParameterName = str;
    }
}
