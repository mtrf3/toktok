package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C43588H8u;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShowcaseProductRequest {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("exposed_product_id_list")
    public final String[] exposedProductIdList;

    @InterfaceC65349Pkn("kol_id")
    public final String kolId;

    @InterfaceC65349Pkn("next_scroll_param")
    public final String nextScrollParam;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("recommend_context")
    public final String recommendContext;

    @InterfaceC65349Pkn("search_card_live_product_id_list")
    public final List<String> searchCardLiveProductIds;

    @InterfaceC65349Pkn("search_card_no_live_product_id_list")
    public final List<String> searchCardNoLiveProductIds;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    public ShowcaseProductRequest(String str, String str2, String str3, String str4, int i, String[] exposedProductIdList, List<String> searchCardLiveProductIds, List<String> searchCardNoLiveProductIds, String str5, String str6) {
        C43588H8u.LIZLLL(str, "kolId", str2, "sessionId", str3, "enterFrom", str4, "nextScrollParam");
        o.LJIIIZ(exposedProductIdList, "exposedProductIdList");
        o.LJIIIZ(searchCardLiveProductIds, "searchCardLiveProductIds");
        o.LJIIIZ(searchCardNoLiveProductIds, "searchCardNoLiveProductIds");
        this.kolId = str;
        this.sessionId = str2;
        this.enterFrom = str3;
        this.nextScrollParam = str4;
        this.count = i;
        this.exposedProductIdList = exposedProductIdList;
        this.searchCardLiveProductIds = searchCardLiveProductIds;
        this.searchCardNoLiveProductIds = searchCardNoLiveProductIds;
        this.recommendContext = str5;
        this.pageSourceInfo = str6;
    }

    public ShowcaseProductRequest(String str, String str2, String str3, String str4, int i, String[] strArr, List list, List list2, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? CardStruct.IStatusCode.DEFAULT : str4, (i2 & 16) != 0 ? 10 : i, (i2 & 32) != 0 ? new String[0] : strArr, (i2 & 64) != 0 ? C61878OQg.INSTANCE : list, (i2 & 128) != 0 ? C61878OQg.INSTANCE : list2, (i2 & 256) != 0 ? null : str5, (i2 & 512) == 0 ? str6 : null);
    }
}
