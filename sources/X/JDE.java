package X;

/* loaded from: classes9.dex */
public final class JDE {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JDR.LJLIL);

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ() {
        if (LIZIZ()) {
            if (C00F.LIZ(31744, 0, "enable_pip_feed_pad", false) <= 0) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "enable_pip_feed", false) <= 0) {
            return false;
        }
        return true;
    }
}
