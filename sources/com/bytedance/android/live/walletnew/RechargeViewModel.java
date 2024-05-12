package com.bytedance.android.live.walletnew;

import X.ActivityC45651qj;
import X.B3N;
import X.BZI;
import X.C04520Fs;
import X.C113554cx;
import X.C15380j0;
import X.C1EW;
import X.C28787BRn;
import X.C28835BTj;
import X.C29061Bar;
import X.C29306Beo;
import X.C30868C9o;
import X.C31556Ca0;
import X.C31660Cbg;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C38354F3m;
import X.C47261Igj;
import X.C53739L7f;
import X.C53740L7g;
import X.C62822Ol8;
import X.C73933Szx;
import X.C73943T0h;
import X.C75861Tpx;
import X.C77537Ubt;
import X.C77541Ubx;
import X.C77591Ucl;
import X.C77608Ud2;
import X.C77626UdK;
import X.C77649Udh;
import X.C77800Ug8;
import X.C79146V4k;
import X.CN1;
import X.EnumC77641UdZ;
import X.F9J;
import X.InterfaceC29856Bng;
import X.InterfaceC77540Ubw;
import X.InterfaceC77595Ucp;
import X.InterfaceC77611Ud5;
import X.InterfaceC77669Ue1;
import X.InterfaceC77748UfI;
import X.InterfaceC92693kP;
import X.ORY;
import X.OSZ;
import Y.AfS54S0200000_5;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeDialog;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeUrl;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeGivingCountSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeInsufficientPackageRecommendationTimeout;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeVipEntranceSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityDetail;
import com.bytedance.android.livesdk.wallet.model.recharge.ExtraActivityInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.c1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RechargeViewModel extends BaseRechargeViewModel {
    public final Bundle LJLLL;
    public final C77591Ucl LJLLLL;
    public DataChannel LJLLLLLL;
    public final InterfaceC77611Ud5 LJLZ;
    public final MutableLiveData<Diamond> LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public boolean LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public InterfaceC92693kP LLIIIL;
    public boolean LLIIIZ;
    public InterfaceC77748UfI LLIIJI;
    public final MutableLiveData<Long> LLIIJLIL;
    public Diamond LLIIL;
    public Diamond LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;

    public final void Ev0() {
        int i;
        DataChannel Tk;
        C77626UdK c77626UdK;
        if (zv0() == -1) {
            i = 0;
        } else {
            i = 1;
        }
        C77537Ubt c77537Ubt = (C77537Ubt) Av0(C77537Ubt.class);
        c77537Ubt.LIZIZ = 18;
        c77537Ubt.LIZJ = i;
        C1EW.LIZ(c77537Ubt.LIZ()).LJJJLIIL(C53739L7f.LJLIL, C53740L7g.LJLIL);
        InterfaceC77611Ud5 interfaceC77611Ud5 = this.LJLZ;
        if (interfaceC77611Ud5 != null && (Tk = interfaceC77611Ud5.Tk()) != null && (c77626UdK = (C77626UdK) Tk.kv0(C75861Tpx.class)) != null) {
            InterfaceC77595Ucp interfaceC77595Ucp = this.LJLIL;
            if (interfaceC77595Ucp != null) {
                interfaceC77595Ucp.LJIJ();
            }
            DiamondPackageExtra diamondPackageExtra = c77626UdK.LJLILLLLZI;
            this.LJLJL = diamondPackageExtra;
            List<Diamond> list = c77626UdK.LJLIL;
            this.LJLJLJ = list;
            InterfaceC77595Ucp interfaceC77595Ucp2 = this.LJLIL;
            if (interfaceC77595Ucp2 != null) {
                interfaceC77595Ucp2.me(diamondPackageExtra, list);
                return;
            }
            return;
        }
        if (!C77649Udh.LIZ().LIZ()) {
            lv0(null, EnumC77641UdZ.USE, BaseRechargeViewModel.LJLLJ, true);
            return;
        }
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        RecommendStrategyParam recommendStrategyParam = new RecommendStrategyParam();
        String str = this.LJLLLL.LJI;
        o.LJIIIZ(str, "<set-?>");
        recommendStrategyParam.scene = str;
        String str2 = this.LJLLLL.LIZJ;
        o.LJIIIZ(str2, "<set-?>");
        recommendStrategyParam.chargeReason = str2;
        recommendStrategyParam.giftIds = C47261Igj.LJJIJIL(Long.valueOf(this.LJLLLL.LJ));
        long j = this.LJLLLL.LJII;
        recommendStrategyParam.giftTotalCoins = j;
        recommendStrategyParam.coinsGap = j - LIZ;
        lv0(recommendStrategyParam, EnumC77641UdZ.NON_USE_AND_NON_CACHE, LiveRechargeInsufficientPackageRecommendationTimeout.INSTANCE.getValue(), true);
    }

    public final boolean Cv0() {
        return ((Boolean) this.LJZI.getValue()).booleanValue();
    }

    public final boolean Dv0() {
        WalletStruct walletStruct;
        WalletCenter walletCenter = (WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        walletCenter.getClass();
        if (!WalletCenter.LJIILL() || (walletStruct = walletCenter.LJLIL) == null || walletStruct.vipOnlyRechargeChannelStatus != 1) {
            return false;
        }
        if (!ORY.LJJIJIIJIL(tv0(), LiveRechargeVipEntranceSetting.INSTANCE.getValue())) {
            return false;
        }
        return true;
    }

    public final boolean isFirstRecharge() {
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge() && LiveFirstRechargeGivingCountSetting.INSTANCE.rechargePanelIncludeGivingCount()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final boolean kv0() {
        C77591Ucl c77591Ucl = this.LJLLLL;
        if (c77591Ucl.LJIIIZ && c77591Ucl.LJIIJ) {
            return true;
        }
        return false;
    }

    public final int sv0() {
        ExtraActivityInfo extraActivityInfo;
        List<ExtraActivityDetail> list;
        DiamondPackageExtra diamondPackageExtra = this.LJLJL;
        Boolean bool = null;
        if (diamondPackageExtra != null) {
            extraActivityInfo = diamondPackageExtra.activityInfo;
            if (extraActivityInfo != null) {
                bool = Boolean.valueOf(extraActivityInfo.isShowBanner);
            }
        } else {
            extraActivityInfo = null;
        }
        if (C29306Beo.LJJIFFI(bool) && extraActivityInfo != null && (list = extraActivityInfo.activityDetail) != null) {
            Iterator<ExtraActivityDetail> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ExtraActivityDetail next = it.next();
                if (o.LJ(next.activityId, "kyc_incentive_001")) {
                    if (next != null) {
                        return 3;
                    }
                }
            }
        }
        if (Dv0()) {
            return -3;
        }
        return zv0();
    }

    public final String tv0() {
        return (String) this.LLF.getValue();
    }

    public final int uv0() {
        return ((Number) this.LLD.getValue()).intValue();
    }

    public final int vv0() {
        return ((Number) this.LLI.getValue()).intValue();
    }

    public final c1 wv0() {
        return (c1) this.LLIIIJ.getValue();
    }

    public final long xv0() {
        return ((Number) this.LLIFFJFJJ.getValue()).longValue();
    }

    public final String yv0() {
        return (String) this.LL.getValue();
    }

    public final int zv0() {
        return ((Number) this.LLFZ.getValue()).intValue();
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC92693kP interfaceC92693kP = this.LLIIIL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LLIIIL = null;
        this.LJLLLLLL = null;
    }

    public final boolean rv0() {
        if (vv0() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final InterfaceC77748UfI jv0() {
        return this.LLIIJI;
    }

    public final <T extends InterfaceC77540Ubw> T Av0(Class<T> cls) {
        T t = (T) ((HashMap) this.LLIIII.getValue()).get(cls);
        if (t == null) {
            synchronized (this) {
                t = cls.newInstance();
                HashMap hashMap = (HashMap) this.LLIIII.getValue();
                o.LJII(t, "null cannot be cast to non-null type T of com.bytedance.android.live.walletnew.RechargeViewModel.getSubViewModel$lambda$0");
                hashMap.put(cls, t);
            }
        }
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        if (r0.equals(r3) == true) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bv0(X.ActivityC45651qj r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeViewModel.Bv0(X.1qj):void");
    }

    public final void Gv0(ActivityC45651qj activityC45651qj) {
        if (zv0() == 0) {
            return;
        }
        InterfaceC77595Ucp interfaceC77595Ucp = this.LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.s8(0, 500L);
        }
        C77537Ubt c77537Ubt = (C77537Ubt) Av0(C77537Ubt.class);
        this.LJLJJL.LIZ(C1EW.LIZ(c77537Ubt.LIZ()).LJIJJLI(new AfS62S0200000_13(c77537Ubt, activityC45651qj, 65)).LJJJLIIL(new AfS54S0200000_5(this, activityC45651qj, 78), new AfS65S0100000_13(this, 258)));
    }

    public final void Hv0(ActivityC45651qj activityC45651qj) {
        String str;
        C32364Cn2 c32364Cn2;
        Diamond diamond = this.LLIILII;
        if (diamond != null && C79146V4k.LJJJIL(diamond)) {
            str = "custom";
        } else {
            str = "app_package_guide";
        }
        DataChannel dataChannel = this.LJLLLLLL;
        Map<String, String> map = this.LJLLLL.LIZIZ;
        Map LJJL = C113554cx.LJJL(new OSZ("request_page", yv0()), new OSZ("charge_reason", tv0()), new OSZ("charge_style", "window"), new OSZ("panel_type", "normal"), new OSZ("gift_enter_from", this.LLFF.getValue()), new OSZ("gift_send_type", this.LLFFF.getValue()), new OSZ("pay_method", C77608Ud2.LIZ()), new OSZ("guided_to_web_type", str));
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_lagersum_click");
        LIZ.LJJIFFI(LJJL);
        LIZ.LJJIFFI(map);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
        if (C38354F3m.LIZJ(F9J.LIZIZ(C15380j0.LIZLLL(), 0, "js_kv_methods_20191113").getString("live_guide_show_discount_modal", "1"), CardStruct.IStatusCode.DEFAULT)) {
            c32364Cn2 = new C32364Cn2(LiveWebRechargeUrl.INSTANCE.getValue());
            c32364Cn2.LIZ((int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.9d)), "height");
        } else {
            c32364Cn2 = new C32364Cn2(LiveWebRechargeDialog.INSTANCE.getValue());
        }
        c32364Cn2.LIZJ("charge_reason", tv0());
        c32364Cn2.LIZJ("pay_method", "google_pay");
        c32364Cn2.LIZJ("request_page", yv0());
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(activityC45651qj, UriProtector.parse(c32364Cn2.LIZLLL()));
    }

    public final void Iv0(Context context) {
        if (C15380j0.LJIILLIIL()) {
            Diamond diamond = this.LLIILII;
            if (diamond != null) {
                InterfaceC77669Ue1 interfaceC77669Ue1 = (InterfaceC77669Ue1) C31660Cbg.LIZIZ.getValue();
                int i = diamond.count;
                String LIZIZ = C04520Fs.LIZIZ();
                o.LJIIIIZZ(LIZIZ, "getLanguage()");
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, interfaceC77669Ue1.LIZ(i, LIZIZ));
                return;
            }
            return;
        }
        this.LLILII = true;
        C73943T0h.LIZ().LIZIZ(new B3N(1));
    }

    public final void Jv0(Diamond diamond) {
        Map<String, String> map;
        Object obj;
        Integer num;
        String str;
        String str2;
        C77591Ucl rechargeDialogConfig = this.LJLLLL;
        int i = diamond.count;
        boolean z = this.LLIIIILZ;
        DataChannel dataChannel = this.LJLLLLLL;
        if (rechargeDialogConfig != null) {
            map = rechargeDialogConfig.LIZIZ;
        } else {
            map = null;
        }
        Diamond diamond2 = this.LLIIL;
        DiamondPackageExtra diamondPackageExtra = this.LJLJL;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        OSZ[] oszArr = new OSZ[12];
        oszArr[0] = new OSZ("gift_send_type", this.LLFFF.getValue());
        oszArr[1] = new OSZ("request_page", yv0());
        oszArr[2] = new OSZ("charge_reason", tv0());
        oszArr[3] = new OSZ("charge_style", "window");
        oszArr[4] = new OSZ("pay_method", C77608Ud2.LIZ());
        String str3 = "1";
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_first_recharge", obj);
        oszArr[6] = new OSZ("recharge_package", String.valueOf(i));
        if (dataChannel == null || !o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[7] = new OSZ("is_anchor", str3);
        oszArr[8] = new OSZ("panel_type", C77541Ubx.LJI(rechargeDialogConfig, false));
        if (diamond2 != null) {
            num = Integer.valueOf(diamond2.count);
        } else {
            num = null;
        }
        oszArr[9] = new OSZ("call_package", String.valueOf(num));
        if (diamond2 != null) {
            str = diamond2.LJLILLLLZI;
        } else {
            str = null;
        }
        oszArr[10] = new OSZ("currency", String.valueOf(str));
        if (z) {
            str2 = "click";
        } else {
            str2 = "call";
        }
        oszArr[11] = new OSZ("preview_type", str2);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        Map LIZJ = C77541Ubx.LIZJ(rechargeDialogConfig, i);
        Map LJ = C77541Ubx.LJ();
        Map LIZLLL = C77541Ubx.LIZLLL(rechargeDialogConfig, diamondPackageExtra);
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_preview");
        LIZ.LJIILLIIL(dataChannel);
        Map<String, String> map2 = null;
        LIZ.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ.LJJIFFI(LJJLIIIIJ);
        LIZ.LJJIFFI(LIZJ);
        LIZ.LJJIFFI(LJ);
        LIZ.LJJIFFI(LIZLLL);
        LIZ.LJJIFFI(map);
        LIZ.LJJIIJZLJL();
        if (diamond.LJLIL == 2) {
            DataChannel dataChannel2 = this.LJLLLLLL;
            C77591Ucl c77591Ucl = this.LJLLLL;
            if (c77591Ucl != null) {
                map2 = c77591Ucl.LIZIZ;
            }
            Map LJJL = C113554cx.LJJL(new OSZ("request_page", yv0()), new OSZ("charge_reason", tv0()), new OSZ("charge_style", "window"), new OSZ("panel_type", "normal"), new OSZ("gift_enter_from", this.LLFF.getValue()), new OSZ("gift_send_type", this.LLFFF.getValue()), new OSZ("pay_method", C77608Ud2.LIZ()));
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_lagersum_preview");
            LIZ2.LJIILLIIL(dataChannel2);
            LIZ2.LJJIFFI(LJJL);
            LIZ2.LJJIFFI(map2);
            LIZ2.LJJIIJZLJL();
        }
    }

    public final void Kv0(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (CN1.LIZ(IWalletService.class) != null) {
            ((InterfaceC29856Bng) ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJI().LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZIZ(new AfS65S0100000_13(this, 70));
            ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
        } else {
            C77800Ug8.LJ("livesdk_recharge_service_error", this.LJLLLLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void mv0(C31556Ca0 c31556Ca0) {
        O o;
        super.mv0(c31556Ca0);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Diamond diamond = this.LJLJLLL;
        if (diamond != null) {
            o = Integer.valueOf(diamond.id);
        } else {
            o = 0;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29061Bar.class)).LIZ = o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Fv0(ActivityC45651qj activityC45651qj, int i, int i2) {
        Map<String, String> map;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        C77591Ucl c77591Ucl = this.LJLLLL;
        if (c77591Ucl != null) {
            map = c77591Ucl.LIZIZ;
        } else {
            map = null;
        }
        DataChannel dataChannel = this.LJLLLLLL;
        boolean LJIIJ = C29306Beo.LJIIJ(dataChannel);
        String str2 = "1";
        int i8 = LJIIJ;
        i8 = LJIIJ;
        if (dataChannel == null && map != null) {
            i8 = LJIIJ;
            if (map.containsKey("is_anchor")) {
                i8 = ujb.o.LJJJJIZL(map.get("is_anchor"), "1", false);
            }
        }
        ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_recharge_exchange_entrance");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ("live_detail", "request_page");
        if (i2 == 2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i3), "could_exchange");
        if (i == -1) {
            str = "ug_exchange";
        } else {
            str = "anchor_income";
        }
        LIZ.LJIJJ(str, "charge_reason");
        LIZ.LJIJJ(Integer.valueOf(i8), "is_anchor");
        if (!((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, "is_first_recharge");
        LIZ.LJIJJ("package", "first_recharge_exchange_entrance_page");
        LIZ.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
        LIZ.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
        LIZ.LJJIIJZLJL();
        if (i2 != 1) {
            if (i2 != 2) {
                boolean z = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.isPeriodicPayout;
                if (i == -1) {
                    C30868C9o.LIZJ(R.string.l4b);
                    return;
                }
                if (zv0() != -2) {
                    return;
                }
                RevenueExchange revenueExchange = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
                if (revenueExchange != null && revenueExchange.isRevenue()) {
                    if (z) {
                        i7 = R.string.l24;
                    } else {
                        i7 = R.string.loj;
                    }
                    C30868C9o.LIZJ(i7);
                    return;
                }
                if (z) {
                    i6 = R.string.l2t;
                } else {
                    i6 = R.string.loi;
                }
                C30868C9o.LIZJ(i6);
                return;
            }
            if (!Cv0()) {
                this.LLIILZL = true;
                C73943T0h.LIZ().LIZIZ(new B3N(1));
                return;
            } else {
                Gv0(activityC45651qj);
                return;
            }
        }
        boolean z2 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.isPeriodicPayout;
        if (i == -1) {
            C30868C9o.LIZJ(R.string.l4a);
            return;
        }
        if (zv0() != -2) {
            return;
        }
        RevenueExchange revenueExchange2 = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL.revenue;
        if (revenueExchange2 != null && revenueExchange2.isRevenue()) {
            if (z2) {
                i5 = R.string.l1t;
            } else {
                i5 = R.string.loh;
            }
            C30868C9o.LIZJ(i5);
            return;
        }
        if (z2) {
            i4 = R.string.l2i;
        } else {
            i4 = R.string.log;
        }
        C30868C9o.LIZJ(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fb, code lost:
    
        if (r13 != null) goto L7;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RechargeViewModel(android.os.Bundle r10, X.C77591Ucl r11, X.InterfaceC77595Ucp r12, com.bytedance.ies.sdk.datachannel.DataChannel r13, X.InterfaceC77611Ud5 r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.RechargeViewModel.<init>(android.os.Bundle, X.Ucl, X.Ucp, com.bytedance.ies.sdk.datachannel.DataChannel, X.Ud5):void");
    }
}
