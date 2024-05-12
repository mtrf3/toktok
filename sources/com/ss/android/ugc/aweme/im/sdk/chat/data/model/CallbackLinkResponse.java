package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CallbackLinkResponse extends BaseResponse {

    @InterfaceC65349Pkn("callback_status")
    public final Integer responseStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackLinkResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CallbackLinkResponse copy$default(CallbackLinkResponse callbackLinkResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = callbackLinkResponse.responseStatus;
        }
        return callbackLinkResponse.copy(num);
    }

    public final CallbackLinkResponse copy(Integer num) {
        return new CallbackLinkResponse(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallbackLinkResponse) && o.LJ(this.responseStatus, ((CallbackLinkResponse) obj).responseStatus);
    }

    public int hashCode() {
        Integer num = this.responseStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CallbackLinkResponse(responseStatus=");
        return s0.LIZJ(LIZ, this.responseStatus, ')', LIZ);
    }

    public final Integer getResponseStatus() {
        return this.responseStatus;
    }

    public CallbackLinkResponse(Integer num) {
        this.responseStatus = num;
    }

    public /* synthetic */ CallbackLinkResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
