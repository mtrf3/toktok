package com.kakao.sdk.common.model;

import X.V0N;

/* loaded from: classes12.dex */
public enum AuthErrorCause {
    InvalidRequest,
    InvalidClient,
    InvalidScope,
    InvalidGrant,
    Misconfigured,
    Unauthorized,
    AccessDenied,
    ServerError,
    Unknown;

    public static AuthErrorCause valueOf(String str) {
        return (AuthErrorCause) V0N.LJJJ(AuthErrorCause.class, str);
    }
}
