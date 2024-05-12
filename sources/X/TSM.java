package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkMicMaskGuestItemWidget;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkMicViewMaskWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSM implements U62 {
    public final /* synthetic */ GameLinkMicViewMaskWidget LJLIL;

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
    public final void LJLJJI(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    public TSM(GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget) {
        this.LJLIL = gameLinkMicViewMaskWidget;
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
        LinkListUser linkListUser;
        Long l;
        int i;
        User user;
        TU4 LIZ;
        Object obj;
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("linkMicId = ");
        LIZ2.append(linkMicId);
        LIZ2.append(",surfaceView=");
        LIZ2.append(surfaceView);
        LIZ2.append(", isCDNVideoLand=");
        LIZ2.append(((Boolean) this.LJLIL.LJLLI.getValue()).booleanValue());
        LIZ2.append(", contentView=");
        LIZ2.append(this.LJLIL.contentView);
        TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ2));
        if (surfaceView == null) {
            return;
        }
        boolean booleanValue = ((Boolean) this.LJLIL.LJLLI.getValue()).booleanValue();
        TT0 tt0 = this.LJLIL.LJLILLLLZI;
        Long l2 = null;
        if (tt0 == null || (LIZ = tt0.LIZ()) == null || TextUtils.isEmpty(linkMicId)) {
            linkListUser = null;
        } else {
            Iterator it = LIZ.LIZLLL().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (TextUtils.equals(((LinkListUser) obj).linkMicId, linkMicId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            linkListUser = (LinkListUser) obj;
        }
        GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.LJLIL;
        if (surfaceView.getParent() instanceof ViewGroup) {
            ViewParent parent = surfaceView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setLayoutTransition(null);
            C29306Beo.LJJIJIIJIL(surfaceView);
        }
        if (linkListUser != null && (user = linkListUser.user) != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        Room room = (Room) gameLinkMicViewMaskWidget.dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        if (o.LJ(l, l2)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("videoWidth = ");
            LIZ3.append(gameLinkMicViewMaskWidget.LL());
            LIZ3.append(", videoHeight=");
            LIZ3.append(gameLinkMicViewMaskWidget.LJZL());
            TYP.LIZJ("GameLinkMicViewMaskWidget", X1D.LIZIZ(LIZ3));
            int i2 = -1;
            if (gameLinkMicViewMaskWidget.LLF() && gameLinkMicViewMaskWidget.LJZL() > 0) {
                i = (C15380j0.LJIIJJI() * gameLinkMicViewMaskWidget.LL()) / gameLinkMicViewMaskWidget.LJZL();
            } else {
                i = -1;
            }
            if (booleanValue && !gameLinkMicViewMaskWidget.LLF() && gameLinkMicViewMaskWidget.LL() != 0) {
                i2 = (C15380j0.LJIIL() * gameLinkMicViewMaskWidget.LJZL()) / gameLinkMicViewMaskWidget.LL();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i2);
            if (booleanValue && !gameLinkMicViewMaskWidget.LLF()) {
                marginLayoutParams.topMargin = C15380j0.LJFF(R.dimen.aed);
            }
            gameLinkMicViewMaskWidget.LJLJJLL = marginLayoutParams;
            surfaceView.setZOrderMediaOverlay(true);
            View view = gameLinkMicViewMaskWidget.contentView;
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).addView(surfaceView, 0, gameLinkMicViewMaskWidget.LJLJJLL);
            ((HashMap) gameLinkMicViewMaskWidget.LJLLLL).put(linkMicId, surfaceView);
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
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage) {
        TRA.LJIIIZ(interfaceC75441TjB, destroyChannelMessage);
    }

    @Override // X.U62
    public final void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage) {
        TRA.LJIILL(interfaceC75441TjB, kickOutMessage);
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
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U62
    public final void LJJIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        List list;
        List list2;
        GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.LJLIL;
        List list3 = null;
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
        gameLinkMicViewMaskWidget.getClass();
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty() || list3 == null || list3.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = gameLinkMicViewMaskWidget.LJLJI.get(ListProtector.get(list, i));
            if (gameLinkMicMaskGuestItemWidget != null) {
                gameLinkMicMaskGuestItemWidget.LJLZ(((Number) ListProtector.get(list3, i)).intValue());
            }
        }
    }

    @Override // X.U62
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        String str;
        o.LJIIIZ(session, "session");
        HashMap<String, GameLinkMicMaskGuestItemWidget> hashMap = this.LJLIL.LJLJI;
        RtcUserInfo LLLLLJIL = session.LLLLLJIL();
        if (LLLLLJIL == null || (str = LLLLLJIL.getLinkMicId()) == null) {
            str = "";
        }
        GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = hashMap.get(str);
        if (gameLinkMicMaskGuestItemWidget != null) {
            gameLinkMicMaskGuestItemWidget.LJZ(i);
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
    public final void LJZL(InterfaceC75441TjB interfaceC75441TjB, List<LinkUser> list, List<LinkUser> list2, List<LinkUser> list3, List<LinkUser> list4, List<LinkUser> list5, List<LinkUser> list6, List<LinkUser> list7, String str, CustomLinkMessage customLinkMessage) {
        TRA.LJJIJ(interfaceC75441TjB, list, list2, list3, list4, list5, list6, list7);
    }
}
