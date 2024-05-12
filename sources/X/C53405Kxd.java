package X;

import java.util.List;

/* renamed from: X.Kxd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53405Kxd {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53342Kwc.LJLIL);

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZJ() {
        if (LIZIZ() == 1 || LIZIZ() == 2 || LIZIZ() == 4) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZIZ() == 1 || LIZIZ() == 4 || LIZIZ() == 3) {
            return true;
        }
        return false;
    }

    public static void LIZ(List list) {
        int LIZIZ = LIZIZ();
        if (LIZIZ == 1 || LIZIZ == 4) {
            list.clear();
        } else if (LIZIZ == 2) {
            ORS.LJJLIL(C53404Kxc.LJLIL, list);
        } else {
            if (LIZIZ != 3) {
                return;
            }
            ORS.LJJLIL(C53406Kxe.LJLIL, list);
        }
    }
}
