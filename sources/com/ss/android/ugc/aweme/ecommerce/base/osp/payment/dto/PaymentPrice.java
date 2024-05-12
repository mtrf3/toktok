package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentPrice {

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_summary")
    public final Summary paymentSummary;

    @InterfaceC65349Pkn("payment_price")
    public final Price price;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPrice)) {
            return false;
        }
        PaymentPrice paymentPrice = (PaymentPrice) obj;
        return o.LJ(this.paymentMethodId, paymentPrice.paymentMethodId) && o.LJ(this.price, paymentPrice.price) && o.LJ(this.paymentSummary, paymentPrice.paymentSummary);
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Price price = this.price;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        Summary summary = this.paymentSummary;
        return hashCode2 + (summary != null ? summary.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentPrice(paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", paymentSummary=");
        LIZ.append(this.paymentSummary);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PaymentPrice(String str, Price price, Summary summary) {
        this.paymentMethodId = str;
        this.price = price;
        this.paymentSummary = summary;
    }
}
