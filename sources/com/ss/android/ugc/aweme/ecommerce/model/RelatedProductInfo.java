package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.J77;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RelatedProductInfo {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("click_product_id_list")
    public final J77<Long> clickProductIdList;

    @InterfaceC65349Pkn("expo_product_id_list")
    public final J77<Long> expoProductIdList;

    @InterfaceC65349Pkn("product_id_list")
    public final J77<Long> productIdList;

    @InterfaceC65349Pkn("session_impression_info")
    public final J77<Object> sessionImpressionInfo;

    @InterfaceC65349Pkn("video_id")
    public final String videoId;

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedProductInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedProductInfo)) {
            return false;
        }
        RelatedProductInfo relatedProductInfo = (RelatedProductInfo) obj;
        return o.LJ(this.videoId, relatedProductInfo.videoId) && o.LJ(this.authorId, relatedProductInfo.authorId) && o.LJ(this.productIdList, relatedProductInfo.productIdList) && o.LJ(this.expoProductIdList, relatedProductInfo.expoProductIdList) && o.LJ(this.clickProductIdList, relatedProductInfo.clickProductIdList) && o.LJ(this.sessionImpressionInfo, relatedProductInfo.sessionImpressionInfo);
    }

    public final int hashCode() {
        String str = this.videoId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authorId;
        return this.sessionImpressionInfo.hashCode() + ((this.clickProductIdList.hashCode() + ((this.expoProductIdList.hashCode() + ((this.productIdList.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelatedProductInfo(videoId=");
        LIZ.append(this.videoId);
        LIZ.append(", authorId=");
        LIZ.append(this.authorId);
        LIZ.append(", productIdList=");
        LIZ.append(this.productIdList);
        LIZ.append(", expoProductIdList=");
        LIZ.append(this.expoProductIdList);
        LIZ.append(", clickProductIdList=");
        LIZ.append(this.clickProductIdList);
        LIZ.append(", sessionImpressionInfo=");
        LIZ.append(this.sessionImpressionInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RelatedProductInfo(String str, String str2, J77<Long> productIdList, J77<Long> expoProductIdList, J77<Long> clickProductIdList, J77<Object> sessionImpressionInfo) {
        o.LJIIIZ(productIdList, "productIdList");
        o.LJIIIZ(expoProductIdList, "expoProductIdList");
        o.LJIIIZ(clickProductIdList, "clickProductIdList");
        o.LJIIIZ(sessionImpressionInfo, "sessionImpressionInfo");
        this.videoId = str;
        this.authorId = str2;
        this.productIdList = productIdList;
        this.expoProductIdList = expoProductIdList;
        this.clickProductIdList = clickProductIdList;
        this.sessionImpressionInfo = sessionImpressionInfo;
    }

    public /* synthetic */ RelatedProductInfo(String str, String str2, J77 j77, J77 j772, J77 j773, J77 j774, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? new J77(50) : j77, (i & 8) != 0 ? new J77(50) : j772, (i & 16) != 0 ? new J77(50) : j773, (i & 32) != 0 ? new J77(1) : j774);
    }
}
