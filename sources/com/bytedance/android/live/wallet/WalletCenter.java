package com.bytedance.android.live.wallet;

import X.B83;
import X.BZI;
import X.C16880lQ;
import X.C1EW;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29401Dk;
import X.C48459J0d;
import X.C73454SsE;
import X.C73893SzJ;
import X.C73969T1h;
import X.C77608Ud2;
import X.CN1;
import X.EnumC32353Cmr;
import X.InterfaceC30442Bx8;
import X.InterfaceC32356Cmu;
import X.InterfaceC64592gB;
import X.Q7L;
import Y.AfS17S0001000_5;
import Y.AfS1S0200100_5;
import Y.AfS36S0101000_5;
import Y.AfS4S0100100_5;
import Y.AfS57S0100000_5;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeSupportUGExchange;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceKillswitch;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceLocationMoveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;

/* loaded from: classes6.dex */
public class WalletCenter implements IWalletCenter {
    public WalletStruct LJLIL = new WalletStruct();
    public WalletInfoExtra LJLILLLLZI = new WalletInfoExtra();
    public ExchangeDisplayInfo LJLJI = new ExchangeDisplayInfo();
    public GetTotalBalanceResponse.GetTotalBalanceData LJLJJI = new GetTotalBalanceResponse.GetTotalBalanceData();
    public BalanceStruct LJLJJL = new BalanceStruct();
    public final C73893SzJ LJLJJLL = new C73893SzJ();
    public final C73893SzJ LJLJL = new C73893SzJ();
    public final C73893SzJ LJLJLJ = new C73893SzJ();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    public final String LIZLLL() {
        GetTotalBalanceResponse.GetTotalBalanceData getTotalBalanceData = this.LJLJJI;
        GetTotalBalanceResponse.BalanceInfo balanceInfo = getTotalBalanceData.balance;
        if (balanceInfo != null && getTotalBalanceData.hasIncomeBefore && !balanceInfo.symbol.isEmpty() && LJIIIZ()) {
            try {
                IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
                List singletonList = Collections.singletonList(new BigDecimal(this.LJLJJI.balance.amount));
                GetTotalBalanceResponse.BalanceInfo balanceInfo2 = this.LJLJJI.balance;
                return (String) ListProtector.get(((WalletExchange) walletExchange).LJIILJJIL(singletonList, balanceInfo2.decimalPlace, balanceInfo2.code, null, Boolean.FALSE, Boolean.TRUE), 0);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return "";
    }

    public final C73454SsE LJI() {
        return this.LJLJJLL.LJJJ(C73969T1h.LIZIZ());
    }

    public final boolean LJIIIIZZ() {
        if ((WalletEntranceLocationMoveSetting.INSTANCE.shouldDisplayInSettingsNavBar() || WalletEntranceBalanceShownSetting.INSTANCE.shouldShowWalletEntrance()) && !WalletEntranceKillswitch.INSTANCE.isWalletEntranceKillswitchEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        return WalletEntranceBalanceShownSetting.INSTANCE.shouldShowBalance() & this.LJLJJI.hasIncomeBefore;
    }

    public final void LJIIJ() {
        LJIILIIL(EnumC32353Cmr.OTHERS, null);
    }

    public final void LJIILJJIL() {
        C1EW.LIZ(((IWalletApi) Q7L.LIZIZ(IWalletApi.class)).getTotalExchangeableBalance()).LJJJLIIL(new AfS36S0101000_5(0, this, 63), new AfS17S0001000_5(0, 21));
    }

    public static boolean LJIILL() {
        return ((C29374Bfu) B83.LIZ().LIZIZ()).isLogin();
    }

    public final long LIZ() {
        if (!LJIILL()) {
            return 0L;
        }
        return this.LJLIL.diamond;
    }

    public final void LJIIL() {
        ExchangeDisplayInfo exchangeDisplayInfo;
        if (!LJIILL()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        Long valueOf = Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.LLLIIIIL;
        if (!valueOf.equals(c48459J0d.LIZJ())) {
            bool = Boolean.FALSE;
            c48459J0d.LIZ(valueOf);
        }
        if (!bool.booleanValue() || (exchangeDisplayInfo = this.LJLJI) == null || exchangeDisplayInfo.isFirstExchange || (exchangeDisplayInfo.w9TaxStatus != 4 && LiveExchangeTaxEnableSetting.INSTANCE.getValue())) {
            C1EW.LIZ(((IWalletApi) Q7L.LIZIZ(IWalletApi.class)).getExchangeInfo()).LJJJJZI(new AfS36S0101000_5(0, this, 64));
        }
        if (!LiveRechargeSupportUGExchange.INSTANCE.getValue()) {
            this.LJLJL.onNext(0L);
        } else {
            C1EW.LIZ(((IWalletApi) Q7L.LIZIZ(IWalletApi.class)).getBalanceInfo(1)).LJJJLIIL(new AfS36S0101000_5(1, this, 60), new AfS57S0100000_5(this, 315));
        }
    }

    public final boolean LJFF(long j) {
        if (!LJIILL() || this.LJLIL.diamond < j) {
            return false;
        }
        return true;
    }

    public final void LJII(long j) {
        if (!LJIILL()) {
            return;
        }
        this.LJLIL.diamond = j;
        this.LJLJJLL.onNext(Long.valueOf(LIZ()));
    }

    public final void LJIIJJI(InterfaceC32356Cmu interfaceC32356Cmu) {
        if (!LJIILL()) {
            C29401Dk c29401Dk = new C29401Dk(-666);
            c29401Dk.setErrorMsg("user doesn't login");
            interfaceC32356Cmu.LIZIZ(c29401Dk);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            C1EW.LIZ(((IWalletApi) Q7L.LIZIZ(IWalletApi.class)).getWalletInfoNew()).LJJJLIIL(new AfS1S0200100_5(uptimeMillis, interfaceC32356Cmu, this, 0), new AfS4S0100100_5(uptimeMillis, interfaceC32356Cmu, 2));
        }
    }

    public final String LJ(int i, boolean z) {
        int i2;
        int i3;
        double d = 10.0d;
        int i4 = 0;
        if (i == -1) {
            if (this.LJLJJL.getUserBalance() != null) {
                double balance = this.LJLJJL.getUserBalance().getBalance();
                if (this.LJLJJL.getExchangeInfo() != null && this.LJLJJL.getExchangeInfo().getCurrencyInfo() != null) {
                    i3 = this.LJLJJL.getExchangeInfo().getCurrencyInfo().getKeepDot();
                } else {
                    i3 = 0;
                }
                if (!z) {
                    d = 1.0d;
                }
                IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
                double pow = balance / Math.pow(d, 2.0d);
                if (z) {
                    i4 = i3;
                }
                return ((WalletExchange) walletExchange).LJIIL(pow, i4);
            }
        } else {
            RevenueExchange revenueExchange = this.LJLIL.revenue;
            if (revenueExchange != null) {
                double balance2 = revenueExchange.getBalance();
                BalanceStructExtra balanceStructExtra = this.LJLIL.LIZ;
                if (balanceStructExtra != null && balanceStructExtra.getCurrencyInfo() != null) {
                    i2 = this.LJLIL.LIZ.getCurrencyInfo().getKeepDot();
                } else {
                    i2 = 0;
                }
                if (!z) {
                    d = 1.0d;
                }
                IWalletExchange walletExchange2 = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
                double pow2 = balance2 / Math.pow(d, 2.0d);
                if (z) {
                    i4 = i2;
                }
                return ((WalletExchange) walletExchange2).LJIIL(pow2, i4);
            }
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public final void LJIILIIL(final EnumC32353Cmr enumC32353Cmr, final HashMap<String, String> hashMap) {
        if (!LJIILL()) {
            return;
        }
        final long LIZ = LIZ();
        if (enumC32353Cmr == EnumC32353Cmr.LIVE_ROOM_PRELOAD) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_preload_calling_wallet_api");
            LIZ2.LJIJJ(C77608Ud2.LIZ(), "pay_method");
            LIZ2.LJIJJ("live_room", "request_page");
            LIZ2.LJJIIJZLJL();
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        C1EW.LIZ(((IWalletApi) Q7L.LIZIZ(IWalletApi.class)).getWalletInfoNew()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.Cmq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String str;
                WalletCenter walletCenter = WalletCenter.this;
                long j = uptimeMillis;
                EnumC32353Cmr enumC32353Cmr2 = enumC32353Cmr;
                HashMap logMap = hashMap;
                long j2 = LIZ;
                BaseResponse baseResponse = (BaseResponse) obj;
                walletCenter.getClass();
                HashMap hashMap2 = new HashMap();
                WalletStruct walletStruct = (WalletStruct) baseResponse.data;
                if (walletStruct != null) {
                    BalanceStructExtra balanceStructExtra = walletCenter.LJLIL.LIZ;
                    walletCenter.LJLIL = walletStruct;
                    WalletExchange walletExchange = WalletExchange.LJLIL;
                    boolean LIZJ = walletStruct.LIZJ();
                    walletExchange.getClass();
                    WalletExchange.LJJIIJ(LIZJ);
                    WalletExchange.LJJIII(walletStruct.LIZIZ());
                    RevenueExchange revenueExchange = walletCenter.LJLIL.revenue;
                    if (revenueExchange != null && revenueExchange.getEnableExchange()) {
                        walletCenter.LJLIL.LIZ = balanceStructExtra;
                        WalletExchange.LJJIJ(walletStruct.revenue.getBalance(), walletStruct.revenue.getCurrency(), walletStruct.revenue.getRegion());
                    }
                    hashMap2.put("detail_raw_code", Long.valueOf(walletStruct.diamond));
                } else {
                    hashMap2.put("detail_raw_code", -1);
                }
                R r = baseResponse.extra;
                if (r != 0) {
                    walletCenter.LJLILLLLZI = (WalletInfoExtra) r;
                }
                walletCenter.LJLJJLL.onNext(Long.valueOf(walletCenter.LIZ()));
                C0K2.LJIIL(SystemClock.uptimeMillis() - j, 0, O5Y.LJJL("ttlive_charge_current_diamond_status"), hashMap2);
                int i = C32354Cms.LIZ[enumC32353Cmr2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (logMap != null) {
                            if (j2 != walletCenter.LIZ()) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            logMap.put("is_update", str);
                        }
                        o.LJIIIZ(logMap, "logMap");
                        AnonymousClass172.LIZ("livesdk_recharge_coins_balance_response", logMap);
                    }
                } else {
                    C77630UdO.LJ(SystemClock.uptimeMillis() - j, true);
                }
                C77630UdO.LJI(SystemClock.uptimeMillis() - j, null);
            }
        }, new AfS1S0200100_5(uptimeMillis, enumC32353Cmr, hashMap, 13));
    }
}
