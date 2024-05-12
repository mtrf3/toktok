package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum BackgroundMode {
    BACKGROUND_A(0),
    BACKGROUND_B(1),
    BLUR(2),
    NONE(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static BackgroundMode valueOf(String str) {
        return (BackgroundMode) V0N.LJJJ(BackgroundMode.class, str);
    }

    BackgroundMode(int i) {
        this.value = i;
    }
}
