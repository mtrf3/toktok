package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShopRecommendData {

    @InterfaceC65349Pkn("feed_list")
    public final List<ProductData> productList;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommendData)) {
            return false;
        }
        ShopRecommendData shopRecommendData = (ShopRecommendData) obj;
        return o.LJ(this.productList, shopRecommendData.productList) && o.LJ(this.requestId, shopRecommendData.requestId);
    }

    public final int hashCode() {
        List<ProductData> list = this.productList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.requestId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopRecommendData(productList=");
        LIZ.append(this.productList);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.requestId, ')', LIZ);
    }

    public ShopRecommendData(List<ProductData> list, String str) {
        this.productList = list;
        this.requestId = str;
    }
}
