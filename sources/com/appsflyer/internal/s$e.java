package com.appsflyer.internal;

import X.V0N;

/* loaded from: classes.dex */
public enum s$e {
    EMPTY_ARRAY,
    NONEMPTY_ARRAY,
    EMPTY_OBJECT,
    DANGLING_KEY,
    NONEMPTY_OBJECT,
    NULL;

    public static s$e valueOf(String str) {
        return (s$e) V0N.LJJJ(s$e.class, str);
    }
}
