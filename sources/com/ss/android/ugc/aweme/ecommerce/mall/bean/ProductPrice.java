package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProductPrice {

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("discount_value")
    public final Float discountValue;

    @InterfaceC65349Pkn("min_price")
    public final String minPrice;

    public static /* synthetic */ ProductPrice copy$default(ProductPrice productPrice, String str, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productPrice.minPrice;
        }
        if ((i & 2) != 0) {
            str2 = productPrice.discount;
        }
        if ((i & 4) != 0) {
            f = productPrice.discountValue;
        }
        return productPrice.copy(str, str2, f);
    }

    public final ProductPrice copy(String str, String str2, Float f) {
        return new ProductPrice(str, str2, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return o.LJ(this.minPrice, productPrice.minPrice) && o.LJ(this.discount, productPrice.discount) && o.LJ(this.discountValue, productPrice.discountValue);
    }

    public int hashCode() {
        String str = this.minPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.discountValue;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPrice(minPrice=");
        LIZ.append(this.minPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", discountValue=");
        LIZ.append(this.discountValue);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final Float getDiscountValue() {
        return this.discountValue;
    }

    public final String getMinPrice() {
        return this.minPrice;
    }

    public ProductPrice(String str, String str2, Float f) {
        this.minPrice = str;
        this.discount = str2;
        this.discountValue = f;
    }
}
