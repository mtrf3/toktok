package X;

/* loaded from: classes7.dex */
public final class DUE {
    public static volatile boolean LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(DUG.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(DUF.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(DUH.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(DUD.LJLIL);

    public static boolean LIZLLL() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZ() {
        if (C2NW.LIZ().LJIJ() && C2NW.LIZ().LJIJ() && DQG.LIZJ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (DPI.LIZ()) {
            return C2NW.LIZ().LJIIL(C33892DRw.LJLIL);
        }
        return false;
    }

    public static boolean LIZJ() {
        if (C2NW.LIZ().LJIILIIL()) {
            return C2NW.LIZ().LJIIL(C33891DRv.LJLIL);
        }
        return false;
    }

    public static boolean LJFF(boolean z) {
        if (z) {
            if (C2NW.LIZ().LJJIJIIJIL() && DPI.LIZ() && (LIZJ() || LIZIZ() || LIZ())) {
                LIZ = false;
                return false;
            }
            LIZ = true;
            return true;
        }
        return LIZ;
    }
}
