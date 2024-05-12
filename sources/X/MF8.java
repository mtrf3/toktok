package X;

/* loaded from: classes10.dex */
public final class MF8 {
    public static volatile int LIZ;
    public static volatile int LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;

    public static int LIZ() {
        if (AV1.LJIJI(LIZLLL)) {
            return LIZIZ;
        }
        return LIZ;
    }

    public static void LIZIZ(int i, String str) {
        boolean z;
        LIZLLL = str;
        if (LIZ() != i) {
            z = true;
        } else {
            z = false;
        }
        LIZJ = z;
        if (AV1.LJIJI(str)) {
            LIZIZ = i;
        } else {
            LIZ = i;
        }
    }
}
