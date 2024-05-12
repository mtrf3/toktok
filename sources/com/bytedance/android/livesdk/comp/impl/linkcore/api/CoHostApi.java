package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.CancelResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiCancelResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra;
import webcast.api.linkmic.ApplyResponse;
import webcast.api.linkmic.KickOutResponse;
import webcast.api.linkmic.LeaveResponse;

/* loaded from: classes14.dex */
public interface CoHostApi {
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/apply/")
    AbstractC73638SvC<BaseResponse<ApplyResponse.ResponseData, CoHostInviteDetailedExtra>> apply(@InterfaceC64986Pew("to_room_id") long j, @InterfaceC64986Pew("to_user_id") long j2, @InterfaceC64986Pew("room_id") long j3, @InterfaceC64986Pew("source_type") long j4, @InterfaceC64986Pew("effective_seconds") long j5, @InterfaceC64986Pew("need_withdraw") boolean z, @InterfaceC64986Pew("transparent_extra") String str, @InterfaceC64986Pew("tag_type") int i, @InterfaceC64986Pew("tag_value") String str2, @InterfaceC64986Pew("check_perception_center") boolean z2, @InterfaceC64986Pew("client_log_id") String str3);

    @E8L("/webcast/linkmic/cancel/")
    AbstractC73638SvC<C28467BFf<CancelResponse>> cancel(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("to_room_id") long j3, @InterfaceC64986Pew("to_user_id") long j4, @InterfaceC64986Pew("sec_to_user_id") String str, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("action_id") long j5, @InterfaceC64986Pew("cancel_type") int i2, @InterfaceC64986Pew("transparent_extra") String str2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/check_permission/")
    AbstractC73638SvC<C28467BFf<C76800UCe>> checkPermissionV3(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/linkmic/finish/")
    AbstractC73638SvC<C28467BFf<C76800UCe>> finishV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str);

    @E8L("/webcast/linkmic/finish/")
    AbstractC73638SvC<C28467BFf<C76800UCe>> finishV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str, @InterfaceC64986Pew("not_suggest_to_uid") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/get_settings/")
    AbstractC73672Svk<C28467BFf<LinkGetSettingResult>> getAnchorLinkMicUserSetting(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("sec_user_id") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/invite/")
    AbstractC73638SvC<BaseResponse<LinkInviteResult, CoHostInviteDetailedExtra>> invite(@InterfaceC64986Pew("vendor") int i, @InterfaceC64986Pew("to_room_id") long j, @InterfaceC64986Pew("to_user_id") long j2, @InterfaceC64986Pew("sec_to_user_id") String str, @InterfaceC64986Pew("room_id") long j3, @InterfaceC64986Pew("invite_type") int i2, @InterfaceC64986Pew("match_type") int i3, @InterfaceC64986Pew("invite_more") boolean z, @InterfaceC64986Pew("invite_from_channel_id") long j4, @InterfaceC64986Pew("effective_seconds") int i4, @InterfaceC64986Pew("need_withdraw") boolean z2, @InterfaceC64986Pew("transparent_extra") String str2, @InterfaceC64986Pew("tag_type") int i5, @InterfaceC64986Pew("tag_value") String str3, @InterfaceC64986Pew("check_perception_center") boolean z3, @InterfaceC64986Pew("client_log_id") String str4);

    @E8L("/webcast/linkmic/join_channel/")
    AbstractC73638SvC<C28467BFf<C76800UCe>> joinChannelV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("transparent_extra") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/kick_out/")
    AbstractC73638SvC<C28467BFf<KickOutResponse.ResponseData>> kickOut(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("to_user_id") long j3, @InterfaceC64986Pew("to_room_id") long j4, @InterfaceC64986Pew("kickout_type") int i, @InterfaceC64986Pew("transparent_extra") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/leave/")
    AbstractC73638SvC<C28467BFf<LeaveResponse.ResponseData>> leave(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("not_suggest_to_uid") long j3, @InterfaceC64986Pew("transparent_extra") String str);

    @E8L("/webcast/linkmic/multi_cancel/")
    AbstractC73638SvC<C28467BFf<MultiCancelResponse>> multiCancel(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("cancel_users") String str, @InterfaceC64986Pew("transparent_extra") String str2);

    @E8L("/webcast/linkmic/permit/")
    AbstractC73638SvC<C28467BFf<PermitResponse.ResponseData>> permit(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("permit_status") int i, @InterfaceC64986Pew("apply_user_id") long j3, @InterfaceC64986Pew("apply_room_id") long j4, @InterfaceC64986Pew("action_id") long j5, @InterfaceC64986Pew("transparent_extra") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic_match/auto_match/")
    AbstractC73672Svk<C28467BFf<AutoMatchResp.ResponseData>> randomLinkMicAutoMatch(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("tz_name") String str2, @InterfaceC64986Pew("tz_offset") int i);

    @E8L("/webcast/linkmic_match/cancel_match/")
    AbstractC73672Svk<C28467BFf<C76800UCe>> randomLinkMicCancelMatch(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("sec_user_id") String str);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/reply/")
    AbstractC73638SvC<C28467BFf<LinkReplyResult>> reply(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("reply_status") int i, @InterfaceC64986Pew("invite_user_id") long j3, @InterfaceC64986Pew("action_id") long j4, @InterfaceC64986Pew("invite_room_id") long j5, @InterfaceC64986Pew("transparent_extra") String str);

    @E8M("/webcast/linkmic/feedback/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> reportBroadcasterLinkIssue(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64986Pew("anchor_id") long j3, @InterfaceC64985Pev("sec_anchor_id") String str, @InterfaceC64986Pew("to_user_id") long j4, @InterfaceC64985Pev("sec_to_user_id") String str2, @InterfaceC64985Pev("scene") String str3, @InterfaceC64985Pev("vendor") int i, @InterfaceC64985Pev("issue_category") String str4, @InterfaceC64985Pev("issue_content") String str5, @InterfaceC64985Pev("err_code") long j5, @InterfaceC64985Pev("extra_str") String str6);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/resume/")
    AbstractC73638SvC<C28467BFf<ResumeResponse.ResponseData>> resume(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/rivals/")
    AbstractC73672Svk<BaseResponse<RivalsListsData, RivalsListExtra>> rivalsList(@InterfaceC64986Pew("rivals_type") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("tz_name") String str, @InterfaceC64986Pew("tz_offset") int i2);

    @E8L("/webcast/linkmic/send_signal/")
    AbstractC73638SvC<C28467BFf<C76800UCe>> sendSignalV3(@InterfaceC64986Pew("channel_id") long j, @InterfaceC64986Pew("content") String str, @InterfaceC64986Pew("to_user_ids") long[] jArr);

    @E8M("/webcast/linkmic/update_settings/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> updateAnchorLinkSetting(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("sec_user_id") String str, @InterfaceC64985Pev("effective_field") int i, @InterfaceC64985Pev("is_turn_on") boolean z, @InterfaceC64985Pev("accept_multi_linkmic") boolean z2, @InterfaceC64985Pev("accept_not_follower_invite") boolean z3, @InterfaceC64985Pev("allow_gift_to_other_anchors") boolean z4, @InterfaceC64985Pev("block_invitation_of_this_live") boolean z5);

    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @E8L("/webcast/linkmic/list/")
    AbstractC73638SvC<C28467BFf<LinkmicListResponse>> updateUserList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("channel_id") long j2);
}
