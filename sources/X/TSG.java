package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSG implements InterfaceC75414Tik<LeaveChannelResult> {
    public final /* synthetic */ GameLinkGuestPresenter LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveChannelResult value) {
        o.LJIIIZ(value, "value");
        TYP.LIZ("GameLinkGuestPresenter", "leave channel succeed", false);
        this.LJLIL.isLeavingChannel = false;
        C74838TYs.LJ().LJJIIZ = true;
        this.LJLIL.isWaitingState = false;
        if (!o.LJ(this.LJLILLLLZI, "leave_with_detach_view")) {
            this.LJLIL.getMultiGuestDataHolder().LJIIZILJ = -1;
            C74838TYs.LJ().LJIIIZ(false);
            TTV.LIZ().LJ = false;
            this.LJLIL.leaveAction(this.LJLJI);
            TTV.LIZ().LIZ = false;
            this.LJLIL.turnOffEngine();
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leave channel failed, ");
        LIZ.append(this.LJLIL.getThrowableMsg(th));
        TYP.LIZ("GameLinkGuestPresenter", X1D.LIZIZ(LIZ), false);
        GameLinkGuestPresenter gameLinkGuestPresenter = this.LJLIL;
        gameLinkGuestPresenter.isLeavingChannel = false;
        if (th != null && gameLinkGuestPresenter.mView != 0) {
            gameLinkGuestPresenter.logThrowable(th);
        }
        C74838TYs.LJ().LJJIIZ = false;
        if (!(th instanceof C64698PaI)) {
            this.LJLIL.getMultiGuestDataHolder().LJIIZILJ = -1;
            C74838TYs.LJ().LJIIIZ(false);
            TTV.LIZ().LJ = false;
            this.LJLIL.leaveAction(this.LJLJI);
            TTV.LIZ().LIZ = false;
            this.LJLIL.turnOffEngine();
        }
    }

    public TSG(GameLinkGuestPresenter gameLinkGuestPresenter, String str, boolean z) {
        this.LJLIL = gameLinkGuestPresenter;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
