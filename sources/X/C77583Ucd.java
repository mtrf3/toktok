package X;

import Y.ARunnableS4S1110000_13;
import Y.AfS65S0100000_13;
import android.app.Activity;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveFirstRechargeGivingCountSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77583Ucd implements InterfaceC32295Clv {
    public WeakReference<Activity> LIZIZ;
    public final String LJ;
    public final ArrayList<String> LJFF;
    public Diamond LJI;
    public ARunnableS4S1110000_13 LJII;
    public C77612Ud6 LJIIIIZZ;
    public boolean LJIIIZ;
    public FirstChargeData LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public InterfaceC77677Ue9 LJIILLIIL;
    public final C77586Ucg LJIIZILJ;
    public final C77582Ucc LJIJ;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public final long LIZJ = 12;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C77655Udn.LJLIL);

    @Override // X.InterfaceC32295Clv
    public final void onDestroy() {
        this.LJII = null;
        this.LJIIJ = null;
        this.LJI = null;
    }

    @Override // X.InterfaceC32295Clv
    public final void LIZLLL() {
        this.LIZ.LIZ(((IapApi) Q7L.LIZIZ(IapApi.class)).syncFirstRechargeInfo(this.LIZJ, C77608Ud2.LIZIZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(this, 259), C77668Ue0.LJLIL));
    }

    public final InterfaceC31557Ca1 LJFF() {
        Object value = this.LIZLLL.getValue();
        o.LJIIIIZZ(value, "<get-payManager>(...)");
        return (InterfaceC31557Ca1) value;
    }

    @Override // X.InterfaceC32295Clv
    public final void reset() {
        this.LJFF.clear();
        this.LJFF.add(this.LJ);
    }

    public C77583Ucd() {
        String value = LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
        value = value == null ? "" : value;
        this.LJ = value;
        ArrayList<String> arrayList = new ArrayList<>();
        this.LJFF = arrayList;
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIILJJIL = "";
        LJFF().init();
        arrayList.add(value);
        this.LJIIZILJ = new C77586Ucg(this);
        this.LJIJ = new C77582Ucc(this);
    }

    @Override // X.InterfaceC32295Clv
    public final void LIZIZ() {
        if (C77608Ud2.LIZIZ()) {
            return;
        }
        LJFF().LJ(this.LJFF, this.LJIJ);
    }

    @Override // X.InterfaceC32295Clv
    public final void LIZ(C32276Clc c32276Clc) {
        this.LJIILLIIL = c32276Clc;
    }

    public final void LJ(String str, boolean z) {
        Activity activity;
        WeakReference<Activity> weakReference = this.LIZIZ;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        Diamond diamond = this.LJI;
        if (diamond != null && diamond.LJLJI > 0) {
            diamond.LJLJJLL = Boolean.valueOf(z);
            this.LJIILL = diamond.count;
            C31558Ca2.LIZ(LJFF(), activity, diamond, this.LJIJ, 0, null, null, this.LJIIL, str, 48);
        }
        this.LJII = null;
    }

    @Override // X.InterfaceC32295Clv
    public final void LIZJ(ActivityC45651qj activityC45651qj, String str, String str2, String str3, String str4) {
        boolean z;
        this.LJIIL = str;
        this.LJIILIIL = str3;
        this.LJIILJJIL = str4;
        this.LIZIZ = new WeakReference<>(activityC45651qj);
        this.LJIIJJI = (int) ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        Diamond diamond = this.LJI;
        if (!str2.equals("first_recharge_gift_panel") || (str2.equals("first_recharge_gift_panel") && LiveFirstRechargeGivingCountSetting.INSTANCE.giftPanelIncludeGivingCount())) {
            z = true;
        } else {
            z = false;
        }
        if (diamond == null || diamond.LJLJI <= 0) {
            this.LJII = new ARunnableS4S1110000_13(this, str2, z, 1);
            LJFF().LJ(this.LJFF, this.LJIJ);
        } else {
            LJ(str2, z);
        }
    }
}
