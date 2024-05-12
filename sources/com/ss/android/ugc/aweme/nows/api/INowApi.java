package com.ss.android.ugc.aweme.nows.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195737mD;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.models.NowArchiveFeedResponse;
import com.ss.android.ugc.aweme.models.NowArchiveResponse;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import com.ss.android.ugc.aweme.models.NowMultiUserPostResponse;
import com.ss.android.ugc.aweme.models.NowPersonInviteShareInfoResponse;
import com.ss.android.ugc.aweme.models.NowPublishInfoResponse;
import com.ss.android.ugc.aweme.models.NowUserPostResponse;

/* loaded from: classes4.dex */
public interface INowApi {
    @E8L("/aweme/v1/aweme/delete/")
    InterfaceC37276Ek4<BaseResponse> deleteItem(@InterfaceC64986Pew("aweme_id") String str);

    @E8L("/tiktok/v1/now/archive")
    InterfaceC37276Ek4<NowArchiveResponse> fetchArchiveData(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("load_type") int i);

    @E8M("/tiktok/v1/now/feed")
    @InterfaceC195757mF
    InterfaceC37276Ek4<NowFeedResponse> fetchNowFeed(@InterfaceC64985Pev("cursor") long j, @InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("preload") int i2, @InterfaceC195737mD Object obj, @InterfaceC64985Pev("insert_ids") String str, @InterfaceC64985Pev("insert_user_ids") String str2, @InterfaceC64985Pev("ext_control_info") String str3);

    @E8L("/tiktok/v1/now/multi/user/post")
    AbstractC73672Svk<NowMultiUserPostResponse> getMultiUserNowPostObservable(@InterfaceC64986Pew("author_ids") String str);

    @E8L("/tiktok/v1/now/archive/feed")
    InterfaceC37276Ek4<NowArchiveFeedResponse> getNowArchiveFeedList(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("load_type") int i, @InterfaceC64986Pew("count") long j2, @InterfaceC64986Pew("item_id") String str);

    @E8L("/tiktok/v1/now/discovery/feed")
    InterfaceC37276Ek4<NowFeedResponse> getNowDiscoveryFeed(@InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("preload") int i2, @InterfaceC195737mD Object obj);

    @E8L("/tiktok/v1/now/relation")
    Object getNowRelationResponse(InterfaceC67352kd<Object> interfaceC67352kd);

    @E8L("/tiktok/v1/now/invite_info")
    InterfaceC37276Ek4<NowPersonInviteShareInfoResponse> getPersonInviteShareInfo();

    @E8L("/tiktok/v1/now/publish_info")
    InterfaceC37276Ek4<NowPublishInfoResponse> getPublishInfo();

    @E8L("/tiktok/v1/now/user/post")
    InterfaceC37276Ek4<NowUserPostResponse> getUserNowPost(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("backward") boolean z, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("now_scene") int i2);

    @E8M("/unification/privacy/item/modify/visibility/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> setNowVisibility(@InterfaceC64985Pev("aweme_id") String str, @InterfaceC64985Pev("type") int i);

    @E8M("/tiktok/v1/now/daily_notification_switch")
    AbstractC73672Svk<BaseResponse> turnOnNowDailyNotification();

    @E8L("/aweme/v1/commit/item/digg/")
    InterfaceC37276Ek4<BaseResponse> updateLikeStatus(@InterfaceC64986Pew("aweme_id") String str, @InterfaceC64986Pew("type") String str2, @InterfaceC64986Pew("channel_id") String str3, @InterfaceC64986Pew("previous_page") String str4, @InterfaceC64986Pew("enter_from") String str5);
}
