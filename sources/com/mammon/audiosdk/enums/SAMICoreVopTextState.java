package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes13.dex */
public enum SAMICoreVopTextState {
    AVAILABLE(0),
    SUCCESS_END(1),
    FAILED_END(2);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopTextState valueOf(String str) {
        return (SAMICoreVopTextState) V0N.LJJJ(SAMICoreVopTextState.class, str);
    }

    SAMICoreVopTextState(int i) {
        this.value = i;
    }
}
