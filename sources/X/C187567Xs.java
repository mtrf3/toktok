package X;

/* renamed from: X.7Xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187567Xs {
    public static boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "allow_reuse_both_sound", true) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ() {
        if (C00F.LIZ(31744, 0, "allow_reuse_both_sound", true) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LIZ() {
        if (LIZIZ() || LIZJ()) {
            return true;
        }
        return false;
    }
}
