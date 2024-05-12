package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeExchangeLynxPagePhase1;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeOptPhase1;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeQuickGift;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynx;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeWebUrlLynxV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFirstRechargeOptimizedSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeGivingCountSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.CmD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32313CmD extends AbstractC32320CmK {
    public long LIZJ;
    public FirstChargeData LIZLLL;
    public GiftsInfo LJ;
    public C32004ChE LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public final String LIZIZ = "LiveFirstRechargeDataHolder";
    public String LJFF = "";
    public final C73318Sq2 LJIIIZ = new C73318Sq2();
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C32318CmI.LJLIL);
    public final C32276Clc LJIIJJI = new C32276Clc(this);

    public final Gift LJI() {
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        GiftsInfo giftsInfo = this.LJ;
        if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null) {
            long j = liveLimitedTimeDiscountGiftInfo.giftId;
            if (j == 0) {
                return null;
            }
            return GiftManager.inst().findGiftById(j);
        }
        return null;
    }

    public final long LJII() {
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        GiftsInfo giftsInfo = this.LJ;
        if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null) {
            return liveLimitedTimeDiscountGiftInfo.giftId;
        }
        return 0L;
    }

    public final InterfaceC32295Clv LJIIIIZZ() {
        Object value = this.LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-firstRechargePayManager>(...)");
        return (InterfaceC32295Clv) value;
    }

    public final boolean LJIIJ() {
        long j;
        GiftsInfo giftsInfo;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo2;
        GiftsInfo giftsInfo2 = this.LJ;
        if (giftsInfo2 != null && (liveLimitedTimeDiscountGiftInfo2 = giftsInfo2.firstRechargeGiftInfo) != null) {
            j = liveLimitedTimeDiscountGiftInfo2.expireTime;
        } else {
            j = 0;
        }
        if ((j > 0 && j <= (C30725C4b.LIZ() / 1000) + 1) || (giftsInfo = this.LJ) == null || (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) == null || liveLimitedTimeDiscountGiftInfo.remainTimes <= 0) {
            C0NB.LIZIZ(this.LIZIZ, "hasJustRechargedCountdownGift expire or run out of times");
            return false;
        }
        Gift LJI = LJI();
        if (LJI == null) {
            return false;
        }
        return LJI.isDisplayedOnPanel;
    }

    public final boolean LJIIL() {
        FirstChargeData firstChargeData = this.LIZLLL;
        if (firstChargeData == null || !firstChargeData.isFirstCharge || LJIIJ()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIZ() {
        if (C32455CoV.LJIILLIIL()) {
            return false;
        }
        boolean LJIIL = LJIIL();
        if (LiveGiftFirstRechargeOptimizedSetting.INSTANCE.inExp1()) {
            if (LJIIL) {
                if (C32314CmE.LIZIZ() == 0) {
                    if (C32314CmE.LIZJ() == 0) {
                        if (C32314CmE.LIZLLL() == 0) {
                            LJIIL = true;
                        } else {
                            LJIIL = false;
                        }
                    } else {
                        LJIIL = false;
                    }
                } else {
                    LJIIL = false;
                }
            }
            C10S.LIZ("LiveGiftFirstRechargeOptimizedSetting exp1 res:", LJIIL, this.LIZIZ);
        } else {
            C0NB.LIZIZ(this.LIZIZ, "LiveGiftFirstRechargeOptimizedSetting not in exp1");
        }
        if (!LJIIL && !LJIIJ()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(Diamond diamond) {
        String str;
        if (diamond == null || (str = diamond.price) == null || str.length() == 0 || diamond.count == 0 || diamond.givingCount == 0 || diamond.LJLJI == 0) {
            return true;
        }
        return false;
    }

    public static String LJIILL(FirstChargeData firstChargeData) {
        String str;
        if (firstChargeData == null) {
            return "FirstChargeData(null)";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstChargeData(isFirstCharge=");
        LIZ.append(firstChargeData.isFirstCharge);
        LIZ.append(", price=");
        Diamond diamond = firstChargeData.diamond;
        if (diamond != null) {
            str = diamond.price;
        } else {
            str = null;
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    public static String LJIILLIIL(GiftsInfo giftsInfo) {
        Long l;
        Long l2;
        if (giftsInfo == null) {
            return "GiftsInfo(null)";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftsInfo(fr_id=");
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo;
        Long l3 = null;
        if (liveLimitedTimeDiscountGiftInfo != null) {
            l = Long.valueOf(liveLimitedTimeDiscountGiftInfo.giftId);
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(", fr_exp=");
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo2 = giftsInfo.firstRechargeGiftInfo;
        if (liveLimitedTimeDiscountGiftInfo2 != null) {
            l2 = Long.valueOf(liveLimitedTimeDiscountGiftInfo2.expireTime);
        } else {
            l2 = null;
        }
        LIZ.append(l2);
        LIZ.append("), fr_times=");
        LIZ.append(giftsInfo.firstRechargeGiftInfo.remainTimes);
        LIZ.append(", fr_p=");
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo3 = giftsInfo.firstRechargeGiftInfo;
        if (liveLimitedTimeDiscountGiftInfo3 != null) {
            l3 = Long.valueOf(liveLimitedTimeDiscountGiftInfo3.originalPrice);
        }
        return JBR.LJ(LIZ, l3, ')', LIZ);
    }

    public final void LIZLLL(Uri.Builder builder) {
        IWalletCenter walletCenter;
        String str;
        BalanceStructExtra exchangeInfo;
        BalanceStructExtra exchangeInfo2;
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService == null || (walletCenter = iWalletService.walletCenter()) == null) {
            return;
        }
        WalletCenter walletCenter2 = (WalletCenter) walletCenter;
        WalletStruct walletStruct = walletCenter2.LJLIL;
        boolean z = false;
        if (walletStruct.LIZ == null) {
            return;
        }
        if (walletStruct.isPeriodicPayout) {
            z = true;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        builder.appendQueryParameter("is_periodic_payout", str);
        if (walletCenter2.LJLIL.LIZ.getCoins() > 0) {
            BalanceStructExtra balanceStructExtra = walletCenter2.LJLIL.LIZ;
            if (balanceStructExtra != null) {
                LJ(balanceStructExtra, builder);
            }
            RevenueExchange revenueExchange = walletCenter2.LJLIL.revenue;
            if (revenueExchange != null) {
                builder.appendQueryParameter("balance", ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJ(-2, true));
                if (revenueExchange.isRevenue()) {
                    builder.appendQueryParameter("exchange_type_for_first", "2");
                } else {
                    builder.appendQueryParameter("exchange_type_for_first", "1");
                }
            }
            builder.appendQueryParameter("way", "1");
            C30554Byw<Boolean> c30554Byw = InterfaceC30442Bx8.R1;
            Boolean LIZ = c30554Byw.LIZ();
            Boolean bool = Boolean.TRUE;
            if (!o.LJ(LIZ, bool)) {
                str2 = "1";
            }
            builder.appendQueryParameter("is_first_enter", str2);
            builder.appendQueryParameter("experimental_group_num", String.valueOf(LiveFirstRechargeExchangeLynxPagePhase1.INSTANCE.getValue()));
            c30554Byw.LIZJ(bool);
            return;
        }
        BalanceStruct balanceStruct = walletCenter2.LJLJJL;
        if (balanceStruct != null && (exchangeInfo = balanceStruct.getExchangeInfo()) != null && exchangeInfo.getCoins() > 0) {
            BalanceStruct balanceStruct2 = walletCenter2.LJLJJL;
            if (balanceStruct2 != null && (exchangeInfo2 = balanceStruct2.getExchangeInfo()) != null) {
                LJ(exchangeInfo2, builder);
            }
            BalanceStruct balanceStruct3 = walletCenter2.LJLJJL;
            if (balanceStruct3 != null && balanceStruct3.getUserBalance() != null) {
                builder.appendQueryParameter("balance", ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJ(-1, true));
            }
            builder.appendQueryParameter("way", CardStruct.IStatusCode.DEFAULT);
            builder.appendQueryParameter("exchange_type_for_first", "3");
            C30554Byw<Boolean> c30554Byw2 = InterfaceC30442Bx8.R1;
            Boolean LIZ2 = c30554Byw2.LIZ();
            Boolean bool2 = Boolean.TRUE;
            if (!o.LJ(LIZ2, bool2)) {
                str2 = "1";
            }
            builder.appendQueryParameter("is_first_enter", str2);
            builder.appendQueryParameter("experimental_group_num", String.valueOf(LiveFirstRechargeExchangeLynxPagePhase1.INSTANCE.getValue()));
            c30554Byw2.LIZJ(bool2);
            return;
        }
        C0NB.LIZIZ(this.LIZIZ, "doOpenH5 old page");
    }

    public final void LJIILIIL(long j) {
        long j2;
        Room room;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        int i;
        String str = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGiftSentSuccess:");
        LIZ.append(j);
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        if (LJII() == j) {
            String str2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onGiftSentSuccess update cache: oldInfo(");
            LIZ2.append(LJIILLIIL(this.LJ));
            LIZ2.append(')');
            C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ2));
            GiftsInfo giftsInfo = this.LJ;
            if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null && (i = liveLimitedTimeDiscountGiftInfo.remainTimes) > 0) {
                liveLimitedTimeDiscountGiftInfo.remainTimes = i - 1;
            }
            UW7 uw7 = GiftManager.inst().giftRepository;
            C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
            if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            uw7.LIZ(11, j2, null, "", C32455CoV.LJIILLIIL());
        }
    }

    public final boolean LJIIZILJ(long j) {
        if (j == LJII() && LJIIJ()) {
            return true;
        }
        return false;
    }

    public static void LJ(BalanceStructExtra balanceStructExtra, Uri.Builder builder) {
        String str;
        int i;
        long j;
        long j2;
        int i2;
        int i3;
        String symbol;
        CurrencyInfo currencyInfo = balanceStructExtra.getCurrencyInfo();
        String str2 = "";
        if (currencyInfo == null || (str = currencyInfo.getCode()) == null) {
            str = "";
        }
        builder.appendQueryParameter("currency_code", str);
        CurrencyInfo currencyInfo2 = balanceStructExtra.getCurrencyInfo();
        if (currencyInfo2 != null && (symbol = currencyInfo2.getSymbol()) != null) {
            str2 = symbol;
        }
        builder.appendQueryParameter("symbol", str2);
        CurrencyInfo currencyInfo3 = balanceStructExtra.getCurrencyInfo();
        int i4 = 0;
        if (currencyInfo3 != null) {
            i = currencyInfo3.getKeepDot();
        } else {
            i = 0;
        }
        builder.appendQueryParameter("keep_dot", String.valueOf(i));
        builder.appendQueryParameter("max_coins", String.valueOf(balanceStructExtra.getCoins()));
        BasePackage basePackage = balanceStructExtra.getBasePackage();
        long j3 = 0;
        if (basePackage != null) {
            j = basePackage.getId();
        } else {
            j = 0;
        }
        builder.appendQueryParameter("base_package_id", String.valueOf(j));
        BasePackage basePackage2 = balanceStructExtra.getBasePackage();
        if (basePackage2 != null) {
            j2 = basePackage2.getPrice();
        } else {
            j2 = 0;
        }
        builder.appendQueryParameter("base_package_price", String.valueOf(j2));
        BasePackage basePackage3 = balanceStructExtra.getBasePackage();
        if (basePackage3 != null) {
            i2 = basePackage3.getRealDot();
        } else {
            i2 = 0;
        }
        builder.appendQueryParameter("real_dot", String.valueOf(i2));
        BasePackage basePackage4 = balanceStructExtra.getBasePackage();
        if (basePackage4 != null) {
            i3 = basePackage4.getLocalDot();
        } else {
            i3 = 0;
        }
        builder.appendQueryParameter("local_price_real_dot", String.valueOf(i3));
        CurrencyInfo localCurrencyInfo = balanceStructExtra.getLocalCurrencyInfo();
        if (localCurrencyInfo != null) {
            i4 = localCurrencyInfo.getKeepDot();
        }
        builder.appendQueryParameter("local_keep_dot", String.valueOf(i4));
        BasePackage basePackage5 = balanceStructExtra.getBasePackage();
        if (basePackage5 != null) {
            j3 = basePackage5.getLocalPrice();
        }
        builder.appendQueryParameter("local_price", String.valueOf(j3));
    }

    @Override // X.C2U
    public final void LIZ(long j, long j2) {
        String str = this.LIZIZ;
        StringBuilder LIZJ = V10.LIZJ("resetGiftInfo(roomId=", j, ", anchorId=");
        LIZJ.append(j2);
        LIZJ.append(')');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZJ));
        C0NB.LIZIZ(this.LIZIZ, "clean");
        this.LIZLLL = null;
        this.LJ = null;
        this.LJIIIIZZ = false;
        this.LJFF = null;
        this.LJIIIZ.LIZLLL();
        this.LIZJ = j;
        LJIIIIZZ().LIZIZ();
        LJIIIIZZ().reset();
        LJIIIIZZ().LIZ(this.LJIIJJI);
    }

    @Override // X.C2U
    public final void LIZIZ(ActivityC45651qj activityC45651qj, int i, String str) {
        LJFF(activityC45651qj, true, false, str, i, null, null);
    }

    public final void LJIILJJIL(Context context, String str, boolean z, int i, String str2, String str3) {
        if (!LJIIL()) {
            C30868C9o.LIZJ(R.string.so4);
            return;
        }
        if (C15380j0.LJIILLIIL()) {
            LJFF(context, false, z, str, i, str2, str3);
            return;
        }
        B3N b3n = new B3N(1);
        C32004ChE c32004ChE = new C32004ChE(null);
        c32004ChE.LIZIZ = "first_recharge";
        c32004ChE.LJIIL = SystemClock.uptimeMillis();
        c32004ChE.LIZLLL = new RunnableC32317CmH(this, context, z, str, i, str2, str3);
        this.LJI = c32004ChE;
        C73943T0h.LIZ().LIZIZ(b3n);
    }

    public final void LJFF(Context context, boolean z, boolean z2, String str, int i, String str2, String str3) {
        Diamond diamond;
        String value;
        boolean z3;
        SparkContext Vs0;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!(context instanceof Activity)) {
            return;
        }
        FirstChargeData firstChargeData = this.LIZLLL;
        String str9 = null;
        if (firstChargeData != null) {
            diamond = firstChargeData.diamond;
        } else {
            diamond = null;
        }
        if (LJIIJJI(diamond)) {
            C30868C9o.LIZJ(R.string.so4);
            return;
        }
        C0NB.LIZIZ(this.LIZIZ, "doOpenH5");
        C32456CoW.LIZJ(this.LJFF);
        if (!LiveFirstRechargeExchangeLynxPagePhase1.INSTANCE.inExp()) {
            value = LiveFirstRechargeWebUrlLynx.INSTANCE.getValue();
            z3 = false;
        } else {
            value = LiveFirstRechargeWebUrlLynxV2.INSTANCE.getValue();
            z3 = true;
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            String str10 = this.LJFF;
            if (str10 != null && !ujb.o.LJJJJJL(str10)) {
                str2 = this.LJFF;
            }
            buildUpon.appendQueryParameter("gift_enter_from", str2);
            buildUpon.appendQueryParameter("notification_type", str3);
            if (diamond == null || (str4 = diamond.price) == null) {
                str4 = null;
            }
            buildUpon.appendQueryParameter("price", str4);
            if (diamond != null) {
                str5 = Integer.valueOf(diamond.count).toString();
            } else {
                str5 = null;
            }
            buildUpon.appendQueryParameter("diamond_count", str5);
            buildUpon.appendQueryParameter("charge_reason", str);
            String str11 = "1";
            if (z) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            buildUpon.appendQueryParameter("recall", str6);
            buildUpon.appendQueryParameter("pay_method", "google_pay");
            buildUpon.appendQueryParameter("title_ab", CardStruct.IStatusCode.DEFAULT);
            buildUpon.appendQueryParameter("request_id", BJM.LJIILIIL());
            if (C32455CoV.LJIILLIIL()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            buildUpon.appendQueryParameter("is_anchor", str7);
            buildUpon.appendQueryParameter("lack_diamond_count", String.valueOf(i));
            if (!LiveFirstRechargeQuickGift.INSTANCE.inExp() || !z2) {
                str11 = CardStruct.IStatusCode.DEFAULT;
            }
            buildUpon.appendQueryParameter("enter_from_quick_rose", str11);
            if (LiveFirstRechargeGivingCountSetting.INSTANCE.giftPanelIncludeGivingCount()) {
                if (diamond != null) {
                    str8 = Integer.valueOf(diamond.givingCount).toString();
                } else {
                    str8 = null;
                }
                buildUpon.appendQueryParameter("giving_count", str8);
            }
            LiveFirstRechargeOptPhase1 liveFirstRechargeOptPhase1 = LiveFirstRechargeOptPhase1.INSTANCE;
            if (liveFirstRechargeOptPhase1.inExp()) {
                buildUpon.appendQueryParameter("unify_first_recharge", String.valueOf(liveFirstRechargeOptPhase1.getValue()));
            }
            if (z3) {
                LIZLLL(buildUpon);
            }
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            value = uri;
        } catch (Exception e) {
            C0NB.LIZIZ(this.LIZIZ, e.toString());
        }
        String str12 = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doOpenH5:\n");
        LIZ.append(value);
        C0NB.LIZIZ(str12, X1D.LIZIZ(LIZ));
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        if (iHybridContainerService != null && (Vs0 = iHybridContainerService.Vs0(context, value, null)) != null) {
            str9 = Vs0.containerId;
        }
        this.LJII = str9;
        C15490jB.LJIJ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_opened_pack.webp");
    }
}
