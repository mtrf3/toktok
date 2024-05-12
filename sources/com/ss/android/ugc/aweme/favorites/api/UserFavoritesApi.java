package com.ss.android.ugc.aweme.favorites.api;

import X.C10K;
import X.E4Q;
import X.E4T;
import X.EFJ;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import com.ss.android.ugc.aweme.favorites.model.CollectedQuestionList;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;

/* loaded from: classes4.dex */
public final class UserFavoritesApi {
    public static final RetrofitApi LIZ = (RetrofitApi) RetrofitFactory.LIZLLL().create(EFJ.LIZJ).create(RetrofitApi.class);

    /* loaded from: classes4.dex */
    public interface RetrofitApi {
        @E4Q("/aweme/v1/aweme/collect/")
        C10K<BaseResponse> collectAweme(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("action") int i, @InterfaceC64989Pez("collect_privacy_setting") int i2);

        @E4Q("/aweme/v1/challenge/collect/")
        C10K<BaseResponse> collectChallenge(@InterfaceC64989Pez("ch_id") String str, @InterfaceC64989Pez("action") int i);

        @E4T("/tiktok/comment/collect/v1/")
        C10K<BaseResponse> collectComment(@InterfaceC64989Pez("comment_id") String str, @InterfaceC64989Pez("action") int i);

        @E4T("/aweme/v1/lvideo/collect/")
        C10K<BaseResponse> collectLongVideo(@InterfaceC64989Pez("album_id") String str, @InterfaceC64989Pez("action") int i);

        @E4Q("/aweme/v1/mix/collect/")
        C10K<BaseResponse> collectMix(@InterfaceC64989Pez("mix_id") String str, @InterfaceC64989Pez("action") int i);

        @E4Q("/aweme/v1/music/collect/")
        C10K<CollectMusicResponse> collectMusic(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("action") int i);

        @E4T("/tiktok/v1/forum/question/collect/")
        C10K<BaseResponse> collectQuestion(@InterfaceC64989Pez("question_id") long j, @InterfaceC64989Pez("action") int i);

        @E4Q("/aweme/v2/shop/seeding/collect/")
        C10K<BaseResponse> collectSeeding(@InterfaceC64989Pez("seed_id") String str, @InterfaceC64989Pez("operate_type") int i);

        @E4Q("/aweme/v1/aweme/listcollection/")
        C10K<BaseResponse> fetchCollectAwemeList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/aweme/v1/challenge/listcollection/")
        C10K<Object> fetchCollectChallengeList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/tiktok/comment/listcollection/v1/")
        C10K<CollectedCommentList> fetchCollectCommentList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/aweme/v1/music/listcollection/")
        C10K<BaseResponse> fetchCollectMusicList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/tiktok/v1/forum/question/listcollection/")
        C10K<CollectedQuestionList> fetchCollectQuestionList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);

        @E4Q("/aweme/v1/sticker/listcollection/")
        C10K<StickerList> fetchStickerList(@InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("count") int i2);
    }
}
