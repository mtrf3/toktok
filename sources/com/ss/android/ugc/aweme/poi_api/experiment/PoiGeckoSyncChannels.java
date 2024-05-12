package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C00F;
import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PoiGeckoSyncChannels extends F9E {

    @InterfaceC65349Pkn("nearby")
    public final List<String> nearbyGeckoChannels;

    @InterfaceC65349Pkn("poi_detail")
    public final List<String> poiDetailGeckoChannels;

    @InterfaceC65349Pkn("review_banner")
    public final List<String> poiReviewBannerGeckoChannels;

    public PoiGeckoSyncChannels() {
        this(null, null, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.nearbyGeckoChannels, this.poiDetailGeckoChannels, this.poiReviewBannerGeckoChannels};
    }

    public PoiGeckoSyncChannels(List<String> list, List<String> list2, List<String> list3) {
        C00F.LJ(list, "nearbyGeckoChannels", list2, "poiDetailGeckoChannels", list3, "poiReviewBannerGeckoChannels");
        this.nearbyGeckoChannels = list;
        this.poiDetailGeckoChannels = list2;
        this.poiReviewBannerGeckoChannels = list3;
    }

    public PoiGeckoSyncChannels(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
