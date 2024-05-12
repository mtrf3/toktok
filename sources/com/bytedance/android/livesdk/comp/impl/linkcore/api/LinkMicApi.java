package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.AbstractC73638SvC;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC65131PhH;
import X.R2P;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CancelInviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ChangeLayoutResp;
import com.bytedance.android.livesdk.model.message.linkcore.ChangePositionResp;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.DestroyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.PermitResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyResponse;
import tikcast.linkmic.controller.CancelJoinGroupReq;
import tikcast.linkmic.controller.CancelJoinGroupResp;
import tikcast.linkmic.controller.JoinGroupReq;
import tikcast.linkmic.controller.JoinGroupResp;
import tikcast.linkmic.controller.KickOutAllGuestsParam;
import tikcast.linkmic.controller.KickOutAllGuestsResp;
import tikcast.linkmic.controller.LeaveJoinGroupReq;
import tikcast.linkmic.controller.LeaveJoinGroupResp;
import tikcast.linkmic.controller.MGetABInfosReq;
import tikcast.linkmic.controller.MGetABInfosResp;
import tikcast.linkmic.controller.PermitJoinGroupReq;
import tikcast.linkmic.controller.PermitJoinGroupResp;
import tikcast.linkmic.controller.RechargeReq;
import tikcast.linkmic.controller.RechargeResp;
import tikcast.linkmic.controller.ResumeReq;
import tikcast.linkmic.controller.ResumeResp;

/* loaded from: classes14.dex */
public interface LinkMicApi {
    @E8M("/tikcast/linkmic/apply/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ApplyRequestResponse>> applyRequest(@InterfaceC195727mC ApplyRequestParam applyRequestParam);

    @E8M("/tikcast/linkmic/cancel_apply/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<CancelApplyResponse>> cancelApply(@InterfaceC195727mC CancelApplyParam cancelApplyParam);

    @E8M("/tikcast/linkmic/cancel_invite/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<CancelInviteResponse>> cancelInvite(@InterfaceC195727mC CancelInviteParam cancelInviteParam);

    @E8M("/tikcast/linkmic/cancel_group/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<CancelJoinGroupResp>> cancelJoinGroup(@InterfaceC195727mC CancelJoinGroupReq cancelJoinGroupReq);

    @E8M("/tikcast/linkmic/change_layout/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ChangeLayoutResp>> changeLayout(@InterfaceC195727mC ChangeLayoutParam changeLayoutParam);

    @E8M("/tikcast/linkmic/change_position/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ChangePositionResp>> changePosition(@InterfaceC195727mC ChangePositionParam changePositionParam);

    @E8M("/tikcast/linkmic/create_channel/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<CreateChannelResponse>> crateChannelRequest(@InterfaceC195727mC CreateChannelParam createChannelParam);

    @E8M("/tikcast/linkmic/finish/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<DestroyRequestResponse>> destroyChannelRequest(@InterfaceC195727mC DestroyChannelParam destroyChannelParam);

    @E8M("/tikcast/linkmic/mget_ab_infos/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<MGetABInfosResp>> getRtcAbInfo(@InterfaceC195727mC MGetABInfosReq mGetABInfosReq);

    @E8M("/tikcast/linkmic/invite/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<InviteResponse>> invite(@InterfaceC195727mC InviteParam inviteParam);

    @E8M("/tikcast/linkmic/join_channel/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<JoinChannelResp>> joinChannel(@InterfaceC195727mC JoinChannelParam joinChannelParam);

    @E8M("/tikcast/linkmic/join_direct/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<JoinDirectResp>> joinDirect(@InterfaceC195727mC JoinDirectParam joinDirectParam);

    @E8M("/tikcast/linkmic/join_group/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<JoinGroupResp>> joinGroup(@InterfaceC195727mC JoinGroupReq joinGroupReq);

    @E8M("/tikcast/linkmic/kick_out/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<KickOutResponse>> kickOut(@InterfaceC195727mC KickOutParam kickOutParam);

    @E8M("/tikcast/linkmic/kick_out_all_guests/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<KickOutAllGuestsResp>> kickOutAll(@InterfaceC195727mC KickOutAllGuestsParam kickOutAllGuestsParam);

    @E8M("/tikcast/linkmic/leave/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<LeaveRequestResponse>> leaveChannelRequest(@InterfaceC195727mC LeaveChannelParam leaveChannelParam);

    @E8M("/tikcast/linkmic/leave_group/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<LeaveJoinGroupResp>> leaveJoinGroup(@InterfaceC195727mC LeaveJoinGroupReq leaveJoinGroupReq);

    @E8M("/tikcast/linkmic/permit/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<PermitResponse>> permitApply(@InterfaceC195727mC PermitParam permitParam);

    @E8M("/tikcast/linkmic/permit_group/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<PermitJoinGroupResp>> permitJoinGroup(@InterfaceC195727mC PermitJoinGroupReq permitJoinGroupReq);

    @E8M("/tikcast/linkmic/recharge/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<RechargeResp>> recharge(@InterfaceC195727mC RechargeReq rechargeReq);

    @E8M("/tikcast/linkmic/reply/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ReplyResponse>> replyInvite(@InterfaceC195727mC ReplyInviteParam replyInviteParam);

    @E8M("/tikcast/linkmic/report_link_message/")
    @InterfaceC65131PhH(EnumC29608Bjg.LINK_MIC)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ReportLinkMessageResp>> reportLinkMsg(@InterfaceC195727mC ReportLinkMessageReq reportLinkMessageReq);

    @E8M("/tikcast/linkmic/resume/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"content-type: application/json"})
    AbstractC73638SvC<R2P<ResumeResp>> resume(@InterfaceC195727mC ResumeReq resumeReq);
}
