package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PEI {
    public static volatile PE3 LIZIZ;
    public static RunnableC54355LUx LIZJ;
    public static long LIZLLL;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static volatile boolean LJ = true;
    public static final List<C54356LUy> LJFF = new CopyOnWriteArrayList();
    public static long LJIIL = 180000;
    public static long LJIILIIL = 360000;

    public static void LIZ(Object obj) {
        ((CopyOnWriteArrayList) LJFF).add(new C54356LUy(obj));
        long uptimeMillis = SystemClock.uptimeMillis() - LIZLLL;
        if (uptimeMillis <= LJIIL) {
            return;
        }
        if (!LJ && uptimeMillis <= 900000) {
            return;
        }
        LJ = false;
        if (LIZIZ == null) {
            LIZIZ = PD2.LIZ;
        }
        if (LIZIZ == null) {
            return;
        }
        LIZLLL = SystemClock.uptimeMillis();
        LIZJ = new RunnableC54355LUx();
        LIZIZ.LJIIIIZZ(new PE1(PD7.LIGHT_WEIGHT, LIZJ, "LeakCheck-Thread"), 2000L);
    }
}
