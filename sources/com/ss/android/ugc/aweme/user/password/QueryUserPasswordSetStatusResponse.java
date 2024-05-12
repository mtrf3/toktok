package com.ss.android.ugc.aweme.user.password;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QueryUserPasswordSetStatusResponse {

    @InterfaceC65349Pkn("data")
    public final QueryUserPasswordSetStatusData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryUserPasswordSetStatusResponse)) {
            return false;
        }
        QueryUserPasswordSetStatusResponse queryUserPasswordSetStatusResponse = (QueryUserPasswordSetStatusResponse) obj;
        return o.LJ(this.message, queryUserPasswordSetStatusResponse.message) && o.LJ(this.data, queryUserPasswordSetStatusResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        QueryUserPasswordSetStatusData queryUserPasswordSetStatusData = this.data;
        return hashCode + (queryUserPasswordSetStatusData != null ? queryUserPasswordSetStatusData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryUserPasswordSetStatusResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public QueryUserPasswordSetStatusResponse(String str, QueryUserPasswordSetStatusData queryUserPasswordSetStatusData) {
        this.message = str;
        this.data = queryUserPasswordSetStatusData;
    }
}
