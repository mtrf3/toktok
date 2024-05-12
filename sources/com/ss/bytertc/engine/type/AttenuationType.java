package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AttenuationType {
    ATTENUATION_TYPE_NONE(0),
    ATTENUATION_TYPE_LINEAR(1),
    ATTENUATION_TYPE_EXPONENTIAL(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AttenuationType valueOf(String str) {
        return (AttenuationType) V0N.LJJJ(AttenuationType.class, str);
    }

    AttenuationType(int i) {
        this.value = i;
    }
}
