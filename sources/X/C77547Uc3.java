package X;

import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.AutoExchangeTaxDialogVM;

/* renamed from: X.Uc3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77547Uc3 implements InterfaceC77498UbG {
    public final /* synthetic */ AutoExchangeTaxDialogVM LIZ;

    public C77547Uc3(ABLiveIncomeExchangeDialogVM aBLiveIncomeExchangeDialogVM) {
        this.LIZ = aBLiveIncomeExchangeDialogVM;
    }

    @Override // X.InterfaceC77498UbG
    public final void LIZ(boolean z, boolean z2, TaxDialogParams taxDialogParams, Throwable th) {
        if (z) {
            this.LIZ.hv0("tax_info_status_duration");
            if (z2) {
                this.LIZ.sv0(false, false);
                return;
            } else {
                this.LIZ.qv0(taxDialogParams);
                return;
            }
        }
        this.LIZ.hv0("loading_duration");
        AutoExchangeTaxDialogVM autoExchangeTaxDialogVM = this.LIZ;
        autoExchangeTaxDialogVM.lv0(1, autoExchangeTaxDialogVM.rv0(), th);
        this.LIZ.LJLJLLL.LJIJ();
        InterfaceC77468Uam interfaceC77468Uam = this.LIZ.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZJ();
        }
        AutoExchangeTaxDialogVM autoExchangeTaxDialogVM2 = this.LIZ;
        boolean z3 = !autoExchangeTaxDialogVM2.gv0();
        AutoExchangeTaxDialogVM autoExchangeTaxDialogVM3 = this.LIZ;
        autoExchangeTaxDialogVM2.kv0(autoExchangeTaxDialogVM3.LJLJI, autoExchangeTaxDialogVM3.rv0(), th, z3);
    }
}
