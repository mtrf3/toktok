package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentBillSummary {

    @InterfaceC65349Pkn("bill_summary")
    public final Summary billSummary;

    @InterfaceC65349Pkn("payment_method_code")
    public final String paymentMethodId;

    public static /* synthetic */ PaymentBillSummary copy$default(PaymentBillSummary paymentBillSummary, String str, Summary summary, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentBillSummary.paymentMethodId;
        }
        if ((i & 2) != 0) {
            summary = paymentBillSummary.billSummary;
        }
        return paymentBillSummary.copy(str, summary);
    }

    public final PaymentBillSummary copy(String str, Summary summary) {
        return new PaymentBillSummary(str, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentBillSummary)) {
            return false;
        }
        PaymentBillSummary paymentBillSummary = (PaymentBillSummary) obj;
        return o.LJ(this.paymentMethodId, paymentBillSummary.paymentMethodId) && o.LJ(this.billSummary, paymentBillSummary.billSummary);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Summary summary = this.billSummary;
        return hashCode + (summary != null ? summary.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentBillSummary(paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", billSummary=");
        LIZ.append(this.billSummary);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Summary getBillSummary() {
        return this.billSummary;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public PaymentBillSummary(String str, Summary summary) {
        this.paymentMethodId = str;
        this.billSummary = summary;
    }
}
