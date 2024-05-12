package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopBill {

    @InterfaceC65349Pkn("product_total")
    public final String productTotal;

    @InterfaceC65349Pkn("sales_tax")
    public final BillItem salesTax;

    @InterfaceC65349Pkn("total")
    public final Price total;

    @InterfaceC65349Pkn("total_discount")
    public final String totalDiscount;

    public static /* synthetic */ ShopBill copy$default(ShopBill shopBill, String str, Price price, String str2, BillItem billItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopBill.productTotal;
        }
        if ((i & 2) != 0) {
            price = shopBill.total;
        }
        if ((i & 4) != 0) {
            str2 = shopBill.totalDiscount;
        }
        if ((i & 8) != 0) {
            billItem = shopBill.salesTax;
        }
        return shopBill.copy(str, price, str2, billItem);
    }

    public final ShopBill copy(String str, Price price, String str2, BillItem billItem) {
        return new ShopBill(str, price, str2, billItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBill)) {
            return false;
        }
        ShopBill shopBill = (ShopBill) obj;
        return o.LJ(this.productTotal, shopBill.productTotal) && o.LJ(this.total, shopBill.total) && o.LJ(this.totalDiscount, shopBill.totalDiscount) && o.LJ(this.salesTax, shopBill.salesTax);
    }

    public int hashCode() {
        String str = this.productTotal;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Price price = this.total;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        String str2 = this.totalDiscount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillItem billItem = this.salesTax;
        return hashCode3 + (billItem != null ? billItem.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopBill(productTotal=");
        LIZ.append(this.productTotal);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", totalDiscount=");
        LIZ.append(this.totalDiscount);
        LIZ.append(", salesTax=");
        LIZ.append(this.salesTax);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getProductTotal() {
        return this.productTotal;
    }

    public final BillItem getSalesTax() {
        return this.salesTax;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final String getTotalDiscount() {
        return this.totalDiscount;
    }

    public final ShopBill merge(ShopBill shopBill) {
        if (shopBill == null) {
            return this;
        }
        String str = shopBill.productTotal;
        if (str == null) {
            str = this.productTotal;
        }
        Price price = shopBill.total;
        if (price == null) {
            price = this.total;
        }
        return new ShopBill(str, price, shopBill.totalDiscount, shopBill.salesTax);
    }

    public ShopBill(String str, Price price, String str2, BillItem billItem) {
        this.productTotal = str;
        this.total = price;
        this.totalDiscount = str2;
        this.salesTax = billItem;
    }
}
