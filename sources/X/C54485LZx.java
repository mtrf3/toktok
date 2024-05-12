package X;

/* renamed from: X.LZx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54485LZx {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ() {
        boolean z;
        LXS LIZ2 = LXU.LIZ();
        if (LIZ2 == null) {
            return;
        }
        if (LIZ || LIZIZ || LIZJ || LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        if (z == LIZ2.LJI) {
            return;
        }
        LIZ2.LJI = z;
        C2U8.LIZ(new IKH());
    }

    public static void LIZ(boolean z) {
        LIZJ = z;
        LIZIZ();
    }
}
