package com.ss.android.ugc.aweme.prop.api;

import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.prop.model.StickerPropAwemeList;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;

/* loaded from: classes10.dex */
public interface StickerPropApi {
    @E4Q("/aweme/v1/sticker/detail/")
    C76L<NewFaceStickerListBean> getStickerDetail(@InterfaceC64989Pez("sticker_ids") String str, @InterfaceC64989Pez("source") int i, @InterfaceC64989Pez("app_version") String str2);

    @E4Q("/aweme/v1/sticker/detail/")
    C76L<NewFaceStickerListBean> getStickerDetail(@InterfaceC64989Pez("sticker_ids") String str, @InterfaceC64989Pez("app_version") String str2);

    @E4Q("/aweme/v1/sticker/discover/")
    C76L<StickerPropAwemeList> queryEffectDiscoverAwemeList(@InterfaceC64989Pez("sticker_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("feed_session_id") String str2, @InterfaceC64989Pez("media_type") int i2);

    @E4Q("/tiktok/v1/sticker/featured_video/candidates/")
    C76L<StickerPropAwemeList> queryFeatureVideoAwemeList(@InterfaceC64989Pez("effect_id") String str);

    @E4Q("/tiktok/notice/sticker/items/v1")
    C76L<StickerPropAwemeList> queryInboxStickerAwemeList(@InterfaceC64989Pez("sticker_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i);

    @E4Q("/aweme/v1/sticker/aweme/")
    C76L<StickerPropAwemeList> queryStickerAwemeList(@InterfaceC64989Pez("sticker_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("source") int i2, @InterfaceC64989Pez("media_type") int i3, @InterfaceC64989Pez("video_cover_shrink") String str2);

    @E4Q("/aweme/v1/sticker/aweme/")
    C76L<StickerPropAwemeList> queryStickerAwemeList(@InterfaceC64989Pez("sticker_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("media_type") int i2, @InterfaceC64989Pez("video_cover_shrink") String str2);
}
