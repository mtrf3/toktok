package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BalanceRequest extends F9E {

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("payment_methods")
    public final List<PaymentMethodInfo> paymentMethods;

    @InterfaceC65349Pkn("summary_total_price_val")
    public final String summaryTotalPriceVal;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BalanceRequest copy$default(BalanceRequest balanceRequest, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = balanceRequest.paymentMethods;
        }
        if ((i & 2) != 0) {
            str = balanceRequest.summaryTotalPriceVal;
        }
        if ((i & 4) != 0) {
            str2 = balanceRequest.currency;
        }
        return balanceRequest.copy(list, str, str2);
    }

    public final BalanceRequest copy(List<PaymentMethodInfo> paymentMethods, String summaryTotalPriceVal, String currency) {
        o.LJIIIZ(paymentMethods, "paymentMethods");
        o.LJIIIZ(summaryTotalPriceVal, "summaryTotalPriceVal");
        o.LJIIIZ(currency, "currency");
        return new BalanceRequest(paymentMethods, summaryTotalPriceVal, currency);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.paymentMethods, this.summaryTotalPriceVal, this.currency};
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<PaymentMethodInfo> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getSummaryTotalPriceVal() {
        return this.summaryTotalPriceVal;
    }

    public BalanceRequest(List<PaymentMethodInfo> paymentMethods, String summaryTotalPriceVal, String currency) {
        o.LJIIIZ(paymentMethods, "paymentMethods");
        o.LJIIIZ(summaryTotalPriceVal, "summaryTotalPriceVal");
        o.LJIIIZ(currency, "currency");
        this.paymentMethods = paymentMethods;
        this.summaryTotalPriceVal = summaryTotalPriceVal;
        this.currency = currency;
    }
}
