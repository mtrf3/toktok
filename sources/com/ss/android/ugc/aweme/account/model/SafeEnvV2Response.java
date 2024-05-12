package com.ss.android.ugc.aweme.account.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SafeEnvV2Response {

    @InterfaceC65349Pkn("data")
    public final SafeEnvData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeEnvV2Response)) {
            return false;
        }
        SafeEnvV2Response safeEnvV2Response = (SafeEnvV2Response) obj;
        return o.LJ(this.message, safeEnvV2Response.message) && o.LJ(this.data, safeEnvV2Response.data);
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        SafeEnvData safeEnvData = this.data;
        return hashCode + (safeEnvData == null ? 0 : safeEnvData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeEnvV2Response(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SafeEnvV2Response(String message, SafeEnvData safeEnvData) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.data = safeEnvData;
    }
}
