package X;

/* renamed from: X.L4i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53664L4i {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52419Khj.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C52418Khi.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C210968Ps.LJLIL);
    public static final java.util.Set<String> LIZLLL = C77275UUl.LJIIIIZZ("For You", "Following", "PROFILE");
    public static final java.util.Set<String> LJ;

    static {
        java.util.Set<String> LJ2 = C77275UUl.LJ("Stem", "Nearby", "Friends");
        LJ2.addAll(A7F.LIZIZ);
        ORZ.LLJJ(LJ2);
        LJ = LJ2;
    }

    public static final boolean LIZ(String str) {
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        C62822Ol8 c62822Ol8 = LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 && ORZ.LJLJJI(str, LIZLLL)) {
            return true;
        }
        if (((Number) c62822Ol8.getValue()).intValue() != 2 || (!ORZ.LJLJJI(str, LJ) && !ORZ.LJLJJI(str, LIZLLL))) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(String str) {
        if (((Boolean) LIZJ.getValue()).booleanValue() && C30581Hy.LJIL(str)) {
            return true;
        }
        return false;
    }
}
