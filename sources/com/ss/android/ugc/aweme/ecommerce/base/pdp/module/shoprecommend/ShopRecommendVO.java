package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendData;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopRecommendVO {

    @InterfaceC65349Pkn("enter_name")
    public final String enterName;

    @InterfaceC65349Pkn("enter_schema")
    public final String enterSchema;

    @InterfaceC65349Pkn("model_title")
    public final String modelTitle;

    @InterfaceC65349Pkn("shop_recommend_data")
    public final ShopRecommendData shopRecommendData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommendVO)) {
            return false;
        }
        ShopRecommendVO shopRecommendVO = (ShopRecommendVO) obj;
        return o.LJ(this.modelTitle, shopRecommendVO.modelTitle) && o.LJ(this.enterName, shopRecommendVO.enterName) && o.LJ(this.enterSchema, shopRecommendVO.enterSchema) && o.LJ(this.shopRecommendData, shopRecommendVO.shopRecommendData);
    }

    public final int hashCode() {
        String str = this.modelTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterSchema;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShopRecommendData shopRecommendData = this.shopRecommendData;
        return hashCode3 + (shopRecommendData != null ? shopRecommendData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopRecommendVO(modelTitle=");
        LIZ.append(this.modelTitle);
        LIZ.append(", enterName=");
        LIZ.append(this.enterName);
        LIZ.append(", enterSchema=");
        LIZ.append(this.enterSchema);
        LIZ.append(", shopRecommendData=");
        LIZ.append(this.shopRecommendData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ShopRecommendVO(String str, String str2, String str3, ShopRecommendData shopRecommendData) {
        this.modelTitle = str;
        this.enterName = str2;
        this.enterSchema = str3;
        this.shopRecommendData = shopRecommendData;
    }
}
