package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaymentMethodPolicy {

    @InterfaceC65349Pkn("link")
    public final List<String> links;

    @InterfaceC65349Pkn("raw_text")
    public final String rawText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodPolicy)) {
            return false;
        }
        PaymentMethodPolicy paymentMethodPolicy = (PaymentMethodPolicy) obj;
        return o.LJ(this.rawText, paymentMethodPolicy.rawText) && o.LJ(this.links, paymentMethodPolicy.links);
    }

    public final int hashCode() {
        String str = this.rawText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.links;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentMethodPolicy(rawText=");
        LIZ.append(this.rawText);
        LIZ.append(", links=");
        return C1NE.LIZIZ(LIZ, this.links, ')', LIZ);
    }

    public PaymentMethodPolicy(String str, List<String> list) {
        this.rawText = str;
        this.links = list;
    }
}
