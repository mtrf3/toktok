package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;

/* renamed from: X.CuP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32821CuP implements InterfaceC77468Uam {
    public final /* synthetic */ C32805Cu9 LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C32787Ctr LIZJ;

    @Override // X.InterfaceC77468Uam
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LJ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZ() {
        this.LIZJ.LIZJ.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        this.LIZJ.LIZJ(this.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZJ() {
        this.LIZJ.LIZJ.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        this.LIZJ.LIZJ(this.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void LJFF() {
        this.LIZJ.LIZJ.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
        this.LIZJ.LIZJ(this.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC77468Uam
    public final void onShow() {
        this.LIZJ.LIZJ.rv0(RechargeExchangeCoinsDialogShowing.class, Boolean.TRUE);
    }

    public C32821CuP(C32787Ctr c32787Ctr, C32805Cu9 c32805Cu9, boolean z) {
        this.LIZJ = c32787Ctr;
        this.LIZ = c32805Cu9;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZLLL(int i, long j, boolean z, boolean z2) {
        if (z2) {
            this.LIZ.LJII = true;
        }
        C32805Cu9 c32805Cu9 = this.LIZ;
        c32805Cu9.LJFF = i;
        c32805Cu9.LJI = z;
        c32805Cu9.LJIIIIZZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        if (this.LIZIZ) {
            this.LIZJ.LJI(this.LIZ);
            C0NB.LJIIIZ("NewGifter", "fromNewGifterLogic: sendGiftWithRetrofit");
        } else {
            this.LIZJ.LJFF(this.LIZ);
        }
    }
}
