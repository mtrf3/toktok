package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C113554cx;
import X.C30725C4b;
import X.C77410UZq;
import X.C77448UaS;
import X.C77453UaX;
import X.C77481Uaz;
import X.CN1;
import X.InterfaceC77468Uam;
import X.OSZ;
import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ConfirmExchangeDialogVM extends ExchangeDialogVM {
    public final Context LJLJJLL;
    public final C77453UaX LJLJL;
    public final InterfaceC77468Uam LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final String LJLLI;
    public final Map<String, OSZ<Integer, String>> LJLLILLLL;
    public final int LJLLJ;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void mv0() {
        String str;
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLJL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        String pv0 = pv0(this.LJLL);
        OSZ<Integer, String> osz = this.LJLLILLLL.get(this.LJLLI);
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LIZJ(dataChannel, j, pv0, str, this.LJLJL.LIZLLL, 2, 0, z ? 1 : 0, z ? 1 : 0, "cancel");
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJLJ;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZ();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onCancel() {
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJLJ;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZ();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJLJ;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.onShow();
        }
    }

    public final String ov0() {
        String str = this.LJLLI;
        int hashCode = str.hashCode();
        if (hashCode != 3730) {
            if (hashCode != 3322092) {
                if (hashCode == 184289364 && str.equals("live_ab")) {
                    return "anchor_income";
                }
            } else if (str.equals("live")) {
                return "anchor_income";
            }
        } else if (str.equals("ug")) {
            return "ug_exchange";
        }
        return "refund_credit";
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void nv0() {
        String str;
        long j;
        BasePackage basePackage;
        BasePackage basePackage2;
        String currency;
        BasePackage basePackage3;
        this.LJLJJI = C30725C4b.LIZ();
        long LIZ = this.LJLJL.LIZIZ - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        boolean z = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLJL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j2 = c77453UaX.LIZJ;
        String pv0 = pv0(this.LJLL);
        OSZ<Integer, String> osz = this.LJLLILLLL.get(this.LJLLI);
        String str2 = "";
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LIZLLL(dataChannel, j2, pv0, str, this.LJLJL.LIZLLL, 2, 0, z ? 1 : 0, z ? 1 : 0);
        int i = 0;
        if (this.LJLILLLLZI) {
            IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
            String giftSource = this.LJLJL.LIZLLL;
            walletExchange.getClass();
            o.LJIIIZ(giftSource, "giftSource");
            WalletExchange.LJFF("not_auto_exchange", giftSource, false);
        }
        InterfaceC77468Uam interfaceC77468Uam = this.LJLJLJ;
        if (interfaceC77468Uam != null) {
            interfaceC77468Uam.LIZIZ();
        }
        if (o.LJ(this.LJLLI, "live")) {
            C77410UZq.LIZJ(this.LJLJI, ov0(), true);
            WalletExchange walletExchange2 = WalletExchange.LJLIL;
            int i2 = this.LJLJL.LIZIZ;
            walletExchange2.getClass();
            long LIZ2 = i2 - ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
            WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
            RevenueExchange revenueExchange = walletStruct.revenue;
            ExchangeParams exchangeParams = new ExchangeParams();
            BalanceStructExtra balanceStructExtra = walletStruct.LIZ;
            long j3 = 0;
            if (balanceStructExtra != null && (basePackage3 = balanceStructExtra.getBasePackage()) != null) {
                j = basePackage3.getId();
            } else {
                j = 0;
            }
            exchangeParams.diamondId = (int) j;
            exchangeParams.way = 1;
            if (revenueExchange != null && (currency = revenueExchange.getCurrency()) != null) {
                str2 = currency;
            }
            exchangeParams.currency = str2;
            exchangeParams.source = 11;
            exchangeParams.coinsCount = LIZ2;
            BalanceStructExtra balanceStructExtra2 = walletStruct.LIZ;
            if (balanceStructExtra2 != null && (basePackage2 = balanceStructExtra2.getBasePackage()) != null) {
                j3 = basePackage2.getPrice();
            }
            exchangeParams.localAmount = j3 * LIZ2;
            BalanceStructExtra balanceStructExtra3 = walletStruct.LIZ;
            if (balanceStructExtra3 != null && (basePackage = balanceStructExtra3.getBasePackage()) != null) {
                i = basePackage.getRealDot();
            }
            exchangeParams.currencyDot = i;
            exchangeParams.isFirstRecharge = ((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge();
            Context context = this.LJLJJLL;
            C77453UaX c77453UaX2 = this.LJLJL;
            C77481Uaz.LIZIZ(c77453UaX2.LIZJ, context, this.LJLJLJ, exchangeParams, c77453UaX2.LIZ, c77453UaX2.LIZLLL, new AqS163S0100000_13(this, 472), new AqS179S0100000_13(this, 531));
            return;
        }
        C77410UZq.LIZJ(this.LJLJI, ov0(), false);
        InterfaceC77468Uam interfaceC77468Uam2 = this.LJLJLJ;
        if (interfaceC77468Uam2 != null) {
            interfaceC77468Uam2.LIZLLL(this.LJLLJ, LIZ, false, this.LJLILLLLZI);
        }
        C77410UZq.LJ();
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean iv0() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean jv0() {
        return this.LJLL;
    }

    public final String pv0(boolean z) {
        String str = this.LJLLI;
        int hashCode = str.hashCode();
        if (hashCode != 3730) {
            if (hashCode != 3322092) {
                if (hashCode == 184289364 && str.equals("live_ab")) {
                    if (z) {
                        return "over_threshold_anchor_second";
                    }
                    return "not_auto_anchor_second";
                }
            } else if (str.equals("live")) {
                return "second_confirm_page";
            }
        } else if (str.equals("ug")) {
            return "over_threshold_two";
        }
        return "";
    }

    public final void qv0(boolean z) {
        String str;
        boolean z2 = this.LJLILLLLZI;
        C77453UaX c77453UaX = this.LJLJL;
        DataChannel dataChannel = c77453UaX.LIZ;
        long j = c77453UaX.LIZJ;
        String pv0 = pv0(z);
        OSZ<Integer, String> osz = this.LJLLILLLL.get(this.LJLLI);
        if (osz == null || (str = osz.getSecond()) == null) {
            str = "";
        }
        C77448UaS.LJ(dataChannel, j, pv0, str, this.LJLJL.LIZLLL, 2, 0, z2 ? 1 : 0);
    }

    public ConfirmExchangeDialogVM(Context context, InterfaceC77468Uam interfaceC77468Uam, C77453UaX liveExchangeParam, String str, boolean z, boolean z2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LJLJJLL = context;
        this.LJLJL = liveExchangeParam;
        this.LJLJLJ = interfaceC77468Uam;
        this.LJLJLLL = z;
        this.LJLL = z2;
        this.LJLLI = str;
        Map<String, OSZ<Integer, String>> LJJL = C113554cx.LJJL(new OSZ("live", new OSZ(2, "anchor_income")), new OSZ("ug", new OSZ(1, "ug_exchange")), new OSZ("live_ab", new OSZ(2, "anchor_income")));
        this.LJLLILLLL = LJJL;
        OSZ<Integer, String> osz = LJJL.get(str);
        this.LJLLJ = osz != null ? osz.getFirst().intValue() : 0;
    }
}
