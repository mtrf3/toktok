package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundleProduct {

    @InterfaceC65349Pkn("add_count")
    public final Integer addCount;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("bundle_product_price")
    public final BundlePrice productPrice;

    @InterfaceC65349Pkn("product_source")
    public final String productSource;

    @InterfaceC65349Pkn("pdp_schema")
    public final String schema;

    @InterfaceC65349Pkn("selected_sku")
    public final BundleSku selectedSku;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleProduct)) {
            return false;
        }
        BundleProduct bundleProduct = (BundleProduct) obj;
        return o.LJ(this.productId, bundleProduct.productId) && o.LJ(this.image, bundleProduct.image) && o.LJ(this.productPrice, bundleProduct.productPrice) && o.LJ(this.selectedSku, bundleProduct.selectedSku) && o.LJ(this.title, bundleProduct.title) && o.LJ(this.sellerId, bundleProduct.sellerId) && o.LJ(this.addCount, bundleProduct.addCount) && o.LJ(this.schema, bundleProduct.schema) && o.LJ(this.productSource, bundleProduct.productSource);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        BundlePrice bundlePrice = this.productPrice;
        int hashCode3 = (hashCode2 + (bundlePrice == null ? 0 : bundlePrice.hashCode())) * 31;
        BundleSku bundleSku = this.selectedSku;
        int hashCode4 = (hashCode3 + (bundleSku == null ? 0 : bundleSku.hashCode())) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.addCount;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.schema;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productSource;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleProduct(productId=");
        LIZ.append(this.productId);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", productPrice=");
        LIZ.append(this.productPrice);
        LIZ.append(", selectedSku=");
        LIZ.append(this.selectedSku);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", addCount=");
        LIZ.append(this.addCount);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", productSource=");
        return q.LIZIZ(LIZ, this.productSource, ')', LIZ);
    }

    public BundleProduct(String str, Image image, BundlePrice bundlePrice, BundleSku bundleSku, String str2, String str3, Integer num, String str4, String str5) {
        this.productId = str;
        this.image = image;
        this.productPrice = bundlePrice;
        this.selectedSku = bundleSku;
        this.title = str2;
        this.sellerId = str3;
        this.addCount = num;
        this.schema = str4;
        this.productSource = str5;
    }
}
