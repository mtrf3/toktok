package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PriceInfoRequestParams {

    @InterfaceC65349Pkn("bill_items")
    public final List<BillItem> billItems;

    @InterfaceC65349Pkn("payment_before_pay_promotion")
    public final Price paymentBeforePayPromotion;

    @InterfaceC65349Pkn("total")
    public final Price total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfoRequestParams)) {
            return false;
        }
        PriceInfoRequestParams priceInfoRequestParams = (PriceInfoRequestParams) obj;
        return o.LJ(this.billItems, priceInfoRequestParams.billItems) && o.LJ(this.total, priceInfoRequestParams.total) && o.LJ(this.paymentBeforePayPromotion, priceInfoRequestParams.paymentBeforePayPromotion);
    }

    public final int hashCode() {
        List<BillItem> list = this.billItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Price price = this.total;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.paymentBeforePayPromotion;
        return hashCode2 + (price2 != null ? price2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriceInfoRequestParams(billItems=");
        LIZ.append(this.billItems);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", paymentBeforePayPromotion=");
        LIZ.append(this.paymentBeforePayPromotion);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PriceInfoRequestParams(List<BillItem> list, Price price, Price price2) {
        this.billItems = list;
        this.total = price;
        this.paymentBeforePayPromotion = price2;
    }
}
