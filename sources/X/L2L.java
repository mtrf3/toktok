package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L2L {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(L2K.LJLIL);

    public static final int LIZLLL() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        if (LJ(diContainer) && LIZLLL() != 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        if (LJ(diContainer) && LIZLLL() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        if (LJ(diContainer) && LIZLLL() >= 3) {
            return true;
        }
        return false;
    }

    public static boolean LJ(C82622Wbi c82622Wbi) {
        if (!((Boolean) C53066KsA.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return o.LJ(c82622Wbi.LJIIIIZZ("enableDelayRecordPage", Boolean.class), Boolean.TRUE);
    }
}
