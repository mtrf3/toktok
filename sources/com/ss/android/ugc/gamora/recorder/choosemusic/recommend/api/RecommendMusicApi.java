package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;

/* loaded from: classes8.dex */
public interface RecommendMusicApi {
    @E4Q("/aweme/v1/music/detail/")
    AbstractC73672Svk<SimpleMusic> getMusicDetail(@InterfaceC64989Pez("music_id") String str);

    @E4Q("/tiktok/v1/music/recommend/effect/")
    AbstractC73672Svk<RecommendMusic> getRecommendMusic(@InterfaceC64989Pez("effect_id") String str, @InterfaceC64989Pez("resource_id") String str2);
}
