package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SEIStreamUpdateEvent {
    STREAM_ADD(0),
    STREAM_REMOVE(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SEIStreamUpdateEvent valueOf(String str) {
        return (SEIStreamUpdateEvent) V0N.LJJJ(SEIStreamUpdateEvent.class, str);
    }

    SEIStreamUpdateEvent(int i) {
        this.value = i;
    }
}
