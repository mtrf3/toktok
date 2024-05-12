package com.kakao.sdk.common.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public abstract class KakaoSdkError extends RuntimeException {
    public final String msg;

    public /* synthetic */ KakaoSdkError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final boolean isInvalidTokenError() {
        if (this instanceof AuthError) {
            if (((AuthError) this).getReason() == AuthErrorCause.InvalidGrant) {
                return true;
            }
        } else if ((this instanceof ApiError) && ((ApiError) this).getReason() == ApiErrorCause.InvalidToken) {
            return true;
        }
        return false;
    }

    public String getMsg() {
        return this.msg;
    }

    public KakaoSdkError(String str) {
        super(str);
        this.msg = str;
    }
}
