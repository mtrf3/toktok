package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTO extends AbstractC31497CXt<InterfaceC31336CRo> implements TT2 {
    public final Context LJLIL;
    public final TTR LJLILLLLZI;
    public final GameLinkGuestPresenter LJLJI;
    public final C62822Ol8 LJLJJI;
    public final TTP LJLJJL;

    @Override // X.TT2
    public final TU2 LIZ() {
        boolean z;
        int LIZIZ = TTV.LIZIZ(0L);
        if (LIZIZ == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TU2 tu2 = new TU2(this, 2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideBeInvitedUICtrlCmd(audio only): link permission ");
            LIZ.append(0L);
            LIZ.append(' ');
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            LIZ.append(tu2);
            TYP.LIZ("GameLinkBeInviteOptPresenter", X1D.LIZIZ(LIZ), false);
            return tu2;
        }
        TU2 tu22 = new TU2(this, 2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("provideBeInvitedUICtrlCmd: link permission ");
        LIZ2.append(0L);
        LIZ2.append(' ');
        LIZ2.append(LIZIZ);
        LIZ2.append(' ');
        LIZ2.append(tu22);
        TYP.LIZ("GameLinkBeInviteOptPresenter", X1D.LIZIZ(LIZ2), false);
        return tu22;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void detachView() {
        super.detachView();
        ((C73318Sq2) this.LJLJJI.getValue()).LIZLLL();
    }

    @Override // X.TT2
    public final C74748TVg LJJIJLIJ(long j) {
        int LIZIZ = TTV.LIZIZ(j);
        if (LIZIZ == 2) {
            C74748TVg c74748TVg = new C74748TVg(true, null, this, false, true, 342);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideBeInvitedPreviewDialogUICtrlCmd(audio only): link permission ");
            LIZ.append(j);
            LIZ.append(' ');
            LIZ.append(LIZIZ);
            LIZ.append(' ');
            LIZ.append(c74748TVg);
            TYP.LIZ("GameLinkBeInviteOptPresenter", X1D.LIZIZ(LIZ), false);
            return c74748TVg;
        }
        return null;
    }

    @Override // X.AbstractC31497CXt
    public final void attachView(InterfaceC31336CRo interfaceC31336CRo) {
        DataChannel LJIIL;
        super.attachView((TTO) interfaceC31336CRo);
        if (this.LJLILLLLZI.LIZJ() == null || (LJIIL = this.LJLILLLLZI.LJIIL()) == null) {
            return;
        }
        new TVA(this.LJLJJL, this.LJLILLLLZI, LJIIL);
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final /* bridge */ /* synthetic */ void attachView(InterfaceC2301691o interfaceC2301691o) {
        attachView((TTO) interfaceC2301691o);
    }

    @Override // X.TTA
    public final void LIZIZ(int i, String str) {
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLJI;
        if (gameLinkGuestPresenter != null) {
            GameLinkGuestPresenter.exitInteractInNormalWay$default(gameLinkGuestPresenter, "leave_source_user_click_cancel_in_preview", false, i, 2, null);
        }
    }

    public TTO(Context context, TTR gameLinkManager, GameLinkGuestPresenter gameLinkGuestPresenter) {
        o.LJIIIZ(gameLinkManager, "gameLinkManager");
        this.LJLIL = context;
        this.LJLILLLLZI = gameLinkManager;
        this.LJLJI = gameLinkGuestPresenter;
        this.LJLJJI = C221108m2.LIZIZ(TTI.LJLIL);
        C221108m2.LIZIZ(TTH.LJLIL);
        this.LJLJJL = new TTP(this);
    }
}
