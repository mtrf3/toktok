package X;

import Y.ARunnableS3S0010000_11;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.crash.gwpasan.GwpAsan;
import com.bytedance.crash.nativecrash.NativeImpl;
import defpackage.i0;
import java.io.File;
import org.json.JSONException;

/* loaded from: classes12.dex */
public final class PKZ {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final PLF LJFF = new PLF();
    public static boolean LJI;
    public static boolean LJII;
    public static PJQ LJIIIIZZ;
    public static PJO LJIIIZ;
    public static PJS LJIIJ;
    public static PJM LJIIJJI;

    public static void LIZIZ() {
        LJIIJJI.getClass();
        File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/FDTracker");
        File file2 = new File(C78596Usy.LJJIIJ(PK0.LIZ), i0.LJFF("npth/FDTracker/", PK0.LIZJ()));
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file3 : listFiles) {
            if (!file3.isFile() && !file3.getAbsolutePath().equals(file2.getAbsolutePath())) {
                try {
                    if (C64267PKd.LIZIZ(file3) != 0) {
                        PK8.LIZJ(file3);
                    }
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        }
    }

    public static boolean LIZJ() {
        if (PKR.LJII || NativeImpl.LIZLLL()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        Boolean bool = PKR.LJIIIIZZ.get();
        if ((bool != null && bool.booleanValue()) || NativeImpl.LIZLLL()) {
            return true;
        }
        return false;
    }

    public static void LIZ(String str) {
        File[] listFiles;
        if (LJIIIZ == null || (listFiles = C78596Usy.LJIJJ(GwpAsan.LJIILIIL).listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.isFile()) {
                try {
                    GwpAsan.LJFF(file, str);
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        }
    }

    public static synchronized void LJFF(Context context) {
        Context context2 = context;
        synchronized (PKZ.class) {
            Application application = PK0.LIZIZ;
            if (application == null) {
                if (context2 instanceof Application) {
                    application = (Application) context2;
                    if (application.getBaseContext() == null) {
                        throw new IllegalArgumentException("Please slardar oncall. Application not be attached, please init use the param from attachBaseContext, and invoke Npth.setApplication(Application) before init.");
                    }
                } else {
                    application = (Application) C16880lQ.LLLLL(context2);
                    if (application != null) {
                        if (application.getBaseContext() != null) {
                            context2 = application.getBaseContext();
                        }
                    } else {
                        throw new IllegalArgumentException("Please slardar oncall. Please invoke Npth.setApplication(Application) before init.");
                    }
                }
            }
            LJ(application, context2, true, true, true, true);
        }
    }

    public static synchronized void LJ(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (PKZ.class) {
            if (LIZ) {
                return;
            }
            LIZ = true;
            C77412UZs.LJJIJIIJI("start");
            if (context != null && application != null) {
                PK0.LJI(application, context);
                C77412UZs.LJJIJIIJI("NpthBus_initGlobal");
                if (z || z2) {
                    PKR LJ2 = PKR.LJ();
                    if (z2) {
                        LJ2.LIZIZ = new PK3(context, true);
                    }
                    if (z) {
                        LJ2.LIZJ = new PK3(context, false);
                    }
                    LIZIZ = true;
                }
                C77412UZs.LJJIJIIJI("javaCrashInit");
                NativeImpl.LJIIJ();
                C77412UZs.LJJIJIIJI("NativeImpl_loadLibrary");
                if (z3) {
                    LIZLLL = NativeImpl.LJIJ(context);
                    C77412UZs.LJJIJIIJI("NativeImpl_startMonitorNativeCrash");
                    if (!LIZLLL) {
                        LJ = true;
                    }
                }
                C64214PIc.LIZ().LIZJ(new ARunnableS3S0010000_11(z4, 0), 0L);
                C77412UZs.LJJIJIIJI("startNpthDefaultThread");
                long uptimeMillis = SystemClock.uptimeMillis();
                try {
                    C77412UZs.LJLILLLLZI.put("total", uptimeMillis - C77412UZs.LJLJJI);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("npth init total cost : ");
                    LIZ2.append(uptimeMillis - C77412UZs.LJLJJI);
                    LIZ2.append(" ms");
                    X1D.LIZIZ(LIZ2);
                    C78685UuP.LJJJLL();
                } catch (JSONException unused) {
                }
                return;
            }
            throw new IllegalArgumentException("context or Application must be not null.");
        }
    }
}
