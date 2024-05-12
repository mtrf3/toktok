package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum RemoteUserPriority {
    REMOTE_USER_PRIORITY_LOW(0),
    REMOTE_USER_PRIORITY_MEDIUM(100),
    REMOTE_USER_PRIORITY_HIGH(200);

    public int value;

    public int value() {
        return this.value;
    }

    public static RemoteUserPriority valueOf(String str) {
        return (RemoteUserPriority) V0N.LJJJ(RemoteUserPriority.class, str);
    }

    RemoteUserPriority(int i) {
        this.value = i;
    }
}
