package com.ss.android.ugc.aweme.journey;

import X.C12460eI;
import X.C16970lZ;
import X.C175256uH;
import X.C188727au;
import X.C221108m2;
import X.C2NW;
import X.C2U8;
import X.C34206Dbe;
import X.C34348Ddw;
import X.C35878E6g;
import X.C36089EEj;
import X.C36093EEn;
import X.C36152EGu;
import X.C36222EJm;
import X.C38686FGg;
import X.C38862FNa;
import X.C38986FRu;
import X.C39077FVh;
import X.C39281FbJ;
import X.C39282FbK;
import X.C40721FyX;
import X.C40723FyZ;
import X.C40725Fyb;
import X.C40726Fyc;
import X.C40729Fyf;
import X.C40732Fyi;
import X.C40736Fym;
import X.C40739Fyp;
import X.C40742Fys;
import X.C40746Fyw;
import X.C40751Fz1;
import X.C45804HyK;
import X.C60322Nlu;
import X.C61653OHp;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C63078OpG;
import X.C65803Ps7;
import X.C78598Ut0;
import X.DSB;
import X.EFK;
import X.FAB;
import X.FAJ;
import X.FNO;
import X.FNZ;
import X.G0D;
import X.G15;
import X.G2E;
import X.G2G;
import X.G2H;
import X.HG3;
import X.IWF;
import X.InterfaceC18010nF;
import X.InterfaceC40740Fyq;
import X.InterfaceC62984Onk;
import X.InterfaceC79713Ax;
import X.LFH;
import X.QD3;
import X.ViewOnLayoutChangeListenerC40722FyY;
import X.YUS;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes7.dex */
public final class NewUserJourneyActivity extends YUS implements InterfaceC18010nF, InterfaceC62984Onk {
    public static boolean LJLLLL;
    public View LJLL;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 43));
    public boolean LJLLI = true;
    public boolean LJLLILLLL = true;
    public final C40725Fyb LJLLJ = new C40725Fyb(this);

    @Override // X.FNL, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // X.FNL, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.FNL, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        boolean z;
        C40736Fym c40736Fym = FNO.LIZ().LJLJI;
        if (c40736Fym != null) {
            c40736Fym.LJ = true;
            InterfaceC79713Ax interfaceC79713Ax = c40736Fym.LIZ;
            if (interfaceC79713Ax != null) {
                interfaceC79713Ax.onComplete();
            }
        }
        C38986FRu.LIZ().LIZ = true;
        C2U8.LIZ(new C39282FbK());
        C40746Fyw LLFII = LLFII();
        LLFII.getClass();
        C35878E6g.LIZ();
        if (((C40739Fyp) LLFII.LJLJJI.getValue()).LJLJJL != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLIL == 2) {
            Intent intent = getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(this, G2G.LIZIZ.getSplashActivityClass());
            intent.setFlags(335544320);
            intent.putExtra("from_new_user_journey", true);
            intent.putExtra("pre_mainactivity_first_enter", false);
            intent.putExtra("reorder_new_journey_front", false);
            Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
            C78598Ut0.LJIJJ(intent, this);
            startActivity(intent);
            C40721FyX.LIZ = true;
        } else if (z) {
            Intent intent2 = getIntent();
            if (intent2 == null) {
                intent2 = new Intent();
            }
            intent2.setClass(this, G2G.LIZIZ.getSplashActivityClass());
            intent2.setFlags(335544320);
            intent2.putExtra("pre_mainactivity_first_enter", false);
            C78598Ut0.LJIJJ(intent2, this);
            startActivity(intent2);
        }
        if (!MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin(false) || MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).disableForTest()) {
            IWF.LJJLIIIIJ().LIZIZ();
        }
        super.finish();
        C63078OpG.LIZ();
        overridePendingTransition(0, R.anim.d1);
        IAppsflyerApi LJ = AppsflyerImpl.LJ();
        if (LJ != null) {
            LJ.LIZIZ();
        }
        AppsflyerImpl.LJ().LIZ();
        GuestModeServiceImpl.LJIIJJI().LJIIIIZZ();
        C40732Fyi.LIZ = null;
        G2H g2h = G2H.NUJ_FINISHED;
        C188727au c188727au = new C188727au();
        C36222EJm.LIZ(c188727au);
        Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        C36222EJm.LIZIZ(g2h, map);
        if (C40729Fyf.LIZ) {
            PushPermissionPopupManager.LJII().LIZJ(G2G.LIZIZ.LJII());
        }
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b0226";
    }

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.FNL, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.FNL, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final C40746Fyw LLFII() {
        return (C40746Fyw) this.LJLJLLL.getValue();
    }

    public final void LLFZ() {
        InterfaceC40740Fyq interfaceC40740Fyq;
        C40746Fyw LLFII = LLFII();
        LLFII.getClass();
        C35878E6g.LIZ();
        C40739Fyp c40739Fyp = (C40739Fyp) LLFII.LJLJJI.getValue();
        c40739Fyp.getClass();
        G0D LIZ = C40751Fz1.LIZ();
        if (LIZ != null && (interfaceC40740Fyq = (InterfaceC40740Fyq) LIZ.LIZ(InterfaceC40740Fyq.class)) != null) {
            interfaceC40740Fyq.gi(SettingServiceImpl.LIZ().getCurrentI18nItem(c40739Fyp.LJLIL));
        }
        C40751Fz1.LIZIZ(new C40742Fys(c40739Fyp));
        G15 g15 = C40751Fz1.LIZ;
        if (g15 != null) {
            g15.LIZLLL(c40739Fyp);
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C38986FRu.LIZ().LIZ = true;
        a.LJIIJ().LJI(false);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        FAJ.LJFF("cold_boot_new_user_journey_create_to_resume", false);
        FAJ.LIZ("cold_boot_new_user_journey_resume_duration", false);
        super.onResume();
        if (C38862FNa.LIZ() && this.LJLLI) {
            MainLooperOptService LJIIJ = MainLooperOptService.LJIIJ(null);
            if (LJIIJ != null) {
                LJIIJ.LJIJJLI(FAB.WATCH_MAIN_FRAME);
            }
            this.LJLLI = false;
        }
        FAJ.LJFF("cold_boot_new_user_journey_resume_duration", false);
        FAJ.LIZ("cold_boot_new_user_journey_resume_to_focus_changed", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAppFlyerEvent(C39281FbJ event) {
        o.LJIIIZ(event, "event");
        Activity LJIJJ = C45804HyK.LJIJJ(this);
        if (LJIJJ != null) {
            Intent intent = new Intent(LJIJJ, (Class<?>) NewUserJourneyActivity.class);
            intent.putExtra("deeplink_intent_about_welcome_screen", event.LJLIL);
            LLFII().LIZ(intent);
        }
    }

    @Override // X.YUS, X.FNL, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Application application;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        FAJ.LJFF("cold_boot_stubmain_to_new_user_jrouney", false);
        C12460eI.LJIIJJI("b4101");
        G2E.LIZIZ = SystemClock.elapsedRealtime();
        C34348Ddw c34348Ddw = C34348Ddw.LJLIL;
        if (C36152EGu.LIZIZ(c34348Ddw)) {
            C16970lZ.LJFF(this, "activity_journey");
        }
        if (C38686FGg.LJ && ((Boolean) C38862FNa.LIZ.getValue()).booleanValue() && (!C36152EGu.LIZIZ(FNZ.LJLIL))) {
            MainLooperOptService.LJII();
        }
        LFH.LIZIZ.LIZIZ(this);
        activityConfiguration(C40723FyZ.LJLIL);
        super.onCreate(bundle);
        FAJ.LIZ("cold_boot_new_user_journey_oncreate_duration", false);
        this.LJLJJI = getIntent().getBooleanExtra("from_main", true);
        LLFII().LIZIZ();
        if (!this.LJLJJI) {
            C38986FRu.LIZ().LIZJ = 1;
        }
        if (C61653OHp.LIZ() == 0 && (application = getApplication()) != null) {
            C60322Nlu.LIZ(application);
        }
        a.LJIIJ().LJI(true);
        C38986FRu.LIZ().LIZ = false;
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        LLFII().LIZ(getIntent());
        FAJ.LIZ("cold_boot_new_user_journey_setcontentview_duration", false);
        if (C36152EGu.LIZIZ(c34348Ddw)) {
            setContentView(C16970lZ.LIZLLL(C45804HyK.LJIJJ(this), R.layout.eh));
        } else {
            setContentView(R.layout.eh);
        }
        View findViewById = findViewById(R.id.dm7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.fragment_container)");
        this.LJLL = findViewById;
        if (this.LJLIL <= 0 || bundle != null) {
            LLFZ();
        } else {
            View decorView = getWindow().getDecorView();
            o.LJIIIIZZ(decorView, "window.decorView");
            decorView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC40722FyY(decorView, this));
        }
        FAJ.LJFF("cold_boot_new_user_journey_setcontentview_duration", false);
        LJLLLL = true;
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZIZ.LJIIJJI();
        LIZJ.LJIIIZ();
        LIZJ.LIZJ();
        FAJ.LJFF("cold_boot_new_user_journey_oncreate_duration", false);
        FAJ.LIZ("cold_boot_new_user_journey_create_to_resume", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        if (HG3.LJIILL().isChildrenMode()) {
            finish();
        } else {
            LLFII().onEvent(event);
        }
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        FAJ.LJFF("cold_boot_new_user_pre_main", false);
        LLFII().LIZ(intent);
        if (C34206Dbe.LIZ()) {
            C36093EEn.LIZ.getClass();
            C36093EEn.LIZJ();
        }
        if (C2NW.LIZ().LJIILLIIL(DSB.LJLIL)) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZ(C39077FVh.LIZIZ.LIZIZ(EFK.BACKGROUND));
            LJIIIZ.LIZJ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C40726Fyc event) {
        o.LJIIIZ(event, "event");
        LLFII().onEvent(event);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LLFII().onActivityResult(i, i2, intent);
    }
}
