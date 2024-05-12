package X;

import java.util.HashMap;

/* renamed from: X.CsM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32694CsM {
    public static int LIZIZ;
    public static int LIZLLL;
    public static long LJ;
    public static int LJFF;
    public static int LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIL;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static int LJJI;
    public static int LJJIFFI;
    public static int LJJII;
    public static int LJJIII;
    public static int LJJIIJ;
    public static int LJJIJ;
    public static long LJJIJIIJI;
    public static long LJJIJIIJIL;
    public static long LJJIJIL;
    public static final C32694CsM LIZ = new C32694CsM();
    public static String LIZJ = "";
    public static boolean LJIIJJI = true;
    public static final HashMap<Long, Boolean> LJJIIJZLJL = new HashMap<>();
    public static final HashMap<Long, Boolean> LJJIIZ = new HashMap<>();
    public static final HashMap<Long, Boolean> LJJIIZI = new HashMap<>();
    public static long LJJIJL = Long.MAX_VALUE;
    public static long LJJIJLIJ = Long.MAX_VALUE;
    public static long LJJIL = Long.MAX_VALUE;

    public static void LIZ() {
        LJIL = 0L;
        LJJ = 0L;
        LJJI = 0;
        LJJIFFI = 0;
        LJJII = 0;
        LJJIII = 0;
        LJJIJIIJIL = 0L;
        LJJIJIL = 0L;
        LJJIJL = Long.MAX_VALUE;
        LJJIJLIJ = Long.MAX_VALUE;
        LJJIL = Long.MAX_VALUE;
        LJJIIJ = 0;
        LJJIIJZLJL.clear();
        LJJIIZ.clear();
        LJJIIZI.clear();
        LJJIJ = 0;
        LJJIJIIJI = 0L;
        LIZLLL = 0;
        LJ = 0L;
        LJFF = 0;
        LJI = 0;
        LIZIZ = 0;
        LIZJ = "";
        LJII = 0L;
        LJIIIIZZ = 0L;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        LJIIL = 0L;
        LJIILIIL = 0L;
        LJIILJJIL = 0L;
        LJIILL = 0L;
        LJIILLIIL = 0L;
        LJIIZILJ = 0L;
        LJIJ = 0L;
        LJIJI = 0L;
        LJIJJ = 0L;
        LJIJJLI = 0L;
    }

    public static String LIZIZ() {
        long j = LJJIJL;
        long j2 = LJJIL;
        if (j > j2 || j > LJJIJLIJ) {
            if (j2 <= j && j2 <= LJJIJLIJ) {
                return "panel_dismiss";
            }
            long j3 = LJJIJLIJ;
            if (j3 <= j && j3 <= j2) {
                return "scroll";
            }
        }
        return "success";
    }
}
