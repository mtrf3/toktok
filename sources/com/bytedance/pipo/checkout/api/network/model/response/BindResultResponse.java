package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BindResultResponse {

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    @InterfaceC65349Pkn("return_url")
    public String returnUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public BindResultResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BindResultResponse copy$default(BindResultResponse bindResultResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindResultResponse.resultCode;
        }
        if ((i & 2) != 0) {
            str2 = bindResultResponse.returnUrl;
        }
        return bindResultResponse.copy(str, str2);
    }

    public final BindResultResponse copy(String str, String str2) {
        return new BindResultResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindResultResponse)) {
            return false;
        }
        BindResultResponse bindResultResponse = (BindResultResponse) obj;
        return o.LJ(this.resultCode, bindResultResponse.resultCode) && o.LJ(this.returnUrl, bindResultResponse.returnUrl);
    }

    public int hashCode() {
        String str = this.resultCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.returnUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindResultResponse(resultCode=");
        LIZ.append((Object) this.resultCode);
        LIZ.append(", returnUrl=");
        LIZ.append((Object) this.returnUrl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final void setResultCode(String str) {
        this.resultCode = str;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public BindResultResponse(String str, String str2) {
        this.resultCode = str;
        this.returnUrl = str2;
    }

    public /* synthetic */ BindResultResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
