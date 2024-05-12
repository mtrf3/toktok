package com.ss.android.ugc.aweme.roaming;

import X.AbstractC73672Svk;
import X.C54659Lcl;
import X.E8M;
import X.InterfaceC195727mC;

/* loaded from: classes10.dex */
public interface RegionListApi {
    public static final C54659Lcl LIZ = C54659Lcl.LIZ;

    @E8M("/tiktok/nearby/region/list/v1/")
    AbstractC73672Svk<NearbyRegionListV1Response> fetchNearbyRegionList(@InterfaceC195727mC NearbyRegionListV1Request nearbyRegionListV1Request);

    @E8M("/tiktok/nearby/region/search/v1/")
    AbstractC73672Svk<NearbyRegionSearchV1Response> searchRegions(@InterfaceC195727mC NearbyRegionSearchV1Request nearbyRegionSearchV1Request);
}
