package X;

import Y.ARunnableS30S0200000_11;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LivePipoMonitorHostSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletIapMoneyPlatformHost;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UnV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78257UnV {
    public static final C78257UnV LIZ = new C78257UnV();
    public static final C77799Ug7 LIZIZ;
    public static final C77750UfK LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    public final synchronized void LIZ() {
        if (LIZLLL) {
            return;
        }
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(LIZIZ);
        LIZLLL = true;
    }

    static {
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerLifeCycleCallback(new C77754UfO());
        LIZIZ = new C77799Ug7();
        LIZJ = new C77750UfK();
    }

    public static boolean LIZIZ(String str) {
        String str2;
        InterfaceC78268Ung interfaceC78268Ung;
        InterfaceC58216Mt2 interfaceC58216Mt2;
        InterfaceC77774Ufi interfaceC77774Ufi;
        java.util.Map<String, String> map;
        EnumC78271Unj enumC78271Unj;
        QT2 qt2;
        Application application;
        if (C38354F3m.LJ(str)) {
            return false;
        }
        String iapKey = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getIapKey();
        String LIZIZ2 = C30792C6q.LIZIZ();
        String LIZ2 = C30792C6q.LIZ();
        HashMap LIZ3 = C45243HpH.LIZ("iapKey", iapKey, "pipoHost", LIZIZ2);
        LIZ3.put("mpHost", LIZ2);
        QT2 qt22 = new QT2();
        qt22.LIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        qt22.LJ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appName();
        qt22.LIZIZ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getVersionCodeInt();
        qt22.LIZJ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getUpdateVersionCode();
        qt22.LIZLLL = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel();
        qt22.LJFF = true;
        C78262Una c78262Una = new C78262Una();
        c78262Una.LIZJ = C30792C6q.LIZIZ();
        c78262Una.LIZLLL = C30792C6q.LIZ();
        c78262Una.LIZ = iapKey;
        c78262Una.LJ = C77859Uh5.LIZ;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isBoe()) {
            str2 = "10202010Wm7uNj";
        } else {
            str2 = "05816USpPkJiyBnttk";
        }
        c78262Una.LIZIZ = str2;
        if (C77608Ud2.LIZIZ()) {
            c78262Una.LJI = true;
            c78262Una.LJFF = false;
            LIZ3.put("pay_method", "amazon");
        } else {
            c78262Una.LJI = false;
            c78262Una.LJFF = true;
            LIZ3.put("pay_method", "GP");
        }
        C78609UtB.LJJJJZI("ttlive_pipo_init", LIZ3);
        java.util.Map<String, Object> value = LiveWalletIapMoneyPlatformHost.INSTANCE.getValue();
        if (value != null && value.containsKey("wallet_iap_mp_host")) {
            c78262Una.LIZLLL = value.get("wallet_iap_mp_host").toString();
        }
        C78259UnX c78259UnX = new C78259UnX(c78262Una);
        Context LLLLL = C16880lQ.LLLLL(C15380j0.LIZLLL());
        o.LJIIIIZZ(LLLLL, "getContext().applicationContext");
        if (!(LLLLL instanceof Application)) {
            return false;
        }
        C78260UnY c78260UnY = new C78260UnY((Application) LLLLL, qt22);
        c78260UnY.LIZJ = str;
        c78260UnY.LJIIIIZZ = C77755UfP.LJLIL;
        c78260UnY.LJIIIZ = C77743UfD.LIZ;
        c78260UnY.LJ = LivePipoMonitorHostSetting.INSTANCE.getValue();
        c78260UnY.LJII = c78259UnX;
        String LIZIZ3 = C30792C6q.LIZIZ();
        c78260UnY.LIZLLL = LIZIZ3;
        c78260UnY.LJFF = C77860Uh6.LIZ;
        if (!TextUtils.isEmpty(LIZIZ3) || !TextUtils.isEmpty(c78260UnY.LIZJ)) {
            if (!TextUtils.isEmpty(c78260UnY.LIZJ)) {
                if (TextUtils.isEmpty(c78260UnY.LJI)) {
                    c78260UnY.LJI = "en";
                }
                C78258UnW c78258UnW = new C78258UnW(c78260UnY);
                C78253UnR.LJFF().addIapObserver(LIZJ);
                C78261UnZ c78261UnZ = (C78261UnZ) C78273Unl.LJIIIZ().LIZ();
                if (c78261UnZ.LIZ == null) {
                    c78261UnZ.LIZ = c78258UnW;
                }
                C78258UnW c78258UnW2 = c78261UnZ.LIZ;
                if (c78258UnW2.LIZ == null && (application = c78258UnW.LIZ) != null) {
                    c78258UnW2.LIZ = application;
                }
                if (c78258UnW2.LIZIZ == null && (qt2 = c78258UnW.LIZIZ) != null) {
                    c78258UnW2.LIZIZ = qt2;
                }
                if (TextUtils.isEmpty(c78258UnW2.LIZJ) && !TextUtils.isEmpty(c78258UnW.LIZJ)) {
                    c78258UnW2.LIZJ = c78258UnW.LIZJ;
                }
                if (TextUtils.isEmpty(c78258UnW2.LIZLLL) && !TextUtils.isEmpty(c78258UnW.LIZLLL)) {
                    c78258UnW2.LIZLLL = c78258UnW.LIZLLL;
                }
                if (c78258UnW2.LJ == null && (enumC78271Unj = c78258UnW.LJ) != null) {
                    c78258UnW2.LJ = enumC78271Unj;
                }
                if (TextUtils.isEmpty(c78258UnW2.LJFF) && !TextUtils.isEmpty(c78258UnW.LJFF)) {
                    c78258UnW2.LJFF = c78258UnW.LJFF;
                }
                if (!c78258UnW2.LJI && c78258UnW.LJI) {
                    c78258UnW2.LJI = true;
                }
                if (!c78258UnW2.LJII && c78258UnW.LJII) {
                    c78258UnW2.LJII = true;
                }
                if (!c78258UnW2.LJIIIIZZ && c78258UnW.LJIIIIZZ) {
                    c78258UnW2.LJIIIIZZ = true;
                }
                if (TextUtils.isEmpty(c78258UnW2.LJIIIZ) && !TextUtils.isEmpty(c78258UnW.LJIIIZ)) {
                    c78258UnW2.LJIIIZ = c78258UnW.LJIIIZ;
                }
                if (TextUtils.isEmpty(c78258UnW2.LJIIJ) && !TextUtils.isEmpty(c78258UnW.LJIIJ)) {
                    c78258UnW2.LJIIJ = c78258UnW.LJIIJ;
                }
                if (c78258UnW2.LJIIL == null && (map = c78258UnW.LJIIL) != null) {
                    c78258UnW2.LJIIL = map;
                }
                if (TextUtils.isEmpty(c78258UnW2.LJIIJJI) && !TextUtils.isEmpty(c78258UnW.LJIIJJI)) {
                    c78258UnW2.LJIIJJI = c78258UnW.LJIIJJI;
                }
                C78259UnX c78259UnX2 = c78258UnW2.LJIILIIL;
                if (c78259UnX2 == null) {
                    c78258UnW2.LJIILIIL = c78258UnW.LJIILIIL;
                } else {
                    C78259UnX c78259UnX3 = c78258UnW.LJIILIIL;
                    if (TextUtils.isEmpty(c78259UnX2.LIZIZ) && !TextUtils.isEmpty(c78259UnX3.LIZIZ)) {
                        c78259UnX2.LIZIZ = c78259UnX3.LIZIZ;
                    }
                    if (TextUtils.isEmpty(c78259UnX2.LIZ) && !TextUtils.isEmpty(c78259UnX3.LIZ)) {
                        c78259UnX2.LIZ = c78259UnX3.LIZ;
                    }
                    if (TextUtils.isEmpty(c78259UnX2.LJIIIZ) && !TextUtils.isEmpty(c78259UnX3.LJIIIZ)) {
                        c78259UnX2.LJIIIZ = c78259UnX3.LJIIIZ;
                    }
                    if (c78259UnX2.LIZJ == 0) {
                        long j = c78259UnX3.LIZJ;
                        if (j != 0) {
                            c78259UnX2.LIZJ = j;
                        }
                    }
                    if (TextUtils.isEmpty(c78259UnX2.LIZLLL) && !TextUtils.isEmpty(c78259UnX3.LIZLLL)) {
                        c78259UnX2.LIZLLL = c78259UnX3.LIZLLL;
                    }
                    if (c78259UnX2.LJ == null && (interfaceC78268Ung = c78259UnX3.LJ) != null) {
                        c78259UnX2.LJ = interfaceC78268Ung;
                    }
                    c78259UnX2.LJFF = c78259UnX3.LJFF;
                    if (!c78259UnX2.LJI && c78259UnX3.LJI) {
                        c78259UnX2.LJI = true;
                    }
                    if (!c78259UnX2.LJII && c78259UnX3.LJII) {
                        c78259UnX2.LJII = true;
                    }
                }
                if (c78258UnW2.LJIILJJIL == null && (interfaceC77774Ufi = c78258UnW.LJIILJJIL) != null) {
                    c78258UnW2.LJIILJJIL = interfaceC77774Ufi;
                }
                if (c78258UnW2.LJIILLIIL == null && (interfaceC58216Mt2 = c78258UnW.LJIILLIIL) != null) {
                    c78258UnW2.LJIILLIIL = interfaceC58216Mt2;
                }
                C78273Unl LJIIIZ = C78273Unl.LJIIIZ();
                LJIIIZ.LJIIIIZZ();
                C78258UnW c78258UnW3 = ((C78261UnZ) LJIIIZ.LIZ()).LIZ;
                if (c78258UnW3 != null) {
                    if (c78258UnW3.LJIILJJIL != null) {
                        C78265Und LIZIZ4 = LJIIIZ.LIZIZ();
                        InterfaceC77774Ufi interfaceC77774Ufi2 = c78258UnW3.LJIILJJIL;
                        if (interfaceC77774Ufi2 != null) {
                            LIZIZ4.LJLIL = interfaceC77774Ufi2;
                        } else {
                            LIZIZ4.getClass();
                        }
                    }
                    if (c78258UnW3.LJIILL != null) {
                        InterfaceC78267Unf LJFF = LJIIIZ.LJFF();
                        InterfaceC77797Ug5 interfaceC77797Ug5 = c78258UnW3.LJIILL;
                        C78263Unb c78263Unb = (C78263Unb) LJFF;
                        if (interfaceC77797Ug5 != null) {
                            c78263Unb.LIZ = interfaceC77797Ug5;
                        } else {
                            c78263Unb.getClass();
                        }
                    }
                }
                PaymentServiceManager.get().getIapExternalService().init();
                JSONObject qi = ((IHostSetting) CN1.LIZ(IHostSetting.class)).qi();
                C78273Unl.LJIIIZ().LJIIIIZZ().getClass();
                if (qi != null) {
                    Application application2 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
                    JSONObject optJSONObject = qi.optJSONObject("sdk_key_pipo_pay");
                    if (optJSONObject != null) {
                        ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11((Context) application2, optJSONObject, 77);
                        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                            RunnableC39007FSp.LIZIZ(aRunnableS30S0200000_11);
                        } else {
                            aRunnableS30S0200000_11.run();
                        }
                    }
                }
                LJ = true;
                return true;
            }
            throw new IllegalArgumentException("did is null,please set did by com.bytedance.globalpayment.payment.common.lib.configuration.Configuration.Builder.withDid!");
        }
        throw new IllegalArgumentException("region and  host is null,please set region or host!");
    }
}
