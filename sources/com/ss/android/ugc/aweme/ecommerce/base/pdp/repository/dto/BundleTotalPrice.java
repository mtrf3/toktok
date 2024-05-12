package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundleTotalPrice {

    @InterfaceC65349Pkn("activity_id")
    public final String activityId;

    @InterfaceC65349Pkn("price")
    public final BundlePrice price;

    @InterfaceC65349Pkn("save_title")
    public final String saveTitle;

    @InterfaceC65349Pkn("total_title")
    public final String totalTitle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleTotalPrice)) {
            return false;
        }
        BundleTotalPrice bundleTotalPrice = (BundleTotalPrice) obj;
        return o.LJ(this.saveTitle, bundleTotalPrice.saveTitle) && o.LJ(this.totalTitle, bundleTotalPrice.totalTitle) && o.LJ(this.price, bundleTotalPrice.price) && o.LJ(this.activityId, bundleTotalPrice.activityId);
    }

    public final int hashCode() {
        String str = this.saveTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BundlePrice bundlePrice = this.price;
        int hashCode3 = (hashCode2 + (bundlePrice == null ? 0 : bundlePrice.hashCode())) * 31;
        String str3 = this.activityId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleTotalPrice(saveTitle=");
        LIZ.append(this.saveTitle);
        LIZ.append(", totalTitle=");
        LIZ.append(this.totalTitle);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", activityId=");
        return q.LIZIZ(LIZ, this.activityId, ')', LIZ);
    }

    public BundleTotalPrice(String str, String str2, BundlePrice bundlePrice, String str3) {
        this.saveTitle = str;
        this.totalTitle = str2;
        this.price = bundlePrice;
        this.activityId = str3;
    }
}
