package X;

import android.app.Application;
import com.google.gson.Gson;

/* renamed from: X.Wg3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82891Wg3 {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C82892Wg4 LIZIZ;
    public static final C82892Wg4 LIZJ;
    public static final C82892Wg4 LIZLLL;
    public static final C82892Wg4 LJ;
    public static final C82892Wg4 LJFF;
    public static final C82892Wg4 LJI;
    public static InterfaceC82904WgG LJII;
    public static InterfaceC82912WgO LJIIIIZZ;
    public static final C82891Wg3 LJIIIZ;

    static {
        TBV tbv = new TBV(C82891Wg3.class, "backendContext", "getBackendContext()Landroid/app/Application;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LIZ = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(C82891Wg3.class, "backendDebug", "getBackendDebug()Z", 0, c65351Pkp), C07250Qf.LIZIZ(C82891Wg3.class, "backendGson", "getBackendGson()Lcom/google/gson/Gson;", 0, c65351Pkp), C07250Qf.LIZIZ(C82891Wg3.class, "backendMob", "getBackendMob()Lcom/ss/android/ugc/tools/mob/IMob;", 0, c65351Pkp), C07250Qf.LIZIZ(C82891Wg3.class, "backendMonitor", "getBackendMonitor()Lcom/ss/android/ugc/tools/monitor/IMonitor;", 0, c65351Pkp), C07250Qf.LIZIZ(C82891Wg3.class, "backendLogger", "getBackendLogger()Lcom/ss/android/ugc/tools/utils/IToolsLogger;", 0, c65351Pkp)};
        LJIIIZ = new C82891Wg3();
        LIZIZ = new C82892Wg4(C82897Wg9.LJLIL);
        LIZJ = new C82892Wg4(C82898WgA.LJLIL);
        LIZLLL = new C82892Wg4(C82903WgF.LJLIL);
        LJ = new C82892Wg4(C82906WgI.LJLIL);
        LJFF = new C82892Wg4(C82907WgJ.LJLIL);
        LJI = new C82892Wg4(C82900WgC.LJLIL);
    }

    public static final Application LIZ() {
        C82891Wg3 c82891Wg3 = LJIIIZ;
        c82891Wg3.getClass();
        return (Application) LIZIZ.LIZ(c82891Wg3, LIZ[0]);
    }

    public static final boolean LIZIZ() {
        C82891Wg3 c82891Wg3 = LJIIIZ;
        c82891Wg3.getClass();
        return ((Boolean) LIZJ.LIZ(c82891Wg3, LIZ[1])).booleanValue();
    }

    public static final Gson LIZJ() {
        C82891Wg3 c82891Wg3 = LJIIIZ;
        c82891Wg3.getClass();
        return (Gson) LIZLLL.LIZ(c82891Wg3, LIZ[2]);
    }

    public static final C5NP LIZLLL() {
        C82891Wg3 c82891Wg3 = LJIIIZ;
        c82891Wg3.getClass();
        return (C5NP) LJI.LIZ(c82891Wg3, LIZ[5]);
    }
}
