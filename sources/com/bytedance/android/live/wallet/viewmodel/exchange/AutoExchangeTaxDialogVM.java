package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C62705OjF;
import X.C77410UZq;
import X.C77453UaX;
import X.C77476Uau;
import X.C77554UcA;
import X.C77571UcR;
import X.CN1;
import X.InterfaceC77468Uam;
import X.InterfaceC77552Uc8;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class AutoExchangeTaxDialogVM extends BillingAddressVM {
    public final String LJLLLLLL;
    public final String LJLZ;
    public final long LJZ;
    public TaxDialogParams LJZI;
    public final boolean LJZL;

    public final String rv0() {
        String str = this.LJLLLLLL;
        if (o.LJ(str, "LIVE_GIFTS")) {
            return "anchor_income";
        }
        if (o.LJ(str, "UG")) {
            return "ug_exchange";
        }
        return "refund_credit";
    }

    public final void uv0() {
        Context context = this.LJLL;
        if (context != null) {
            ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJJIIZ(context, null, this.LJZI);
            lv0(1, rv0(), null);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean jv0() {
        return this.LJZL;
    }

    public final void qv0(TaxDialogParams taxDialogParams) {
        this.LJLLJ.LIZ(C77476Uau.LIZIZ(this.LJLLI.LIZIZ, iv0(), true).LJFF(new C62705OjF()).LJJII(new AfS62S0200000_13(this, taxDialogParams, 10), new AfS65S0100000_13(this, 65)));
    }

    public final void tv0(DefaultLocationData defaultLocationData) {
        hv0("loading_duration");
        lv0(0, rv0(), null);
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

    public final void sv0(boolean z, boolean z2) {
        int i;
        if (z) {
            this.LJLLJ.LIZ(C77476Uau.LIZ().LJFF(new C62705OjF()).LJJII(new AfS65S0100000_13(this, 191), new AfS65S0100000_13(this, 192)));
            return;
        }
        if (gv0()) {
            if (z2) {
                this.LJLJLLL.LJIJ();
                hv0("loading_duration");
                uv0();
                return;
            }
            this.LJLJLLL.LJIJ();
            String str = this.LJLLLLLL;
            if (o.LJ(str, "LIVE_GIFTS")) {
                i = 2;
            } else if (o.LJ(str, "UG")) {
                i = 1;
            } else {
                i = 0;
            }
            InterfaceC77468Uam interfaceC77468Uam = this.LJLLILLLL;
            if (interfaceC77468Uam != null) {
                interfaceC77468Uam.LIZLLL(i, this.LJZ, true, this.LJLILLLLZI);
            }
            C77410UZq.LJ();
            return;
        }
        tv0(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoExchangeTaxDialogVM(InterfaceC77552Uc8 view, Context context, C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam) {
        super(view, context, liveExchangeParam, interfaceC77468Uam);
        boolean z;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LJLLLLLL = "LIVE_GIFTS";
        this.LJLZ = "11";
        long LIZ = liveExchangeParam.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        this.LJZ = LIZ;
        LiveExchangeCancelLimit.INSTANCE.getValue();
        if (LIZ > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJZL = z;
    }
}
