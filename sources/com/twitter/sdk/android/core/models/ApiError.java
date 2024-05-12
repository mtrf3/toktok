package com.twitter.sdk.android.core.models;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class ApiError {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("message")
    public final String message;

    public ApiError(String str, int i) {
        this.message = str;
        this.code = i;
    }
}
