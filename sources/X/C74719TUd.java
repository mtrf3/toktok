package X;

import Y.ARunnableS24S0300000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDObjectS0S0101000;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
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
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.TUd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74719TUd implements InterfaceC75371Ti3, U62 {
    public final boolean LJLIL;
    public final InterfaceC74721TUf LJLILLLLZI;
    public String LJLJJLL;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C35895E6x.LJLIL);
    public final long LJLJJI = 4290888129L;
    public boolean LJLJJL = true;
    public int LJLJL = 720;
    public int LJLJLJ = 720;

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

    public final float LJI() {
        return (this.LJLJLJ * 8.0f) / this.LJLJL;
    }

    public final HashMap<View, ViewGroup> LJIIJ() {
        return (HashMap) this.LJLJI.getValue();
    }

    public final void LJFF() {
        for (Map.Entry<View, ViewGroup> entry : LJIIJ().entrySet()) {
            View key = entry.getKey();
            C87277YNd.LJJIIZ(key);
            entry.getValue().post(new ARunnableS49S0100000_13(key, 10));
            ViewGroup value = entry.getValue();
            value.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            value.setClipToOutline(true);
            Iterator<View> it = C78924UyG.LIZLLL(entry.getValue()).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (iDObjectS0S0101000.hasNext()) {
                    View view = (View) iDObjectS0S0101000.next();
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    view.setClipToOutline(true);
                }
            }
        }
        this.LJLILLLLZI.LIZ(0.0f);
        LJIIJ().clear();
    }

    @Override // X.U62
    public final void LJIILIIL(String source) {
        o.LJIIIZ(source, "source");
    }

    public final Drawable LJIILJJIL(View view) {
        LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
        if (livesdkLinkmicFloatWindowOptimizeSetting.isV1(this.LJLIL)) {
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            LIZIZ.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), (int) this.LJLJJI);
            LIZIZ.setCornerRadius(LJI());
            return LIZIZ;
        }
        if (livesdkLinkmicFloatWindowOptimizeSetting.isV2(this.LJLIL)) {
            GradientDrawable LIZIZ2 = T28.LIZIZ(0);
            LIZIZ2.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), C259910h.LIZIZ(R.attr.go, view.getContext()));
            LIZIZ2.setCornerRadius(LJI());
            return LIZIZ2;
        }
        return null;
    }

    @Override // X.U62
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
    }

    public final void LJIL(boolean z) {
        this.LJLJJL = z;
        if (!z) {
            LJFF();
        }
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

    public C74719TUd(boolean z, C74720TUe c74720TUe) {
        this.LJLIL = z;
        this.LJLILLLLZI = c74720TUe;
        C8E.LJ().e3(this);
    }

    @Override // X.U62
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.InterfaceC75371Ti3
    public final void LIZIZ(View view, ViewGroup parent) {
        ZoomService zoomService;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        if (!this.LJLJJL || LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.isV0(this.LJLIL)) {
            return;
        }
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("ZOOM_SERVICE");
        if (obj instanceof ZoomService) {
            zoomService = (ZoomService) obj;
        } else {
            zoomService = null;
        }
        if ((zoomService != null && zoomService.LIZJ()) || C59994Ngc.LIZJ() != EnumC74778TWk.FLOATING) {
            C87277YNd.LJJIIZ(view);
            parent.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            parent.setClipToOutline(true);
            Iterator<View> it = C78924UyG.LIZLLL(parent).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (iDObjectS0S0101000.hasNext()) {
                    View view2 = (View) iDObjectS0S0101000.next();
                    view2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    view2.setClipToOutline(true);
                } else {
                    this.LJLILLLLZI.LIZ(0.0f);
                    return;
                }
            }
        } else {
            TV3.LJIILIIL(-1, view, parent);
            TV3.LJIILL(parent, new ARunnableS24S0300000_13(this, view, parent, 3));
        }
    }

    @Override // X.InterfaceC75371Ti3
    public final void LIZJ(View view, ViewGroup parent) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        C87277YNd.LJJIIZ(view);
        parent.post(new ARunnableS49S0100000_13(view, 11));
        parent.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        parent.setClipToOutline(true);
        Iterator<View> it = C78924UyG.LIZLLL(parent).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view2 = (View) iDObjectS0S0101000.next();
                view2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                view2.setClipToOutline(true);
            } else {
                LJIIJ().remove(view);
                return;
            }
        }
    }

    @Override // X.InterfaceC75371Ti3
    public final void LIZLLL(View view, boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            if (!this.LJLJLLL) {
                LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
                if (livesdkLinkmicFloatWindowOptimizeSetting.isV2(this.LJLIL)) {
                    gradientDrawable = T28.LIZIZ(0);
                    gradientDrawable.setStroke(livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH(), C259910h.LIZIZ(R.attr.eh, view.getContext()));
                    gradientDrawable.setCornerRadius(LJI());
                } else {
                    gradientDrawable = null;
                }
                view.setBackground(gradientDrawable);
            }
        } else if (this.LJLJLLL) {
            view.setBackground(LJIILJJIL(view));
        }
        this.LJLJLLL = z;
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
        if (o.LJ(linkMicId, this.LJLJJLL)) {
            LJIL(true);
            this.LJLJJLL = null;
        }
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
    public final void LJJJJIZL(InterfaceC75441TjB session, int i, int i2) {
        o.LJIIIZ(session, "session");
    }

    @Override // X.U62
    public final void LJLI(U65 session, LinkUser joinedUser, CustomLinkMessage customLinkMessage) {
        o.LJIIIZ(session, "session");
        o.LJIIIZ(joinedUser, "joinedUser");
        LJIL(false);
        Long userId = joinedUser.getUserId();
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        if (userId == null || userId.longValue() != currentUserId) {
            return;
        }
        this.LJLJJLL = joinedUser.getLinkMicId();
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
