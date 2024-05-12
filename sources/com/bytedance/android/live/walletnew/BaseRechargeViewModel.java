package com.bytedance.android.live.walletnew;

import X.ActivityC45651qj;
import X.C09650Zl;
import X.C16880lQ;
import X.C1EW;
import X.C30725C4b;
import X.C31556Ca0;
import X.C31558Ca2;
import X.C32364Cn2;
import X.C62705OjF;
import X.C67702lC;
import X.C73318Sq2;
import X.C73411SrX;
import X.C73943T0h;
import X.C74906TaY;
import X.C77446UaQ;
import X.C77585Ucf;
import X.C77589Ucj;
import X.C77601Ucv;
import X.C77607Ud1;
import X.C77612Ud6;
import X.C77613Ud7;
import X.C77629UdN;
import X.C77630UdO;
import X.C77650Udi;
import X.C77651Udj;
import X.C77731Uf1;
import X.CN1;
import X.EnumC77641UdZ;
import X.InterfaceC77595Ucp;
import X.InterfaceC77748UfI;
import X.ORZ;
import X.Q7L;
import Y.AfS2S0300100_13;
import Y.AfS65S0100000_13;
import android.app.Activity;
import android.os.SystemClock;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletQueryProductTimeOut;
import com.bytedance.android.livesdk.livesetting.wallet.WalletChargebackPenaltyEducationPopupUrlSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.android.livesdk.wallet.WebRechargeCustom;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.UnlockVoucherParams;

/* loaded from: classes14.dex */
public class BaseRechargeViewModel extends ViewModel {
    public static final long LJLLJ = LiveWalletQueryProductTimeOut.INSTANCE.getValue();
    public InterfaceC77595Ucp LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public InterfaceC77748UfI LJLJJLL;
    public DiamondPackageExtra LJLJL;
    public List<? extends Diamond> LJLJLJ;
    public Diamond LJLJLLL;
    public NoticesResult.Notice LJLL;
    public C73411SrX LJLLI;
    public final /* synthetic */ C74906TaY LJLJJL = new C74906TaY();
    public final C77589Ucj LJLLILLLL = new C77589Ucj(this);

    public boolean kv0() {
        return false;
    }

    public void nv0(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        o.LJIIIZ(productList, "productList");
    }

    public final long hv0() {
        return ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
    }

    public final CurrencyPriceItem iv0() {
        WebRechargeCustom webRechargeCustom;
        List<CurrencyPriceItem> list;
        DiamondPackageExtra diamondPackageExtra = this.LJLJL;
        if (diamondPackageExtra != null && (webRechargeCustom = diamondPackageExtra.webRechargeCustom) != null && (list = webRechargeCustom.cusList) != null) {
            return (CurrencyPriceItem) ORZ.LJLLLL(list);
        }
        return null;
    }

