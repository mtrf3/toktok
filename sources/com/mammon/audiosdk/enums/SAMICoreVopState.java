package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes13.dex */
public enum SAMICoreVopState {
    Error(0),
    UNINITIALIZED(1),
    AGREEING(2),
    RECORDING(3),
    UPLOADING(4),
    BUILDING(5),
    COMPLETED(6);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopState valueOf(String str) {
        return (SAMICoreVopState) V0N.LJJJ(SAMICoreVopState.class, str);
    }

    SAMICoreVopState(int i) {
        this.value = i;
    }
}
