package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C30725C4b;
import X.C48459J0d;
import X.C77448UaS;
import X.C77453UaX;
import X.C77543Ubz;
import X.C77544Uc0;
import X.C77551Uc7;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC77468Uam;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGExchangeDialogVM extends ExchangeFirstStageVM {
    public final Context LJLJLLL;
    public final C77453UaX LJLL;
    public final InterfaceC77468Uam LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int ov0() {
        return 0;
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
        rv0(str);
        if (!this.LJLLILLLL) {
            if (C77551Uc7.LJFF(Boolean.valueOf(liveExchangeCancelExperiment.getValue()))) {
                InterfaceC30442Bx8.LLLIILIL.LIZ(Boolean.FALSE);
            } else {
                C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIIL;
                c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
            }
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        rv0("exit_button");
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        hv0("loading_duration");
        lv0(0, "ug_exchange", null);
        super.onShow();
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void pv0() {
        this.LJLJJI = C30725C4b.LIZ();
        this.LJLJJL = new HashMap<>();
        C77453UaX c77453UaX = this.LJLL;
        C77448UaS.LIZLLL(c77453UaX.LIZ, c77453UaX.LIZJ, qv0(this.LJLLJ), "ug_exchange", this.LJLL.LIZLLL, 1, 0, 0, 0);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJ();
        }
        if (this.LJLILLLLZI) {
            ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJJII("not_auto_exchange", this.LJLL.LIZLLL);
        }
        Context context = this.LJLJLLL;
        if (context != null) {
            WalletExchange walletExchange = WalletExchange.LJLIL;
            boolean z = this.LJLLILLLL;
            C77543Ubz c77543Ubz = new C77543Ubz(this, context);
            walletExchange.getClass();
            WalletExchange.LIZLLL(c77543Ubz, "UG", "11", z);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean iv0() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean jv0() {
        return this.LJLLJ;
    }

    public final String qv0(boolean z) {
        if (z) {
            return "over_threshold_one";
        }
        Integer LIZJ = InterfaceC30442Bx8.LLLILZ.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_HAS_EXCHANGE_GIFT_S…COUNT_FOR_UG_INCOME.value");
        if (LIZJ.intValue() > 1) {
            return "not_auto";
        }
        return "first_two_times";
    }

    public final void rv0(String str) {
        C77453UaX c77453UaX = this.LJLL;
        C77448UaS.LIZJ(c77453UaX.LIZ, c77453UaX.LIZJ, qv0(this.LJLLJ), "ug_exchange", this.LJLL.LIZLLL, 1, 0, 0, 0, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGExchangeDialogVM(Context context, C77544Uc0 exchangeDialog, C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam) {
        super(context, exchangeDialog);
        boolean z;
        o.LJIIIZ(exchangeDialog, "exchangeDialog");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LJLJLLL = context;
        this.LJLL = liveExchangeParam;
        this.LJLLI = interfaceC77468Uam;
        LiveExchangeCancelLimit.INSTANCE.getValue();
        long LIZ = liveExchangeParam.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        this.LJLLILLLL = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJ();
        if (LIZ > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = z;
    }
}
