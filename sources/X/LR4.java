package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class LR4 {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public static void LIZ(int i, boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        C55888Lwa.LIZIZ.LJIIIZ(i);
        if (!LJIIIZ) {
            LJIIIZ = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j5 = LIZ;
            long j6 = uptimeMillis - j5;
            long j7 = LJIIIIZZ;
            if (j7 == 0) {
                j = 0;
            } else {
                j = j7 - j5;
            }
            long j8 = LIZIZ;
            if (j8 == 0) {
                j2 = 0;
            } else {
                j2 = j8 - j5;
            }
            long j9 = LIZJ;
            if (j9 == 0) {
                j3 = 0;
            } else {
                j3 = j9 - j5;
            }
            long j10 = LIZLLL;
            if (j10 == 0) {
                j4 = 0;
            } else {
                j4 = j10 - j5;
            }
            C10K.LIZJ(new LR5(i, j6, j, j2, j3, j4, z));
        }
    }
}
