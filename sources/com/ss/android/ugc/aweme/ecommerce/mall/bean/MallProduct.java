package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallProduct {

    @InterfaceC65349Pkn("images")
    public final List<ProductImage> images;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("price")
    public final ProductPrice price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("selling_points")
    public final List<SellingPoint> sellingPointsList;

    @InterfaceC65349Pkn("sold_count")
    public final Long soldCount;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallProduct copy$default(MallProduct mallProduct, String str, String str2, List list, ProductPrice productPrice, String str3, List list2, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = mallProduct.title;
        }
        if ((i & 4) != 0) {
            list = mallProduct.images;
        }
        if ((i & 8) != 0) {
            productPrice = mallProduct.price;
        }
        if ((i & 16) != 0) {
            str3 = mallProduct.schema;
        }
        if ((i & 32) != 0) {
            list2 = mallProduct.sellingPointsList;
        }
        if ((i & 64) != 0) {
            l = mallProduct.soldCount;
        }
        if ((i & 128) != 0) {
            str4 = mallProduct.logExtra;
        }
        return mallProduct.copy(str, str2, list, productPrice, str3, list2, l, str4);
    }

    public final MallProduct copy(String str, String str2, List<ProductImage> list, ProductPrice productPrice, String str3, List<SellingPoint> list2, Long l, String str4) {
        return new MallProduct(str, str2, list, productPrice, str3, list2, l, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallProduct)) {
            return false;
        }
        MallProduct mallProduct = (MallProduct) obj;
        return o.LJ(this.productId, mallProduct.productId) && o.LJ(this.title, mallProduct.title) && o.LJ(this.images, mallProduct.images) && o.LJ(this.price, mallProduct.price) && o.LJ(this.schema, mallProduct.schema) && o.LJ(this.sellingPointsList, mallProduct.sellingPointsList) && o.LJ(this.soldCount, mallProduct.soldCount) && o.LJ(this.logExtra, mallProduct.logExtra);
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProductImage> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ProductPrice productPrice = this.price;
        int hashCode4 = (hashCode3 + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        String str3 = this.schema;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SellingPoint> list2 = this.sellingPointsList;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.soldCount;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.logExtra;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallProduct(productId=");
        LIZ.append(this.productId);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", images=");
        LIZ.append(this.images);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", sellingPointsList=");
        LIZ.append(this.sellingPointsList);
        LIZ.append(", soldCount=");
        LIZ.append(this.soldCount);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public final List<ProductImage> getImages() {
        return this.images;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final ProductPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final List<SellingPoint> getSellingPointsList() {
        return this.sellingPointsList;
    }

    public final Long getSoldCount() {
        return this.soldCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public MallProduct(String str, String str2, List<ProductImage> list, ProductPrice productPrice, String str3, List<SellingPoint> list2, Long l, String str4) {
        this.productId = str;
        this.title = str2;
        this.images = list;
        this.price = productPrice;
        this.schema = str3;
        this.sellingPointsList = list2;
        this.soldCount = l;
        this.logExtra = str4;
    }
}
