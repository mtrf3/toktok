package X;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
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
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TS7 implements U62 {
    public final /* synthetic */ C74843TYx LJLIL;

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

    public TS7(C74843TYx c74843TYx) {
        this.LJLIL = c74843TYx;
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
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(InteractStateChangeEvent.class, new TW6(7));
        }
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
    public final void LJJII(InterfaceC75441TjB interfaceC75441TjB, CancelInviteMessage cancelInviteMessage) {
        TRA.LJII(interfaceC75441TjB, cancelInviteMessage);
    }

    @Override // X.U62
    public final void LJJIIZI(String linkMicId, long j) {
        long j2;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo LJJIJIIJIL;
        User user;
        o.LJIIIZ(linkMicId, "linkMicId");
        C74843TYx c74843TYx = this.LJLIL;
        if (c74843TYx.mView == 0) {
            return;
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce1 != null && (LIZ = interfaceC31805Ce1.LIZ()) != null && (LJJIJIIJIL = C76917UGr.LJJIJIIJIL(LIZ, linkMicId)) != null && (user = LJJIJIIJIL.mUser) != null) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                j2 = followInfo.getFollowStatus();
            } else {
                j2 = 0;
            }
            if (j == 1) {
                long id = LJJIJIIJIL.mUser.getId();
                String secUid = LJJIJIIJIL.mUser.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                c74843TYx.LJJJJJL(id, secUid, "kickout_with_rtc_user_leaved");
            }
        } else {
            j2 = -1;
        }
        TZC tzc = (TZC) c74843TYx.mView;
        if (tzc != null) {
            tzc.Cg();
        }
        C74830TYk.LIZLLL(TS8.LIZ.LIZIZ(linkMicId), j2, C59994Ngc.LIZJ(), c74843TYx.dataChannel);
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(session, "session");
        TRA.LJIIIZ(session, destroyChannelMessage);
        UPJ.LJFF(7, C73943T0h.LIZ());
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage) {
        TRA.LJIILL(interfaceC75441TjB, kickOutMessage);
    }

    @Override // X.U62
    public final void LJJJJ(U65 session, DirectJoinMessage directJoinMessage) {
        o.LJIIIZ(session, "session");
        C74843TYx c74843TYx = this.LJLIL;
        c74843TYx.getClass();
        c74843TYx.LJJJLIIL(directJoinMessage.toUnifiedReplyInviteMessage(), true);
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
    public final void LJJJLL(U65 session, LinkCoreError error) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(error, "error");
        TRA.LJJIIJ(session, error);
        UPJ.LJFF(7, C73943T0h.LIZ());
    }

    @Override // X.U62
    public final void LJJL(U65 u65, CancelInviteGroupMessage cancelInviteGroupMessage) {
        TRA.LJI(u65, cancelInviteGroupMessage);
    }

    @Override // X.U62
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        InterfaceC74695TTf LLIIJLIL;
        o.LJIIIZ(session, "session");
        C74843TYx c74843TYx = this.LJLIL;
        if (o.LJ(c74843TYx.LJLJJL, Boolean.TRUE) || c74843TYx.mView == 0 || c75745To5 == null) {
            return;
        }
        C75745To5 c75745To52 = new C75745To5(c75745To5.LIZ, c75745To5.LIZIZ, new C38891fp(), c75745To5.LIZLLL, c75745To5.LJ, "#151723", c75745To5.LJI, true, null, null, 1792);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LLIIJLIL = R6.LLIIJLIL()) == null) {
            return;
        }
        LLIIJLIL.LIZ(c75745To52);
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
    public final void LL(InterfaceC75441TjB session, String linkMicId) {
        long j;
        LinkPlayerInfo linkPlayerInfo;
        String str;
        AbstractC74727TUl LIZ;
        AbstractC74727TUl LIZ2;
        AbstractC74727TUl LIZ3;
        AbstractC74727TUl LIZ4;
        o.LJIIIZ(session, "session");
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("receive guest[");
        LIZ5.append(linkMicId);
        LIZ5.append("] firstRemoteAudioFrame");
        C74987Tbr.LIZ("VoiceChatAnchorPresenter", X1D.LIZIZ(LIZ5));
        C74843TYx c74843TYx = this.LJLIL;
        if (c74843TYx.mView == 0) {
            return;
        }
        InterfaceC31805Ce1 interfaceC31805Ce1 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce1 != null && (LIZ4 = interfaceC31805Ce1.LIZ()) != null) {
            j = C76917UGr.LJJJ(LIZ4, linkMicId);
        } else {
            j = 0;
        }
        C74830TYk.LIZJ(j, C75147TeR.LIZJ(j), linkMicId);
        InterfaceC31805Ce1 interfaceC31805Ce12 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce12 != null && (LIZ3 = interfaceC31805Ce12.LIZ()) != null) {
            linkPlayerInfo = C76917UGr.LJJIJL(LIZ3, j);
        } else {
            linkPlayerInfo = null;
        }
        InterfaceC31805Ce1 interfaceC31805Ce13 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce13 == null || (str = interfaceC31805Ce13.LIZIZ(j)) == null) {
            str = "";
        }
        InterfaceC31805Ce1 interfaceC31805Ce14 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce14 != null && (LIZ2 = interfaceC31805Ce14.LIZ()) != null) {
            C76917UGr.LJJIII(LIZ2);
        }
        EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
        String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
        String LJJJJZ = C74843TYx.LJJJJZ(linkPlayerInfo);
        int LJIIJ = C74947TbD.LJIIJ(linkPlayerInfo);
        InterfaceC31805Ce1 interfaceC31805Ce15 = c74843TYx.LJLILLLLZI;
        if (interfaceC31805Ce15 != null && (LIZ = interfaceC31805Ce15.LIZ()) != null) {
            C76917UGr.LJJJJIZL(LIZ, linkMicId);
        }
        C75017TcL.LJIIZILJ(j, LIZJ, linkMicId, LJJJLL, LJJJJZ, LJIIJ, str, 0);
        C75147TeR.LIZLLL(j, false);
    }

    @Override // X.U62
    public final void LLFF(U65 u65, PermitApplyGroupMessage permitApplyGroupMessage) {
        TRA.LJIL(u65, permitApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLIIIJ(U65 session, RtcStartResultMessage rtcStartResultMessage) {
        o.LJIIIZ(session, "session");
        if (rtcStartResultMessage.getStartSuccess()) {
            C88207Yjb.LJII(TSK.LJLIL);
        }
    }

    @Override // X.U62
    public final void LLIIJI(U65 u65, CancelApplyGroupMessage cancelApplyGroupMessage) {
        TRA.LJ(u65, cancelApplyGroupMessage);
    }

    @Override // X.U62
    public final void LLILII(InterfaceC75441TjB session, ReplyInviteMessage replyInviteMessage) {
        o.LJIIIZ(session, "session");
        this.LJLIL.LJJJLIIL(replyInviteMessage.toUnifiedReplyInviteMessage(), false);
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
            C88207Yjb.LJIILJJIL();
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
