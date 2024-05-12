package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ProductInfo implements Serializable {

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("merchant_id")
    public final String merchantId;

    @InterfaceC65349Pkn("price")
    public final Float price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, String str, String str2, Float f, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productInfo.productId;
        }
        if ((i & 2) != 0) {
            str2 = productInfo.merchantId;
        }
        if ((i & 4) != 0) {
            f = productInfo.price;
        }
        if ((i & 8) != 0) {
            str3 = productInfo.currency;
        }
        return productInfo.copy(str, str2, f, str3);
    }

    public final ProductInfo copy(String str, String str2, Float f, String str3) {
        return new ProductInfo(str, str2, f, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfo)) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        return o.LJ(this.productId, productInfo.productId) && o.LJ(this.merchantId, productInfo.merchantId) && o.LJ(this.price, productInfo.price) && o.LJ(this.currency, productInfo.currency);
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.price;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.currency;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfo(productId=");
        LIZ.append(this.productId);
        LIZ.append(", merchantId=");
        LIZ.append(this.merchantId);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", currency=");
        return q.LIZIZ(LIZ, this.currency, ')', LIZ);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public ProductInfo(String str, String str2, Float f, String str3) {
        this.productId = str;
        this.merchantId = str2;
        this.price = f;
        this.currency = str3;
    }

    public /* synthetic */ ProductInfo(String str, String str2, Float f, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Float.valueOf(0.0f) : f, (i & 8) != 0 ? "" : str3);
    }
}
