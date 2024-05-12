package com.appsflyer.internal;

import X.V0N;

/* loaded from: classes.dex */
public enum a$a {
    HOOKING("hk"),
    DEBUGGABLE("dbg");

    public String valueOf;

    public static a$a valueOf(String str) {
        return (a$a) V0N.LJJJ(a$a.class, str);
    }

    a$a(String str) {
        this.valueOf = str;
    }
}
