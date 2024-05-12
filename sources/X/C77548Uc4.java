package X;

import android.content.Context;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2;

/* renamed from: X.Uc4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77548Uc4 implements InterfaceC77498UbG {
    public final /* synthetic */ LiveIncomeExchangeDialogVMV2 LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C77548Uc4(LiveIncomeExchangeDialogVMV2 liveIncomeExchangeDialogVMV2, Context context) {
        this.LIZ = liveIncomeExchangeDialogVMV2;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC77498UbG
    public final void LIZ(boolean z, boolean z2, TaxDialogParams taxDialogParams, Throwable th) {
        if (z) {
            this.LIZ.hv0("tax_info_status_duration");
            if (z2) {
                C77410UZq.LIZLLL(this.LIZ.LJLJI, "anchor_income", true, false);
                this.LIZ.rv0(this.LIZIZ);
                return;
            } else {
                if (taxDialogParams == null) {
                    return;
                }
                C77410UZq.LIZLLL(this.LIZ.LJLJI, "anchor_income", false, true);
                WalletExchange.LJLIL.LJJIIZ(this.LIZ.LJLL, null, taxDialogParams);
                this.LIZ.hv0("loading_duration");
                this.LIZ.lv0(1, "anchor_income", null);
                return;
            }
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LIZ.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZJ();
        }
        this.LIZ.hv0("loading_duration");
        this.LIZ.lv0(1, "anchor_income", th);
    }
}
