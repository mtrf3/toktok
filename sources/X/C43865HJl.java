package X;

/* renamed from: X.HJl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43865HJl {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C43867HJn.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43866HJm.LJLIL);

    public static int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZ() {
        if (LIZJ() != 0 && ((Boolean) LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        if (LIZ() && (LIZJ() == 1 || LIZJ() == 3)) {
            return true;
        }
        return false;
    }
}
