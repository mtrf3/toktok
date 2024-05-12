package com.ss.android.ugc.aweme.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;

/* loaded from: classes10.dex */
public interface MentionVideoListApi {
    @E4Q("/aweme/v1/aweme/listcollection/")
    AbstractC73672Svk<AllFavoriteContentResponse> getFavoriteVideo(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i);

    @E4Q("/aweme/v1/aweme/favorite/")
    AbstractC73672Svk<FeedItemList> getLikeVideos(@InterfaceC64989Pez("invalid_item_count") int i, @InterfaceC64989Pez("is_hiding_invalid_item") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("count") int i3);

    @E4Q("/aweme/v1/aweme/post/")
    AbstractC73672Svk<FeedItemList> getPostedVideos(@InterfaceC64989Pez("source") int i, @InterfaceC64989Pez("user_avatar_shrink") String str, @InterfaceC64989Pez("video_cover_shrink") String str2, @InterfaceC64989Pez("filter_private") int i2, @InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("sec_user_id") String str3, @InterfaceC64989Pez("count") int i3);

    @E4Q("/aweme/v1/music/aweme/")
    AbstractC73672Svk<MusicAwemeList> queryMusicAwemeList(@InterfaceC64989Pez("music_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("type") int i2);
}
