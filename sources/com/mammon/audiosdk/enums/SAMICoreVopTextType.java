package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes5.dex */
public enum SAMICoreVopTextType {
    PRIMARY(50),
    STANDARD(80);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopTextType valueOf(String str) {
        return (SAMICoreVopTextType) V0N.LJJJ(SAMICoreVopTextType.class, str);
    }

    SAMICoreVopTextType(int i) {
        this.value = i;
    }
}
