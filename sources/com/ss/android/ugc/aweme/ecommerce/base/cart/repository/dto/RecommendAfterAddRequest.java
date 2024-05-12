package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RecommendAfterAddRequest {

    @InterfaceC65349Pkn("logistics_service_id")
    public final String logisticsServiceID;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("sku_price")
    public final String skuPrice;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendAfterAddRequest)) {
            return false;
        }
        RecommendAfterAddRequest recommendAfterAddRequest = (RecommendAfterAddRequest) obj;
        return o.LJ(this.productId, recommendAfterAddRequest.productId) && o.LJ(this.skuId, recommendAfterAddRequest.skuId) && o.LJ(this.source, recommendAfterAddRequest.source) && o.LJ(this.skuPrice, recommendAfterAddRequest.skuPrice) && o.LJ(this.logisticsServiceID, recommendAfterAddRequest.logisticsServiceID);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.source;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.skuPrice;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logisticsServiceID;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendAfterAddRequest(productId=");
        LIZ.append(this.productId);
        LIZ.append(", skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", skuPrice=");
        LIZ.append(this.skuPrice);
        LIZ.append(", logisticsServiceID=");
        return q.LIZIZ(LIZ, this.logisticsServiceID, ')', LIZ);
    }

    public RecommendAfterAddRequest(String str, String str2, Integer num, String str3, String str4) {
        this.productId = str;
        this.skuId = str2;
        this.source = num;
        this.skuPrice = str3;
        this.logisticsServiceID = str4;
    }
}
