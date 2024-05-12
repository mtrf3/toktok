package com.kakao.sdk.common.model;

import X.V0N;

/* loaded from: classes12.dex */
public enum ClientErrorCause {
    Unknown,
    Cancelled,
    TokenNotFound,
    NotSupported,
    BadParameter,
    IllegalState;

    public static ClientErrorCause valueOf(String str) {
        return (ClientErrorCause) V0N.LJJJ(ClientErrorCause.class, str);
    }
}
