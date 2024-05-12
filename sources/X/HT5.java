package X;

/* loaded from: classes8.dex */
public final class HT5 {
    public static boolean LIZ;
    public static int LIZIZ = -1;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static int LIZ() {
        if (LIZJ || LIZLLL) {
            return 4;
        }
        return LIZIZ;
    }

    public static final boolean LIZIZ() {
        if (LIZ() != -1) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        LIZIZ = i | (LIZ ? 1 : 0);
    }
}
