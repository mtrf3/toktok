package com.ss.android.ugc.aweme.challenge.recommend;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes8.dex */
public final class RecommendHashTagApi {
    public static final HashTagApi LIZ = (HashTagApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.LIZ).create(HashTagApi.class);

    /* loaded from: classes8.dex */
    public interface HashTagApi {
        @E4Q("/aweme/v1/challenge/history/intervene/")
        C10K<RecommendHashTagResponse> fetchRecommendHashTagsMT(@InterfaceC64989Pez("zip_uri") String str, @InterfaceC64989Pez("effect_ids") String str2, @InterfaceC64989Pez("music_id") String str3, @InterfaceC64989Pez("video_id") String str4);
    }
}
