package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PdpAddToShowcaseResponse {

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpAddToShowcaseResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpAddToShowcaseResponse)) {
            return false;
        }
        PdpAddToShowcaseResponse pdpAddToShowcaseResponse = (PdpAddToShowcaseResponse) obj;
        return o.LJ(this.statusCode, pdpAddToShowcaseResponse.statusCode) && o.LJ(this.statusMsg, pdpAddToShowcaseResponse.statusMsg);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpAddToShowcaseResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        return q.LIZIZ(LIZ, this.statusMsg, ')', LIZ);
    }

    public PdpAddToShowcaseResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }

    public /* synthetic */ PdpAddToShowcaseResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
