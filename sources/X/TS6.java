package X;

import Y.AfS17S0001000_5;
import Y.AfS40S0000000_13;
import Y.IDhS104S0100000_11;
import android.os.Debug;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractDebugInfoEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOnlyPushRtcWhenResumeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TS6 implements U62 {
    public final /* synthetic */ C74842TYw LJLIL;

    @Override // X.U62
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
    }

    @Override // X.U62
    public final void LJIIL(long j, long j2) {
    }

    @Override // X.U62
    public final void LJIJI(String str, String str2) {
    }

    @Override // X.U62
    public final void LJIJJ(java.util.Map<String, String> map) {
    }

    @Override // X.U62
    public final void LJJIFFI() {
    }

    @Override // X.U62
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.U62
    public final void LJJIJIIJIL() {
        this.LJLIL.dataChannel.pv0(AnchorBroadcastResolutionChangeEvent.class);
    }

    public TS6(C74842TYw c74842TYw) {
        this.LJLIL = c74842TYw;
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rtc turnOffEngine msg");
        this.LJLIL.getMultiGuestDataHolder().LJIIJJI();
    }

    @Override // X.U62
    public final InterfaceC76688U7w LJJIII(U65 session) {
        o.LJIIIZ(session, "session");
        return null;
    }

    @Override // X.U62
    public final void LLD(U65 session) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLFII(U65 session) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLIILII(C28272B7s sei) {
        o.LJIIIZ(sei, "sei");
    }

    @Override // X.U62
    public final UB4 LLIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        return null;
    }

    @Override // X.U62
    public final void LLILZ(U65 session) {
        o.LJIIIZ(session, "session");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rtc startPushStream msg");
        DataChannel dataChannel = this.LJLIL.LJLJJI;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(7));
        }
        TestDisableMixStreamTypeSetting.INSTANCE.getValue();
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJ(long j, int i) {
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rtc roomMsgSent result msg");
        this.LJLIL.getClass();
        if (i != 200) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(i));
            hashMap.put("msg_id", String.valueOf(j));
        }
    }

    @Override // X.U62
    public final void LJIIIIZZ(List<LinkUser> list, List<LinkUser> list2) {
        TRA.LJIJI(list, list2);
    }

    @Override // X.U62
    public final void LJIIIZ(List<LinkUser> list, List<LinkUser> list2) {
        TRA.LJIJ(list, list2);
    }

    @Override // X.U62
    public final void LJIIJJI(InterfaceC75441TjB session, LeaveMessage leaveMessage) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        long j;
        o.LJIIIZ(session, "session");
        TRA.LJIIZILJ(session, leaveMessage);
        Long userId = leaveMessage.getLeftUser().getUserId();
        if (userId != null) {
            long longValue = userId.longValue();
            InterfaceC31805Ce1 LJJJJJ = this.LJLIL.LJJJJJ();
            if (LJJJJJ != null && (LIZ = LJJJJJ.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIL(longValue)) != null) {
                C74842TYw c74842TYw = this.LJLIL;
                FollowInfo followInfo = linkPlayerInfo.mUser.getFollowInfo();
                if (followInfo != null) {
                    j = followInfo.getFollowStatus();
                } else {
                    j = 0;
                }
                C74830TYk.LIZLLL(longValue, j, C59994Ngc.LIZJ(), c74842TYw.dataChannel);
            }
        }
    }

    @Override // X.U62
    public final void LJIILL(U65 u65, LeaveGroupMessage leaveGroupMessage) {
        TRA.LJIILLIIL(u65, leaveGroupMessage);
    }

    @Override // X.U62
    public final void LJIILLIIL(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJIJ(U65 u65, JoinChannelMessage joinChannelMessage) {
        TRA.LJIILIIL(u65, joinChannelMessage);
    }

    @Override // X.U62
    public final void LJJII(InterfaceC75441TjB interfaceC75441TjB, CancelInviteMessage cancelInviteMessage) {
        TRA.LJII(interfaceC75441TjB, cancelInviteMessage);
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL.onUserLeft(linkMicId, j);
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage) {
        TRA.LJIIIZ(interfaceC75441TjB, destroyChannelMessage);
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB session, KickOutMessage kickOutMessage) {
        o.LJIIIZ(session, "session");
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            this.LJLIL.LJJL(kickOutMessage);
        }
    }

    @Override // X.U62
    public final void LJJJJ(U65 session, DirectJoinMessage directJoinMessage) {
        o.LJIIIZ(session, "session");
        C74842TYw c74842TYw = this.LJLIL;
        c74842TYw.getClass();
        c74842TYw.LJJJZ(directJoinMessage.toUnifiedReplyInviteMessage(), true);
    }

    @Override // X.U62
    public final void LJJJJL(U65 session, PermitApplyMessage permitApplyMessage) {
        o.LJIIIZ(session, "session");
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            this.LJLIL.LJJLI(permitApplyMessage);
        }
    }

    @Override // X.U62
    public final void LJJJJZI(U65 session, String str) {
        o.LJIIIZ(session, "session");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rtc SendRtcRoomMessage msg");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    @Override // X.U62
    public final void LJJJLL(U65 session, LinkCoreError error) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(error, "error");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rtcError msg");
        C74842TYw c74842TYw = this.LJLIL;
        int errorCode = error.getErrorCode();
        String errorMsg = error.getErrorMsg();
        if (c74842TYw.mView == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Guest; code:");
        LIZ.append(errorCode);
        LIZ.append("; message:");
        LIZ.append(errorMsg);
        TYQ.LJFF("OnError", X1D.LIZIZ(LIZ));
        String logTAG = c74842TYw.logTAG(1974);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onError: ");
        LIZ2.append(errorMsg);
        C32014ChO.LIZJ(logTAG, X1D.LIZIZ(LIZ2), null);
        C30868C9o.LIZJ(R.string.sun);
        TZJ tzj = TZJ.RTC_ERROR;
        c74842TYw.LJLJLJ = true;
        ((C32537Cpp) c74842TYw.LJLJJI.gv0(C28419BDj.class)).LIZ = Boolean.TRUE;
        if (tzj == null) {
            return;
        }
        c74842TYw.LJJJJL(tzj, C78857UxB.LJJIIJ(1476788485, "bpea-linkmic_anchorpre_onUnrecoverableErrorHappened"));
    }

    @Override // X.U62
    public final void LJJL(U65 u65, CancelInviteGroupMessage cancelInviteGroupMessage) {
        TRA.LJI(u65, cancelInviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        o.LJIIIZ(session, "session");
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel == null || (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel.kv0(C75415Til.class)) == null || (iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null)) == null || (Mb0 = iSharedBgAbility.Mb0()) == null || (state = Mb0.getState()) == null || !state.LJLJI || c75745To5 == null) {
            return;
        }
        c75745To5.LJIIJ = state.LJLJJL;
    }

    @Override // X.U62
    public final void LJJLIIJ(U65 u65, InviteGroupMessage inviteGroupMessage) {
        TRA.LJIIJJI(u65, inviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIL(U65 session, InviteMessage inviteMessage) {
        Long l;
        BusinessContent bizContent;
        MultiLiveContent multiLiveContent;
        InviteBizContent inviteBizContent;
        o.LJIIIZ(session, "session");
        if (LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            this.LJLIL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleReceiveModeratorInviteMessage, message=");
            LIZ.append(inviteMessage);
            C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
            User inviteeUserInfo = inviteMessage.getInviteeUserInfo();
            User user = null;
            if (inviteeUserInfo != null) {
                l = Long.valueOf(inviteeUserInfo.getId());
            } else {
                l = null;
            }
            User inviteeUserInfo2 = inviteMessage.getInviteeUserInfo();
            if (l != null && inviteeUserInfo2 != null) {
                long longValue = l.longValue();
                java.util.Map<Long, String> map = C75147TeR.LJLJJLL;
                Long valueOf = Long.valueOf(longValue);
                String LIZ2 = C05170If.LIZ(inviteeUserInfo2);
                o.LJIIIIZZ(LIZ2, "getDisplayName(user)");
                map.put(valueOf, LIZ2);
            }
            BizContentWrapper bizContentWrapper = inviteMessage.getCustomMessage().getBizContentWrapper();
            if (bizContentWrapper != null && (bizContent = bizContentWrapper.getBizContent()) != null && (multiLiveContent = bizContent.multiLiveContent) != null && (inviteBizContent = multiLiveContent.inviteIMContent) != null) {
                user = inviteBizContent.operatorUserInfo;
            }
            C28847BTv.LIZIZ(R.string.n3g, "sent_invitation", user, inviteMessage.getInviteeUserInfo());
        }
    }

    @Override // X.U62
    public final void LJJLJ(U65 u65, ReplyInviteGroupMessage replyInviteGroupMessage) {
        TRA.LJJIFFI(u65, replyInviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLL(InterfaceC75441TjB interfaceC75441TjB, InviteMessage inviteMessage) {
        TRA.LJIIL(interfaceC75441TjB, inviteMessage);
    }

    @Override // X.U62
    public final void LJLIIIL(U65 u65, GroupChangeMessage groupChangeMessage) {
        TRA.LJIIJ(u65, groupChangeMessage);
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLLILLLL(InterfaceC75441TjB interfaceC75441TjB, PermitApplyMessage permitApplyMessage) {
        TRA.LJJ(interfaceC75441TjB, permitApplyMessage);
    }

    @Override // X.U62
    public final void LJLLLL(U65 u65, ApplyGroupMessage applyGroupMessage) {
        TRA.LIZJ(u65, applyGroupMessage);
    }

    @Override // X.U62
    public final void LJLZ(InterfaceC75441TjB interfaceC75441TjB, CreateChannelMessage createChannelMessage) {
        TRA.LJIIIIZZ(interfaceC75441TjB, createChannelMessage);
    }

    @Override // X.U62
    public final void LJZ(InterfaceC75441TjB interfaceC75441TjB, CancelApplyMessage cancelApplyMessage) {
        TRA.LJFF(interfaceC75441TjB, cancelApplyMessage);
    }

    @Override // X.U62
    public final void LL(InterfaceC75441TjB session, String linkMicId) {
        java.util.Map map;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive guest[");
        LIZ.append(linkMicId);
        LIZ.append("] firstRemoteVideoFrame");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLIL.LJLJJI;
        if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(BD9.class)) != null) {
            map.put(linkMicId, true);
        }
        this.LJLIL.onFirstRemoteVideoFrameRender(linkMicId);
    }

    @Override // X.U62
    public final void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage) {
        TRA.LJIL(u65, permitApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        LinkCoreError error;
        String str;
        Config.VideoQuality videoQuality;
        StreamUrl streamUrl;
        o.LJIIIZ(session, "session");
        boolean startSuccess = rtcStartResultMessage.getStartSuccess();
        if (startSuccess) {
            boolean gt = ((IInteractService) CN1.LIZ(IInteractService.class)).gt(String.valueOf(this.LJLIL.LJLJI.getId()));
            C74842TYw c74842TYw = this.LJLIL;
            if (gt) {
                C0NB.LJIIIZ("MultiGuestV3AnchorPresenter", "onRtcStartResult: inPunish=true");
                c74842TYw.getClass();
                C74842TYw.LJJJLZIJ(false);
            }
            C74842TYw c74842TYw2 = this.LJLIL;
            DataChannel dataChannel = c74842TYw2.LJLJJI;
            if (dataChannel != null) {
                c74842TYw2.LLFF.name();
                dataChannel.qv0(InteractDebugInfoEvent.class, new V1B());
            }
            C88207Yjb.LJII(TSK.LJLIL);
            Room room = c74842TYw2.LJLIL;
            if (room == null || (streamUrl = room.getStreamUrl()) == null || (str = streamUrl.LIZ()) == null) {
                str = "";
            }
            long id = c74842TYw2.LJLIL.getId();
            String lowerCase = c74842TYw2.LLFF.name().toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            StreamUrlExtra streamUrlExtraSafely = c74842TYw2.LJLIL.getStreamUrlExtraSafely();
            o.LJIIIIZZ(streamUrlExtraSafely, "mRoom.streamUrlExtraSafely");
            if (streamUrlExtraSafely.anchorInteractProfile > 0) {
                videoQuality = Config.VideoQuality.ANCHOR_HIGH;
            } else {
                videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
            }
            R24 r24 = new R24(videoQuality.getWidth(), lowerCase, str, videoQuality.getHeight(), id, videoQuality.getBitrate(), videoQuality.getFps());
            c74842TYw2.LJLJJLL = r24;
            Debug.getMemoryInfo(new Debug.MemoryInfo());
            r24.LIZJ = r0.getTotalPss() / 1024.0f;
            r24.LJIIIIZZ = (C73411SrX) TMC.LJJI(5000L, TimeUnit.MILLISECONDS).LJJJ(T16.LIZ()).LJJIJL(new IDhS104S0100000_11(r24, 0)).LJJIII(new C72704Sg8(), false).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS40S0000000_13(0), new AfS17S0001000_5(0, 7));
            InterfaceC30442Bx8.LLJJIJIIJIL.LIZ(Boolean.TRUE);
            return;
        }
        if (startSuccess || (error = rtcStartResultMessage.getError()) == null) {
            return;
        }
        C74842TYw c74842TYw3 = this.LJLIL;
        int errorCode = error.getErrorCode();
        String errorMsg = error.getErrorMsg();
        if (c74842TYw3.mView == 0) {
            return;
        }
        C74838TYs.LJ().LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Anchor; code:");
        LIZ.append(errorCode);
        LIZ.append("; desc:");
        LIZ.append(errorMsg);
        TYQ.LJFF("OnStartFailed", X1D.LIZIZ(LIZ));
        TZC tzc = (TZC) c74842TYw3.mView;
        if (tzc != null) {
            tzc.aP();
        }
        DataChannel dataChannel2 = c74842TYw3.LJLJJI;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.qv0(InteractStateChangeEvent.class, new TW6(8));
    }

    @Override // X.U62
    public final void LLIIJI(U65 u65, CancelApplyGroupMessage cancelApplyGroupMessage) {
        TRA.LJ(u65, cancelApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB session, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(session, "session");
        this.LJLIL.LJJJZ(replyInviteMessage.toUnifiedReplyInviteMessage(), false);
    }

    @Override // X.U62
    public final void LLILIL(U65 u65, P2PGroupChangeMessage p2PGroupChangeMessage) {
        TRA.LJIJJLI(u65, p2PGroupChangeMessage);
    }

    @Override // X.U62
    public final void LLILLJJLI(InterfaceC75441TjB interfaceC75441TjB, ApplyMessage applyMessage) {
        TRA.LIZLLL(interfaceC75441TjB, applyMessage);
    }

    @Override // X.U62
    public final void LLJIJIL(U65 u65, ReplyInviteMessage replyInviteMessage) {
        TRA.LJIJJ(u65, replyInviteMessage);
    }

    @Override // X.U62
    public final void LJIIZILJ(String linkMicId, float f, float f2) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJIJIL(String linkMicId, boolean z, boolean z2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive rmeote mute");
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        List list;
        List list2;
        List list3;
        Boolean bool;
        C74842TYw c74842TYw = this.LJLIL;
        if (strArr != null) {
            list = ORY.LJJZZIII(strArr);
        } else {
            list = null;
        }
        if (zArr != null) {
            list2 = ORY.LJL(zArr);
        } else {
            list2 = null;
        }
        if (iArr != null) {
            list3 = ORY.LJJZ(iArr);
        } else {
            list3 = null;
        }
        c74842TYw.getClass();
        boolean z = true;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty()) {
            return;
        }
        String LIZLLL = C74838TYs.LJ().LIZLLL();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) ListProtector.get(list, i2);
            c74842TYw.getMultiGuestDataHolder().LJIILIIL(((Number) ListProtector.get(list3, i2)).intValue(), str);
            if (TextUtils.equals(str, LIZLLL)) {
                if (list2 != null) {
                    bool = (Boolean) ListProtector.get(list2, i2);
                } else {
                    bool = null;
                }
                if (C29306Beo.LJJIFFI(bool) && ((Number) ListProtector.get(list3, i2)).intValue() > 0) {
                    i = ((Number) ListProtector.get(list3, i2)).intValue();
                }
            }
        }
        DataChannel dataChannel = c74842TYw.LJLJJI;
        if (i <= 0) {
            z = false;
        }
        dataChannel.qv0(LiveTalkStateEvent.class, Boolean.valueOf(z));
        TZC tzc = (TZC) c74842TYw.mView;
        if (tzc == null) {
            return;
        }
        tzc.onTalkVoiceUpdated(i);
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        C74842TYw c74842TYw = this.LJLIL;
        String linkMicId = joinedUser.getLinkMicId();
        if (linkMicId == null) {
            linkMicId = "";
        }
        c74842TYw.onUserJoined(linkMicId);
    }

    @Override // X.U62
    public final void LJLJLLL(U65 session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive RTC userMsg received  [");
        LIZ.append(messageContent);
        LIZ.append(']');
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB interfaceC75441TjB, String str, String str2) {
        TRA.LJJIII(interfaceC75441TjB, str, str2);
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        C73411SrX c73411SrX;
        o.LJIIIZ(session, "session");
        C74987Tbr.LIZ("MultiGuestV3AnchorPresenter", "receive RTC engine end msg");
        if (MultiGuestOnlyPushRtcWhenResumeSetting.INSTANCE.isEnable()) {
            C0NB.LIZIZ("wws_test", "send MultiGuestOnlyPushRtcWhenResumeSetting");
            DataChannel dataChannel = this.LJLIL.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(OnlyPushRtcEngineAlreadyCloseChannel.class, Boolean.TRUE);
            }
        }
        if (z) {
            C74842TYw c74842TYw = this.LJLIL;
            if (c74842TYw.mView == 0) {
                return;
            }
            C0NB.LJIIIZ(BYR.LIZ, "onEngineEndSuccess");
            C74838TYs.LJ().LJI();
            DataChannel dataChannel2 = c74842TYw.LJLJJI;
            if (dataChannel2 != null) {
                dataChannel2.qv0(InteractDebugInfoEvent.class, new V1B());
            }
            TYQ.LJFF("onEndSuccess", "position:LinkIn_Anchor");
            R24 r24 = c74842TYw.LJLJJLL;
            if (r24 != null && (c73411SrX = r24.LJIIIIZZ) != null && !c73411SrX.isDisposed()) {
                r24.LJIIIIZZ.dispose();
            }
            c74842TYw.LJLJJLL = null;
            C88207Yjb.LJIILJJIL();
            return;
        }
        if (z || linkCoreError == null) {
            return;
        }
        C74842TYw c74842TYw2 = this.LJLIL;
        int errorCode = linkCoreError.getErrorCode();
        String errorMsg = linkCoreError.getErrorMsg();
        c74842TYw2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:LinkIn_Anchor; code:");
        LIZ.append(errorCode);
        LIZ.append("; desc:");
        LIZ.append(errorMsg);
        TYQ.LJFF("OnEndFailed", X1D.LIZIZ(LIZ));
    }

    @Override // X.U62
    public final void LJJLIIIJL(InterfaceC75441TjB session, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJZL(InterfaceC75441TjB interfaceC75441TjB, List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3, List<LinkUser> list4, List<LinkUser> list5, List<LinkUser> list6, List<LinkUser> list7, String str, CustomLinkMessage customLinkMessage) {
        TRA.LJJIJ(interfaceC75441TjB, list, list2, list3, list4, list5, list6, list7);
    }
}
