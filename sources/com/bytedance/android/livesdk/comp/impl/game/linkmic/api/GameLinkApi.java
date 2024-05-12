package com.bytedance.android.livesdk.comp.impl.game.linkmic.api;

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
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import X.R2P;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.feedback.GuestFeedbackSubmitResponse;
import java.util.Map;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.AckStateResp;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;
import tikcast.linkmic.controller.GetStateReq;
import tikcast.linkmic.controller.GetStateResp;

/* loaded from: classes14.dex */
public interface GameLinkApi {
    @E8M("/tikcast/linkmic/change_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73672Svk<R2P<ChangeStateResp>> changeState(@InterfaceC195727mC ChangeStateReq changeStateReq);

    @E8L("/webcast/linkmic_multi_guest/list_by_type/")
    AbstractC73638SvC<C28467BFf<MultiLiveGuestInfoList>> getListByType(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("channel_id") long j3, @InterfaceC64986Pew("need_list_type_set_json_str") String str, @InterfaceC64986Pew("list_by_type_scene") int i, @InterfaceC64986Pew("reason") int i2);

    @E8M("/tikcast/linkmic/get_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73672Svk<R2P<GetStateResp>> getState(@InterfaceC195727mC GetStateReq getStateReq);

    @E8M("/webcast/linkmic_multi_guest/reply_accept_notice/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> replyAcceptNotice(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("guest_user_id") long j2, @InterfaceC64985Pev("anchor_id") long j3, @InterfaceC64985Pev("channel_id") long j4);

    @E8M("/tikcast/linkmic/report_link_message/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ReportLinkMessageResp>> reportLinkMsg(@InterfaceC195727mC ReportLinkMessageReq reportLinkMessageReq);

    @E8M("/tikcast/linkmic/ack_state/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73672Svk<R2P<AckStateResp>> sendMessageAck(@InterfaceC195727mC AckStateReq ackStateReq);

    @E8M("/feedback/2/post_message/")
    @InterfaceC195757mF
    AbstractC73672Svk<GuestFeedbackSubmitResponse> submitFeedback(@InterfaceC36229EJt Map<String, String> map);

    @E8M("/webcast/linkmic_multi_guest/turn_off_invitation/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> turnOffInvitation(@InterfaceC64985Pev("room_id") long j);
}
