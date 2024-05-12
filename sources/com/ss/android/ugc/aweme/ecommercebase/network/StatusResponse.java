package com.ss.android.ugc.aweme.ecommercebase.network;

import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class StatusResponse<T> {

    @InterfaceC65349Pkn("data")
    public T data;

    @InterfaceC65349Pkn("status_code")
    public int code = -1;

    @InterfaceC65349Pkn("status_message")
    public final String message = "";

    public final boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(T t) {
        this.data = t;
    }
}