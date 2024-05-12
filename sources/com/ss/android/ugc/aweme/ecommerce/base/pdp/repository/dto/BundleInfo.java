package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundleInfo {

    @InterfaceC65349Pkn("add_button")
    public final BundleAddButton bundleAddButton;

    @InterfaceC65349Pkn("bundle_id")
    public final String bundleId;

    @InterfaceC65349Pkn("bundle_schema")
    public final String bundleSchema;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("product_list")
    public final List<BundleProduct> productList;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("total_price")
    public final BundleTotalPrice totalPrice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleInfo)) {
            return false;
        }
        BundleInfo bundleInfo = (BundleInfo) obj;
        return o.LJ(this.bundleId, bundleInfo.bundleId) && o.LJ(this.productList, bundleInfo.productList) && o.LJ(this.title, bundleInfo.title) && o.LJ(this.totalPrice, bundleInfo.totalPrice) && o.LJ(this.bundleAddButton, bundleInfo.bundleAddButton) && o.LJ(this.bundleSchema, bundleInfo.bundleSchema) && o.LJ(this.daInfo, bundleInfo.daInfo);
    }

    public final int hashCode() {
        String str = this.bundleId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BundleProduct> list = this.productList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BundleTotalPrice bundleTotalPrice = this.totalPrice;
        int hashCode4 = (hashCode3 + (bundleTotalPrice == null ? 0 : bundleTotalPrice.hashCode())) * 31;
        BundleAddButton bundleAddButton = this.bundleAddButton;
        int hashCode5 = (hashCode4 + (bundleAddButton == null ? 0 : bundleAddButton.hashCode())) * 31;
        String str3 = this.bundleSchema;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleInfo(bundleId=");
        LIZ.append(this.bundleId);
        LIZ.append(", productList=");
        LIZ.append(this.productList);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", totalPrice=");
        LIZ.append(this.totalPrice);
        LIZ.append(", bundleAddButton=");
        LIZ.append(this.bundleAddButton);
        LIZ.append(", bundleSchema=");
        LIZ.append(this.bundleSchema);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public BundleInfo(String str, List<BundleProduct> list, String str2, BundleTotalPrice bundleTotalPrice, BundleAddButton bundleAddButton, String str3, String str4) {
        this.bundleId = str;
        this.productList = list;
        this.title = str2;
        this.totalPrice = bundleTotalPrice;
        this.bundleAddButton = bundleAddButton;
        this.bundleSchema = str3;
        this.daInfo = str4;
    }
}
