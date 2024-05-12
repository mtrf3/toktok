package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BCAuthorizationResponse {

    @InterfaceC65349Pkn("data")
    public final BCAuthorizationResponseData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public BCAuthorizationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCAuthorizationResponse)) {
            return false;
        }
        BCAuthorizationResponse bCAuthorizationResponse = (BCAuthorizationResponse) obj;
        return o.LJ(this.message, bCAuthorizationResponse.message) && o.LJ(this.data, bCAuthorizationResponse.data);
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        BCAuthorizationResponseData bCAuthorizationResponseData = this.data;
        return hashCode + (bCAuthorizationResponseData == null ? 0 : bCAuthorizationResponseData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BCAuthorizationResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BCAuthorizationResponse(String message, BCAuthorizationResponseData bCAuthorizationResponseData) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.data = bCAuthorizationResponseData;
    }

    public /* synthetic */ BCAuthorizationResponse(String str, BCAuthorizationResponseData bCAuthorizationResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bCAuthorizationResponseData);
    }
}
