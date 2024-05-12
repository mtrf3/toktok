package X;

import android.os.Handler;

/* renamed from: X.Cus, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32850Cus {
    public static InterfaceC35343Dtz LIZ;
    public static boolean LIZIZ;
    public static int LJ;
    public static int LJI;
    public static long LJII;
    public static boolean LJIIIIZZ;
    public static String LIZJ = "";
    public static long LIZLLL = 1;
    public static final Handler LJFF = new Handler(C16880lQ.LLJJJJ());
    public static final RunnableC35342Dty LJIIIZ = RunnableC35342Dty.LJLIL;

    public static void LIZIZ() {
        InterfaceC35343Dtz interfaceC35343Dtz = LIZ;
        if (interfaceC35343Dtz == null) {
            return;
        }
        if (LIZIZ) {
            interfaceC35343Dtz.LIZ(LJI, LIZLLL, "convenient_gift", LJ, LIZJ);
        } else {
            interfaceC35343Dtz.LIZ(LJI, LIZLLL, "normal_gift", LJ, LIZJ);
        }
        LJIIIIZZ = false;
    }

    public static boolean LIZ(long j) {
        if (j == LJII && LJIIIIZZ) {
            return true;
        }
        return false;
    }
}
