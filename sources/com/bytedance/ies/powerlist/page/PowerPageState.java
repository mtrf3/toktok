package com.bytedance.ies.powerlist.page;

import X.V0N;

/* loaded from: classes13.dex */
public enum PowerPageState {
    Reset(0),
    Loading(1),
    Loaded(2),
    Error(3),
    End(4);

    public final int value;

    public static PowerPageState valueOf(String str) {
        return (PowerPageState) V0N.LJJJ(PowerPageState.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    PowerPageState(int i) {
        this.value = i;
    }
}
