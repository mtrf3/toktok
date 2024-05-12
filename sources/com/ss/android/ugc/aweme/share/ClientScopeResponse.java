package com.ss.android.ugc.aweme.share;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ClientScopeResponse {

    @InterfaceC65349Pkn("data")
    public final ScopeData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientScopeResponse)) {
            return false;
        }
        ClientScopeResponse clientScopeResponse = (ClientScopeResponse) obj;
        return o.LJ(this.data, clientScopeResponse.data) && o.LJ(this.message, clientScopeResponse.message);
    }

    public final int hashCode() {
        ScopeData scopeData = this.data;
        return this.message.hashCode() + ((scopeData == null ? 0 : scopeData.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientScopeResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public ClientScopeResponse(ScopeData scopeData, String message) {
        o.LJIIIZ(message, "message");
        this.data = scopeData;
        this.message = message;
    }
}
