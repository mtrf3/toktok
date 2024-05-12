package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BaseResponse<T> {

    @InterfaceC65349Pkn("data")
    public T data;

    @InterfaceC65349Pkn("code")
    public int code = -1;

    @InterfaceC65349Pkn("msg")
    public String message = "";

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

    public final void setMessage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.message = str;
    }
}
