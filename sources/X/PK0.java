package X;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.runtime.ConfigManager;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PK0 {
    public static Context LIZ = null;
    public static Application LIZIZ = null;
    public static long LIZJ = 0;
    public static long LIZLLL = 0;
    public static String LJ = "default";
    public static boolean LJFF;
    public static boolean LJI;
    public static C64257PJt LJII;
    public static volatile ConcurrentHashMap<Integer, String> LJIIJ;
    public static C64260PJw LJIIL;
    public static volatile String LJIILIIL;
    public static volatile int LJIILL;
    public static volatile String LJIILLIIL;
    public static String LJIJJ;
    public static boolean LJIJJLI;
    public static final ConfigManager LJIIIIZZ = new ConfigManager();
    public static final PKU LJIIIZ = new PKU();
    public static final JSONObject LJIIJJI = new JSONObject();
    public static final Object LJIILJJIL = new Object();
    public static final long LJIIZILJ = -1;
    public static long LJIJ = 0;
    public static boolean LJIJI = false;

    public static String LIZ() {
        if (LJIJJ == null) {
            synchronized (PK0.class) {
                if (LJIJJ == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C64254PJq.LIZIZ().optString("bytrace_id_prefix", String.valueOf(UUID.randomUUID())));
                    LIZ2.append("-");
                    LIZ2.append(Process.myPid());
                    LJIJJ = X1D.LIZIZ(LIZ2);
                }
            }
        }
        return LJIJJ;
    }

    public static C64257PJt LIZIZ() {
        if (LJII == null) {
            LJII = new C64257PJt(LIZ, new C54841Lfh(), null);
        }
        return LJII;
    }

    public static String LIZJ() {
        if (LJIILIIL == null) {
            synchronized (LJIILJJIL) {
                if (LJIILIIL == null) {
                    LJIILIIL = LJIIIIZZ();
                }
            }
        }
        return LJIILIIL;
    }

    public static C64260PJw LIZLLL() {
        if (LJIIL == null) {
            synchronized (PK0.class) {
                LJIIL = new C64260PJw();
            }
        }
        return LJIIL;
    }

    public static String LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ());
        LIZ2.append('_');
        LIZ2.append(Long.toHexString(new Random().nextLong()));
        LIZ2.append("G");
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LJII() {
        String valueOf;
        Object obj = LIZIZ().LIZLLL().get("channel");
        if (obj == null) {
            valueOf = "unknown";
        } else {
            valueOf = String.valueOf(obj);
        }
        return valueOf.contains("test_crash");
    }

    public static String LJIIIIZZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(Long.toHexString(new Random().nextLong()));
        LIZ2.append('-');
        LIZ2.append(LIZJ);
        LIZ2.append('-');
        LIZ2.append(Process.myPid());
        LIZ2.append("G");
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJI(Application application, Context context) {
        if (LIZIZ == null || LIZ == null) {
            LIZJ = System.currentTimeMillis();
            LIZLLL = SystemClock.uptimeMillis();
            LIZ = context;
            LIZIZ = application;
            LJIILIIL = LIZJ();
        }
    }

    public static String LJFF(long j, CrashType crashType, boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append("_");
        LIZ2.append(crashType.getName());
        LIZ2.append('_');
        LIZ2.append(LIZJ());
        LIZ2.append('_');
        String str3 = "normal_";
        if (!z) {
            str = "normal_";
        } else {
            str = "oom_";
        }
        LIZ2.append(str);
        LIZ2.append(LIZJ);
        LIZ2.append('_');
        if (!z2) {
            str2 = "normal_";
        } else {
            str2 = "ignore_";
        }
        LIZ2.append(str2);
        if (FPX.LIZJ()) {
            str3 = "nospace_";
        }
        LIZ2.append(str3);
        LIZ2.append(Long.toHexString(new Random().nextLong()));
        LIZ2.append("G");
        return X1D.LIZIZ(LIZ2);
    }
}
