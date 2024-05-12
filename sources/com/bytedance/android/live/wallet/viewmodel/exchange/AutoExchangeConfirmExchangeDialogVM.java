package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C113554cx;
import X.C48459J0d;
import X.C77410UZq;
import X.C77448UaS;
import X.C77453UaX;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC77468Uam;
import X.OSZ;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AutoExchangeConfirmExchangeDialogVM extends ExchangeDialogVM {
    public final C77453UaX LJLJJLL;
    public final InterfaceC77468Uam LJLJL;
    public final boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final String LJLL;
    public final Map<String, OSZ<Integer, String>> LJLLI;
    public final int LJLLILLLL;
    public final long LJLLJ;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void mv0() {
        String str;
        String second;
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLJJLL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        OSZ<Integer, String> osz = this.LJLLI.get(this.LJLL);
        String str2 = "";
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LIZJ(dataChannel, j, "second_confirm_page", str, this.LJLJJLL.LIZLLL, 2, 0, 1, z ? 1 : 0, "cancel");
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLIL;
        c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        OSZ<Integer, String> osz2 = this.LJLLI.get(this.LJLL);
        if (osz2 != null && (second = osz2.getSecond()) != null) {
            str2 = second;
        }
        C77448UaS.LJI("not_auto_exchange", str2, this.LJLJJLL.LIZLLL, false);
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZLLL(this.LJLLILLLL, this.LJLLJ, false, false);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void nv0() {
        String str;
        String str2;
        String str3 = this.LJLJI;
        String str4 = this.LJLL;
        if (o.LJ(str4, "live")) {
            str = "anchor_income";
        } else if (o.LJ(str4, "ug")) {
            str = "ug_exchange";
        } else {
            str = "refund_credit";
        }
        C77410UZq.LIZJ(str3, str, false);
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLJJLL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        OSZ<Integer, String> osz = this.LJLLI.get(this.LJLL);
        if (osz == null || (str2 = osz.getSecond()) == null) {
            str2 = "";
        }
        C77448UaS.LIZLLL(dataChannel, j, "second_confirm_page", str2, this.LJLJJLL.LIZLLL, 2, 0, 1, z ? 1 : 0);
        if (o.LJ(this.LJLL, "live")) {
            IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
            String giftSource = this.LJLJJLL.LIZLLL;
            walletExchange.getClass();
            o.LJIIIZ(giftSource, "giftSource");
            WalletExchange.LJFF("not_auto_exchange", giftSource, true);
        } else if (o.LJ(this.LJLL, "ug")) {
            ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJJII("not_auto_exchange", this.LJLJJLL.LIZLLL);
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZIZ();
        }
        InterfaceC77468Uam interfaceC77468Uam2 = this.LJLJL;
        if (interfaceC77468Uam2 != null) {
            interfaceC77468Uam2.LIZLLL(this.LJLLILLLL, this.LJLLJ, true, this.LJLILLLLZI);
        }
        C77410UZq.LJ();
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZLLL(this.LJLLILLLL, this.LJLLJ, false, false);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJL;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean iv0() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean jv0() {
        return this.LJLJLLL;
    }

    public AutoExchangeConfirmExchangeDialogVM(C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam, String callFrom) {
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        o.LJIIIZ(callFrom, "callFrom");
        this.LJLJJLL = liveExchangeParam;
        this.LJLJL = interfaceC77468Uam;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = callFrom;
        Map<String, OSZ<Integer, String>> LJJL = C113554cx.LJJL(new OSZ("live", new OSZ(2, "anchor_income")), new OSZ("ug", new OSZ(1, "ug_exchange")));
        this.LJLLI = LJJL;
        OSZ<Integer, String> osz = LJJL.get(callFrom);
        this.LJLLILLLL = osz != null ? osz.getFirst().intValue() : 0;
        this.LJLLJ = liveExchangeParam.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
    }
}
