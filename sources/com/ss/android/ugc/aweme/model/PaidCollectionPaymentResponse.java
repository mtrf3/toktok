package com.ss.android.ugc.aweme.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidCollectionPaymentResponse extends BaseResponse {

    @InterfaceC65349Pkn("credit_balance_usd")
    public final String creditBalanceUsd;

    @InterfaceC65349Pkn("local_currency_code")
    public final String localCurrencyCode;

    @InterfaceC65349Pkn("local_currency_price")
    public final String localCurrencyPrice;

    @InterfaceC65349Pkn("local_currency_symbol")
    public final String localCurrencySymbol;

    @InterfaceC65349Pkn("order_id")
    public final String orderId;

    @InterfaceC65349Pkn("payment_method")
    public final int paymentMethod;

    @InterfaceC65349Pkn("product_price_usd")
    public final String productPriceUsd;

    @InterfaceC65349Pkn("voucher_use_status")
    public final VoucherUseStatus voucherUseStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidCollectionPaymentResponse() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaidCollectionPaymentResponse) {
            return C78966Uyw.LJIIIZ(((PaidCollectionPaymentResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.paymentMethod), this.creditBalanceUsd, this.localCurrencyPrice, this.localCurrencyCode, this.localCurrencySymbol, this.productPriceUsd, this.orderId, this.voucherUseStatus};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("PaidCollectionPaymentResponse:%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public PaidCollectionPaymentResponse(int i, String creditBalanceUsd, String localCurrencyPrice, String localCurrencyCode, String localCurrencySymbol, String productPriceUsd, String orderId, VoucherUseStatus voucherUseStatus) {
        o.LJIIIZ(creditBalanceUsd, "creditBalanceUsd");
        o.LJIIIZ(localCurrencyPrice, "localCurrencyPrice");
        o.LJIIIZ(localCurrencyCode, "localCurrencyCode");
        o.LJIIIZ(localCurrencySymbol, "localCurrencySymbol");
        o.LJIIIZ(productPriceUsd, "productPriceUsd");
        o.LJIIIZ(orderId, "orderId");
        o.LJIIIZ(voucherUseStatus, "voucherUseStatus");
        this.paymentMethod = i;
        this.creditBalanceUsd = creditBalanceUsd;
        this.localCurrencyPrice = localCurrencyPrice;
        this.localCurrencyCode = localCurrencyCode;
        this.localCurrencySymbol = localCurrencySymbol;
        this.productPriceUsd = productPriceUsd;
        this.orderId = orderId;
        this.voucherUseStatus = voucherUseStatus;
    }

    public /* synthetic */ PaidCollectionPaymentResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, VoucherUseStatus voucherUseStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? VoucherUseStatus.NO_VOUCHER_USED : voucherUseStatus);
    }
}
