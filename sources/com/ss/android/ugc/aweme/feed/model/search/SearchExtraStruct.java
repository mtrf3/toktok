package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SearchExtraStruct implements Serializable {

    @InterfaceC65349Pkn("liveProductStruct")
    public SearchLiveCommdityStruct liveProductStruct;

    @InterfaceC65349Pkn("search_live_struct")
    public SearchLiveStruct searchLiveStruct;

    @InterfaceC65349Pkn("searchShopStruct")
    public SearchShopStruct searchShopStruct;

    public final SearchLiveCommdityStruct getLiveProductStruct() {
        return this.liveProductStruct;
    }

    public final SearchLiveStruct getSearchLiveStruct() {
        return this.searchLiveStruct;
    }

    public final SearchShopStruct getSearchShopStruct() {
        return this.searchShopStruct;
    }

    public final void setLiveProductStruct(SearchLiveCommdityStruct searchLiveCommdityStruct) {
        this.liveProductStruct = searchLiveCommdityStruct;
    }

    public final void setSearchLiveStruct(SearchLiveStruct searchLiveStruct) {
        this.searchLiveStruct = searchLiveStruct;
    }

    public final void setSearchShopStruct(SearchShopStruct searchShopStruct) {
        this.searchShopStruct = searchShopStruct;
    }
}
