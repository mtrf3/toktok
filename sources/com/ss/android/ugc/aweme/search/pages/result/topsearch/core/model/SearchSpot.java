package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSpot {

    @InterfaceC65349Pkn("ala_src")
    public final String alaSrc;

    @InterfaceC65349Pkn("hotspot_items")
    public List<? extends Aweme> awemeCards;

    @InterfaceC65349Pkn("doc_id")
    public String docId;

    @InterfaceC65349Pkn("is_hotspot_degradation")
    public final boolean isHotspotDegradation;

    @InterfaceC65349Pkn("hotspot")
    public final SearchSpotInfo searchSpotInfo;

    public final int hashCode() {
        SearchSpotInfo searchSpotInfo = this.searchSpotInfo;
        if (searchSpotInfo != null) {
            return searchSpotInfo.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SearchSpot.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot");
        return o.LJ(this.searchSpotInfo, ((SearchSpot) obj).searchSpotInfo);
    }
}
