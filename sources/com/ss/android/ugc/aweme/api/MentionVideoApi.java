package com.ss.android.ugc.aweme.api;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E4Q;
import X.EFJ;
import X.InterfaceC64989Pez;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;

/* loaded from: classes10.dex */
public final class MentionVideoApi implements MentionVideoListApi {
    public static final MentionVideoApi LIZIZ = new MentionVideoApi();
    public final /* synthetic */ MentionVideoListApi LIZ;

    @Override // com.ss.android.ugc.aweme.api.MentionVideoListApi
    @E4Q("/aweme/v1/aweme/listcollection/")
    public AbstractC73672Svk<AllFavoriteContentResponse> getFavoriteVideo(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i) {
        return this.LIZ.getFavoriteVideo(j, i);
    }

    @Override // com.ss.android.ugc.aweme.api.MentionVideoListApi
    @E4Q("/aweme/v1/aweme/favorite/")
    public AbstractC73672Svk<FeedItemList> getLikeVideos(@InterfaceC64989Pez("invalid_item_count") int i, @InterfaceC64989Pez("is_hiding_invalid_item") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("count") int i3) {
        return this.LIZ.getLikeVideos(i, i2, j, str, i3);
    }

    @Override // com.ss.android.ugc.aweme.api.MentionVideoListApi
    @E4Q("/aweme/v1/aweme/post/")
    public AbstractC73672Svk<FeedItemList> getPostedVideos(@InterfaceC64989Pez("source") int i, @InterfaceC64989Pez("user_avatar_shrink") String str, @InterfaceC64989Pez("video_cover_shrink") String str2, @InterfaceC64989Pez("filter_private") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("sec_user_id") String str3, @InterfaceC64989Pez("count") int i3) {
        return this.LIZ.getPostedVideos(i, str, str2, i2, j, str3, i3);
    }

    @Override // com.ss.android.ugc.aweme.api.MentionVideoListApi
    @E4Q("/aweme/v1/music/aweme/")
    public AbstractC73672Svk<MusicAwemeList> queryMusicAwemeList(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("type") int i2) {
        return this.LIZ.queryMusicAwemeList(str, j, i, i2);
    }

    public MentionVideoApi() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (MentionVideoListApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, MentionVideoListApi.class);
    }
}
