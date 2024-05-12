package Y;

import X.C16880lQ;
import X.C35936E8m;
import X.C64174PGo;
import X.C64234PIw;
import X.C64273PKj;
import X.C64401PPh;
import X.C64402PPi;
import X.C64403PPj;
import X.C64409PPp;
import X.C64416PPw;
import X.C65852Psu;
import X.C65926Pu6;
import X.C65929Pu9;
import X.C66059PwF;
import X.C66460Q6m;
import X.C66465Q6r;
import X.C66716QGi;
import X.C67003QRj;
import X.C67006QRm;
import X.C69017R6v;
import X.C69018R6w;
import X.C77413UZt;
import X.EnumC62956OnI;
import X.EnumC69113RAn;
import X.FMX;
import X.FUA;
import X.HandlerThreadC64418PPy;
import X.InterfaceC64332PMq;
import X.InterfaceC69020R6y;
import X.PJA;
import X.PKQ;
import X.PQ0;
import X.PSY;
import X.PT6;
import X.QM0;
import X.QRG;
import X.QRP;
import X.QRV;
import X.QSD;
import X.R67;
import X.R6D;
import X.R6P;
import Y.ARunnableS1S0001000_6;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.SkynetConfig;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.skynet.base.BaseIniter;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes12.dex */
public class ARunnableS17S0110000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        NetworkConfig networkConfig;
        SkynetConfig skynetConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && (skynetConfig = networkConfig.skynetConfig) != null) {
            if (this.z1 || (!skynetConfig.domainBlockList.isEmpty())) {
                BaseIniter.initDns((Context) this.l0, false, false, skynetConfig.domainBlockList);
            }
            C65926Pu6.LIZIZ("Helios:Network-Skynet", new AqS158S0200000_11(this, skynetConfig, 2), 4, null, 8);
        }
    }

    public final void LIZ$1() {
        PKQ.LIZIZ();
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_kill_history_err") == 1 || this.z1) {
            Iterator it = ((LinkedList) this.l0).iterator();
            while (it.hasNext()) {
                C64273PKj c64273PKj = (C64273PKj) it.next();
                if (this.z1) {
                    PKQ.LJIIIZ(c64273PKj, c64273PKj.LJIIIIZZ, c64273PKj.LIZ, null);
                } else {
                    PKQ.LJIIIZ(c64273PKj, c64273PKj.LJIIIIZZ, c64273PKj.LIZ, null);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|b|10|11|(1:(5:41|16|(1:18)|19|(2:21|22)(2:24|(2:30|31)(2:28|29)))(1:40))|14|15|16|(0)|19|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003a, code lost:
    
        r0.printStackTrace();
        r3 = r4.LJIIIIZZ();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS17S0110000_11 r5) {
        /*
            java.lang.Object r2 = r5.l0
            X.QGi r2 = (X.C66716QGi) r2
            boolean r5 = r5.z1
            r2.getClass()
            java.lang.Object r3 = X.C66716QGi.LJIIL
            monitor-enter(r3)
            X.QYt r0 = r2.LIZ     // Catch: java.lang.Throwable -> L9c
            r0.LIZ()     // Catch: java.lang.Throwable -> L9c
            android.content.Context r0 = r0.LIZ     // Catch: java.lang.Throwable -> L9c
            X.QM7 r1 = X.QM7.LIZ(r0)     // Catch: java.lang.Throwable -> L9c
            X.QGj r0 = r2.LIZJ     // Catch: java.lang.Throwable -> L95
            X.QGm r4 = r0.LIZJ()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L22
            r1.LJ()     // Catch: java.lang.Throwable -> L9c
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            X.QGr r1 = r4.LJFF()     // Catch: X.C66730QGw -> L51
            X.QGr r0 = X.EnumC66725QGr.REGISTER_ERROR     // Catch: X.C66730QGw -> L51
            if (r1 != r0) goto L2c
            goto L34
        L2c:
            X.QGr r1 = r4.LJFF()     // Catch: X.C66730QGw -> L51
            X.QGr r0 = X.EnumC66725QGr.UNREGISTERED     // Catch: X.C66730QGw -> L51
            if (r1 != r0) goto L42
        L34:
            X.QGm r3 = X.C66716QGi.LIZ(r2, r4)     // Catch: java.lang.NullPointerException -> L39 X.C66730QGw -> L51
            goto L56
        L39:
            r0 = move-exception
            r0.printStackTrace()     // Catch: X.C66730QGw -> L51
            X.QGm r3 = r4.LJIIIIZZ()     // Catch: X.C66730QGw -> L51
            goto L56
        L42:
            if (r5 != 0) goto L4c
            X.QGp r0 = r2.LIZLLL     // Catch: X.C66730QGw -> L51
            boolean r0 = r0.LIZ(r4)     // Catch: X.C66730QGw -> L51
            if (r0 == 0) goto L7b
        L4c:
            X.QGm r3 = r2.LIZLLL(r4)     // Catch: X.C66730QGw -> L51
            goto L56
        L51:
            r0 = move-exception
            r2.LJII(r0)
            goto L7b
        L56:
            r2.LJ(r3)
            r2.LJIIJ(r4, r3)
            X.QGr r1 = r3.LJFF()
            X.QGr r0 = X.EnumC66725QGr.REGISTERED
            if (r1 != r0) goto L69
            java.lang.String r0 = r3.LIZIZ
            r2.LJIIIZ(r0)
        L69:
            X.QGr r1 = r3.LJFF()
            X.QGr r0 = X.EnumC66725QGr.REGISTER_ERROR
            if (r1 != r0) goto L7c
            X.QGw r1 = new X.QGw
            X.QGh r0 = X.EnumC66715QGh.BAD_CONFIG
            r1.<init>(r0)
            r2.LJII(r1)
        L7b:
            return
        L7c:
            X.QGr r1 = r3.LIZJ
            X.QGr r0 = X.EnumC66725QGr.NOT_GENERATED
            if (r1 == r0) goto L86
            X.QGr r0 = X.EnumC66725QGr.ATTEMPT_MIGRATION
            if (r1 != r0) goto L91
        L86:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r0)
            r2.LJII(r1)
            goto L7b
        L91:
            r2.LJIIIIZZ(r3)
            goto L7b
        L95:
            r0 = move-exception
            if (r1 == 0) goto L9b
            r1.LJ()     // Catch: java.lang.Throwable -> L9c
        L9b:
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS17S0110000_11.run$0(Y.ARunnableS17S0110000_11):void");
    }

    public static final void run$1(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        ((C66716QGi) aRunnableS17S0110000_11.l0).LIZJ(aRunnableS17S0110000_11.z1);
    }

    public static final void run$10(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean z = aRunnableS17S0110000_11.z1;
        Context context = (Context) aRunnableS17S0110000_11.l0;
        C77413UZt.LJI("method_push_start_on_application");
        try {
            C67006QRm.LIZ.LIZ(QRV.LIZ());
            if (z) {
                QSD LIZ = QSD.LIZ();
                boolean LIZJ = C67003QRj.LJFF().LIZJ(context);
                LIZ.getClass();
                QRG.LIZIZ().getClass();
                QRG.LIZLLL().LJIIIIZZ(LIZJ);
                C67003QRj LJFF = C67003QRj.LJFF();
                synchronized (LJFF) {
                    if (LJFF.LIZ(context)) {
                        LJFF.LIZJ = true;
                    } else {
                        LJFF.LIZJ = false;
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        C67006QRm.LIZ(context).getClass();
                        ((AliveOnlineSettings) PT6.LIZ(QM0.LIZ, AliveOnlineSettings.class)).LJIILLIIL();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } catch (Throwable th) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("location", "constructInitPush");
                jSONObject.put("errorDesc", th.getMessage());
                FUA.LIZJ("aweme_nofatal_track", jSONObject);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        C77413UZt.LJIIJ("method_push_start_on_application");
    }

    public static final void run$2(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean LIZ;
        try {
            aRunnableS17S0110000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        HeliosEnvImpl heliosEnvImpl = (HeliosEnvImpl) aRunnableS17S0110000_11.l0;
        boolean z = aRunnableS17S0110000_11.z1;
        heliosEnvImpl.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        PQ0 pq0 = PQ0.LJFF;
        Application application = heliosEnvImpl.LJIIIIZZ;
        pq0.getClass();
        try {
            HandlerThreadC64418PPy.LIZ();
            C64401PPh.LIZIZ(application, HandlerThreadC64418PPy.LJLJJL, z);
            InterfaceC64332PMq interfaceC64332PMq = new InterfaceC64332PMq() { // from class: X.PPz
                @Override // X.InterfaceC64332PMq
                public final void LIZ() {
                    HandlerThreadC64418PPy.LIZ();
                    HandlerThreadC64418PPy.LJLJI.LIZIZ(new ARunnableS1S0001000_6(0, 4));
                }
            };
            if (C64401PPh.LIZIZ.get()) {
                interfaceC64332PMq.LIZ();
            } else {
                C64401PPh.LJI.add(interfaceC64332PMq);
            }
            C64409PPp.LJI(pq0.LIZJ);
            C64416PPw callback = pq0.LJ;
            o.LJIIIZ(callback, "callback");
            C64402PPi.LIZJ.add(callback);
            C64403PPj.LJ(pq0.LIZLLL);
        } catch (Exception e) {
            C66059PwF.LIZIZ(new C65852Psu((Thread) null, (Throwable) e, "label_lifecycle_monitor_initialize", (Map<String, String>) null, false));
        }
        C65929Pu9.LIZ(currentTimeMillis, "LifecycleMonitor.initialize", true);
    }

    public static final void run$4(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS17S0110000_11.l0;
        boolean z = aRunnableS17S0110000_11.z1;
        if (!authorizeActivity.isDestroyed()) {
            EnumC62956OnI LJI = a.LIZIZ().LJI();
            IGuestModeService LJIIJJI = GuestModeServiceImpl.LJIIJJI();
            if (!a.LIZIZ().LIZ() || LJIIJJI.LJIIJ()) {
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZ(LJI.getValue(), "register_age_gate_action");
                c35936E8m.LIZ(0, "show");
                c35936E8m.LIZ(LJIIJJI.LJIIJ() ? 1 : 0, "is_guest_mode");
                FMX.LJIIL("tns_third_party_not_registered_age_gate_action", c35936E8m.LIZ);
                if (a.LJIJI().LJFF()) {
                    final C69017R6v c69017R6v = new C69017R6v();
                    AuthResult authResult = authorizeActivity.LJLJJI;
                    R6P r6p = new R6P(authResult, authorizeActivity);
                    String enterType = authorizeActivity.Xg();
                    o.LJIIIZ(enterType, "enterType");
                    c69017R6v.LIZ = r6p;
                    if (!a.LJIJI().LJFF()) {
                        InterfaceC69020R6y interfaceC69020R6y = c69017R6v.LIZ;
                        if (interfaceC69020R6y != null) {
                            ((R6P) interfaceC69020R6y).LIZ(-1);
                            return;
                        }
                        return;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login");
                    buildRoute.withParam("enter_type", enterType);
                    buildRoute.withParam("next_page", EnumC69113RAn.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                    buildRoute.withParam("key_auth_result", authResult);
                    buildRoute.open(10086, new OnActivityResultCallback() { // from class: X.R6u
                        @Override // com.bytedance.router.OnActivityResultCallback
                        public final void onActivityResult(int i, int i2, Intent intent) {
                            InterfaceC69020R6y interfaceC69020R6y2;
                            C69017R6v c69017R6v2 = C69017R6v.this;
                            c69017R6v2.getClass();
                            if (i == 10086) {
                                if (i2 != -1) {
                                    if (i2 != 0 || (interfaceC69020R6y2 = c69017R6v2.LIZ) == null) {
                                        return;
                                    }
                                    ((R6P) interfaceC69020R6y2).LIZ(0);
                                    return;
                                }
                                InterfaceC69020R6y interfaceC69020R6y3 = c69017R6v2.LIZ;
                                if (interfaceC69020R6y3 == null) {
                                    return;
                                }
                                ((R6P) interfaceC69020R6y3).LIZ(-1);
                            }
                        }
                    });
                    return;
                }
                authorizeActivity.LLIIIZ(authorizeActivity.LJLJJI, false);
                return;
            }
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZ(LJI.getValue(), "register_age_gate_action");
            c35936E8m2.LIZ(1, "show");
            c35936E8m2.LIZ(0, "is_guest_mode");
            FMX.LJIIL("tns_third_party_not_registered_age_gate_action", c35936E8m2.LIZ);
            final C69018R6w c69018R6w = new C69018R6w();
            AuthResult authResult2 = authorizeActivity.LJLJJI;
            R6D r6d = new R6D(authResult2, authorizeActivity);
            Boolean valueOf = Boolean.valueOf(z);
            String Xg = authorizeActivity.Xg();
            Bundle LLJJIJI = C16880lQ.LLJJIJI(authorizeActivity.getIntent());
            c69018R6w.LIZ = r6d;
            if (valueOf.booleanValue()) {
                SmartRoute LIZIZ = R67.LIZIZ(authorizeActivity);
                LIZIZ.withParam(LLJJIJI);
                LIZIZ.open();
                authorizeActivity.finish();
                return;
            }
            SmartRoute buildRoute2 = SmartRouter.buildRoute(authorizeActivity, "//account/login/signup_or_login");
            buildRoute2.withParam("enter_type", Xg);
            buildRoute2.withParam("key_auth_result", authResult2);
            buildRoute2.withParam("platform", authResult2.mProviderId);
            buildRoute2.withParam("is_existing_user", false);
            buildRoute2.withParam("enter_from", "3rd_party_auth");
            buildRoute2.withParam("enter_method", "3rd_party_verified");
            buildRoute2.withParam("next_page", EnumC69113RAn.THIRD_PARTY_AGE_GATE.getValue());
            buildRoute2.open(998, new OnActivityResultCallback() { // from class: X.R6t
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    C69018R6w c69018R6w2 = C69018R6w.this;
                    if (i == 998) {
                        InterfaceC69021R6z interfaceC69021R6z = c69018R6w2.LIZ;
                        if (interfaceC69021R6z != null) {
                            if (i2 == -1) {
                                ((R6D) interfaceC69021R6z).LIZ(1, C16880lQ.LLJJIJIIJIL(intent, "birthday"));
                                return;
                            } else if (i2 == 0) {
                                ((R6D) interfaceC69021R6z).LIZ(0, null);
                                return;
                            } else {
                                new Exception();
                                ((R6D) interfaceC69021R6z).LIZ(-1, null);
                                return;
                            }
                        }
                        return;
                    }
                    c69018R6w2.getClass();
                }
            });
        }
    }

    public static final void run$5(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean LIZ;
        try {
            ((QRP) aRunnableS17S0110000_11.l0).LIZIZ.LIZJ(aRunnableS17S0110000_11.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        C66460Q6m c66460Q6m = (C66460Q6m) aRunnableS17S0110000_11.l0;
        boolean z = aRunnableS17S0110000_11.z1;
        c66460Q6m.getClass();
        PSY.LJ(C16880lQ.LLLZ("begin startCheckAppBoot lazyLoadData %b", new Object[]{Boolean.valueOf(z)}));
        if (c66460Q6m.LJFF == null) {
            c66460Q6m.LJFF = SmartProtectedStateMachine.LIZLLL(c66460Q6m.LJ);
        }
        if (!c66460Q6m.LJFF.LIZJ) {
            if (!z) {
                C66465Q6r.LJIILLIIL.LIZIZ();
            }
            if (C66460Q6m.LIZLLL()) {
                c66460Q6m.LJFF.LJII();
            }
            PSY.LJ(C16880lQ.LLLZ("startCheckAppBoot isEnable %b", new Object[]{Boolean.valueOf(C66460Q6m.LIZLLL())}));
        }
        if (!C66460Q6m.LIZLLL()) {
            c66460Q6m.LIZ.shutdown();
        }
        if (!c66460Q6m.LIZIZ) {
            System.currentTimeMillis();
            C66465Q6r.LJIILLIIL.getClass();
            c66460Q6m.LIZIZ = false;
            synchronized (c66460Q6m.LIZ) {
                if (c66460Q6m.LIZIZ) {
                    c66460Q6m.LIZ.shutdown();
                }
            }
        }
        PSY.LJ(C16880lQ.LLLZ("end startCheckAppBoot lazyLoadData %b", new Object[]{Boolean.valueOf(z)}));
    }

    public static final void run$7(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean LIZ;
        try {
            ((C64234PIw) aRunnableS17S0110000_11.l0).LJ();
            ((C64234PIw) aRunnableS17S0110000_11.l0).LJLJLLL = !aRunnableS17S0110000_11.z1;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean LIZ;
        try {
            ((C64174PGo) aRunnableS17S0110000_11.l0).LIZ(aRunnableS17S0110000_11.z1);
            ((C64174PGo) aRunnableS17S0110000_11.l0).LJLJI = aRunnableS17S0110000_11.z1;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS17S0110000_11 aRunnableS17S0110000_11) {
        boolean LIZ;
        try {
            aRunnableS17S0110000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S0110000_11(C66460Q6m c66460Q6m, int i) {
        this.$t = i;
        this.l0 = c66460Q6m;
        this.z1 = true;
    }

    public ARunnableS17S0110000_11(C66716QGi c66716QGi, int i) {
        this.$t = i;
        this.l0 = c66716QGi;
        this.z1 = false;
    }

    public ARunnableS17S0110000_11(QRP qrp, int i) {
        this.$t = i;
        this.l0 = qrp;
        this.z1 = false;
    }

    public ARunnableS17S0110000_11(Context context, boolean z, int i) {
        this.$t = i;
        switch (i) {
            case 2:
                this.z1 = z;
                this.l0 = context;
                return;
            default:
                this.z1 = z;
                this.l0 = context;
                return;
        }
    }

    public ARunnableS17S0110000_11(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
