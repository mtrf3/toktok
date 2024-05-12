package X;

import Y.ACallableS24S0001000_6;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS13S0101000_9;
import Y.ARunnableS42S0100000_6;
import Y.AgS45S0000000_6;
import android.os.Looper;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.google.gson.m;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.setting.api.ABApi;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import defpackage.e1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.F7d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38449F7d implements F7W, IAbTestManager {
    public static volatile C38449F7d LIZIZ;
    public final OJM<InterfaceC38454F7i> LIZ = new OJM<>();

    public static C38449F7d LJFF() {
        if (LIZIZ == null) {
            synchronized (C38449F7d.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C38449F7d();
                }
            }
        }
        return LIZIZ;
    }

    public static void LJI() {
        boolean z;
        if (e1.LIZ(31744, "use_surface_view", true, false)) {
            z = true;
        } else {
            z = false;
        }
        Object value = C38450F7e.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeBoolean("useSurfaceView", z);
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        videoBitRateABManager.getClass();
        if (!ColdLaunchRequestCombinerImpl.LIZJ().LIZIZ()) {
            videoBitRateABManager.LIZ();
        }
        KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 0).storeBoolean("clear_red_point_cost", true);
        C78685UuP.LJJIII().initNotificationChannel();
        C10K.LIZJ(new ACallableS24S0001000_6(1, 7));
        C34948Dnc.LIZJ();
        Keva repo = KevaImpl.getRepo("settings_v3_config", 1);
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("tt_use_libra_config_and", SettingsManager.LIZ("tt_use_libra_setting", false));
    }

    public C38449F7d() {
        FIP.LIZIZ.LIZ.put(3, new FIR(System.currentTimeMillis(), this));
    }

    @Override // X.F7W, com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZ() {
        FH5.LIZIZ().getClass();
        C38458F7m c38458F7m = new C38458F7m();
        c38458F7m.LIZ = "settings_v3_fallback_to_v1";
        C09900aA.LJII(new C38459F7n(c38458F7m));
        ABApi.LIZ.getClass();
        Object value = C38452F7g.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-instance>(...)");
        ((ABApi) value).querySettings().LIZLLL(new AgS45S0000000_6(0)).LJ(new AgS45S0000000_6(1), C10K.LJIIIIZZ, null);
        if (C38686FGg.LJ) {
            C38686FGg.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(m mVar) {
        m mVar2 = new m();
        mVar2.LJJII("data", mVar);
        C36791EcF.LIZ(mVar2);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        FIP.LIZIZ.LIZ(3, z);
        if (z) {
            if (((Boolean) DP0.LIZ.getValue()).booleanValue()) {
                C38995FSd.LJFF().execute(new ARunnableS13S0101000_9(2, this, 1));
            } else {
                if (C34624DiO.LIZLLL) {
                    C57022Lq.LIZ.LJLIL.postDelayed(new ARunnableS42S0100000_6(this, 60), 300L);
                } else {
                    LJI();
                    FFI.LJIIIIZZ = true;
                }
                C36922EeM.LIZLLL(4, "InterestSelectExperiment", "ab value refresh success,start to notify");
                try {
                    Iterator<InterfaceC38454F7i> it = this.LIZ.iterator();
                    while (it.hasNext()) {
                        InterfaceC38454F7i next = it.next();
                        if (next != null) {
                            next.onChanged();
                        }
                    }
                } catch (ConcurrentModificationException e) {
                    C36922EeM.LJFF(e);
                }
                if (C34624DiO.LIZLLL) {
                    C57022Lq.LIZ.LJLIL.post(new ARunnableS13S0000000_6(25));
                } else {
                    SettingsManager.LIZLLL().getClass();
                    C38965FQz.LIZ(SettingsManager.LIZ("enable_safe_view_checker", false));
                    SettingsRequestServiceImpl.LJIILLIIL().LIZ(EF7.LIZIZ());
                }
            }
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            EIT.LIZ("system_launch").LIZIZ(System.currentTimeMillis() - currentTimeMillis, "AbTestManager:onAbTestCompleteEvent");
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC38454F7i interfaceC38454F7i) {
        this.LIZ.LJIIZILJ(interfaceC38454F7i);
    }
}
