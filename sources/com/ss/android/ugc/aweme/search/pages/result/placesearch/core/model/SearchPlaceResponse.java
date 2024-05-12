package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import X.InterfaceC65349Pkn;
import com.google.gson.m;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

/* loaded from: classes9.dex */
public final class SearchPlaceResponse extends SearchApiResult {

    @InterfaceC65349Pkn("poi_info")
    public final SearchPOIInfo poiInfo;

    /* loaded from: classes9.dex */
    public static final class SearchPOIInfo {

        @InterfaceC65349Pkn("dynamic_patch")
        public final DynamicPatch dynamicPatch;

        @InterfaceC65349Pkn("nearby_auth")
        public final DynamicPatch nearbyAuth;

        @InterfaceC65349Pkn("poi_info")
        public final List<m> poiInfo;
    }
}