    public void onDestroy() {
        C73411SrX c73411SrX;
        C73411SrX c73411SrX2 = this.LJLLI;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLLI) != null) {
            c73411SrX.dispose();
        }
        this.LJLIL = null;
        ((C73318Sq2) this.LJLJJL.LIZ.getValue()).dispose();
    }

    public InterfaceC77748UfI jv0() {
        return this.LJLJJLL;
    }

    public void mv0(C31556Ca0 c31556Ca0) {
        InterfaceC77595Ucp interfaceC77595Ucp = this.LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LLLLLILLIL();
        }
        Diamond diamond = this.LJLJLLL;
        if (diamond != null) {
            C73943T0h.LIZ().LIZIZ(new C77446UaQ(Boolean.TRUE, diamond.count * c31556Ca0.LJLJJI.LIZJ, Boolean.FALSE, Boolean.valueOf(kv0())));
            C77613Ud7 c77613Ud7 = c31556Ca0.LJLJJI;
            C77612Ud6 c77612Ud6 = new C77612Ud6(c77613Ud7.LIZ, c77613Ud7.LIZIZ, c77613Ud7.LIZJ, 8);
            InterfaceC77595Ucp interfaceC77595Ucp2 = this.LJLIL;
            if (interfaceC77595Ucp2 != null) {
                interfaceC77595Ucp2.j7(diamond, c77612Ud6);
            }
            C77630UdO.LIZJ();
        }
    }

    public final void qv0(String str) {
        String str2;
        String str3;
        DiamondBuyRequestParams diamondBuyRequestParams;
        C77651Udj LIZLLL = C77607Ud1.LIZLLL().LIZLLL(str);
        String str4 = "";
        try {
            Gson gson = C09650Zl.LIZIZ;
            if (LIZLLL != null && (diamondBuyRequestParams = LIZLLL.LIZ) != null) {
                str3 = diamondBuyRequestParams.voucherTokenList;
            } else {
                str3 = null;
            }
            Object LJII = gson.LJII(str3, new C77650Udi().getType());
            o.LJIIIIZZ(LJII, "get()\n                  …pe,\n                    )");
            str2 = (String) ListProtector.get((List) LJII, 0);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str2 = "";
        }
        if (str2 != null) {
            if (str2.length() == 0) {
                return;
            }
            IRechargeApi iRechargeApi = (IRechargeApi) Q7L.LIZIZ(IRechargeApi.class);
            UnlockVoucherParams unlockVoucherParams = new UnlockVoucherParams();
            if (str2 != null) {
                str4 = str2;
            }
            unlockVoucherParams.voucherToken = str4;
            unlockVoucherParams.paymentOrderId = str;
            this.LJLJJL.LIZ(C1EW.LIZ(iRechargeApi.unlockVoucher(unlockVoucherParams)).LJJJLIIL(new AfS65S0100000_13(this, 68), new AfS65S0100000_13(this, 69)));
        }
    }

    public final void pv0(Diamond diamond, int i) {
        long hv0 = hv0();
        long uptimeMillis = SystemClock.uptimeMillis();
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJJI(new C77601Ucv(i, hv0, uptimeMillis, diamond));
    }

    public BaseRechargeViewModel(InterfaceC77595Ucp interfaceC77595Ucp, long j, long j2, int i) {
        this.LJLIL = interfaceC77595Ucp;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = i;
    }

    public static void ov0(ActivityC45651qj activityC45651qj, int i, long j, int i2) {
        C32364Cn2 c32364Cn2 = new C32364Cn2(WalletChargebackPenaltyEducationPopupUrlSetting.INSTANCE.getValue());
        c32364Cn2.LIZ(i, "diamond_count");
        c32364Cn2.LIZIZ(j, "current_balance");
        c32364Cn2.LIZJ("popup_entrance", "live_room");
        c32364Cn2.LIZ(i2, "deducted_count");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(activityC45651qj, UriProtector.parse(c32364Cn2.LIZLLL()));
    }

    public final void lv0(RecommendStrategyParam recommendStrategyParam, EnumC77641UdZ cachePolicy, long j, boolean z) {
        o.LJIIIZ(cachePolicy, "cachePolicy");
        if (C77629UdN.LIZ) {
            C77629UdN.LIZJ = C30725C4b.LIZ();
        }
        InterfaceC77595Ucp interfaceC77595Ucp = this.LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LJII();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("charge_source", Integer.valueOf(this.LJLJJI));
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJJL.LIZ(C77607Ud1.LIZJ().LIZLLL(C67702lC.LIZ(this.LJLJJI), this.LJLILLLLZI, this.LJLJI, recommendStrategyParam, cachePolicy).LJJLIIIJJI(j, TimeUnit.SECONDS).LJII(new C62705OjF()).LJJJJ(new C77585Ucf(z, this, hashMap, currentTimeMillis, cachePolicy)).LJJJLIIL(new AfS2S0300100_13(currentTimeMillis, this, hashMap, cachePolicy, 6), new AfS2S0300100_13(currentTimeMillis, this, hashMap, cachePolicy, 7)));
    }

    public final void gv0(Activity activity, Diamond diamond, int i, List<String> list, String str, String str2) {
        this.LJLJLLL = diamond;
        InterfaceC77595Ucp interfaceC77595Ucp = this.LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.s8(R.string.spa, 0L);
        }
        C31558Ca2.LIZ(C77731Uf1.LIZ, activity, diamond, this.LJLLILLLL, i, null, list, str, str2, 16);
    }
}
