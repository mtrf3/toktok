package com.kakao.sdk.user.model;

import X.V0N;

/* loaded from: classes9.dex */
public enum AgeRange {
    AGE_0_9,
    AGE_10_14,
    AGE_15_19,
    AGE_20_29,
    AGE_30_39,
    AGE_40_49,
    AGE_50_59,
    AGE_60_69,
    AGE_70_79,
    AGE_80_89,
    AGE_90_ABOVE,
    UNKNOWN;

    public static AgeRange valueOf(String str) {
        return (AgeRange) V0N.LJJJ(AgeRange.class, str);
    }
}
