package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BaseResponse<T> {

    @InterfaceC65349Pkn("data")
    public final T data;

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("error_content")
    public final String errorContent;

    @InterfaceC65349Pkn("error_message")
    public final String errorMsg;

    @InterfaceC65349Pkn("result_code")
    public final String resultCode;

    public final boolean LIZ() {
        return o.LJ(this.resultCode, "success");
    }

    public BaseResponse(String errorCode, String errorMsg, String resultCode, String errorContent, T t) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(resultCode, "resultCode");
        o.LJIIIZ(errorContent, "errorContent");
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.resultCode = resultCode;
        this.errorContent = errorContent;
        this.data = t;
    }
}
