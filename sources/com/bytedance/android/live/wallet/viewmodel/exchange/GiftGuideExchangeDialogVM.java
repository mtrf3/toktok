package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C113554cx;
import X.C30725C4b;
import X.C32355Cmt;
import X.C48459J0d;
import X.C77448UaS;
import X.C77453UaX;
import X.C77469Uan;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC77468Uam;
import X.InterfaceC77539Ubv;
import X.OSZ;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GiftGuideExchangeDialogVM extends ExchangeFirstStageVM {
    public final Context LJLJLLL;
    public final C77453UaX LJLL;
    public final InterfaceC77468Uam LJLLI;
    public final String LJLLILLLL;
    public final boolean LJLLJ;
    public final Map<String, OSZ<Integer, String>> LJLLL;
    public final int LJLLLL;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean jv0() {
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int ov0() {
        if (o.LJ(this.LJLLILLLL, "ug")) {
            return 0;
        }
        return 1;
    }

    public final String qv0() {
        String str = this.LJLLILLLL;
        if (o.LJ(str, "live")) {
            return "anchor_income";
        }
        if (o.LJ(str, "ug")) {
            return "ug_exchange";
        }
        return "refund_credit";
    }

    public final boolean sv0() {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIL;
        c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        return true;
    }

    public final boolean tv0() {
        Boolean LIZ = C32355Cmt.LIZ.LJLIL.LIZ();
        o.LJIIIIZZ(LIZ, "walletStruct.liveAutoExchangeEnable");
        if (LIZ.booleanValue() && !this.LJLLJ) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIL;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GIFTS_GUIDE_EXCHANGE_CLICK_CANCEL_COUNT.value");
            if (LIZJ.intValue() >= 0) {
                Integer LIZJ2 = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ2, "LIVE_GIFTS_GUIDE_EXCHANGE_CLICK_CANCEL_COUNT.value");
                if (LIZJ2.intValue() < 4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void mv0() {
        String str;
        boolean tv0 = tv0();
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        String rv0 = rv0(true);
        OSZ<Integer, String> osz = this.LJLLL.get(this.LJLLILLLL);
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LIZJ(dataChannel, j, rv0, str, this.LJLL.LIZLLL, 1, tv0 ? 1 : 0, 0, z ? 1 : 0, "cancel");
        Integer LIZJ = InterfaceC30442Bx8.LLLIL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFTS_GUIDE_EXCHANGE_CLICK_CANCEL_COUNT.value");
        if (LIZJ.intValue() >= 0) {
            sv0();
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        super.onShow();
        hv0("loading_duration");
        lv0(0, qv0(), null);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void pv0() {
        String str;
        this.LJLJJI = C30725C4b.LIZ();
        this.LJLJJL = new HashMap<>();
        boolean tv0 = tv0();
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        String rv0 = rv0(true);
        OSZ<Integer, String> osz = this.LJLLL.get(this.LJLLILLLL);
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LIZLLL(dataChannel, j, rv0, str, this.LJLL.LIZLLL, 1, tv0 ? 1 : 0, 0, z ? 1 : 0);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLLI;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LJ();
        }
        Context context = this.LJLJLLL;
        if (context != null) {
            long LIZ = this.LJLL.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            WalletExchange walletExchange = WalletExchange.LJLIL;
            boolean z2 = this.LJLLJ;
            C77469Uan c77469Uan = new C77469Uan(this, context, LIZ);
            walletExchange.getClass();
            WalletExchange.LIZLLL(c77469Uan, "LIVE_GIFTS", "11", z2);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean iv0() {
        return this.LJLLJ;
    }

    public final String rv0(boolean z) {
        Integer LIZJ = InterfaceC30442Bx8.LLLIL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFTS_GUIDE_EXCHANGE_CLICK_CANCEL_COUNT.value");
        if (LIZJ.intValue() >= 0) {
            return "first_show_page";
        }
        return "not_auto_anchor_first";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideExchangeDialogVM(Context context, InterfaceC77539Ubv exchangeDialog, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam, String str) {
        super(context, exchangeDialog);
        boolean z;
        o.LJIIIZ(exchangeDialog, "exchangeDialog");
        this.LJLJLLL = context;
        this.LJLL = c77453UaX;
        this.LJLLI = interfaceC77468Uam;
        this.LJLLILLLL = str;
        if (o.LJ(str, "live")) {
            z = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIILIIL();
        } else if (o.LJ(str, "ug")) {
            z = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJ();
        } else {
            z = false;
        }
        this.LJLLJ = z;
        Map<String, OSZ<Integer, String>> LJJL = C113554cx.LJJL(new OSZ("live", new OSZ(2, "anchor_income")), new OSZ("ug", new OSZ(1, "ug_exchange")));
        this.LJLLL = LJJL;
        OSZ<Integer, String> osz = LJJL.get(str);
        this.LJLLLL = osz != null ? osz.getFirst().intValue() : 0;
    }
}
