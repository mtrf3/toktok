package com.bytedance.android.live.wallet;

import X.B83;
import X.BZI;
import X.C03660Ck;
import X.C03880Dg;
import X.C06490Nh;
import X.C06530Nl;
import X.C141335gf;
import X.C15380j0;
import X.C1EW;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C32355Cmt;
import X.C38354F3m;
import X.C3C5;
import X.C65300Pk0;
import X.C65814PsI;
import X.C76800UCe;
import X.C76912UGm;
import X.C77437UaH;
import X.C77448UaS;
import X.C77453UaX;
import X.C77473Uar;
import X.C77476Uau;
import X.C77481Uaz;
import X.C77482Ub0;
import X.C77483Ub1;
import X.C77487Ub5;
import X.C77493UbB;
import X.C77494UbC;
import X.CN1;
import X.DialogC77438UaI;
import X.DialogInterfaceOnClickListenerC77449UaT;
import X.DialogInterfaceOnClickListenerC77452UaW;
import X.DialogInterfaceOnClickListenerC77475Uat;
import X.DialogInterfaceOnClickListenerC77496UbE;
import X.DialogInterfaceOnClickListenerC77497UbF;
import X.EnumC77490Ub8;
import X.InterfaceC64592gB;
import X.InterfaceC77468Uam;
import X.InterfaceC77498UbG;
import X.InterfaceC77500UbI;
import X.Q7L;
import X.UI8;
import Y.AfS1S2110000_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import Y.AfS7S2000000_13;
import Y.IDCListenerS53S0200000_13;
import android.content.Context;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGiftGuideExchange;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletTaxAPI;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletUgLocaleMappingSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes14.dex */
public final class WalletExchange implements IWalletExchange {
    public static final WalletExchange LJLIL = new WalletExchange();

