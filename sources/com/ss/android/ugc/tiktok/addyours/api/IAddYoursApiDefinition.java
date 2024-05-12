package com.ss.android.ugc.tiktok.addyours.api;

import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC37276Ek4;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursInvitablesResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp;

/* loaded from: classes4.dex */
public interface IAddYoursApiDefinition {
    @E8L("/tiktok/v1/addyours/profile/topics")
    InterfaceC37276Ek4<HubFeedResponse> fetchHubFeed(@InterfaceC64986Pew("viewed_user_id") long j, @InterfaceC64986Pew("request_type") int i, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("load_type") int i2, @InterfaceC64986Pew("count") int i3);

    @E8L("/tiktok/v1/addyours/invitables")
    Object getInvitables(@InterfaceC64986Pew("topic_id") long j, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("count") int i, InterfaceC67352kd<? super AddYoursInvitablesResp> interfaceC67352kd);

    @E8L("/tiktok/v1/addyours/topic/detail")
    InterfaceC37276Ek4<AddYoursDetailResp> getTopicDetail(@InterfaceC64986Pew("topic_id") long j, @InterfaceC64986Pew("from_question") boolean z, @InterfaceC64986Pew("load_type") int i, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("count") int i2, @InterfaceC64986Pew("enter_from") int i3, @InterfaceC64986Pew("suggest_invitables_count") int i4, @InterfaceC64986Pew("viewed_user_id") String str);

    @E8L("/tiktok/v1/addyours/notice/videos")
    InterfaceC37276Ek4<AddYoursNoticeVideosResp> getTopicParticipants(@InterfaceC64986Pew("topic_id") long j, @InterfaceC64986Pew("cursor") long j2, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("pass_through") String str);

    @E8L("/tiktok/v1/addyours/topic/sticker")
    Object getTopicSticker(@InterfaceC64986Pew("topic_id") long j, InterfaceC67352kd<? super AddYoursTopicStickerResp> interfaceC67352kd);

    @E8M("/tiktok/v1/addyours/invite")
    @InterfaceC195757mF
    Object invite(@InterfaceC64985Pev("invitees") String str, @InterfaceC64985Pev("topic_id") long j, @InterfaceC64985Pev("item_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8M("/tiktok/v1/addyours/topic/collect")
    @InterfaceC195757mF
    Object markCollectedStatus(@InterfaceC64985Pev("topic_id") long j, @InterfaceC64985Pev("action") int i, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
