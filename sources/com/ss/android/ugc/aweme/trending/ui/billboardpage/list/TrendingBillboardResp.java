package com.ss.android.ugc.aweme.trending.ui.billboardpage.list;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingBillboardResp extends BaseResponse {

    @InterfaceC65349Pkn("billboard_icon_url_list")
    public final List<String> bannerBackgroundUrlList;

    @InterfaceC65349Pkn("billboard_info")
    public final List<TrendingBillboardModel> billboard;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingBillboardResp)) {
            return false;
        }
        TrendingBillboardResp trendingBillboardResp = (TrendingBillboardResp) obj;
        return o.LJ(this.billboard, trendingBillboardResp.billboard) && o.LJ(this.bannerBackgroundUrlList, trendingBillboardResp.bannerBackgroundUrlList);
    }

    public final int hashCode() {
        List<TrendingBillboardModel> list = this.billboard;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.bannerBackgroundUrlList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingBillboardResp(billboard=");
        LIZ.append(this.billboard);
        LIZ.append(", bannerBackgroundUrlList=");
        return C1NE.LIZIZ(LIZ, this.bannerBackgroundUrlList, ')', LIZ);
    }

    public TrendingBillboardResp(List<TrendingBillboardModel> list, List<String> list2) {
        this.billboard = list;
        this.bannerBackgroundUrlList = list2;
    }
}
