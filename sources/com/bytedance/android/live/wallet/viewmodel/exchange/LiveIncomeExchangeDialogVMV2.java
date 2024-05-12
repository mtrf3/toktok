package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C30725C4b;
import X.C48459J0d;
import X.C65352Pkq;
import X.C77448UaS;
import X.C77453UaX;
import X.C77454UaY;
import X.C77546Uc2;
import X.C77548Uc4;
import X.C77551Uc7;
import X.C77554UcA;
import X.C77571UcR;
import X.InterfaceC30442Bx8;
import X.InterfaceC77468Uam;
import android.content.Context;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveIncomeExchangeDialogVMV2 extends BillingAddressVM {
    public static final String LJLLLLLL = C65352Pkq.LIZ(LiveIncomeExchangeDialogVMV2.class).LJFF();

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int ov0() {
        return 1;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void mv0() {
        String str;
        LiveExchangeCancelExperiment liveExchangeCancelExperiment = LiveExchangeCancelExperiment.INSTANCE;
        if (C77551Uc7.LJFF(Boolean.valueOf(liveExchangeCancelExperiment.getValue()))) {
            str = "dont_show_again";
        } else {
            str = "not_now";
        }
        if (C77551Uc7.LJFF(Boolean.valueOf(liveExchangeCancelExperiment.getValue()))) {
            InterfaceC30442Bx8.LLLIILIL.LIZ(Boolean.FALSE);
        } else {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIIL;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        }
        qv0(str);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        qv0("exit_button");
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        super.onShow();
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void pv0() {
        this.LJLJJI = C30725C4b.LIZ();
        this.LJLJJL = new HashMap<>();
        C77453UaX c77453UaX = this.LJLLI;
        C77448UaS.LIZLLL(c77453UaX.LIZ, c77453UaX.LIZJ, "first_show_page", "anchor_income", c77453UaX.LIZLLL, 1, 0, 0, 0);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJ();
        }
        Context context = this.LJLL;
        if (context != null) {
            if (!this.LJLLLL) {
                rv0(context);
                return;
            }
            WalletExchange walletExchange = WalletExchange.LJLIL;
            C77548Uc4 c77548Uc4 = new C77548Uc4(this, context);
            walletExchange.getClass();
            WalletExchange.LIZLLL(c77548Uc4, "LIVE_GIFTS", "11", false);
        }
    }

    public final void qv0(String str) {
        C77453UaX c77453UaX = this.LJLLI;
        C77448UaS.LIZJ(c77453UaX.LIZ, c77453UaX.LIZJ, "first_show_page", "anchor_income", c77453UaX.LIZLLL, 1, 0, 0, 0, str);
    }

    public final void rv0(Context context) {
        C77454UaY c77454UaY = new C77454UaY(context, this.LJLLILLLL, this.LJLLI, "live", false, false);
        ConfirmExchangeDialogVM confirmExchangeDialogVM = c77454UaY.LJIIIIZZ;
        String str = this.LJLJI;
        confirmExchangeDialogVM.getClass();
        o.LJIIIZ(str, "<set-?>");
        confirmExchangeDialogVM.LJLJI = str;
        c77454UaY.LJIIIIZZ.qv0(false);
        c77454UaY.LJI();
        hv0("loading_duration");
        lv0(2, "anchor_income", null);
    }

    public final void sv0(DefaultLocationData defaultLocationData) {
        this.LJLJLLL.LJIJ();
        C77554UcA c77554UcA = new C77554UcA();
        if (defaultLocationData == null) {
            c77554UcA.LIZ = false;
        } else {
            c77554UcA.LIZ = true;
            c77554UcA.LIZIZ = C77571UcR.LIZ(defaultLocationData);
        }
        this.LJLLL = c77554UcA;
        this.LJLJLLL.LIZ(c77554UcA);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveIncomeExchangeDialogVMV2(C77546Uc2 view, Context context, C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam) {
        super(view, context, liveExchangeParam, interfaceC77468Uam);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
    }
}
