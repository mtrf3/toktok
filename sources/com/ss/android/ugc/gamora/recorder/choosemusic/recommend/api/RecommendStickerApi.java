package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes12.dex */
public interface RecommendStickerApi {
    @E4Q("/tiktok/effect/recommended_by_music/v1/")
    AbstractC73672Svk<RecommendStickerResponse> fetchRecommendSticker(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("threshold_value") int i, @InterfaceC64989Pez("effect_sdk_version") String str2);
}
