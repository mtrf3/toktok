package com.kakao.sdk.user.model;

import X.V0N;

/* loaded from: classes9.dex */
public enum BirthdayType {
    SOLAR,
    LUNAR,
    UNKNOWN;

    public static BirthdayType valueOf(String str) {
        return (BirthdayType) V0N.LJJJ(BirthdayType.class, str);
    }
}
