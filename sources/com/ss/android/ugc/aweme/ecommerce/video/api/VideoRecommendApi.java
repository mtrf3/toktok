package com.ss.android.ugc.aweme.ecommerce.video.api;

import X.AbstractC73672Svk;
import X.C55805LvF;
import X.E4T;
import X.InterfaceC27211Am7;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModelResponse;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;

/* loaded from: classes10.dex */
public interface VideoRecommendApi {
    public static final C55805LvF LIZ = C55805LvF.LIZ;

    @E4T("/api/v1/shop/recommend/feed/get")
    AbstractC73672Svk<CommonFeedModelResponse> queryVideoRecommendation(@InterfaceC27211Am7 CommonFeedRequest commonFeedRequest);
}
