package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64989Pez;
import X.InterfaceC64992Pf2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* loaded from: classes2.dex */
public interface RecommendNotInterestedApi$SyncNotInterestedApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/commit/dislike/item/")
    AbstractC73672Svk<BaseResponse> dislikeRecommend(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64992Pf2 Map<String, String> map);
}
