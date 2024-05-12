package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubscribeMode {
    AUTO_SUBSCRIBE_MODE(0),
    MANUAL_SUBSCRIBE_MODE(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubscribeMode valueOf(String str) {
        return (SubscribeMode) V0N.LJJJ(SubscribeMode.class, str);
    }

    SubscribeMode(int i) {
        this.value = i;
    }
}
