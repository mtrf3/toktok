package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShopRecommendResponse {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data")
    public final ShopRecommendData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommendResponse)) {
            return false;
        }
        ShopRecommendResponse shopRecommendResponse = (ShopRecommendResponse) obj;
        return o.LJ(this.code, shopRecommendResponse.code) && o.LJ(this.message, shopRecommendResponse.message) && o.LJ(this.data, shopRecommendResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ShopRecommendData shopRecommendData = this.data;
        return hashCode2 + (shopRecommendData != null ? shopRecommendData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ShopRecommendResponse(code=");
        LIZ2.append(this.code);
        LIZ2.append(", message=");
        LIZ2.append(this.message);
        LIZ2.append(", data=");
        LIZ2.append(this.data);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public final boolean LIZ() {
        ShopRecommendData shopRecommendData;
        List<ProductData> list;
        Integer num = this.code;
        if (num == null || num.intValue() != 0 || (shopRecommendData = this.data) == null || (list = shopRecommendData.productList) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public ShopRecommendResponse(Integer num, String str, ShopRecommendData shopRecommendData) {
        this.code = num;
        this.message = str;
        this.data = shopRecommendData;
    }

    public /* synthetic */ ShopRecommendResponse(Integer num, String str, ShopRecommendData shopRecommendData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, str, (i & 4) != 0 ? null : shopRecommendData);
    }
}
