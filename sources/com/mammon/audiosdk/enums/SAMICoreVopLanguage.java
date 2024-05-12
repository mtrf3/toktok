package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes10.dex */
public enum SAMICoreVopLanguage {
    JAPANESE(0),
    ENGLISH(1);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopLanguage valueOf(String str) {
        return (SAMICoreVopLanguage) V0N.LJJJ(SAMICoreVopLanguage.class, str);
    }

    SAMICoreVopLanguage(int i) {
        this.value = i;
    }
}
