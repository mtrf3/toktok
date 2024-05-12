package com.ss.android.ugc.aweme.trending.service;

import X.C00F;
import X.C58096Mr6;

/* loaded from: classes9.dex */
public final class TrendingDetailServiceImpl implements ITrendingFeedService {
    @Override // com.ss.android.ugc.aweme.trending.service.ITrendingFeedService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.trending.service.ITrendingFeedService
    public final void LIZJ() {
    }

    public static ITrendingFeedService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ITrendingFeedService.class, false);
        if (LIZ != null) {
            return (ITrendingFeedService) LIZ;
        }
        if (C58096Mr6.M7 == null) {
            synchronized (ITrendingFeedService.class) {
                if (C58096Mr6.M7 == null) {
                    C58096Mr6.M7 = new TrendingDetailServiceImpl();
                }
            }
        }
        return C58096Mr6.M7;
    }

    @Override // com.ss.android.ugc.aweme.trending.service.ITrendingFeedService
    public final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "enable_search_trending_inflow", true) != 1) {
            return false;
        }
        return true;
    }
}
