package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommitUserNameResponse {

    @InterfaceC65349Pkn("data")
    public final CommitUserNameData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitUserNameResponse)) {
            return false;
        }
        CommitUserNameResponse commitUserNameResponse = (CommitUserNameResponse) obj;
        return o.LJ(this.message, commitUserNameResponse.message) && o.LJ(this.data, commitUserNameResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CommitUserNameData commitUserNameData = this.data;
        return hashCode + (commitUserNameData != null ? commitUserNameData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommitUserNameResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CommitUserNameResponse(String str, CommitUserNameData commitUserNameData) {
        this.message = str;
        this.data = commitUserNameData;
    }
}
