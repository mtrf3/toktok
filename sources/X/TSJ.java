package X;

import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
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
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSJ implements U62 {
    public final /* synthetic */ WindowMaskAssem LJLIL;

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
    public final void LJJIFFI() {
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

    public TSJ(WindowMaskAssem windowMaskAssem) {
        this.LJLIL = windowMaskAssem;
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
    public final void LJJII(InterfaceC75441TjB interfaceC75441TjB, CancelInviteMessage cancelInviteMessage) {
        TRA.LJII(interfaceC75441TjB, cancelInviteMessage);
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        DataChannel dataChannel;
        o.LJIIIZ(session, "session");
        TRA.LJIIIZ(session, destroyChannelMessage);
        WindowMaskAssem windowMaskAssem = this.LJLIL;
        windowMaskAssem.getClass();
        C0NB.LIZIZ("DestroyChannelMessage", "receive msg");
        if (LiveMultiGuestGiftTrayOptSetting.enableGiftTrayPositionChange() && (dataChannel = windowMaskAssem.LJLLI) != null) {
            dataChannel.rv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C74735TUt(false, 4));
        }
        WindowMaskAssem.X3(windowMaskAssem, true, null, 2);
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB session, KickOutMessage kickOutMessage) {
        Boolean bool;
        U8H LJJZZI;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        C76696U8e c76696U8e;
        U8H LJJZZI2;
        o.LJIIIZ(session, "session");
        C76696U8e c76696U8e2 = null;
        if (o.LJ(C78886Uxe.LJJJJLL(C8E.LJ()), "")) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LJJZZI2 = R6.LJJZZI()) != null) {
                c76696U8e = LJJZZI2.LJJIII();
            } else {
                c76696U8e = null;
            }
            C29556Biq.LIZ().getClass();
            EnumC74991Tbv LJI = C74983Tbn.LJI(c76696U8e);
            if (LJI == null) {
                LJI = EnumC74991Tbv.NORMAL;
            }
            this.LJLIL.b4(3, LJI);
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LLIIJI = R62.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
            boolean z = true;
            if (!LJJIIZI.isEmpty() && (LJJIIZI.size() != 1 || !o.LJ(((LinkUser) ORZ.LJLLJ(LJJIIZI)).getUserId(), kickOutMessage.getOwner().getUserId()))) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE) && C29306Beo.LJIIJ(this.LJLIL.LJLLI)) {
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null && (LJJZZI = R63.LJJZZI()) != null) {
                c76696U8e2 = LJJZZI.LJJIII();
            }
            C29556Biq.LIZ().getClass();
            EnumC74991Tbv LJI2 = C74983Tbn.LJI(c76696U8e2);
            if (LJI2 == null) {
                LJI2 = EnumC74991Tbv.NORMAL;
            }
            this.LJLIL.b4(3, LJI2);
        }
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
        o.LJIIIZ(session, "session");
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
    public final void LL(InterfaceC75441TjB interfaceC75441TjB, String str) {
        TRA.LJJI(interfaceC75441TjB, str);
    }

    @Override // X.U62
    public final void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage) {
        TRA.LJIL(u65, permitApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 u65, RtcStartResultMessage rtcStartResultMessage) {
        TRA.LJJIIJZLJL(u65, rtcStartResultMessage);
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
        ILinkStateAbility LJJIL;
        int i;
        o.LJIIIZ(linkMicId, "linkMicId");
        View containerView = this.LJLIL.getContainerView();
        if (containerView != null && (LJJIL = C44729Hgz.LJJIL(containerView)) != null) {
            if (z) {
                i = 4;
            } else {
                i = 3;
            }
            LJJIL.Zq(i, linkMicId, z2);
        }
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        ILinkStateAbility LJJIL;
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive msg, txQuality=");
        LIZ.append(i);
        C0NB.LIZIZ("NetworkStateTips", X1D.LIZIZ(LIZ));
        View containerView = this.LJLIL.getContainerView();
        if (containerView != null && (LJJIL = C44729Hgz.LJJIL(containerView)) != null) {
            LJJIL.vj0(i);
        }
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
    }

    @Override // X.U62
    public final void LJJLIIIJL(InterfaceC75441TjB session, int i, LinkCoreError linkCoreError, AbnormalDisconnectReason abnormalDisconnectReason) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJZL(InterfaceC75441TjB session, List<LinkUser> linkedUsers, List<LinkUser> applicants, List<LinkUser> invitees, List<LinkUser> willJoinGroupUsers, List<LinkUser> liveUsers, List<LinkUser> invitingList, List<LinkUser> applyingList, String str, CustomLinkMessage customLinkMessage) {
        C76696U8e c76696U8e;
        U8H LJJZZI;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkedUsers, "linkedUsers");
        o.LJIIIZ(applicants, "applicants");
        o.LJIIIZ(invitees, "invitees");
        o.LJIIIZ(willJoinGroupUsers, "willJoinGroupUsers");
        o.LJIIIZ(liveUsers, "liveUsers");
        o.LJIIIZ(invitingList, "invitingList");
        o.LJIIIZ(applyingList, "applyingList");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            c76696U8e = LJJZZI.LJJIII();
        } else {
            c76696U8e = null;
        }
        C29556Biq.LIZ().getClass();
        EnumC74991Tbv LJI = C74983Tbn.LJI(c76696U8e);
        if (LJI == null) {
            LJI = EnumC74991Tbv.NORMAL;
        }
        int size = linkedUsers.size() - 1;
        if (this.LJLIL.LLFFF != linkedUsers.size()) {
            this.LJLIL.LLFFF = linkedUsers.size();
            this.LJLIL.H3(LJI);
        }
        DataChannel dataChannel = this.LJLIL.LJLLI;
        if (dataChannel != null) {
            dataChannel.rv0(LinkGuestCountChangeChannel.class, Integer.valueOf(size));
        }
        if (this.LJLIL.L3().LJLIL) {
            if (size > 0) {
                C74979Tbj.LIZJ("user_list_change");
            } else {
                C74979Tbj.LIZIZ("user_list_change");
            }
        }
    }
}
