package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.E4Q;
import X.E4T;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes2.dex */
public interface StickerStoreApi {
    @E4T("im/sticker/set/list/added/add/")
    Object addStickerSet(@InterfaceC64989Pez("sticker_set_id") long j, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E4Q("im/sticker/set/details/")
    Object batchGetStickerSetDetailList(@InterfaceC64989Pez("sticker_set_ids") String str, InterfaceC67352kd<? super StickerSetDetailListResponse> interfaceC67352kd);

    @E4Q("im/sticker/favorite/list")
    Object getFavStickerList(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") long j2, InterfaceC67352kd<? super FavStickerListResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/favorite_video_view/")
    Object getFavoriteVideoList(@InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") long j2, InterfaceC67352kd<? super Video2StickerFavoriteVideoResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/liked_video_view/")
    Object getLikedVideoList(@InterfaceC64989Pez("min_cursor") long j, @InterfaceC64989Pez("max_cursor") long j2, @InterfaceC64989Pez("count") long j3, InterfaceC67352kd<? super Video2StickerLikedVideoResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/notification/list/")
    Object getNotificationVideoStickerUserList(@InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("range_start_time") long j, @InterfaceC64989Pez("cursor") long j2, @InterfaceC64989Pez("count") int i, InterfaceC67352kd<? super Video2StickerSceneResponse> interfaceC67352kd);

    @E4Q("im/sticker/popular/list")
    Object getPopularStickerList(InterfaceC67352kd<? super PopularStickerListResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/published_video_view/")
    Object getPostedVideoList(@InterfaceC64989Pez("min_create_time") long j, @InterfaceC64989Pez("max_create_time") long j2, @InterfaceC64989Pez("count") long j3, InterfaceC67352kd<? super Video2StickerPostedVideoResponse> interfaceC67352kd);

    @E4Q("im/sticker/set/list/")
    Object getStickerSetList(@InterfaceC64989Pez("target_user_id") Long l, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") long j2, @InterfaceC64989Pez("scene") int i, InterfaceC67352kd<? super StickerSetListResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/rank/list/")
    Object getVideoStickerList(@InterfaceC64989Pez("rank_type") int i, @InterfaceC64989Pez("count") long j, @InterfaceC64989Pez("cursor") long j2, InterfaceC67352kd<? super Video2StickerSceneResponse> interfaceC67352kd);

    @E4Q("im/video2sticker/profile/list/")
    Object getVideoStickerListInProfile(@InterfaceC64989Pez("sec_user_id") String str, @InterfaceC64989Pez("count") long j, @InterfaceC64989Pez("cursor") long j2, InterfaceC67352kd<? super Video2StickerSceneResponse> interfaceC67352kd);

    @E4T("im/sticker/set/list/added/update/")
    Object updateAddedStickerSetList(@InterfaceC64989Pez("sticker_set_ids") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E4T("im/sticker/favorite/update/")
    Object updateFavSticker(@InterfaceC64989Pez("sticker_id") long j, @InterfaceC64989Pez("sticker_type") int i, @InterfaceC64989Pez("action") int i2, InterfaceC67352kd<? super FavStickerUpdateResponse> interfaceC67352kd);

    @E4T("im/video2sticker/create/")
    Object uploadCreatedVideoSticker(@InterfaceC64989Pez("store_toggle") boolean z, @InterfaceC64989Pez("origin_video_id") long j, @InterfaceC64989Pez("origin_video_sec_user_id") String str, @InterfaceC64989Pez("sticker_type") int i, @InterfaceC64989Pez("static_uri") String str2, @InterfaceC64989Pez("animated_uri") String str3, @InterfaceC64989Pez("width") long j2, @InterfaceC64989Pez("height") long j3, @InterfaceC64989Pez("labels") String str4, InterfaceC67352kd<? super SaveVideoStickerResponse> interfaceC67352kd);

    @E4T("im/video2sticker/update/")
    Object uploadStickerStatus(@InterfaceC64989Pez("video_sticker_id") long j, @InterfaceC64989Pez("action_enum") int i, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
