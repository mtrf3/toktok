package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletException;

/* renamed from: X.CuO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32820CuO extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C32801Cu5 LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;
    public final /* synthetic */ C34K LJLJJL;
    public final /* synthetic */ C32804Cu8 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32820CuO(C32801Cu5 c32801Cu5, Throwable th, int i, C76732zl c76732zl, C34K c34k, C32804Cu8 c32804Cu8) {
        super(0);
        this.LJLIL = c32801Cu5;
        this.LJLILLLLZI = th;
        this.LJLJI = i;
        this.LJLJJI = c76732zl;
        this.LJLJJL = c34k;
        this.LJLJJLL = c32804Cu8;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        UI4 LIZ = ((WalletException) ((IWalletService) CN1.LIZ(IWalletService.class)).walletException()).LIZ(this.LJLIL.LJFF(), this.LJLILLLLZI, null, null, this.LJLJI, this.LJLJJI.element, this.LJLJJL.element, this.LJLJJLL.LJIIL);
        boolean z = LIZ.LJLIL;
        boolean z2 = LIZ.LJLILLLLZI;
        if (z && z2) {
            C32801Cu5.LJIIJJI(this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }
}
