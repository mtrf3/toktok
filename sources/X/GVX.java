package X;

/* loaded from: classes8.dex */
public final class GVX {
    public static final GVX LIZ = new GVX();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static int LIZ() {
        if (LJ > 0) {
            return 1;
        }
        if (LIZJ) {
            return 3;
        }
        if (LJFF) {
            return 2;
        }
        return 0;
    }

    public static boolean LIZIZ() {
        if (((Boolean) C41792Gai.LIZJ.getValue()).booleanValue()) {
            return true;
        }
        if (((Boolean) C41792Gai.LIZLLL.getValue()).booleanValue() && LJ > 0) {
            return true;
        }
        return false;
    }

    public final void LIZJ(boolean z) {
        synchronized (this) {
            if (z) {
                LJ++;
            } else {
                int i = LJ;
                if (i > 0) {
                    LJ = i - 1;
                } else {
                    LJ = 0;
                }
            }
        }
    }
}
