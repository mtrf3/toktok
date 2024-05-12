package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PiPoResponse {

    @InterfaceC65349Pkn("response")
    public final String response;

    @InterfaceC65349Pkn("sign")
    public final String sign;

    public static /* synthetic */ PiPoResponse copy$default(PiPoResponse piPoResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = piPoResponse.response;
        }
        if ((i & 2) != 0) {
            str2 = piPoResponse.sign;
        }
        return piPoResponse.copy(str, str2);
    }

    public final PiPoResponse copy(String str, String str2) {
        return new PiPoResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiPoResponse)) {
            return false;
        }
        PiPoResponse piPoResponse = (PiPoResponse) obj;
        return o.LJ(this.response, piPoResponse.response) && o.LJ(this.sign, piPoResponse.sign);
    }

    public int hashCode() {
        String str = this.response;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sign;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PiPoResponse(response=");
        LIZ.append(this.response);
        LIZ.append(", sign=");
        return q.LIZIZ(LIZ, this.sign, ')', LIZ);
    }

    public final String getResponse() {
        return this.response;
    }

    public final String getSign() {
        return this.sign;
    }

    public PiPoResponse(String str, String str2) {
        this.response = str;
        this.sign = str2;
    }
}
