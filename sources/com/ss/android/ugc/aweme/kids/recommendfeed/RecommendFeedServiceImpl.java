package com.ss.android.ugc.aweme.kids.recommendfeed;

import X.C58096Mr6;
import X.C58279Mu3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService;
import com.ss.android.ugc.aweme.kids.recommendfeed.ui.RecommendFeedFragment;

/* loaded from: classes11.dex */
public final class RecommendFeedServiceImpl implements IRecommendFeedService {
    public static IRecommendFeedService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IRecommendFeedService.class, false);
        if (LIZ != null) {
            return (IRecommendFeedService) LIZ;
        }
        if (C58096Mr6.P1 == null) {
            synchronized (IRecommendFeedService.class) {
                if (C58096Mr6.P1 == null) {
                    C58096Mr6.P1 = new RecommendFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.P1;
    }

    @Override // com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    public final RecommendFeedFragment LIZIZ() {
        return new RecommendFeedFragment();
    }

    @Override // com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService
    public final Aweme LIZ() {
        return C58279Mu3.LIZ;
    }
}
