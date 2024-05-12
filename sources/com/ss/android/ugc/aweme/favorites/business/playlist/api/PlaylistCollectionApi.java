package com.ss.android.ugc.aweme.favorites.business.playlist.api;

import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.GetPlaylistCollectionListResp;

/* loaded from: classes4.dex */
public interface PlaylistCollectionApi {
    @E8M("/tiktok/v1/mix/click_record/")
    Object clickPlaylist(@InterfaceC64986Pew("mix_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8M("/tiktok/v1/mix/collect/")
    Object collectPlaylist(@InterfaceC64986Pew("mix_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/tiktok/v1/mix/collect_list/")
    Object getPlaylistCollectionList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2, InterfaceC67352kd<? super GetPlaylistCollectionListResp> interfaceC67352kd);

    @E8M("/tiktok/v1/mix/uncollect/")
    Object unCollectPlaylist(@InterfaceC64986Pew("mix_id") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
