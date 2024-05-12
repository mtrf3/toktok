package com.ss.bytertc.engine;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubscribeState {
    SUBSCRIBE_STATE_SUCCESS,
    SUBSCRIBE_STATE_FAILED_NOT_IN_ROOM,
    SUBSCRIBE_STATE_FAILED_STREAM_NOT_FOUND,
    SUBSCRIBE_STATE_FAILED_AUTO_MODE,
    SUBSCRIBE_STATE_FAILED_SIGNAL;

    public static SubscribeState valueOf(String str) {
        return (SubscribeState) V0N.LJJJ(SubscribeState.class, str);
    }
}
