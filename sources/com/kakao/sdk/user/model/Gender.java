package com.kakao.sdk.user.model;

import X.V0N;

/* loaded from: classes9.dex */
public enum Gender {
    FEMALE,
    MALE,
    UNKNOWN;

    public static Gender valueOf(String str) {
        return (Gender) V0N.LJJJ(Gender.class, str);
    }
}
