package com.byted.cast.source.api;

import X.V0N;

/* loaded from: classes29.dex */
public enum a {
    IDLE(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    REQUESTING(4),
    CASTED(5),
    CANCELING(6);

    a(int i) {
    }

    public static a valueOf(String str) {
        return (a) V0N.LJJJ(a.class, str);
    }
}
