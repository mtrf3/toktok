package X;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
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
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRD implements U62 {
    public final /* synthetic */ ViewOnClickListenerC75104Tdk LJLIL;

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
    public final void LJIILL(U65 session, LeaveGroupMessage leaveGroupMessage) {
        o.LJIIIZ(session, "session");
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

    public TRD(ViewOnClickListenerC75104Tdk viewOnClickListenerC75104Tdk) {
        this.LJLIL = viewOnClickListenerC75104Tdk;
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
    public final void LJIIJJI(InterfaceC75441TjB session, LeaveMessage leaveMessage) {
        Long l;
        o.LJIIIZ(session, "session");
        ViewOnClickListenerC75104Tdk viewOnClickListenerC75104Tdk = this.LJLIL;
        viewOnClickListenerC75104Tdk.getClass();
        Long userId = leaveMessage.getLeftUser().getUserId();
        User user = viewOnClickListenerC75104Tdk.LJLLLLLL;
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        if (o.LJ(userId, l)) {
            viewOnClickListenerC75104Tdk.LJLJLLL.run();
        }
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // X.U62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(java.lang.String r6, long r7) {
        /*
            r5 = this;
            java.lang.String r0 = "linkMicId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.Tdk r0 = r5.LJLIL
            com.bytedance.android.live.base.model.user.User r4 = r0.LJLLLLLL
            r3 = 0
            if (r4 == 0) goto L3d
            com.bytedance.android.live.base.model.user.User r0 = r0.LJLL
            if (r0 == 0) goto L4b
            boolean r1 = X.C74947TbD.LJIILLIIL(r0)
            r0 = 1
            if (r1 != r0) goto L4b
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.InterfaceC31805Ce1
            if (r0 == 0) goto L3d
            X.Ce1 r1 = (X.InterfaceC31805Ce1) r1
            if (r1 == 0) goto L3d
            X.TUl r2 = r1.LIZ()
            if (r2 == 0) goto L3d
            long r0 = r4.getId()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C76917UGr.LJJIJL(r2, r0)
        L39:
            if (r0 == 0) goto L3d
            java.lang.String r3 = r0.mInteractIdStr
        L3d:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r3)
            if (r0 == 0) goto L4a
            X.Tdk r0 = r5.LJLIL
            java.lang.Runnable r0 = r0.LJLJLLL
            r0.run()
        L4a:
            return
        L4b:
            X.Tl5 r0 = X.C75559Tl5.LIZIZ
            java.util.HashMap r1 = r0.LIZJ()
            java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.TQ8
            if (r0 == 0) goto L3d
            X.TQ8 r1 = (X.TQ8) r1
            if (r1 == 0) goto L3d
            X.TUl r2 = r1.LIZ()
            if (r2 == 0) goto L3d
            long r0 = r4.getId()
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C76917UGr.LJJIL(r2, r0)
            if (r0 == 0) goto L3d
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.TV3.LIZ(r0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TRD.LJJIIZI(java.lang.String, long):void");
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(session, "session");
        this.LJLIL.LJLJLLL.run();
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB session, KickOutMessage kickOutMessage) {
        Long l;
        o.LJIIIZ(session, "session");
        Long userId = kickOutMessage.getOwner().getUserId();
        User user = this.LJLIL.LJLLLLLL;
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        if (o.LJ(userId, l)) {
            this.LJLIL.LJLJLLL.run();
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
    public final void LJJLIIIJLJLI(InterfaceC75441TjB session, C75745To5 c75745To5) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJJLIL(U65 u65, InviteMessage inviteMessage) {
        TRA.LIZ(u65, inviteMessage);
    }

    @Override // X.U62
    public final void LJJLL(InterfaceC75441TjB interfaceC75441TjB, InviteMessage inviteMessage) {
        TRA.LJIIL(interfaceC75441TjB, inviteMessage);
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
    public final void LLIIIJ(U65 u65, RtcStartResultMessage rtcStartResultMessage) {
        TRA.LJJIIJZLJL(u65, rtcStartResultMessage);
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