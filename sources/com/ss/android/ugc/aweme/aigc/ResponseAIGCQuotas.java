package com.ss.android.ugc.aweme.aigc;

import X.C1NE;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ResponseAIGCQuotas {

    @InterfaceC65349Pkn("quotas")
    public final List<Quota> quotas;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCQuotas)) {
            return false;
        }
        ResponseAIGCQuotas responseAIGCQuotas = (ResponseAIGCQuotas) obj;
        return this.status_code == responseAIGCQuotas.status_code && o.LJ(this.status_msg, responseAIGCQuotas.status_msg) && o.LJ(this.quotas, responseAIGCQuotas.quotas);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return this.quotas.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseAIGCQuotas(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", quotas=");
        return C1NE.LIZIZ(LIZ, this.quotas, ')', LIZ);
    }

    public ResponseAIGCQuotas(int i, String str, List<Quota> quotas) {
        o.LJIIIZ(quotas, "quotas");
        this.status_code = i;
        this.status_msg = str;
        this.quotas = quotas;
    }

    public /* synthetic */ ResponseAIGCQuotas(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, list);
    }
}
