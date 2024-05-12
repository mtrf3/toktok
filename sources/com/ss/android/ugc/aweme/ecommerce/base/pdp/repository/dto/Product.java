package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Product {

    @InterfaceC65349Pkn("images")
    public final List<Image> images;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("price")
    public final Price price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return o.LJ(this.productId, product.productId) && o.LJ(this.images, product.images) && o.LJ(this.price, product.price) && o.LJ(this.schema, product.schema) && o.LJ(this.logExtra, product.logExtra);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Image> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Price price = this.price;
        int hashCode3 = (hashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        String str2 = this.schema;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logExtra;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Product(productId=");
        LIZ.append(this.productId);
        LIZ.append(", images=");
        LIZ.append(this.images);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public Product(String str, List<Image> list, Price price, String str2, String str3) {
        this.productId = str;
        this.images = list;
        this.price = price;
        this.schema = str2;
        this.logExtra = str3;
    }
}
