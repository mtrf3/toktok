package X;

import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;

/* renamed from: X.Uaq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77472Uaq extends AbstractC38123Exj<TaxDialogParams, Object> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(TaxDialogParams taxDialogParams, C38131Exr c38131Exr) {
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(C29306Beo.LIZ(c38131Exr.LIZ));
        IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
        WalletExchange walletExchange2 = (WalletExchange) walletExchange;
        walletExchange2.LJJIIZ(LIZIZ, new C77473Uar(this), taxDialogParams);
    }
}
