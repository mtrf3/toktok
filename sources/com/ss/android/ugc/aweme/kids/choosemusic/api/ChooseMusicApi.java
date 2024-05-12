package com.ss.android.ugc.aweme.kids.choosemusic.api;

import X.C10K;
import X.C76L;
import X.E4Q;
import X.E9R;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.choosemusic.model.MusicCollectionFeedResponse;
import com.ss.android.ugc.aweme.kids.choosemusic.model.MusicPickResponse;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollection;
import com.ss.android.ugc.aweme.kids.music.model.MusicList;
import com.ss.android.ugc.aweme.kids.music.model.SimpleMusicDetail;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes7.dex */
public final class ChooseMusicApi {
    public static final API LIZ = (API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(E9R.LIZ).create(API.class);

    /* loaded from: classes16.dex */
    public interface API {
        @E4Q("/tiktok/v1/kids/music/collect/")
        C10K<BaseResponse> collectMusic(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("action") int i);

        @E4Q("/tiktok/v1/kids/hot/music/")
        C10K<MusicList> getHotMusicList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("not_duplicate") boolean z);

        @E4Q("/tiktok/v1/kids/music/collection/")
        C10K<MusicCollection> getMusicSheet(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/aweme/v1/music/recommend/by/video/")
        C10K<MusicList> getRecommenMusicListFromAI(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("from") String str, @InterfaceC64989Pez("zip_uri") String str2, @InterfaceC64989Pez("music_ailab_ab") String str3, @InterfaceC64989Pez("creation_id") String str4, @InterfaceC64989Pez("micro_app_id") String str5, @InterfaceC64989Pez("video_duration") long j);

        @E4Q("/aweme/v1/sticker/music")
        C10K<MusicList> getStickerMusic(@InterfaceC64989Pez("sticker") String str);

        @E4Q("/tiktok/v1/kids/music/collection/feed/")
        C10K<MusicCollectionFeedResponse> musicCollectionFeed(@InterfaceC64989Pez("cursor") Integer num, @InterfaceC64989Pez("count") Integer num2);

        @E4Q("/tiktok/v1/kids/music/list/")
        C10K<MusicList> musicList(@InterfaceC64989Pez("mc_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/tiktok/v1/kids/music/pick/")
        C10K<MusicPickResponse> musicPick(@InterfaceC64989Pez("radio_cursor") Integer num, @InterfaceC64989Pez("extra_music_ids") String str, @InterfaceC64989Pez("is_commerce_music") Boolean bool);

        @E4Q("/aweme/v1/music/detail/")
        C76L<SimpleMusicDetail> queryMusic(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("click_reason") int i);

        @E4Q("/tiktok/v1/kids/music/list/")
        C10K<MusicList> secondLevelMusicList(@InterfaceC64989Pez("mc_id") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("level") int i3);

        @E4Q("/tiktok/v1/kids/user/music/collect/")
        C10K<CollectedMusicList> userCollectedMusicList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("scene") String str);
    }
}
