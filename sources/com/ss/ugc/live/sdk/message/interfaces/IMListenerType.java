package com.ss.ugc.live.sdk.message.interfaces;

import X.V0N;

/* loaded from: classes14.dex */
public enum IMListenerType {
    ASYNC,
    ASYNC_BUFFER_FREE,
    SYNC;

    public static IMListenerType valueOf(String str) {
        return (IMListenerType) V0N.LJJJ(IMListenerType.class, str);
    }
}
