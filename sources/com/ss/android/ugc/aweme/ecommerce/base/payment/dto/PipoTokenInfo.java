package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PipoTokenInfo {

    @InterfaceC65349Pkn("host")
    public final String host;

    @InterfaceC65349Pkn("token")
    public final String token;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTokenInfo)) {
            return false;
        }
        PipoTokenInfo pipoTokenInfo = (PipoTokenInfo) obj;
        return o.LJ(this.token, pipoTokenInfo.token) && o.LJ(this.host, pipoTokenInfo.host);
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.host;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoTokenInfo(token=");
        LIZ.append(this.token);
        LIZ.append(", host=");
        return q.LIZIZ(LIZ, this.host, ')', LIZ);
    }

    public PipoTokenInfo(String str, String str2) {
        this.token = str;
        this.host = str2;
    }
}
