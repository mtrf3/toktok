package com.bytedance.android.live.liveinteract.cohost.remote.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC30952CCu;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReplyReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ReserveResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerReserveNoticeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.model.Extra;
import java.util.Map;
import webcast.api.linkmic.GetUserLinkmicStatusResponse;

/* loaded from: classes14.dex */
public interface CoHostApi {
    @E8L("/webcast/linkmic/cancel/")
    AbstractC73638SvC<C28467BFf<Void>> cancel(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("to_room_id") long j3, @InterfaceC64986Pew("to_user_id") long j4, @InterfaceC64986Pew("sec_to_user_id") String str, @InterfaceC64986Pew("cancel_reason") String str2, @InterfaceC64986Pew("transparent_extra") String str3);

    @E8L("/webcast/linkmic/finish/")
    AbstractC73638SvC<C28467BFf<Void>> finishV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str);

    @E8L("/webcast/linkmic/finish/")
    AbstractC73638SvC<C28467BFf<Void>> finishV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str, @InterfaceC64986Pew("not_suggest_to_uid") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/get_settings/")
    AbstractC73672Svk<C28467BFf<LinkGetSettingResult>> getAnchorLinkMicUserSetting(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("sec_user_id") String str, @InterfaceC30952CCu Map<String, String> map);

    @E8L("/webcast/linkmic/get_user_linkmic_status/")
    AbstractC73638SvC<C28467BFf<GetUserLinkmicStatusResponse.ResponseData>> getLinkMicUserStatus(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("to_user_id") long j2, @InterfaceC64986Pew("to_room_id") long j3);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/mget_user_linkmic_status/")
    AbstractC73672Svk<C28467BFf<MGetUserLinkmicStatusResponse.ResponseData>> getUserLinkmicStatusMultiCoHost(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("to_user_ids") String str, @InterfaceC64986Pew("to_room_ids") String str2, @InterfaceC64986Pew("friend_list_room_ids") String str3, @InterfaceC64986Pew("recommend_list_room_ids") String str4, @InterfaceC64986Pew("reservation_list_room_ids") String str5);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/invite/")
    AbstractC73638SvC<BaseResponse<LinkInviteResult, Extra>> invite(@InterfaceC64986Pew("vendor") int i, @InterfaceC64986Pew("to_room_id") long j, @InterfaceC64986Pew("to_user_id") long j2, @InterfaceC64986Pew("sec_to_user_id") String str, @InterfaceC64986Pew("room_id") long j3, @InterfaceC64986Pew("invite_type") int i2, @InterfaceC64986Pew("match_type") int i3, @InterfaceC64986Pew("effective_seconds") int i4, @InterfaceC64986Pew("check_perception_center") boolean z, @InterfaceC64986Pew("tag_type") int i5, @InterfaceC64986Pew("tag_value") String str2);

    @E8L("/webcast/linkmic/join_channel/")
    AbstractC73638SvC<C28467BFf<Void>> joinChannelV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/topic/pair/")
    AbstractC73672Svk<C28467BFf<TopicPairResponse.ResponseData>> pair(@InterfaceC64986Pew("action") int i, @InterfaceC64986Pew("topic_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("pair_id") long j3, @InterfaceC64986Pew("inner_channel_id") long j4);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic_match/auto_match/")
    AbstractC73672Svk<C28467BFf<AutoMatchResp.ResponseData>> randomLinkMicAutoMatch(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("tz_name") String str2, @InterfaceC64986Pew("tz_offset") int i);

    @E8L("/webcast/linkmic_match/cancel_match/")
    AbstractC73672Svk<C28467BFf<Void>> randomLinkMicCancelMatch(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("inner_channel_id") long j2, @InterfaceC64986Pew("user_id") long j3, @InterfaceC64986Pew("sec_user_id") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/reply/")
    AbstractC73638SvC<C28467BFf<LinkReplyResult>> reply(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("reply_status") int i, @InterfaceC64986Pew("invite_user_id") long j3, @InterfaceC64986Pew("transparent_extra") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/reply_reserve/")
    AbstractC73672Svk<C28467BFf<ReplyReserveResponse.ResponseData>> replyReserve(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("reserver_room_id") long j2, @InterfaceC64986Pew("reserver_user_id") long j3, @InterfaceC64986Pew("reply_status") int i);

    @E8M("/webcast/linkmic/feedback/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> reportBroadcasterLinkIssue(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64986Pew("anchor_id") long j3, @InterfaceC64985Pev("sec_anchor_id") String str, @InterfaceC64986Pew("to_user_id") long j4, @InterfaceC64985Pev("sec_to_user_id") String str2, @InterfaceC64985Pev("scene") String str3, @InterfaceC64985Pev("vendor") int i, @InterfaceC64985Pev("issue_category") String str4, @InterfaceC64985Pev("issue_content") String str5, @InterfaceC64985Pev("err_code") long j5, @InterfaceC64985Pev("extra_str") String str6);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/reserve/")
    AbstractC73672Svk<C28467BFf<ReserveResponse.ResponseData>> reserve(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("to_room_id") long j2, @InterfaceC64986Pew("to_user_id") long j3);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/resume/")
    AbstractC73638SvC<C28467BFf<ResumeResponse.ResponseData>> resume(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/rivals/")
    AbstractC73672Svk<BaseResponse<RivalsListsData, RivalsListExtra>> rivalsList(@InterfaceC64986Pew("rivals_type") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("tz_name") String str, @InterfaceC64986Pew("tz_offset") int i2, @InterfaceC64986Pew("top_living_friend_uid") long j2, @InterfaceC64986Pew("is_official_channel") boolean z, @InterfaceC64986Pew("top_living_suggest_uid") long j3, @InterfaceC30952CCu Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/rivals/")
    AbstractC73672Svk<BaseResponse<RivalsListsData, RivalsListExtra>> rivalsListForMultiCoHost(@InterfaceC64986Pew("rivals_type") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("scene") int i2, @InterfaceC64986Pew("tz_name") String str, @InterfaceC64986Pew("tz_offset") int i3, @InterfaceC64986Pew("top_living_friend_uid") long j2, @InterfaceC64986Pew("is_official_channel") boolean z, @InterfaceC64986Pew("top_living_suggest_uid") long j3, @InterfaceC30952CCu Map<String, String> map, @InterfaceC64986Pew("panel_style_version") long j4, @InterfaceC64986Pew("client_log_id") String str2);

    @E8L("/webcast/linkmic/send_signal/")
    AbstractC73638SvC<C28467BFf<Void>> sendSignalV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("content") String str, @InterfaceC64986Pew("to_user_ids") long[] jArr);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/topic/set/")
    AbstractC73672Svk<C28467BFf<TopicSetResponse.ResponseData>> topicSet(@InterfaceC64986Pew("action") int i, @InterfaceC64986Pew("topic_id") long j, @InterfaceC64986Pew("channel_id") long j2, @InterfaceC64986Pew("topic_session_id") long j3, @InterfaceC64986Pew("room_id") long j4);

    @E8M("/webcast/cohost/trigger_living_notice/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<TriggerReserveNoticeResponse>> triggerLivingFriendNotice(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("notice_strategy_group") int i);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/trigger_reserve_notice/")
    AbstractC73672Svk<C28467BFf<TriggerReserveNoticeResponse.ResponseData>> triggerReserveNotice(@InterfaceC64986Pew("room_id") long j);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/cohost/trigger_resume_notice/")
    AbstractC73672Svk<C28467BFf<TriggerResumeNoticeResponse>> triggerResumeNotice(@InterfaceC64986Pew("channel_id") long j);

    @E8M("/webcast/linkmic/update_settings/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> updateAnchorLinkSetting(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("effective_field") int i, @InterfaceC64985Pev("is_turn_on") boolean z, @InterfaceC64985Pev("accept_multi_linkmic") boolean z2, @InterfaceC64985Pev("accept_not_follower_invite") boolean z3, @InterfaceC64985Pev("allow_gift_to_other_anchors") boolean z4, @InterfaceC64985Pev("block_invitation_of_this_live") boolean z5, @InterfaceC64985Pev("allow_live_notice_of_friends") boolean z6, @InterfaceC30952CCu Map<String, String> map);

    @E8M("/webcast/linkmic/update_settings/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> updateMultiCoHostLinkSetting(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("effective_field") int i, @InterfaceC64985Pev("block_this_multi_host_invites") boolean z, @InterfaceC64985Pev("block_this_multi_host_apply") boolean z2, @InterfaceC64985Pev("receive_friend_multi_host_invites") boolean z3, @InterfaceC64985Pev("receive_friend_multi_host_application") boolean z4, @InterfaceC64985Pev("receive_not_friend_multi_host_invites") boolean z5, @InterfaceC64985Pev("receive_not_friend_multi_host_application") boolean z6, @InterfaceC64985Pev("allow_live_notice_of_friends") boolean z7, @InterfaceC30952CCu Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/list/")
    AbstractC73638SvC<C28467BFf<LinkmicListResponse>> updateUserList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/cohost/list/")
    AbstractC73638SvC<C28467BFf<CohostListResponse.ResponseData>> updateUserListCrossArc(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2, @InterfaceC64986Pew("source") long j3);
}
