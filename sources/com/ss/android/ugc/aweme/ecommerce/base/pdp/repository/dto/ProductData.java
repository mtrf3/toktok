package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProductData {

    @InterfaceC65349Pkn("extra")
    public final RecommendDaInfo daInfo;

    @InterfaceC65349Pkn("product")
    public final Product product;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        ProductData productData = (ProductData) obj;
        return o.LJ(this.product, productData.product) && o.LJ(this.daInfo, productData.daInfo);
    }

    public final int hashCode() {
        Product product = this.product;
        int hashCode = (product == null ? 0 : product.hashCode()) * 31;
        RecommendDaInfo recommendDaInfo = this.daInfo;
        return hashCode + (recommendDaInfo != null ? recommendDaInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductData(product=");
        LIZ.append(this.product);
        LIZ.append(", daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ProductData(Product product, RecommendDaInfo recommendDaInfo) {
        this.product = product;
        this.daInfo = recommendDaInfo;
    }
}
