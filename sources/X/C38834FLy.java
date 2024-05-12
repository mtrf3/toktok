package X;

import Y.ACallableS109S0100000_6;
import Y.ARunnableS25S0200000_6;
import Y.IDRunnableS6S1000000;
import android.app.Application;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.analytics.page.TrackerProcessLifecycleObserver;
import com.bytedance.applog.compress.CompressManager;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.statistic.AppLogNetworkClient;
import defpackage.g0;
import defpackage.s1;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.FLy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38834FLy {
    public static final void LIZ(Application application) {
        o.LJIIIZ(application, "application");
        try {
            boolean switchToBdtracker = AppLog.getSwitchToBdtracker();
            E3F.LIZIZ(null, FMB.LJLIL, ((Boolean) C34610DiA.LIZ.getValue()).booleanValue());
            E3F.LIZIZ("coldbootBatchOpt", E3P.LJLIL, ((Boolean) C34016DWq.LJIIJ.getValue()).booleanValue());
            if (FCD.LJI(application)) {
                C66266Pza.LIZ();
            }
            if (switchToBdtracker) {
                boolean booleanValue = ((Boolean) C2TM.LIZIZ.getValue()).booleanValue();
                QI3 qi3 = com.bytedance.applog.AppLog.LIZ;
                qi3.LJJI = booleanValue;
                qi3.LJJIIJZLJL = true;
                C39171FYx.LIZLLL = true;
                C39171FYx.LIZJ = true;
                C39171FYx.LIZIZ = 200;
                int intValue = ((Number) C59182Ty.LIZ.getValue()).intValue();
                if (intValue > 0) {
                    qi3.getClass();
                    qi3.LJJIJ = Math.min(Math.max(1, intValue), 8);
                }
                qi3.LJJIIZ = false;
                CompressManager.setReportStatsEnabled(false);
            }
            if (((Boolean) DKR.LIZIZ.getValue()).booleanValue()) {
                AppLog.setAdjustTerminate(true);
            }
            if (((Boolean) DKN.LIZIZ.getValue()).booleanValue()) {
                AppLog.setTerminateImmediately(true);
            }
            C10K.LIZJ(new ACallableS109S0100000_6((Object) application, 8));
            LIZIZ(application);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Y.ARunnableS25S0200000_6, T] */
    public static final void LIZIZ(Application application) {
        boolean LJIIJJI;
        boolean z;
        boolean z2;
        if (a.LJI().LJI()) {
            LJIIJJI = C36583EXj.LIZJ();
        } else {
            LJIIJJI = AV1.LJIIJJI();
        }
        AppLog.setChildModeBeforeInit(LJIIJJI);
        FMD fmd = new FMD(application);
        C38755FIx c38755FIx = new C38755FIx();
        C36212EJc c36212EJc = new C36212EJc(System.currentTimeMillis(), s1.LIZLLL("isFirstInstallAndFirstLaunch()"), new C34K());
        C36213EJd.LIZ = c36212EJc;
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(c36212EJc);
        DeviceRegisterManager.setReleaseBuild(EF7.LJ());
        AppLog.setAppContext(C38835FLz.LIZ);
        AppLog.setConfigUpdateListener(FM0.LIZIZ);
        if (C37694Eqo.LIZIZ == null) {
            synchronized (C37694Eqo.class) {
                if (C37694Eqo.LIZIZ == null) {
                    C37694Eqo.LIZIZ = new C37694Eqo();
                }
            }
        }
        AppLog.setAliYunHanlder(C37694Eqo.LIZIZ);
        if (((Boolean) DKP.LIZIZ.getValue()).booleanValue()) {
            AppLog.setSensitiveApiCallback(C39379Fct.LIZ);
        }
        C38835FLz.LIZIZ = true;
        AppLogNetworkClient appLogNetworkClient = new AppLogNetworkClient();
        if (appLogNetworkClient != AbstractC66805QJt.LIZ) {
            AbstractC66805QJt.LIZ = appLogNetworkClient;
        }
        FM0.LIZ.LJJJJZI(new InterfaceC64592gB() { // from class: X.9Dp
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        FVR.LIZ();
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(FVR.LJI);
        Application app = fmd.LIZ;
        o.LJIIIZ(app, "app");
        if (Q7K.LIZIZ("btm_collect_fragment", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        C19500pe.LIZIZ = z;
        if (Q7K.LIZIZ("btm_throw_exception", 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19480pc.LIZ = z2;
        C12470eJ c12470eJ = new C12470eJ();
        c12470eJ.LIZ = "a2270";
        c12470eJ.LIZIZ = FCD.LJI(app);
        c12470eJ.LIZJ = InitAllServiceImpl.LJIILLIIL().LIZ() ? 1 : 0;
        C12490eL c12490eL = new C12490eL(c12470eJ);
        C63052dh reportCallback = C63052dh.LJLIL;
        o.LJIIIZ(reportCallback, "reportCallback");
        ProcessLifecycleOwner.get().getLifecycle().addObserver(TrackerProcessLifecycleObserver.LJLIL);
        app.registerActivityLifecycleCallbacks(C18140nS.LJLIL);
        C18080nM c18080nM = C18080nM.LIZ;
        String str = c12490eL.LIZ;
        c18080nM.getClass();
        C18080nM.LIZIZ = str;
        String valueOf = String.valueOf(System.currentTimeMillis() + app.hashCode());
        o.LJIIIZ(valueOf, "<set-?>");
        C19500pe.LIZLLL = valueOf;
        C19500pe.LJ = c12490eL.LIZJ;
        C19500pe.LIZJ = reportCallback;
        if (c12490eL.LIZIZ) {
            String string = ((Keva) C19500pe.LJFF.getValue()).getString("btm_current_cache_page", "");
            if (string.length() != 0) {
                C38995FSd.LIZLLL().submit(new IDRunnableS6S1000000(string, 4));
            }
        }
        C67422kk showReportCallback = C67422kk.LJLIL;
        o.LJIIIZ(showReportCallback, "showReportCallback");
        C19620pq.LIZ = showReportCallback;
        C18050nJ.LIZ = new g0();
        C19470pb.LIZ = new C61337O5l();
        C19490pd.LIZ = new C79057V0z();
        C68322mC c68322mC = new C68322mC();
        ?? aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(c38755FIx, fmd, 66);
        c68322mC.element = aRunnableS25S0200000_6;
        aRunnableS25S0200000_6.run();
        c68322mC.element = null;
        FM0.LIZJ = new ARunnableS25S0200000_6(c68322mC, fmd, 65);
        if (LJIIJJI || (((Number) DOH.LIZ.getValue()).intValue() & 2) != 2 || ((Boolean) C34241DcD.LIZ.getValue()).booleanValue()) {
            ARunnableS25S0200000_6 aRunnableS25S0200000_62 = FM0.LIZJ;
            if (aRunnableS25S0200000_62 != null) {
                aRunnableS25S0200000_62.run();
            }
            FM0.LIZJ = null;
        }
    }
}
