package X;

import Y.ARunnableS42S0100000_6;
import Y.ARunnableS6S0210000_6;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.newuser.NewUserImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public class FNL extends ActivityC86117Xqz {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public boolean LJLJJI = true;

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public void finish() {
        super.finish();
        this.LJLJJL = true;
        FAJ.LJFF("cold_boot_new_user_launch_focus_to_finish", false);
        o.LJIIIIZZ(android.util.Log.getStackTraceString(new RuntimeException("NewUserLaunchActivity finish calling stack, not a real exception:")), "getStackTraceString(Runt… not a real exception:\"))");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        ARunnableS6S0210000_6 aRunnableS6S0210000_6;
        super.onPause();
        if (this.LJLIL > 0) {
            if (isFinishing()) {
                C40438Fty.LJI("new_user_journey", null);
                if (C34206Dbe.LIZ()) {
                    C36093EEn.LIZ.getClass();
                    C36093EEn.LIZLLL();
                }
                C35818E3y.LJ(1);
                FAJ.LJFF("cold_boot_new_user_login_end_to_nuj_finish", false);
                FAJ.LJFF("cold_boot_nujactivity_focus_to_finish", false);
                FAJ.LJFF("cold_boot_new_user_login_end_to_feed_total_start", false);
                FAJ.LJIIIZ(SystemClock.uptimeMillis());
                FAJ.LIZ("cold_boot_new_user_journey_pause_to_data_fetched", false);
                FAJ.LJFF("cold_boot_start_to_feed_total_start", false);
                Boolean LIZLLL = C38987FRv.LIZLLL();
                o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
                FAR.LIZ(LIZLLL.booleanValue());
                if (!C33842DPy.LIZ() && (aRunnableS6S0210000_6 = FW5.LJIIJJI) != null) {
                    aRunnableS6S0210000_6.run();
                    FW5.LJIIJJI = null;
                    return;
                }
                return;
            }
            return;
        }
        FAJ.LJIIIZ(SystemClock.uptimeMillis());
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        FAJ.LIZ("cold_boot_new_user_launch_oncreate_duration", false);
        if (C38874FNm.LIZ()) {
            C16970lZ.LJ(R.layout.bf3, this);
            C16970lZ.LJ(R.layout.bet, this);
            C16970lZ.LJ(R.layout.dub, this);
        }
        super.onCreate(bundle);
        boolean z = true;
        C38986FRu.LIZ().LIZLLL = true;
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZ(FNO.LIZ());
        a.LJIJJ().initialize();
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        if (C38986FRu.LIZ().LIZJ() != 0 && createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false) && !createIMandatoryLoginServicebyMonsterPlugin.getHasRequestComplianceApi()) {
            createIMandatoryLoginServicebyMonsterPlugin.setHasRequestComplianceApi(true);
            LJIIIZ.LIZ(G2G.LIZIZ.LIZJ(EFN.NORMAL));
        }
        LJIIIZ.LIZJ();
        if (getIntent().getBooleanExtra("redirect_from_main", false)) {
            new ARunnableS42S0100000_6(this, 116).run();
        }
        if (bundle == null) {
            z = false;
        }
        this.LJLILLLLZI = z;
        FAJ.LJFF("cold_boot_new_user_launch_oncreate_duration", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        View view;
        INewUserApi iNewUserApi;
        FAJ.LJFF("cold_boot_new_user_journey_resume_to_focus_changed", false);
        super.onWindowFocusChanged(z);
        C56662Kg.LIZ().LJIIIZ = false;
        C56662Kg.LIZ().LJII = true;
        if (z) {
            FAJ.LJFF("app_start_to_main_focus", true);
            FAJ.LIZ("cold_boot_nujactivity_focus_to_finish", false);
            FAJ.LIZ("cold_boot_new_user_launch_focus_to_finish", false);
            FAJ.LIZ("interest_window_focus_changed_to_slogan_fragment", false);
            C40438Fty.LIZLLL("new_user_journey");
            if (((Boolean) DPP.LIZIZ.getValue()).booleanValue()) {
                FMW.LIZ(FNM.LJLIL);
            }
            FNP.LIZ(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        if (!this.LJLJI && z && C36157EGz.LIZ()) {
            Object LIZ = C58096Mr6.LIZ(INewUserApi.class, false);
            if (LIZ != null) {
                iNewUserApi = (INewUserApi) LIZ;
            } else {
                if (C58096Mr6.n3 == null) {
                    synchronized (INewUserApi.class) {
                        if (C58096Mr6.n3 == null) {
                            C58096Mr6.n3 = new NewUserImpl();
                        }
                    }
                }
                iNewUserApi = C58096Mr6.n3;
            }
            iNewUserApi.LIZ();
            this.LJLJI = true;
        }
        if (C38862FNa.LIZ() && this.LJLJJL) {
            C36093EEn.LIZ.getClass();
            MainLooperOptService mainLooperOptService = (MainLooperOptService) C36093EEn.LJII(MainLooperOptService.class);
            mainLooperOptService.getClass();
            for (FAB fab : FAB.values()) {
                ((HashMap) mainLooperOptService.LJLIL).put(fab, Boolean.FALSE);
            }
            mainLooperOptService.LJIJJLI(FAB.WATCH_WINDOW_FOCUS_CHANGE);
            WeakReference<View> weakReference = C36152EGu.LIZ;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            WeakReference<View> weakReference2 = C36152EGu.LIZ;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            mainLooperOptService.LJIJJ(view);
        }
    }
}
