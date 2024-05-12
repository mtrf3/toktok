package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C28039AzT;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Summary {
    public static final C28039AzT PriceTips = new C28039AzT();

    @InterfaceC65349Pkn("bill_items")
    public final List<BillItem> billItems;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("origin")
    public final Price origin;

    @InterfaceC65349Pkn("payment_before_pay_promotion")
    public final Price paymentBeforePayPromotion;

    @InterfaceC65349Pkn("sku_total_quantity")
    public final Integer skuTotalQuantity;

    @InterfaceC65349Pkn("tips")
    public final Integer tips;

    @InterfaceC65349Pkn("total")
    public final Price total;

    @InterfaceC65349Pkn("total_discount")
    public final Price totalDiscount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Summary copy$default(Summary summary, List list, Price price, Price price2, String str, Price price3, Integer num, Integer num2, Price price4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = summary.billItems;
        }
        if ((i & 2) != 0) {
            price = summary.total;
        }
        if ((i & 4) != 0) {
            price2 = summary.totalDiscount;
        }
        if ((i & 8) != 0) {
            str = summary.desc;
        }
        if ((i & 16) != 0) {
            price3 = summary.origin;
        }
        if ((i & 32) != 0) {
            num = summary.tips;
        }
        if ((i & 64) != 0) {
            num2 = summary.skuTotalQuantity;
        }
        if ((i & 128) != 0) {
            price4 = summary.paymentBeforePayPromotion;
        }
        return summary.copy(list, price, price2, str, price3, num, num2, price4);
    }

    public final Summary copy(List<BillItem> list, Price price, Price price2, String str, Price price3, Integer num, Integer num2, Price price4) {
        return new Summary(list, price, price2, str, price3, num, num2, price4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return o.LJ(this.billItems, summary.billItems) && o.LJ(this.total, summary.total) && o.LJ(this.totalDiscount, summary.totalDiscount) && o.LJ(this.desc, summary.desc) && o.LJ(this.origin, summary.origin) && o.LJ(this.tips, summary.tips) && o.LJ(this.skuTotalQuantity, summary.skuTotalQuantity) && o.LJ(this.paymentBeforePayPromotion, summary.paymentBeforePayPromotion);
    }

    public int hashCode() {
        List<BillItem> list = this.billItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Price price = this.total;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        Price price2 = this.totalDiscount;
        int hashCode3 = (hashCode2 + (price2 == null ? 0 : price2.hashCode())) * 31;
        String str = this.desc;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Price price3 = this.origin;
        int hashCode5 = (hashCode4 + (price3 == null ? 0 : price3.hashCode())) * 31;
        Integer num = this.tips;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.skuTotalQuantity;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Price price4 = this.paymentBeforePayPromotion;
        return hashCode7 + (price4 != null ? price4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Summary(billItems=");
        LIZ.append(this.billItems);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", totalDiscount=");
        LIZ.append(this.totalDiscount);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", origin=");
        LIZ.append(this.origin);
        LIZ.append(", tips=");
        LIZ.append(this.tips);
        LIZ.append(", skuTotalQuantity=");
        LIZ.append(this.skuTotalQuantity);
        LIZ.append(", paymentBeforePayPromotion=");
        LIZ.append(this.paymentBeforePayPromotion);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<BillItem> getBillItems() {
        return this.billItems;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Price getOrigin() {
        return this.origin;
    }

    public final Price getPaymentBeforePayPromotion() {
        return this.paymentBeforePayPromotion;
    }

    public final Integer getSkuTotalQuantity() {
        return this.skuTotalQuantity;
    }

    public final Integer getTips() {
        return this.tips;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final Price getTotalDiscount() {
        return this.totalDiscount;
    }

    public final Summary merge(Summary summary) {
        if (summary == null) {
            return this;
        }
        List<BillItem> list = summary.billItems;
        if (list == null) {
            list = this.billItems;
        }
        Price price = summary.total;
        if (price == null) {
            price = this.total;
        }
        Price price2 = summary.totalDiscount;
        if (price2 == null) {
            price2 = this.totalDiscount;
        }
        String str = summary.desc;
        Price price3 = summary.origin;
        if (price3 == null) {
            price3 = this.origin;
        }
        Integer num = summary.tips;
        if (num == null) {
            num = this.tips;
        }
        Integer num2 = summary.skuTotalQuantity;
        if (num2 == null) {
            num2 = this.skuTotalQuantity;
        }
        Price price4 = summary.paymentBeforePayPromotion;
        if (price4 == null) {
            price4 = this.paymentBeforePayPromotion;
        }
        return new Summary(list, price, price2, str, price3, num, num2, price4);
    }

    public Summary(List<BillItem> list, Price price, Price price2, String str, Price price3, Integer num, Integer num2, Price price4) {
        this.billItems = list;
        this.total = price;
        this.totalDiscount = price2;
        this.desc = str;
        this.origin = price3;
        this.tips = num;
        this.skuTotalQuantity = num2;
        this.paymentBeforePayPromotion = price4;
    }
}
