package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes8.dex */
public interface RecommendHashTagAPi$RecommendHashTagApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/search/challenge/guide/")
    AbstractC73672Svk<RecommendHashtagResponse> getRecommendChallenges(@InterfaceC64987Pex("zip_uri") String str, @InterfaceC64987Pex("req_source") String str2, @InterfaceC64987Pex("request_order") int i, @InterfaceC64987Pex("edit_info") String str3);
}
