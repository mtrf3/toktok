package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.V0N;

/* loaded from: classes2.dex */
public enum AutoCheckType {
    UNKNOWN(0),
    PR_CHECK_MUSIC(1);

    public final int value;

    public static AutoCheckType valueOf(String str) {
        return (AutoCheckType) V0N.LJJJ(AutoCheckType.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    AutoCheckType(int i) {
        this.value = i;
    }
}
