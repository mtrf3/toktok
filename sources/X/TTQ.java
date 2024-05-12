package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTQ extends AbstractC31497CXt<InterfaceC31336CRo> implements TT1 {
    public final TTR LJLIL;
    public final GameLinkGuestPresenter LJLILLLLZI;

    @Override // X.TT1
    public final void LIZLLL() {
        long j;
        Room LIZJ = this.LJLIL.LIZJ();
        if (LIZJ != null) {
            j = LIZJ.getOwnerUserId();
        } else {
            j = 0;
        }
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams(j);
        InterfaceC75441TjB R6 = this.LJLIL.R6();
        if (R6 != null) {
            R6.LJLL(new TTS(bizJoinChannelParams));
        }
    }

    @Override // X.TT1
    public final C74691TTb LIZJ(long j) {
        boolean z;
        if (TTV.LIZIZ(j) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C74691TTb c74691TTb = new C74691TTb(this, new C74748TVg(false, null, null, false, false, 510));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideApplyDialogUICtrlCmd(audio only): ");
            LIZ.append(c74691TTb);
            TYP.LIZ("GameLinkApplyOptPresenter", X1D.LIZIZ(LIZ), false);
            return c74691TTb;
        }
        TYP.LIZ("GameLinkApplyOptPresenter", "link type unknown", false);
        return null;
    }

    @Override // X.TT1
    public final C74748TVg LJIIIIZZ(long j) {
        boolean z;
        if (TTV.LIZIZ(j) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C74748TVg c74748TVg = new C74748TVg(true, this, null, true, false, 422);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideApplyConfirmDialogUICtrlCmd(audio only): ");
            LIZ.append(c74748TVg);
            TYP.LIZ("GameLinkApplyOptPresenter", X1D.LIZIZ(LIZ), false);
            return c74748TVg;
        }
        TYP.LIZ("GameLinkApplyOptPresenter", "link type unknown", false);
        return null;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        super.attachView((TTQ) interfaceC2301691o);
    }

    @Override // X.AbstractC31497CXt
    public final void attachView(InterfaceC31336CRo interfaceC31336CRo) {
        super.attachView((TTQ) interfaceC31336CRo);
    }

    public TTQ(TTR linkManager, GameLinkGuestPresenter gameLinkGuestPresenter) {
        o.LJIIIZ(linkManager, "linkManager");
        this.LJLIL = linkManager;
        this.LJLILLLLZI = gameLinkGuestPresenter;
    }

    @Override // X.TTA
    public final void LIZIZ(int i, String str) {
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLILLLLZI;
        if (gameLinkGuestPresenter != null) {
            GameLinkGuestPresenter.exitInteractInNormalWay$default(gameLinkGuestPresenter, "leave_source_user_click_cancel_in_preview", false, i, 2, null);
        }
    }
}
