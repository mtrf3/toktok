package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import X.R2P;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLinkMicAdResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestBonusResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateRoomLayoutSettings;
import java.util.Map;

/* loaded from: classes14.dex */
public interface MultiLiveApi {
    @E8M("/webcast/linkmic_multi_guest/guest_mic_camera_manage/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GuestMicCameraManageResponse.ResponseData>> anchorMuteGuest(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("anchor_id") long j2, @InterfaceC64985Pev("channel_id") long j3, @InterfaceC64985Pev("guest_user_id") Long l, @InterfaceC64985Pev("op") int i, @InterfaceC64985Pev("change_scene") Integer num);

    @E8M("/webcast/linkmic_multi_guest/get_ad/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GetLinkMicAdResponse.ResponseData>> getAd(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("ad_id") long j2);

    @E8L("/webcast/linkmic_multi_guest/list_by_type/")
    AbstractC73638SvC<C28467BFf<MultiLiveGuestInfoList>> getListByType(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("channel_id") long j3, @InterfaceC64986Pew("need_list_type_set_json_str") String str, @InterfaceC64986Pew("list_by_type_scene") int i, @InterfaceC64986Pew("source") int i2, @InterfaceC64986Pew("reason") int i3, @InterfaceC64986Pew("applier_list_pin_gift_score_threshold") int i4);

    @E8L("/webcast/linkmic_multi_guest/get_bonus/")
    AbstractC73672Svk<GetMultiGuestBonusResponse> getMultiGuestBonus(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2);

    @E8M("/webcast/linkmic_multi_guest/get_shared_invitee_panel/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GetSharedInviteePanelResponse.ResponseData>> getSharedInviteePanelState(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("user_return_type") int i, @InterfaceC64985Pev("channel_id") String str);

    @E8M("/webcast/linkmic_multi_guest/reply_accept_notice/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> replyAcceptNotice(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("guest_user_id") long j2, @InterfaceC64985Pev("anchor_id") long j3, @InterfaceC64985Pev("channel_id") long j4);

    @E8M("/tikcast/linkmic/report_link_message/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ReportLinkMessageResp>> reportLinkMsg(@InterfaceC195727mC ReportLinkMessageReq reportLinkMessageReq);

    @E8M("/webcast/linkmic_multi_guest/shared_invitation_callback/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> sendMultiLiveShareInvitation(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("shared_invitee_user_ids_json_str") String str, @InterfaceC64985Pev("channel_id") String str2);

    @E8M("/feedback/2/post_message/")
    @InterfaceC195757mF
    AbstractC73672Svk<GuestFeedbackSubmitResponse> submitFeedback(@InterfaceC36229EJt Map<String, String> map);

    @E8M("/webcast/linkmic_multi_guest/turn_off_invitation/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> turnOffInvitation(@InterfaceC64985Pev("room_id") long j);

    @E8M("/webcast/linkmic_multi_guest/update_setting/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<UpdateRoomLayoutSettings>> updateAnchorPanelSettings(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("channel_id") long j2, @InterfaceC64985Pev("live_id") long j3, @InterfaceC64985Pev("new_layout") int i, @InterfaceC64985Pev("new_fix_mic_num") int i2, @InterfaceC64985Pev("new_allow_request_from_user") int i3, @InterfaceC64985Pev("new_allow_request_from_follower_only") int i4, @InterfaceC64985Pev("new_layout_id") String str, @InterfaceC64985Pev("background_sticker_id") String str2, @InterfaceC64985Pev("update_scene") int i5, @InterfaceC64985Pev("new_applier_sort_setting") int i6, @InterfaceC64985Pev("new_applier_sort_gift_score_threshold") long j4);

    @E8L("/webcast/linkmic_multi_guest/enlarge_screen_manage/")
    AbstractC73672Svk<C28467BFf<EnlargeScreenManageResponse.ResponseData>> zoom(@InterfaceC36228EJs Map<String, String> map);
}
