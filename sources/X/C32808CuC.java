package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CuC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32808CuC implements InterfaceC77468Uam {
    public final /* synthetic */ C32802Cu6 LIZ;
    public final /* synthetic */ C32816CuK LIZIZ;

    @Override // X.InterfaceC77468Uam
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LJ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZ() {
        C0NB.LIZIZ(this.LIZ.LIZLLL, "shouldHandleExchangeBeforeLiveGiftSend onSecondNegative");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        }
        this.LIZ.LJIIJJI(this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZJ() {
        C0NB.LIZIZ(this.LIZ.LIZLLL, "shouldHandleExchangeBeforeLiveGiftSend onCoinsInsufficient");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        }
        this.LIZ.LJIIJJI(this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void LJFF() {
        C0NB.LIZIZ(this.LIZ.LIZLLL, "shouldHandleExchangeBeforeLiveGiftSend onFirstNegative");
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        }
        this.LIZ.LJIIJJI(this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void onShow() {
        DataChannel LJI = this.LIZ.LJI();
        if (LJI != null) {
            LJI.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.TRUE);
        }
    }

    public C32808CuC(C32802Cu6 c32802Cu6, C32816CuK c32816CuK) {
        this.LIZ = c32802Cu6;
        this.LIZIZ = c32816CuK;
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZLLL(int i, long j, boolean z, boolean z2) {
        String str = this.LIZ.LIZLLL;
        StringBuilder LIZLLL = C1FJ.LIZLLL("shouldHandleExchangeBeforeLiveGiftSend onSendGiftWithExchange exchangeType(", i, ") needCoins(", j);
        LIZLLL.append(") isAutoExchange(");
        LIZLLL.append(z);
        LIZLLL.append(") isTurnOnAutoExchange(");
        LIZLLL.append(z2);
        LIZLLL.append(')');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZLLL));
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        C32816CuK c32816CuK = this.LIZIZ;
        if (z2) {
            c32816CuK.LJ = true;
        }
        c32816CuK.LIZJ = i;
        c32816CuK.LIZLLL = z;
        c32816CuK.LJFF = LIZ;
        c32816CuK.LJI = true;
        UVW.LJI.LIZIZ(c32816CuK);
    }
}
