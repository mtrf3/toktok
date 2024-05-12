package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum ClientRole {
    CLIENT_ROLE_BROADCASTER,
    CLIENT_ROLE_SILENT_AUDIENCE;

    public static ClientRole valueOf(String str) {
        return (ClientRole) V0N.LJJJ(ClientRole.class, str);
    }
}
