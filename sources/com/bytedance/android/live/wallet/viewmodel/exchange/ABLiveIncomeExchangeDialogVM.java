package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C48459J0d;
import X.C77410UZq;
import X.C77448UaS;
import X.C77453UaX;
import X.C77454UaY;
import X.C77545Uc1;
import X.C77551Uc7;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC77468Uam;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ABLiveIncomeExchangeDialogVM extends AutoExchangeTaxDialogVM {
    public final boolean LL;

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
        vv0(str);
        if (C77551Uc7.LJFF(Boolean.valueOf(liveExchangeCancelExperiment.getValue()))) {
            InterfaceC30442Bx8.LLLIILIL.LIZ(Boolean.FALSE);
        } else {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIIL;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        vv0("exit_button");
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void pv0() {
        int i;
        String str;
        String str2;
        Integer LIZJ = InterfaceC30442Bx8.LLLILZLLLI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_HAS_EXCHANGE_GIFT_S…UNT_FOR_LIVE_INCOME.value");
        boolean z = false;
        if (LIZJ.intValue() > 1 && !this.LL) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLLI;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        if (this.LJZL) {
            str = "over_threshold_anchor_first";
        } else {
            str = "not_auto_anchor_first";
        }
        C77448UaS.LIZLLL(dataChannel, j, str, "anchor_income", c77453UaX.LIZLLL, 1, i, 0, z2 ? 1 : 0);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJ();
        }
        if (this.LJZI != null) {
            C77410UZq.LIZLLL(this.LJLJI, rv0(), false, true);
            uv0();
            return;
        }
        C77410UZq.LIZLLL(this.LJLJI, rv0(), true, false);
        String str3 = this.LJLLLLLL;
        if (o.LJ(str3, "LIVE_GIFTS")) {
            str2 = "live_ab";
        } else if (o.LJ(str3, "UG")) {
            str2 = "ug";
        } else {
            str2 = "";
        }
        Context context = this.LJLL;
        if (context == null) {
            return;
        }
        C77454UaY c77454UaY = new C77454UaY(context, this.LJLLILLLL, this.LJLLI, str2, this.LL, this.LJZL);
        ConfirmExchangeDialogVM confirmExchangeDialogVM = c77454UaY.LJIIIIZZ;
        String str4 = this.LJLJI;
        confirmExchangeDialogVM.getClass();
        o.LJIIIZ(str4, "<set-?>");
        confirmExchangeDialogVM.LJLJI = str4;
        ConfirmExchangeDialogVM confirmExchangeDialogVM2 = c77454UaY.LJIIIIZZ;
        confirmExchangeDialogVM2.LJLILLLLZI = this.LJLILLLLZI;
        if (this.LL && this.LJZL) {
            z = true;
        }
        confirmExchangeDialogVM2.qv0(z);
        c77454UaY.LJI();
        lv0(2, rv0(), null);
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        super.onShow();
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean iv0() {
        return this.LL;
    }

    public final void vv0(String str) {
        int i;
        String str2;
        Integer LIZJ = InterfaceC30442Bx8.LLLILZLLLI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_HAS_EXCHANGE_GIFT_S…UNT_FOR_LIVE_INCOME.value");
        if (LIZJ.intValue() > 1 && !this.LL) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLLI;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        if (this.LJZL) {
            str2 = "over_threshold_anchor_first";
        } else {
            str2 = "not_auto_anchor_first";
        }
        C77448UaS.LIZJ(dataChannel, j, str2, "anchor_income", c77453UaX.LIZLLL, 1, i, 0, z ? 1 : 0, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABLiveIncomeExchangeDialogVM(C77545Uc1 view, Context context, C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam) {
        super(view, context, liveExchangeParam, interfaceC77468Uam);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LL = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIILIIL();
    }
}
