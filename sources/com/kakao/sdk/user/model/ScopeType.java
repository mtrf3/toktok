package com.kakao.sdk.user.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum ScopeType {
    PRIVACY,
    SERVICE;

    public static ScopeType valueOf(String str) {
        return (ScopeType) V0N.LJJJ(ScopeType.class, str);
    }
}
