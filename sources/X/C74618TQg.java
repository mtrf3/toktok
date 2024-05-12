package X;

import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.voicechat.main.common.RtcStartResult;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TQg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74618TQg implements U62 {
    public final /* synthetic */ TQV LJLIL;

    @Override // X.U62
    public final void LJ(long j, int i) {
    }

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
    public final void LJJIJIIJIL() {
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    @Override // X.U62
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.U62
    public final void LJJIFFI() {
        InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) this.LJLIL.mView;
        if (interfaceC74617TQf != null) {
            interfaceC74617TQf.X9(true);
        }
        this.LJLIL.getClass();
    }

    public C74618TQg(TQV tqv) {
        this.LJLIL = tqv;
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
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

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (surfaceView != null) {
            C87277YNd.LJJIIZ(surfaceView);
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
    public final void LJIIJJI(InterfaceC75441TjB interfaceC75441TjB, LeaveMessage leaveMessage) {
        TRA.LJIIZILJ(interfaceC75441TjB, leaveMessage);
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
    public final void LJJII(InterfaceC75441TjB session, CancelInviteMessage cancelInviteMessage) {
        o.LJIIIZ(session, "session");
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = this.LJLIL.LJLJLLL;
        if (multiGuestV3GuestBeInvitedDialog != null && multiGuestV3GuestBeInvitedDialog.isShowing()) {
            MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = this.LJLIL.LJLJLLL;
            if (multiGuestV3GuestBeInvitedDialog2 != null) {
                multiGuestV3GuestBeInvitedDialog2.dismiss();
            }
            this.LJLIL.LJLJLLL = null;
        }
        this.LJLIL.getClass();
        TQV tqv = this.LJLIL;
        tqv.getClass();
        InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) tqv.mView;
        if (interfaceC74617TQf != null) {
            interfaceC74617TQf.dismissApplyDialogIfNeed();
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
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
        TQV tqv = this.LJLIL;
        tqv.getClass();
        C75159Ted.LIZ.getClass();
        C75159Ted.LIZJ();
        if (kickOutMessage.getKickOutReason() != 4) {
            InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) tqv.mView;
            DataChannel dataChannel = tqv.dataChannel;
            if (C74738TUw.LIZLLL()) {
                T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).getGuestSetting()).LJJII(new AfS62S0200000_13(interfaceC74617TQf, dataChannel, 2), new AfS65S0100000_13(interfaceC74617TQf, 13));
            } else {
                C0NB.LIZIZ("GiftRankListManager", "not in show leave rank exp, so run regular logic");
                if (interfaceC74617TQf != null) {
                    interfaceC74617TQf.showKickOutDialog();
                }
            }
        }
        C74740TUy.LIZLLL().LIZLLL = 0L;
        MultiGuestFeedbackController.LJIIJ.getClass();
        TQ4 LIZ = TQS.LIZ();
        if (LIZ != null) {
            LIZ.LIZJ();
        }
        tqv.LJLJLJ = false;
        tqv.stopInteract("leave_with_kicked_out", false, false, 0);
        MultiGuestDialogManager LIZ2 = TS1.LIZ();
        if (LIZ2 != null) {
            LIZ2.iv0(C74622TQk.LJLIL);
        }
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
    public final void LJJJJZI(U65 u65, String str) {
        TRA.LJJIIZ(u65, str);
    }

    @Override // X.U62
    public final void LJJJLL(U65 u65, LinkCoreError linkCoreError) {
        TRA.LJJIIJ(u65, linkCoreError);
    }

    @Override // X.U62
    public final void LJJL(U65 u65, CancelInviteGroupMessage cancelInviteGroupMessage) {
        TRA.LJI(u65, cancelInviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        T t;
        InterfaceC74695TTf LLIIJLIL;
        o.LJIIIZ(session, "session");
        TQV tqv = this.LJLIL;
        tqv.LLD = false;
        if (!tqv.LJLJJI && (t = tqv.mView) != 0 && c75745To5 != null) {
            InterfaceC74605TPt interfaceC74605TPt = null;
            if (t != 0 && ((InterfaceC31336CRo) t).getContext() != null) {
                if (tqv.LJLJI == null) {
                    C24130x7 c24130x7 = new C24130x7();
                    c24130x7.LJFF = false;
                    InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
                    o.LJIIIIZZ(LIZ, "getService(T::class.java)");
                    tqv.LJLJI = ((IBroadcastService) LIZ).createLinkVideoView(((InterfaceC31336CRo) tqv.mView).getContext(), c24130x7, null, tqv.dataChannel);
                }
                interfaceC74605TPt = tqv.LJLJI;
            }
            C75745To5 c75745To52 = new C75745To5(c75745To5.LIZ, c75745To5.LIZIZ, new C74620TQi(interfaceC74605TPt), false, false, null, new N3Z(N3W.LIZ), false, null, null, 1968);
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LIZ(c75745To52);
            }
        }
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(RtcStartResult.class, Boolean.FALSE);
        }
    }

    @Override // X.U62
    public final void LJJLIIJ(U65 u65, InviteGroupMessage inviteGroupMessage) {
        TRA.LJIIJJI(u65, inviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    @Override // X.U62
    public final void LJJLJ(U65 u65, ReplyInviteGroupMessage replyInviteGroupMessage) {
        TRA.LJJIFFI(u65, replyInviteGroupMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLL(X.InterfaceC75441TjB r26, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage r27) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74618TQg.LJJLL(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage):void");
    }

    @Override // X.U62
    public final void LJLIIIL(U65 u65, GroupChangeMessage groupChangeMessage) {
        TRA.LJIIJ(u65, groupChangeMessage);
    }

    @Override // X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB session, int i) {
        o.LJIIIZ(session, "session");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r11 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r11 = "room";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        r3 = r5.LJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r3 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        r3 = r3.LJIJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r3 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (X.C76917UGr.LJJJJI(r3) != true) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        ((X.C29374Bfu) X.B83.LIZ().LIZIZ()).getCurrentUserId();
        r13 = r15.LJLIL.dataChannel;
        kotlin.jvm.internal.o.LJIIIIZZ(r13, "dataChannel");
        r5 = X.C29556Biq.LIZ();
        r3 = r17.getLayoutDSLConfig();
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        r3 = r3.getLayoutId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0103, code lost:
    
        if (r3 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        r5.getClass();
        r7.LJLIL(r8, r9, r10, r11, r12, r13, X.C74983Tbn.LJII(r3));
        r7 = X.EnumC38440F6u.LINK_MIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        if (com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(r7) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
    
        X.C0K2.LIZ("Create engine failed rtc sdk load so failed", new java.lang.Throwable());
        com.bytedance.android.livesdk.utils.LiveAppBundleUtils.ensurePluginAvailable$default(r7, null, false, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        r0 = r15.LJLIL.LJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
    
        r0.LJIIIZ(X.C44432HcC.LJI(), "guest_apply_anchor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0136, code lost:
    
        X.C75159Ted.LIZ.getClass();
        X.C75159Ted.LJIIIIZZ = true;
        r15.LJLIL.getMultiGuestDataHolder().LJJJJI = "apply";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0149, code lost:
    
        r12 = com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(r7);
        r11 = com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(X.EnumC38440F6u.QUIC);
        r10 = com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(X.EnumC38440F6u.RTS);
        r9 = com.bytedance.android.livesdk.utils.LiveAppBundleUtils.isPluginAvailable(X.EnumC38440F6u.CMAF);
        r7 = X.C00F.LIZLLL("LINK_MIC = ", r12, " QUIC = ", r11, "  RTS = ");
        r7.append(r10);
        r7.append(" CMAF = ");
        r7.append(r9);
        X.C0NB.LJIIIZ("FindCrashLog#VoiceChatWatchPresenter#handlePermitMessage ", X.X1D.LIZIZ(r7));
        r15.LJLIL.getClass();
        r7 = r15.LJLIL.dataChannel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0186, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0188, code lost:
    
        r3 = (java.lang.Boolean) r7.kv0(com.bytedance.android.livesdk.dataChannel.PIPStatusData.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0190, code lost:
    
        if (r3 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0192, code lost:
    
        r7 = r3.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019a, code lost:
    
        if (r15.LJLIL.LJLJJI != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        if (r7 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a6, code lost:
    
        r15.LJLIL.getClass();
        r15.LJLIL.stopInteract("play_pip_window", false, X.TQV.LJJJJJ("play_pip_window"), 10015);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b8, code lost:
    
        r15.LJLIL.leaveAction(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ca, code lost:
    
        if (X.C74838TYs.LJ().LJJIIZ == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cc, code lost:
    
        X.C31811Ce7.LIZLLL("VoiceChatWatchPresenter", "receive permit message, but guest is leaving or already left");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d3, code lost:
    
        r7 = X.C74838TYs.LJ();
        r7.LJIILIIL = r17.getApprover().getLinkMicId();
        r2 = ((X.C29374Bfu) X.B83.LIZ().LIZIZ()).getCurrentUserId();
        r8 = X.C8E.LJ().R6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f7, code lost:
    
        if (r8 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f9, code lost:
    
        r8 = r8.LLIIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fd, code lost:
    
        if (r8 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ff, code lost:
    
        r2 = r8.LJIJI(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0203, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0205, code lost:
    
        r2 = r2.getLinkMicId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r7.LJIILJJIL = r2;
        com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController.LJIIJ.getClass();
        r8 = X.TQS.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:
    
        if (r8 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0218, code lost:
    
        r3 = r7.LIZLLL();
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "dataHolder.linkMicId");
        r8.LJ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0224, code lost:
    
        r2 = X.TQS.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0228, code lost:
    
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x022a, code lost:
    
        r0 = r17.getApprover().getChannelId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0232, code lost:
    
        if (r0 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0234, code lost:
    
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0238, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0268, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
    
        r2.LIZLLL(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023d, code lost:
    
        r7.LJII(r15.LJLIL.LJLIL.getOwnerUserId());
        r0 = r15.LJLIL;
        r0.LLF = false;
        r0 = (X.InterfaceC74617TQf) r0.mView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0250, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0252, code lost:
    
        r0.yq0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0255, code lost:
    
        r15.LJLIL.LJLJLJ = true;
        X.C74838TYs.LJ().LJIIIZ(true);
        r15.LJLIL.LJLLILLLL = "guest_apply_anchor";
        X.TQ6.LIZIZ = "guest_apply_anchor";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026a, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0105, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026c, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c4, code lost:
    
        if (r3 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLILLLL(X.InterfaceC75441TjB r16, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r17) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74618TQg.LJLLILLLL(X.TjB, com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
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
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        TRA.LJJI(session, linkMicId);
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(3));
        }
    }

    @Override // X.U62
    public final void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage) {
        TRA.LJIL(u65, permitApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        o.LJIIIZ(session, "session");
        TRA.LJJIIJZLJL(session, rtcStartResultMessage);
        boolean startSuccess = rtcStartResultMessage.getStartSuccess();
        if (startSuccess) {
            C88207Yjb.LJIIJJI(TSK.LJLIL);
            C74740TUy.LIZLLL().LJI(2);
            String joinType = this.LJLIL.LJLLILLLL;
            String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            o.LJIIIZ(joinType, "joinType");
            TQ6.LIZ = System.currentTimeMillis();
            TQ6.LIZJ = LJJJJLL;
            TQ6.LIZLLL = String.valueOf(currentUserId);
            TQV tqv = this.LJLIL;
            if (tqv.LJLILLLLZI == EnumC74703TTn.FAILED) {
                C32014ChO.LIZJ("VoiceChatWatchPresenter", "reply failed, stop ", null);
                this.LJLIL.stopInteract("reply", false, false, 10021);
                return;
            } else {
                tqv.LLD = true;
                tqv.LJJJJJL();
                return;
            }
        }
        if (startSuccess) {
            return;
        }
        LinkCoreError error = rtcStartResultMessage.getError();
        if (error != null) {
            int errorCode = error.getErrorCode();
            String errorMsg = error.getErrorMsg();
            C74838TYs.LJ().LJI();
            C30868C9o.LIZJ(R.string.sum);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("position:LinkIn_Guest; code:");
            LIZ.append(errorCode);
            LIZ.append("; desc:");
            LIZ.append(errorMsg);
            TYQ.LJFF("OnStartFailed", X1D.LIZIZ(LIZ));
            this.LJLIL.exitInteractInNormalWay("rtc_error", false, 10032);
        }
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel == null) {
            return;
        }
        dataChannel.rv0(RtcStartResult.class, Boolean.FALSE);
    }

    @Override // X.U62
    public final void LLIIJI(U65 u65, CancelApplyGroupMessage cancelApplyGroupMessage) {
        TRA.LJ(u65, cancelApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB interfaceC75441TjB, ReplyInviteMessage replyInviteMessage) {
        TRA.LJJII(interfaceC75441TjB, replyInviteMessage);
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
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLI(U65 u65, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
        TRA.LJJIIZI(u65, linkUser);
    }

    @Override // X.U62
    public final void LJLJLLL(U65 u65, String str, String str2) {
        TRA.LJJIJIIJIL(u65, str, str2);
    }

    @Override // X.U62
    public final void LJLLI(InterfaceC75441TjB interfaceC75441TjB, String str, String str2) {
        TRA.LJJIII(interfaceC75441TjB, str, str2);
    }

    @Override // X.U62
    public final void LLIIZ(U65 session, boolean z, LinkCoreError linkCoreError) {
        o.LJIIIZ(session, "session");
        if (z) {
            C88207Yjb.LJIJ();
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
