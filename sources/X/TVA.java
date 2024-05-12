package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TVA {
    public final TY4 LIZ;
    public final TTR LIZIZ;
    public final DataChannel LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public final void LIZ(long j, long j2) {
        int i;
        GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog;
        C41051jJ c41051jJ;
        TVD tvd = (TVD) this.LIZLLL.getValue();
        tvd.LJIILLIIL = 2;
        C74740TUy.LIZLLL().LJIIJJI = tvd.LJIILLIIL;
        TY4 ty4 = this.LIZ;
        if ((ty4 instanceof GameLinkGuestBeInvitedDialog) && (gameLinkGuestBeInvitedDialog = (GameLinkGuestBeInvitedDialog) ty4) != null && (c41051jJ = gameLinkGuestBeInvitedDialog.LJLLI) != null && c41051jJ.isChecked()) {
            i = 1;
        } else {
            i = 0;
        }
        C75911Tql c75911Tql = new C75911Tql(j, j2, 2, new BizReplyParams(2, i), 16);
        InterfaceC75441TjB R6 = this.LIZIZ.R6();
        if (R6 != null) {
            R6.LJJLIIIJL(c75911Tql, new C74817TXx(this, j, j2, i));
        }
    }

    public TVA(TY4 ty4, TTR gameLinkManager, DataChannel dataChannel) {
        o.LJIIIZ(gameLinkManager, "gameLinkManager");
        this.LIZ = ty4;
        this.LIZIZ = gameLinkManager;
        this.LIZJ = dataChannel;
        TYP.LIZ("GameLinkGuestBeInvitedPresenter", "init", false);
        this.LIZLLL = C221108m2.LIZIZ(C74693TTd.LJLIL);
        this.LJ = C221108m2.LIZIZ(C74694TTe.LJLIL);
    }

    public final void LIZIZ(int i, long j, String str) {
        C74838TYs.LJ().LJJIIZ = true;
        BizLeaveParams bizLeaveParams = new BizLeaveParams(j);
        InterfaceC75441TjB R6 = this.LIZIZ.R6();
        if (R6 != null) {
            R6.LJJLIIIJ(new C76012TsO(str, 0L, bizLeaveParams, i, 2), new TSI(str));
        }
    }
}
