package com.ss.android.ugc.aweme.result.common.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

/* loaded from: classes7.dex */
public final class SearchLiveList extends SearchApiResult {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public Boolean hasMore = Boolean.FALSE;

    @InterfaceC65349Pkn("e_com_mall_live_card_items")
    public List<EComMallLiveTabCardStruct> liveCardItems;
}
