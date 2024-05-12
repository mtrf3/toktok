package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductInfoBizExtra {

    @InterfaceC65349Pkn("oec_product_id")
    public final String oecProductId;

    @InterfaceC65349Pkn("product_category")
    public final String productCategory;

    @InterfaceC65349Pkn("product_name")
    public final String productName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoBizExtra)) {
            return false;
        }
        ProductInfoBizExtra productInfoBizExtra = (ProductInfoBizExtra) obj;
        return o.LJ(this.productCategory, productInfoBizExtra.productCategory) && o.LJ(this.productName, productInfoBizExtra.productName) && o.LJ(this.oecProductId, productInfoBizExtra.oecProductId);
    }

    public final int hashCode() {
        String str = this.productCategory;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oecProductId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfoBizExtra(productCategory=");
        LIZ.append(this.productCategory);
        LIZ.append(", productName=");
        LIZ.append(this.productName);
        LIZ.append(", oecProductId=");
        return q.LIZIZ(LIZ, this.oecProductId, ')', LIZ);
    }

    public ProductInfoBizExtra(String str, String str2, String str3) {
        this.productCategory = str;
        this.productName = str2;
        this.oecProductId = str3;
    }
}
