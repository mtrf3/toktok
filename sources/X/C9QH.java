package X;

/* renamed from: X.9QH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9QH {
    public static boolean LIZ = true;
    public static Boolean LIZIZ = Boolean.FALSE;
    public static int LIZJ = 2;
    public static boolean LIZLLL = false;
    public static boolean LJ = false;

    public static void LIZ(int i) {
        boolean z = false;
        if (i < 50) {
            LIZJ = 100 / i;
            LJ = false;
        } else {
            LIZJ = 100 / (100 - i);
            LJ = true;
        }
        if (LIZJ % 2 == 1) {
            z = true;
        }
        LIZLLL = z;
    }
}
