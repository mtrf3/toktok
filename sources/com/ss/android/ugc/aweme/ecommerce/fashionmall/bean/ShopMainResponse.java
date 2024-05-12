package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShopMainResponse extends BaseResponse {

    @InterfaceC65349Pkn("data_string")
    public final String lynxData;

    @InterfaceC65349Pkn("page_data")
    public final PageData pageData;

    @InterfaceC65349Pkn("promotion_url_list")
    public final List<String> promotionUrlList;

    @InterfaceC65349Pkn("recommend_url_list")
    public final List<String> recommendUrlList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopMainResponse copy$default(ShopMainResponse shopMainResponse, PageData pageData, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageData = shopMainResponse.pageData;
        }
        if ((i & 2) != 0) {
            str = shopMainResponse.lynxData;
        }
        if ((i & 4) != 0) {
            list = shopMainResponse.promotionUrlList;
        }
        if ((i & 8) != 0) {
            list2 = shopMainResponse.recommendUrlList;
        }
        return shopMainResponse.copy(pageData, str, list, list2);
    }

    public final ShopMainResponse copy(PageData pageData, String str, List<String> list, List<String> list2) {
        return new ShopMainResponse(pageData, str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopMainResponse)) {
            return false;
        }
        ShopMainResponse shopMainResponse = (ShopMainResponse) obj;
        return o.LJ(this.pageData, shopMainResponse.pageData) && o.LJ(this.lynxData, shopMainResponse.lynxData) && o.LJ(this.promotionUrlList, shopMainResponse.promotionUrlList) && o.LJ(this.recommendUrlList, shopMainResponse.recommendUrlList);
    }

    public int hashCode() {
        PageData pageData = this.pageData;
        int hashCode = (pageData == null ? 0 : pageData.hashCode()) * 31;
        String str = this.lynxData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.promotionUrlList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.recommendUrlList;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopMainResponse(pageData=");
        LIZ.append(this.pageData);
        LIZ.append(", lynxData=");
        LIZ.append(this.lynxData);
        LIZ.append(", promotionUrlList=");
        LIZ.append(this.promotionUrlList);
        LIZ.append(", recommendUrlList=");
        return C1NE.LIZIZ(LIZ, this.recommendUrlList, ')', LIZ);
    }

    public final String getLynxData() {
        return this.lynxData;
    }

    public final PageData getPageData() {
        return this.pageData;
    }

    public final List<String> getPromotionUrlList() {
        return this.promotionUrlList;
    }

    public final List<String> getRecommendUrlList() {
        return this.recommendUrlList;
    }

    public ShopMainResponse(PageData pageData, String str, List<String> list, List<String> list2) {
        this.pageData = pageData;
        this.lynxData = str;
        this.promotionUrlList = list;
        this.recommendUrlList = list2;
    }
}
