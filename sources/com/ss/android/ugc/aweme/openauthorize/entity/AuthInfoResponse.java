package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthInfoResponse {

    @InterfaceC65349Pkn("data")
    public final AuthInfoResponseData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfoResponse)) {
            return false;
        }
        AuthInfoResponse authInfoResponse = (AuthInfoResponse) obj;
        return o.LJ(this.message, authInfoResponse.message) && o.LJ(this.data, authInfoResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AuthInfoResponseData authInfoResponseData = this.data;
        return hashCode + (authInfoResponseData != null ? authInfoResponseData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthInfoResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AuthInfoResponse(String str, AuthInfoResponseData authInfoResponseData) {
        this.message = str;
        this.data = authInfoResponseData;
    }

    public /* synthetic */ AuthInfoResponse(String str, AuthInfoResponseData authInfoResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, authInfoResponseData);
    }
}
