package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class E3T {
    public static final List<String> LIZ = C47261Igj.LJJIJ("PK");
    public static final int LIZIZ = 1;
    public static final int LIZJ = 2;
    public static final int LIZLLL = 3;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(E3R.LJLIL);

    public static int LIZ() {
        return ((Number) LJ.getValue()).intValue();
    }

    public static final int LIZIZ() {
        int LIZ2 = LIZ();
        if (LIZ2 == LIZIZ) {
            return 0;
        }
        if (LIZ2 == LIZJ) {
            return 1;
        }
        if (LIZ2 == LIZLLL) {
            return 2;
        }
        return -1;
    }
}
