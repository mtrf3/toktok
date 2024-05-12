package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C229108yw;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixCandidateVideosResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;

/* loaded from: classes4.dex */
public interface MixFeedApi {
    public static final C229108yw LIZ = C229108yw.LIZ;

    @E8L("/tiktok/v1/mix/check/")
    AbstractC73672Svk<CheckPlayResponse> checkPlaylistName(@InterfaceC64986Pew("check_type") int i, @InterfaceC64986Pew("name") String str);

    @E8L("/tiktok/v1/mix/candidate/")
    AbstractC73638SvC<MixCandidateVideosResponse> getMixCandidateFeeds(@InterfaceC64986Pew("cursor") long j);

    @E8L("/tiktok/v1/mix/detail/")
    AbstractC73638SvC<MixDetailResponse> getMixDetail(@InterfaceC64986Pew("mix_id") String str, @InterfaceC64986Pew("uid") String str2, @InterfaceC64986Pew("sec_uid") String str3, @InterfaceC64986Pew("from_share") boolean z);

    @E8L("/tiktok/v1/mix/videos/")
    Object getMixVideoList(@InterfaceC64986Pew("mix_id") String str, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("pull_type") int i, @InterfaceC64986Pew("uid") String str3, @InterfaceC64986Pew("sec_uid") String str4, @InterfaceC64986Pew("from_share") boolean z, @InterfaceC64986Pew("count") Integer num, @InterfaceC64986Pew("default_page_type") int i2, InterfaceC67352kd<? super MixVideosResponse> interfaceC67352kd);

    @E8L("/tiktok/v1/mix/videos/")
    AbstractC73638SvC<MixVideosResponse> getMixVideos(@InterfaceC64986Pew("mix_id") String str, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("pull_type") int i2);

    @E8L("/tiktok/v1/mix/videos/")
    AbstractC73672Svk<MixVideosResponse> getMixVideos(@InterfaceC64986Pew("mix_id") String str, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("pull_type") int i, @InterfaceC64986Pew("uid") String str3, @InterfaceC64986Pew("sec_uid") String str4);

    @E8L("/tiktok/v1/mix/videos/")
    AbstractC73672Svk<MixVideosResponse> getMixVideos2(@InterfaceC64986Pew("mix_id") String str, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("pull_type") int i, @InterfaceC64986Pew("uid") String str3, @InterfaceC64986Pew("sec_uid") String str4, @InterfaceC64986Pew("from_share") boolean z, @InterfaceC64986Pew("count") Integer num, @InterfaceC64986Pew("default_page_type") int i2);

    @E8L("/tiktok/v1/mix/list/")
    AbstractC73638SvC<MixListResponse> getUserMixList(@InterfaceC64986Pew("uid") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("sec_uid") String str2);

    @E8M("/tiktok/v1/mix/manage/")
    @InterfaceC195757mF
    AbstractC73638SvC<ManageResponse> manageMixFeed(@InterfaceC64985Pev("operation") int i, @InterfaceC64985Pev("mix_id") String str, @InterfaceC64985Pev("item_ids") String str2, @InterfaceC64985Pev("add_ids") String str3, @InterfaceC64985Pev("remove_ids") String str4, @InterfaceC64985Pev("name") String str5);

    @E8M("/aweme/v1/search/loadmore/")
    @InterfaceC195757mF
    AbstractC73638SvC<MixListResponse> searchLodeMore(@InterfaceC64985Pev("id") String str, @InterfaceC64985Pev("cursor") long j, @InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("type") int i2, @InterfaceC64985Pev("keyword") String str2);
}
