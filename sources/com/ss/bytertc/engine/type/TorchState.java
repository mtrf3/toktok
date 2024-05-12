package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum TorchState {
    TORCH_STATE_OFF(0),
    TORCH_STATE_ON(1);

    public int value;

    public static TorchState valueOf(String str) {
        return (TorchState) V0N.LJJJ(TorchState.class, str);
    }

    TorchState(int i) {
        this.value = i;
    }
}
