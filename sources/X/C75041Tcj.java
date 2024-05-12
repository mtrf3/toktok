package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75041Tcj extends TRY {
    public final /* synthetic */ MultiLiveAsAnchorListDialogV2 LJLIL;

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    public C75041Tcj(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        this.LJLIL = multiLiveAsAnchorListDialogV2;
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        int i2;
        o.LJIIIZ(provider, "provider");
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLIL;
        if (multiLiveAsAnchorListDialogV2.LJJJJZ() || C74945TbB.LIZ(Boolean.TRUE) == 0 || TV3.LJIIJ()) {
            C0NB.LIZIZ("kick_out_all", "MultiLiveAsAnchorListDialogV2_updateKickOutAllIconState");
            return;
        }
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiLiveAsAnchorListDialogV2_updateKickOutAllIconState linkedGuestCount:");
        LIZ.append(LJJJJZI);
        C0NB.LIZIZ("kick_out_all", X1D.LIZIZ(LIZ));
        if (C78886Uxe.LJJJJZI(C8E.LJ()) > 0) {
            i2 = R.attr.go;
        } else {
            i2 = R.attr.gp;
        }
        LiveIconView liveIconView = multiLiveAsAnchorListDialogV2.LJLLILLLL;
        if (liveIconView != null) {
            liveIconView.setIconTint(C259910h.LIZIZ(i2, liveIconView.getContext()));
        } else {
            o.LJIJI("btnLayoutKickOutAll");
            throw null;
        }
    }
}
