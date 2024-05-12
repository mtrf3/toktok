package X;

import Y.ARunnableS32S0200000_13;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.api.MultiGuestGuestRecentLinkmicIdChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
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
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TQh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74619TQh implements U62 {
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;

    @Override // X.U62
    public final void LJII(InterfaceC75941TrF interfaceC75941TrF) {
    }

    @Override // X.U62
    public final void LJIIL(long j, long j2) {
    }

    @Override // X.U62
    public final void LJIILL(U65 session, LeaveGroupMessage leaveGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJIJJ(java.util.Map<String, String> map) {
    }

    @Override // X.U62
    public final void LJJL(U65 session, CancelInviteGroupMessage cancelInviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJLIIJ(U65 session, InviteGroupMessage inviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJLJ(U65 session, ReplyInviteGroupMessage replyInviteGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLIIIL(U65 session, GroupChangeMessage groupChangeMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.U62
    public final void LJLLLL(U65 session, ApplyGroupMessage applyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLFF(U65 session, PermitApplyGroupMessage permitApplyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLIIJI(U65 session, CancelApplyGroupMessage cancelApplyGroupMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LLILIL(U65 session, P2PGroupChangeMessage p2PGroupChangeMessage) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJIFFI() {
        this.LJLIL.handleRtcChannelJoined();
    }

    @Override // X.U62
    public final void LJJIJIIJIL() {
        SurfaceView surfaceView;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
        Object obj = multiGuestV3GuestPresenter.liveVideoClient;
        if ((obj instanceof SurfaceView) && (surfaceView = (SurfaceView) obj) != null) {
            surfaceView.post(new ARunnableS32S0200000_13(multiGuestV3GuestPresenter, surfaceView, 19));
        }
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive rtc turnOffEngine msg");
        this.LJLIL.onTurnOffEngine(source);
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
    }

    public C74619TQh(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, Room room) {
        this.LJLIL = multiGuestV3GuestPresenter;
        this.LJLILLLLZI = room;
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJ(long j, int i) {
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive rtc roomMsgSent result msg");
        this.LJLIL.onRoomMsgSentResult(j, i);
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
    public final void LJIIJJI(InterfaceC75441TjB interfaceC75441TjB, LeaveMessage leaveMessage) {
        TRA.LJIIZILJ(interfaceC75441TjB, leaveMessage);
    }

    @Override // X.U62
    public final void LJIILLIIL(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJIJ(U65 session, JoinChannelMessage joinChannelMessage) {
        o.LJIIIZ(session, "session");
        boolean joinChannelSucceed = joinChannelMessage.getJoinChannelSucceed();
        if (joinChannelSucceed) {
            this.LJLIL.handleJoinChannelSucceed(joinChannelMessage.getLinker().LLZL().getLinkMicId());
        } else {
            if (joinChannelSucceed) {
                return;
            }
            this.LJLIL.handleJoinChannelFailed(joinChannelMessage.getThrowable());
        }
    }

    @Override // X.U62
    public final void LJIJI(String str, String str2) {
        DataChannel dataChannel;
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("linkMicId:");
            LIZ.append(str);
            LIZ.append(", sei-->");
            LIZ.append(str2);
            C0NB.LIZIZ("MultiGuestV3GuestPresenter", X1D.LIZIZ(LIZ));
        }
        if (str2 != null && (dataChannel = this.LJLIL.dataChannel) != null) {
            dataChannel.rv0(RtcSeiReceivedChannel.class, str2);
        }
    }

    @Override // X.U62
    public final void LJJII(InterfaceC75441TjB session, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(session, "session");
        this.LJLIL.handleCancelMessage(cancelInviteMessage);
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
        Long userId = kickOutMessage.getOwner().getUserId();
        long userId2 = this.LJLIL.getUserId();
        if (userId == null || userId.longValue() != userId2) {
            return;
        }
        this.LJLIL.handleKickOutMessage(kickOutMessage);
        C0NB.LIZIZ("MultiGuestV3GuestPresenter", "kick out by host");
    }

    @Override // X.U62
    public final void LJJJJ(U65 u65, DirectJoinMessage directJoinMessage) {
        TRA.LJIILJJIL(u65, directJoinMessage);
    }

    @Override // X.U62
    public final void LJJJJL(U65 u65, PermitApplyMessage permitApplyMessage) {
        TRA.LIZIZ(u65, permitApplyMessage);
    }

    @Override // X.U62
    public final void LJJJJZI(U65 session, String str) {
        o.LJIIIZ(session, "session");
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive rtc SendRtcRoomMessage msg");
    }

    @Override // X.U62
    public final void LJJJLL(U65 session, LinkCoreError error) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(error, "error");
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive rtcError msg");
        this.LJLIL.onError(error.getErrorCode(), error.getErrorMsg());
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        o.LJIIIZ(session, "session");
        this.LJLIL.handleRTCInitMessage(c75745To5);
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLL(X.InterfaceC75441TjB r16, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage r17) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74619TQh.LJJLL(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage):void");
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive linkMicStateChange state:");
        LIZ.append(i);
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", X1D.LIZIZ(LIZ));
        if (i == 0 || i == 1) {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
            if (multiGuestV3GuestPresenter.multiGuestDataHolder != null) {
                multiGuestV3GuestPresenter.getMultiGuestDataHolder().LJJJJI = null;
            }
        }
        if (LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting.INSTANCE.isEnabled() && i == 5) {
            this.LJLIL.dataChannel.rv0(MultiGuestGuestRecentLinkmicIdChannel.class, new BM4(C78886Uxe.LJJJJLL(C8E.LJ()), C78886Uxe.LJJJLL(C8E.LJ()), this.LJLIL.getMultiGuestDataHolder().LJJIJLIJ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r9 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r9 = "room";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r0 = r1.getUserManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r0 = r0.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (X.C76917UGr.LJJJJI(r0) != true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        ((X.C29374Bfu) X.B83.LIZ().LIZIZ()).getCurrentUserId();
        r11 = r13.LJLIL.dataChannel;
        kotlin.jvm.internal.o.LJIIIIZZ(r11, "dataChannel");
        r1 = X.C29556Biq.LIZ();
        r0 = r15.getLayoutDSLConfig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        r0 = r0.getLayoutId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r1.getClass();
        r5.LJLIL(r6, r7, r8, r9, r10, r11, X.C74983Tbn.LJII(r2));
        r13.LJLIL.handlePermitMessage(r15);
        r3 = r13.LJLIL.getUserManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r3.LJIIIZ(X.C44432HcC.LJI(), "guest_apply_anchor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        X.C75159Ted.LIZ.getClass();
        X.C75159Ted.LJIIIIZZ = true;
        r1 = r13.LJLIL.getMultiGuestDataHolder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
    
        r1.LJJJJI = "apply";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 != null) goto L18;
     */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLILLLL(X.InterfaceC75441TjB r14, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r15) {
        /*
            r13 = this;
            java.lang.String r0 = "session"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            int r0 = r15.getPermitStatus()
            java.lang.String r3 = "MultiGuestV3GuestPresenter"
            r4 = 1
            if (r0 != r4) goto Ldb
        Lf:
            X.Tb6 r2 = X.C74614TQc.LIZ()
            java.lang.String r1 = "multi_guest_guest_preview_page"
            java.lang.String r0 = "agree_permit"
            r2.LIZ(r1, r0)
            java.lang.String r0 = "receive host permit apply"
            X.C74987Tbr.LIZ(r3, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            X.TQ8 r0 = r0.getUserManager()
            if (r0 == 0) goto Ld8
            X.TUl r0 = r0.LIZ()
            if (r0 == 0) goto Ld8
            int r10 = X.C76917UGr.LJJIII(r0)
        L31:
            X.TYe r5 = X.C74824TYe.LIZ
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r0.getMultiGuestDataHolder()
            boolean r6 = r0.LJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            java.lang.String r7 = r0.getInteractId()
            java.lang.String r2 = ""
            if (r7 != 0) goto L46
            r7 = r2
        L46:
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r1 = r13.LJLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog r0 = r1.guestBeInvitedDialog
            if (r0 == 0) goto L50
            java.lang.String r8 = r0.LJLLILLLL
            if (r8 != 0) goto L54
        L50:
            java.lang.String r8 = "others"
            if (r0 == 0) goto L58
        L54:
            java.lang.String r9 = r0.LJLLI
            if (r9 != 0) goto L5a
        L58:
            java.lang.String r9 = "room"
        L5a:
            X.TQ8 r0 = r1.getUserManager()
            if (r0 == 0) goto Ld5
            X.TUl r0 = r0.LIZ()
            if (r0 == 0) goto Ld5
            boolean r0 = X.C76917UGr.LJJJJI(r0)
            if (r0 != r4) goto Ld5
        L6c:
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            r0.getCurrentUserId()
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            com.bytedance.ies.sdk.datachannel.DataChannel r11 = r0.dataChannel
            java.lang.String r0 = "dataChannel"
            kotlin.jvm.internal.o.LJIIIIZZ(r11, r0)
            X.Tbn r1 = X.C29556Biq.LIZ()
            com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig r0 = r15.getLayoutDSLConfig()
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.getLayoutId()
            if (r0 != 0) goto Ld3
        L93:
            r1.getClass()
            X.Tbv r12 = X.C74983Tbn.LJII(r2)
            r5.LJLIL(r6, r7, r8, r9, r10, r11, r12)
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            r0.handlePermitMessage(r15)
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            X.TQ8 r3 = r0.getUserManager()
            if (r3 == 0) goto Lb3
            long r1 = X.C44432HcC.LJI()
            java.lang.String r0 = "guest_apply_anchor"
            r3.LJIIIZ(r1, r0)
        Lb3:
            X.Ted r0 = X.C75159Ted.LIZ
            r0.getClass()
            X.C75159Ted.LJIIIIZZ = r4
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r1 = r0.getMultiGuestDataHolder()
            if (r1 != 0) goto Lce
        Lc2:
            com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager r1 = X.TS1.LIZ()
            if (r1 == 0) goto Lcd
            X.TQj r0 = X.C74621TQj.LJLIL
            r1.iv0(r0)
        Lcd:
            return
        Lce:
            java.lang.String r0 = "apply"
            r1.LJJJJI = r0
            goto Lc2
        Ld3:
            r2 = r0
            goto L93
        Ld5:
            int r10 = r10 + 1
            goto L6c
        Ld8:
            r10 = 0
            goto L31
        Ldb:
            int r1 = r15.getPermitStatus()
            r0 = 2
            if (r1 != r0) goto Led
            java.lang.String r0 = "receive host refuse apply"
            X.C74987Tbr.LIZ(r3, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter r0 = r13.LJLIL
            r0.handleRejectMessage(r15)
            goto Lc2
        Led:
            java.lang.String r0 = "unknow status"
            X.C0NB.LIZIZ(r3, r0)
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74619TQh.LJLLILLLL(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
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
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive guest receive firstRemoteVideoFrame");
        MultiGuestV3GuestPresenter.setSurfaceViewAdded$default(this.LJLIL, linkMicId, false, 2, null);
        this.LJLIL.onFirstRemoteVideoFrameRender(linkMicId);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        LinkCoreError error;
        o.LJIIIZ(session, "session");
        boolean startSuccess = rtcStartResultMessage.getStartSuccess();
        if (startSuccess) {
            this.LJLIL.onStartSuccess();
        } else {
            if (startSuccess || (error = rtcStartResultMessage.getError()) == null) {
                return;
            }
            this.LJLIL.onStartFailed(error.getErrorCode(), error.getErrorMsg());
        }
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB interfaceC75441TjB, ReplyInviteMessage replyInviteMessage) {
        TRA.LJJII(interfaceC75441TjB, replyInviteMessage);
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
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive rmeote mute");
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        List<String> list;
        List<Boolean> list2;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
        List<Integer> list3 = null;
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
        }
        multiGuestV3GuestPresenter.handleUserTalkStateUpdated(list, list2, list3);
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LJLIL;
        String linkMicId = joinedUser.getLinkMicId();
        if (linkMicId == null) {
            linkMicId = "";
        }
        multiGuestV3GuestPresenter.onUserJoined(linkMicId);
    }

    @Override // X.U62
    public final void LJLJLLL(U65 session, String linkMicId, String messageContent) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(messageContent, "messageContent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive RTC userMsg received [");
        LIZ.append(messageContent);
        LIZ.append(']');
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", X1D.LIZIZ(LIZ));
        this.LJLIL.onUserMessageReceived(messageContent);
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB interfaceC75441TjB, String str, String str2) {
        TRA.LJJIII(interfaceC75441TjB, str, str2);
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        o.LJIIIZ(session, "session");
        C74987Tbr.LIZ("MultiGuestV3GuestPresenter", "receive RTC engine end msg");
        if (z) {
            this.LJLIL.onEndSuccess();
        } else {
            if (z || linkCoreError == null) {
                return;
            }
            this.LJLIL.onEndFailed(linkCoreError.getErrorCode(), linkCoreError.getErrorMsg());
        }
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
