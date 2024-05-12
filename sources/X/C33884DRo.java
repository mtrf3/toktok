package X;

/* renamed from: X.DRo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33884DRo {
    public static final boolean LIZ() {
        if (DPI.LIZ()) {
            if (!C35478DwA.LIZIZ() || !C2NW.LIZ().LJIILLIIL(DRI.LJLIL)) {
                return false;
            }
        } else {
            if (!C35478DwA.LIZIZ()) {
                return false;
            }
            if (C33885DRp.LIZ() != 4 && C33885DRp.LIZ() != 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZIZ() {
        if (DPI.LIZ()) {
            if (!C35478DwA.LIZIZ() || !C2NW.LIZ().LJIILLIIL(DRI.LJLIL)) {
                return false;
            }
        } else {
            if (!C35478DwA.LIZIZ()) {
                return false;
            }
            if (C33885DRp.LIZ() != 4 && C33885DRp.LIZ() != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZJ() {
        if (DPI.LIZ() || !C35478DwA.LIZIZ()) {
            return false;
        }
        if (C33885DRp.LIZ() != 4 && C33885DRp.LIZ() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL() {
        if (DPI.LIZ()) {
            return C2NW.LIZ().LJIILLIIL(DRJ.LJLIL);
        }
        if (((Number) C33889DRt.LIZ.getValue()).intValue() == 1 && ((Number) C33887DRr.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }
}