    public static void LJ(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "-4025445571513062495")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(int r2, boolean r3) {
        /*
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L10
            if (r2 == 0) goto L18
            if (r2 == r0) goto L15
            if (r2 == r1) goto Ld
        La:
            java.lang.String r0 = ""
        Lc:
            return r0
        Ld:
            java.lang.String r0 = "refund_credit"
            goto Lc
        L10:
            if (r2 == r0) goto L18
            if (r2 == r1) goto L15
            goto La
        L15:
            java.lang.String r0 = "anchor_income"
            goto Lc
        L18:
            java.lang.String r0 = "ug_exchange"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIIIIZZ(int, boolean):java.lang.String");
    }

    public final String LJII(int i) {
        if (i == 0) {
            return "live_recharge_page";
        }
        if (i == 1) {
            return "new_balance_page";
        }
        if (i == 15) {
            return "credit_refund_page";
        }
        switch (i) {
            case 9:
                return "wallet_recharge_page";
            case 10:
                return "wallet_withdraw_page";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "send_gift_exchange";
            default:
                return "";
        }
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            r6 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            X.C77481Uaz.LIZ(r3)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "bundle:\n"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r2 = "exchangeParam"
            X.C0NB.LIZIZ(r2, r0)
            java.lang.String r1 = "key_bundle_show_balance"
            r0 = 0
            int r1 = r3.getInt(r1, r0)
            r0 = -2
            java.lang.String r4 = "open"
            java.lang.String r3 = "close"
            if (r1 == r0) goto La0
            r0 = -1
            if (r1 == r0) goto Lb9
            java.lang.String r5 = ""
        L30:
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "liveAutoExchange: "
            r4.append(r0)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIILIIL()
            r4.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            X.C0NB.LIZIZ(r2, r0)
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "ugAutoExchange: "
            r4.append(r0)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIJJ()
            r4.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            X.C0NB.LIZIZ(r2, r0)
            if (r1 == 0) goto L98
            java.lang.String r2 = "livesdk_auto_balance_exchange_status"
            java.lang.String r1 = "status"
            java.lang.String r0 = "charge_reason"
            X.BZI r2 = X.C0JU.LIZIZ(r2, r3, r1, r5, r0)
            com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting r1 = com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting.INSTANCE
            java.lang.String r0 = r2.LJIILL()
            boolean r0 = r1.isBuriedField(r0)
            if (r0 != 0) goto L99
            r2.LJIIZILJ()
            r2.LJJIIJZLJL()
        L98:
            return
        L99:
            r2.LJJIJ()
            r2.LJJIIZI()
            goto L98
        La0:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto Lb7
        Lb4:
            java.lang.String r5 = "anchor_income"
            goto Lcf
        Lb7:
            r4 = r3
            goto Lb4
        Lb9:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto Ld2
        Lcd:
            java.lang.String r5 = "ug_exchange"
        Lcf:
            r3 = r4
            goto L30
        Ld2:
            r4 = r3
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJJ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r3 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LJIJI() {
        /*
            java.util.Locale r4 = java.util.Locale.getDefault()
            r3 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.lang.String r1 = "getprop"
            java.lang.String r0 = "persist.sys.locale"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.lang.Process r3 = r2.exec(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.io.InputStream r0 = r3.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
            if (r0 != 0) goto L2e
            goto L39
        L2e:
            r4 = r0
            goto L39
        L30:
            r0 = move-exception
            if (r3 == 0) goto L36
            r3.destroy()
        L36:
            throw r0
        L37:
            if (r3 == 0) goto L3c
        L39:
            r3.destroy()
        L3c:
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIJI():java.util.Locale");
    }

    public final boolean LJIILIIL() {
        return !C38354F3m.LIZJ(CardStruct.IStatusCode.DEFAULT, C77481Uaz.LIZJ().getString("live_revenue_auto_exchange", CardStruct.IStatusCode.DEFAULT));
    }

    public final boolean LJIJJ() {
        return !C38354F3m.LIZJ(CardStruct.IStatusCode.DEFAULT, C77481Uaz.LIZJ().getString("live_auto_exchange", CardStruct.IStatusCode.DEFAULT));
    }

    public static void LJJIII(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C77481Uaz.LIZJ().edit().putString("live_revenue_auto_exchange", str).apply();
    }

    public static void LJJIIJ(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C77481Uaz.LIZJ().edit().putString("live_auto_exchange", str).apply();
    }

    public final String LJIJ(long j) {
        String str;
        Locale forLanguageTag;
        CurrencyInfo currencyInfo;
        WalletCenter walletCenter = C32355Cmt.LIZ;
        BalanceStructExtra exchangeInfo = walletCenter.LJLJJL.getExchangeInfo();
        if (exchangeInfo == null || (currencyInfo = exchangeInfo.getCurrencyInfo()) == null || (str = currencyInfo.getCode()) == null) {
            str = "";
        }
        String str2 = LiveWalletUgLocaleMappingSetting.INSTANCE.getValue().get(str);
        if (str2 == null) {
            forLanguageTag = null;
        } else {
            forLanguageTag = Locale.forLanguageTag(str2);
        }
        return LJIILLIIL(j, walletCenter.LJLJJL.getExchangeInfo(), false, str, forLanguageTag);
    }

    public static HashMap LJIIJJI(int i, boolean z) {
        String str;
        HashMap LIZJ = C03660Ck.LIZJ("charge_channel", "Exchange");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_exchange_only", str);
        LIZJ.put("charge_reason", LJIIIIZZ(i, z));
        return LIZJ;
    }

    public final void LJI(ExchangeParams exchangeParams, InterfaceC77500UbI interfaceC77500UbI) {
        if (exchangeParams == null) {
            return;
        }
        C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).exchangeCoins(exchangeParams.diamondId, exchangeParams.way, exchangeParams.currency, exchangeParams.source, exchangeParams.coinsCount, exchangeParams.localAmount, exchangeParams.currencyDot, exchangeParams.skipKycReminder, exchangeParams.penaltyWarningSkip, exchangeParams.isFirstRecharge, exchangeParams.showExchangeTooltip, exchangeParams.showExchangeAmountAdjustedText, exchangeParams.exchangeInputOption)).LJJJLIIL(new AfS62S0200000_13(exchangeParams, interfaceC77500UbI, 9), new AfS65S0100000_13(interfaceC77500UbI, 64));
    }

    public final String LJIIIZ(String str, Locale locale) {
        if (locale == null) {
            try {
                locale = LJIJI();
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return "";
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (currencyInstance instanceof DecimalFormat) {
            return String.valueOf(((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getDecimalSeparator());
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return "";
    }

    public final String LJIIJ(String str, Locale locale) {
        if (locale == null) {
            try {
                locale = LJIJI();
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return "";
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (currencyInstance instanceof DecimalFormat) {
            String currencySymbol = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getCurrencySymbol();
            o.LJIIIIZZ(currencySymbol, "nf.decimalFormatSymbols.currencySymbol");
            return currencySymbol;
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return "";
    }

    public final String LJIIL(double d, int i) {
        StringBuilder sb = new StringBuilder(CardStruct.IStatusCode.DEFAULT);
        if (i > 0) {
            sb.append(".");
            int i2 = 0;
            do {
                sb.append(CardStruct.IStatusCode.DEFAULT);
                i2++;
            } while (i2 < i);
        }
        DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.US));
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        String format = decimalFormat.format(d);
        o.LJIIIIZZ(format, "df1.format(num)");
        return format;
    }

    public final String LJIIZILJ(long j, boolean z) {
        return LJIILLIIL(j, C32355Cmt.LIZ.LJLIL.LIZ, z, null, null);
    }

    public final void LJJII(String str, String giftSource) {
        o.LJIIIZ(giftSource, "giftSource");
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((IapApi) C65814PsI.LIZJ(IapApi.class)).updateAutoExchange(true, 0)).LJJJLIIL(new AfS7S2000000_13(str, giftSource, 0), C77494UbC.LJLIL);
    }

    public static void LJFF(String str, String str2, boolean z) {
        C1EW.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).updateAutoExchange(true, 1)).LJJJLIIL(new C77483Ub1(str, str2, z), C77493UbB.LJLIL);
    }

    public static void LJJIIZI(int i, Context context, String giftSource) {
        boolean z;
        int i2;
        o.LJIIIZ(giftSource, "giftSource");
        if (i == 0 || s.LJJJLZIJ(giftSource, "gift_guide_popup", false)) {
            return;
        }
        WalletStruct walletStruct = C32355Cmt.LIZ.LJLIL;
        Boolean LIZ = walletStruct.LIZ();
        o.LJIIIIZZ(LIZ, "walletStruct.getLiveAutoExchangeEnable()");
        if (LIZ.booleanValue() && i == 2) {
            C77448UaS.LIZIZ(1, "anchor_income", giftSource);
            RevenueExchange revenueExchange = walletStruct.revenue;
            if (walletStruct.isPeriodicPayout) {
                z = true;
            } else {
                z = false;
            }
            if (revenueExchange != null && revenueExchange.isRevenue()) {
                if (z) {
                    i2 = R.string.l1m;
                } else {
                    i2 = R.string.l3e;
                }
            } else if (walletStruct.isPeriodicPayout) {
                i2 = R.string.l2b;
            } else {
                i2 = R.string.l3d;
            }
            C77437UaH c77437UaH = new C77437UaH(context);
            c77437UaH.LJJII = false;
            c77437UaH.LJI(R.string.l3j);
            c77437UaH.LIZIZ(i2);
            c77437UaH.LJ(R.string.l4j, new DialogInterfaceOnClickListenerC77449UaT(context, giftSource), false);
            c77437UaH.LIZJ(R.string.l4d, new DialogInterfaceOnClickListenerC77496UbE(giftSource), false);
            LJ(c77437UaH.LIZ());
            return;
        }
        if (i != 1) {
            return;
        }
        C77448UaS.LIZIZ(1, "ug_exchange", giftSource);
        C77437UaH c77437UaH2 = new C77437UaH(context);
        c77437UaH2.LJJII = false;
        c77437UaH2.LJI(R.string.l3j);
        c77437UaH2.LIZIZ(R.string.l3f);
        c77437UaH2.LJ(R.string.l4j, new DialogInterfaceOnClickListenerC77452UaW(giftSource), false);
        c77437UaH2.LIZJ(R.string.l4d, new DialogInterfaceOnClickListenerC77497UbF(giftSource), false);
        LJ(c77437UaH2.LIZ());
    }

    public static void LJJIJ(long j, String currencyType, String countryCode) {
        o.LJIIIZ(currencyType, "currencyType");
        o.LJIIIZ(countryCode, "countryCode");
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((IapApi) C65814PsI.LIZJ(IapApi.class)).getExchangeRatio(currencyType, countryCode, 101L, j, 2)).LJJJLIIL(C77487Ub5.LJLIL, new InterfaceC64592gB() { // from class: X.9D4
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public final boolean LJIL(Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam) {
        if (context == null) {
            return false;
        }
        if (C32355Cmt.LIZ.LJFF(c77453UaX.LIZIZ)) {
            return false;
        }
        if (s.LJJJLZIJ(c77453UaX.LIZLLL, "gift_guide_popup", false) && LiveGiftGuideExchange.INSTANCE.getValue()) {
            EnumC77490Ub8 enumC77490Ub8 = EnumC77490Ub8.LIVE_INCOME;
            WalletExchange walletExchange = LJLIL;
            if (!C77482Ub0.LIZIZ(enumC77490Ub8, context, c77453UaX, interfaceC77468Uam, walletExchange.LJII(11)) && !C77482Ub0.LIZIZ(EnumC77490Ub8.UG_INCOME, context, c77453UaX, interfaceC77468Uam, walletExchange.LJII(11))) {
                interfaceC77468Uam.LIZJ();
            }
            return true;
        }
        if (!C77481Uaz.LIZLLL(context, c77453UaX, interfaceC77468Uam) && !C77481Uaz.LJ(context, c77453UaX, interfaceC77468Uam)) {
            interfaceC77468Uam.LIZJ();
        }
        return true;
    }

    public final void LJJIIZ(Context context, C77473Uar c77473Uar, TaxDialogParams taxDialogParams) {
        boolean z;
        String LJIILL;
        WalletStruct walletStruct;
        if (context == null || taxDialogParams == null) {
            return;
        }
        IWalletCenter walletCenter = ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        if (walletCenter != null && (walletStruct = ((WalletCenter) walletCenter).LJLIL) != null && walletStruct.isPeriodicPayout) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJIILL = C15380j0.LJIILL(R.string.l2n, "6");
        } else {
            LJIILL = C15380j0.LJIILL(R.string.l5a, "6");
        }
        if (C38354F3m.LIZJ(taxDialogParams.exchangeWay, "UG")) {
            if (z) {
                C15380j0.LJIILJJIL(R.string.l1y);
            } else {
                LJIILL = C15380j0.LJIILL(R.string.l5b, "6");
            }
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJJII = false;
        c77437UaH.LIZJ = C15380j0.LJIILJJIL(R.string.l5c);
        c77437UaH.LJI = LJIILL;
        c77437UaH.LIZIZ = taxDialogParams.ignoreSuppress;
        c77437UaH.LJFF(new DialogInterfaceOnClickListenerC77475Uat(context, c77473Uar, taxDialogParams), C15380j0.LJIILJJIL(R.string.me9), false);
        c77437UaH.LIZLLL(new IDCListenerS53S0200000_13(c77473Uar, taxDialogParams, 4), C15380j0.LJIILJJIL(R.string.l3z), false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "7643544874938153799")).LIZ) {
            LIZ.show();
        }
        C77476Uau.LIZJ(taxDialogParams, "show");
    }

    public static void LIZ(InterfaceC77498UbG interfaceC77498UbG, String exchangeWay, String exchangeSource, boolean z) {
        o.LJIIIZ(exchangeWay, "exchangeWay");
        o.LJIIIZ(exchangeSource, "exchangeSource");
        if (LiveWalletTaxAPI.INSTANCE.getValue()) {
            int currentUserId = (int) ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            C65814PsI.LIZ().getClass();
            C1EW.LIZ(((IapApi) ((INetworkService) CN1.LIZ(INetworkService.class)).Yk(IapApi.class)).getTaxInfoV2("W9", currentUserId)).LJJJLIIL(new AfS1S2110000_13(interfaceC77498UbG, z, exchangeSource, exchangeWay, 1), new AfS65S0100000_13(interfaceC77498UbG, 190));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", Integer.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("case_type", 1);
        hashMap2.put("w9", hashMap);
        C65814PsI.LIZ().getClass();
        C1EW.LIZ(((IapApi) C65814PsI.LIZJ(IapApi.class)).getTaxInfo(hashMap2)).LJJJLIIL(new AfS1S2110000_13(interfaceC77498UbG, z, exchangeSource, exchangeWay, 0), new AfS65S0100000_13(interfaceC77498UbG, 189));
    }

    public static void LIZLLL(InterfaceC77498UbG interfaceC77498UbG, String exchangeWay, String exchangeSource, boolean z) {
        o.LJIIIZ(exchangeWay, "exchangeWay");
        o.LJIIIZ(exchangeSource, "exchangeSource");
        if (!LiveExchangeTaxEnableSetting.INSTANCE.getValue()) {
            interfaceC77498UbG.LIZ(true, true, null, null);
        } else {
            LJLIL.getClass();
            LIZ(interfaceC77498UbG, exchangeWay, exchangeSource, z);
        }
    }

    public final void LJJIFFI(Context context, int i, int i2, String prompt) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(prompt, "prompt");
        UI8 ui8 = new UI8();
        ui8.LJIIJJI = i;
        ui8.LJIIL = i2;
        ui8.LJIILIIL = false;
        C76912UGm.LIZIZ(context, false, prompt, ui8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r21 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r21 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILLIIL(long r18, com.bytedance.android.live.wallet.model.BalanceStructExtra r20, boolean r21, java.lang.String r22, java.util.Locale r23) {
        /*
            r17 = this;
            java.lang.String r4 = ""
            if (r20 == 0) goto L10
            com.bytedance.android.live.wallet.model.BasePackage r0 = r20.getBasePackage()
            if (r0 == 0) goto L10
            com.bytedance.android.live.wallet.model.CurrencyInfo r0 = r20.getCurrencyInfo()
            if (r0 != 0) goto L11
        L10:
            return r4
        L11:
            r10 = 0
            if (r21 == 0) goto Lb4
            com.bytedance.android.live.wallet.model.BasePackage r0 = r20.getBasePackage()
            if (r0 == 0) goto Lca
            int r8 = r0.getLocalDot()
        L1e:
            com.bytedance.android.live.wallet.model.CurrencyInfo r0 = r20.getLocalCurrencyInfo()
            if (r0 == 0) goto Lcf
            int r12 = r0.getKeepDot()
        L28:
            if (r21 == 0) goto L96
            com.bytedance.android.live.wallet.model.BasePackage r0 = r20.getBasePackage()
            if (r0 == 0) goto Lad
            long r0 = r0.getLocalPrice()
        L34:
            com.bytedance.android.live.wallet.model.CurrencyInfo r2 = r20.getLocalCurrencyInfo()
            if (r2 == 0) goto L40
            java.lang.String r2 = r2.getSymbol()
            if (r2 != 0) goto Lb2
        L40:
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r13 = r22
            r6 = r18
            if (r13 == 0) goto L78
            r14 = r23
            if (r14 == 0) goto L78
            com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCurrencyLocaliseSetting r5 = com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCurrencyLocaliseSetting.INSTANCE
            boolean r5 = r5.getValue()
            if (r5 == 0) goto L78
            java.math.BigDecimal r9 = new java.math.BigDecimal
            double r4 = (double) r0
            double r0 = (double) r8
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 / r0
            double r0 = (double) r6
            double r4 = r4 * r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r9.<init>(r0)
            java.util.List r11 = X.C47261Igj.LJJIJ(r9)
            r15 = 1
            r16 = r15
            java.util.List r0 = LJIILL(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            java.lang.String r0 = (java.lang.String) r0
        L77:
            return r0
        L78:
            java.lang.StringBuilder r9 = X.X1D.LIZ()
            r9.append(r4)
            double r4 = (double) r0
            double r0 = (double) r8
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 / r0
            double r0 = (double) r6
            double r4 = r4 * r0
            r0 = r17
            java.lang.String r0 = r0.LJIIL(r4, r12)
            r9.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r9)
            goto L77
        L96:
            com.bytedance.android.live.wallet.model.BasePackage r0 = r20.getBasePackage()
            if (r0 == 0) goto Lad
            long r0 = r0.getPrice()
        La0:
            com.bytedance.android.live.wallet.model.CurrencyInfo r2 = r20.getCurrencyInfo()
            if (r2 == 0) goto L40
            java.lang.String r2 = r2.getSymbol()
            if (r2 != 0) goto Lb2
            goto L40
        Lad:
            r0 = 0
            if (r21 == 0) goto La0
            goto L34
        Lb2:
            r4 = r2
            goto L40
        Lb4:
            com.bytedance.android.live.wallet.model.BasePackage r0 = r20.getBasePackage()
            if (r0 == 0) goto Lca
            int r8 = r0.getRealDot()
        Lbe:
            com.bytedance.android.live.wallet.model.CurrencyInfo r0 = r20.getCurrencyInfo()
            if (r0 == 0) goto Lcf
            int r12 = r0.getKeepDot()
            goto L28
        Lca:
            r8 = 0
            if (r21 == 0) goto Lbe
            goto L1e
        Lcf:
            r12 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIILLIIL(long, com.bytedance.android.live.wallet.model.BalanceStructExtra, boolean, java.lang.String, java.util.Locale):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (r20 == 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(android.content.Context r18, com.bytedance.ies.sdk.datachannel.DataChannel r19, int r20, java.lang.Long r21, java.lang.String r22) {
        /*
            r17 = this;
            long r6 = r21.longValue()
            java.lang.String r0 = "giftSource"
            r9 = r22
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r0 = 11
            r1 = r17
            java.lang.String r13 = r1.LJII(r0)
            r10 = 0
            r5 = r20
            java.lang.String r15 = LJIIIIZZ(r5, r10)
            r16 = 0
            boolean r0 = X.C77411UZr.LIZ
            if (r0 != 0) goto Le7
        L20:
            java.util.HashMap r1 = LJIIJJI(r5, r10)
            com.bytedance.android.live.wallet.WalletCenter r4 = X.C32355Cmt.LIZ
            X.Cmr r0 = X.EnumC32353Cmr.EXCHANGE_SUCCESS
            r4.LJIILIIL(r0, r1)
            r4.LJIIL()
            r1 = 1
            r0 = 2
            r3 = r18
            if (r5 != r0) goto L8e
            com.bytedance.android.live.wallet.WalletExchange r0 = com.bytedance.android.live.wallet.WalletExchange.LJLIL
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L5f
            r10 = 1
        L3d:
            X.J0d<java.lang.Integer> r1 = X.InterfaceC30442Bx8.LLLILZLLLI
            java.lang.Object r0 = r1.LIZJ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZ(r0)
        L52:
            com.bytedance.android.live.wallet.model.WalletStruct r0 = r4.LJLIL
            java.lang.Boolean r0 = r0.LIZ()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lae
        L5e:
            return
        L5f:
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLILZLLLI
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_HAS_EXCHANGE_GIFT_S…UNT_FOR_LIVE_INCOME.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L3d
            X.J0d<java.lang.Boolean> r2 = X.InterfaceC30442Bx8.LLLIZZ
            java.lang.Object r1 = r2.LIZJ()
            java.lang.String r0 = "LIVE_SHOW_TURN_ON_AUTO_E…LOG_FOR_LIVE_INCOME.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L3d
            LJJIIZI(r5, r3, r9)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.LIZ(r0)
            goto L3d
        L8e:
            if (r5 != r1) goto Le3
            com.bytedance.android.live.wallet.WalletExchange r0 = com.bytedance.android.live.wallet.WalletExchange.LJLIL
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto Lb4
            r10 = 1
        L99:
            X.J0d<java.lang.Integer> r1 = X.InterfaceC30442Bx8.LLLILZ
            java.lang.Object r0 = r1.LIZJ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZ(r0)
        Lae:
            r8 = r19
            X.C77448UaS.LJFF(r5, r6, r8, r9, r10)
            goto L5e
        Lb4:
            X.J0d<java.lang.Integer> r0 = X.InterfaceC30442Bx8.LLLILZ
            java.lang.Object r1 = r0.LIZJ()
            java.lang.String r0 = "LIVE_HAS_EXCHANGE_GIFT_S…COUNT_FOR_UG_INCOME.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L99
            X.J0d<java.lang.Boolean> r2 = X.InterfaceC30442Bx8.LLLILZJ
            java.lang.Object r1 = r2.LIZJ()
            java.lang.String r0 = "LIVE_SHOW_TURN_ON_AUTO_E…IALOG_FOR_UG_INCOME.value"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L99
            LJJIIZI(r5, r3, r9)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.LIZ(r0)
            goto L99
        Le3:
            if (r5 != r0) goto Lae
            goto L52
        Le7:
            long r11 = X.C30725C4b.LIZ()
            long r0 = X.C77411UZr.LIZIZ
            long r11 = r11 - r0
            r14 = r10
            X.C77410UZq.LIZIZ(r11, r13, r14, r15, r16)
            X.C77411UZr.LIZ = r10
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIJJLI(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, int, java.lang.Long, java.lang.String):void");
    }

    public final void LJJI(DataChannel dataChannel, long j, Boolean bool, int i, String giftSource) {
        String str;
        Long l;
        String str2;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(giftSource, "giftSource");
        if (i == 1) {
            str = "ug_exchange";
        } else {
            str = "anchor_income";
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ = C28787BRn.LIZ("livesdk_balance_exchange_failed");
        LIZ.LJIILLIIL(dataChannel);
        String str3 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(String.valueOf(l), "anchor_id");
        if (room != null) {
            str3 = room.getIdStr();
        }
        LIZ.LJIJJ(String.valueOf(str3), "room_id");
        String str4 = "1";
        if (C29306Beo.LJIIJ(dataChannel)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C06530Nl.LIZLLL(LIZ, str2, "is_anchor", j, "error_code");
        if (!booleanValue) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str4, "is_auto");
        LIZ.LJIJJ(str, "charge_reason");
        C06490Nh.LIZLLL(LIZ, giftSource, "gift_enter_from", "exchange", "error_from");
    }

    public static List LJIILL(List nums, int i, String currencyCode, Locale locale, boolean z, boolean z2) {
        Object LIZ;
        o.LJIIIZ(nums, "nums");
        o.LJIIIZ(currencyCode, "currencyCode");
        ArrayList arrayList = new ArrayList();
        if (locale == null) {
            try {
                LJLIL.getClass();
                locale = LJIJI();
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        o.LJIIIIZZ(currencyInstance, "getCurrencyInstance(locale)");
        currencyInstance.setCurrency(Currency.getInstance(currencyCode));
        currencyInstance.setMaximumFractionDigits(i);
        currencyInstance.setMinimumFractionDigits(i);
        currencyInstance.setRoundingMode(RoundingMode.CEILING);
        if (!z2) {
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            o.LJIIIIZZ(decimalFormatSymbols, "nf as DecimalFormat).decimalFormatSymbols");
            decimalFormatSymbols.setCurrencySymbol("");
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
        }
        Iterator it = nums.iterator();
        while (it.hasNext()) {
            arrayList.add(currencyInstance.format((BigDecimal) it.next()));
        }
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            if (z) {
                arrayList = new ArrayList();
                Iterator it2 = nums.iterator();
                while (it2.hasNext()) {
                    arrayList.add(LJLIL.LJIIL(((BigDecimal) it2.next()).doubleValue(), i));
                }
            } else {
                throw m10exceptionOrNullimpl;
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ List LJIILJJIL(List list, int i, String str, Locale locale, Boolean bool, Boolean bool2) {
        return LJIILL(list, i, str, locale, bool.booleanValue(), bool2.booleanValue());
    }
}
