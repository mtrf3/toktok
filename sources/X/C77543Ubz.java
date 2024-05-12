package X;

import android.content.Context;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.viewmodel.exchange.ConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Ubz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77543Ubz implements InterfaceC77498UbG {
    public final /* synthetic */ UGExchangeDialogVM LIZ;
    public final /* synthetic */ Context LIZIZ;

    public C77543Ubz(UGExchangeDialogVM uGExchangeDialogVM, Context context) {
        this.LIZ = uGExchangeDialogVM;
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC77498UbG
    public final void LIZ(boolean z, boolean z2, TaxDialogParams taxDialogParams, Throwable th) {
        boolean z3;
        if (z) {
            if (z2) {
                this.LIZ.hv0("tax_info_status_duration");
                C77410UZq.LIZLLL(this.LIZ.LJLJI, "ug_exchange", true, false);
                Context context = this.LIZIZ;
                UGExchangeDialogVM uGExchangeDialogVM = this.LIZ;
                C77454UaY c77454UaY = new C77454UaY(context, uGExchangeDialogVM.LJLLI, uGExchangeDialogVM.LJLL, "ug", uGExchangeDialogVM.LJLLILLLL, uGExchangeDialogVM.LJLLJ);
                ConfirmExchangeDialogVM confirmExchangeDialogVM = c77454UaY.LJIIIIZZ;
                String str = this.LIZ.LJLJI;
                confirmExchangeDialogVM.getClass();
                o.LJIIIZ(str, "<set-?>");
                confirmExchangeDialogVM.LJLJI = str;
                ConfirmExchangeDialogVM confirmExchangeDialogVM2 = c77454UaY.LJIIIIZZ;
                UGExchangeDialogVM uGExchangeDialogVM2 = this.LIZ;
                confirmExchangeDialogVM2.LJLILLLLZI = uGExchangeDialogVM2.LJLILLLLZI;
                if (uGExchangeDialogVM2.LJLLILLLL && uGExchangeDialogVM2.LJLLJ) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                confirmExchangeDialogVM2.qv0(z3);
                c77454UaY.LJI();
                this.LIZ.hv0("loading_duration");
                this.LIZ.lv0(2, "ug_exchange", null);
            }
        } else {
            InterfaceC77468Uam interfaceC77468Uam = this.LIZ.LJLLI;
            if (interfaceC77468Uam != null) {
                interfaceC77468Uam.LIZJ();
            }
            this.LIZ.hv0("loading_duration");
            this.LIZ.lv0(2, "ug_exchange", th);
        }
        if (taxDialogParams != null) {
            C77410UZq.LIZLLL(this.LIZ.LJLJI, "ug_exchange", false, true);
            this.LIZ.hv0("tax_info_status_duration");
            WalletExchange.LJLIL.LJJIIZ(this.LIZ.LJLJLLL, null, taxDialogParams);
            this.LIZ.hv0("loading_duration");
            this.LIZ.lv0(1, "ug_exchange", null);
        }
    }
}
