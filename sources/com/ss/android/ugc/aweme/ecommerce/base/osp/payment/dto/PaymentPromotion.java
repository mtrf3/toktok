package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentPromotion {

    @InterfaceC65349Pkn("promotion_amount")
    public final String amount;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("edit_card_prom_desc")
    public final String descInEditStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPromotion)) {
            return false;
        }
        PaymentPromotion paymentPromotion = (PaymentPromotion) obj;
        return o.LJ(this.desc, paymentPromotion.desc) && o.LJ(this.amount, paymentPromotion.amount) && o.LJ(this.descInEditStatus, paymentPromotion.descInEditStatus);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.descInEditStatus;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentPromotion(desc=");
        LIZ.append(this.desc);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", descInEditStatus=");
        return q.LIZIZ(LIZ, this.descInEditStatus, ')', LIZ);
    }

    public PaymentPromotion(String str, String str2, String str3) {
        this.desc = str;
        this.amount = str2;
        this.descInEditStatus = str3;
    }
}
