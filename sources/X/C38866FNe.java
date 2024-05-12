package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FNe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38866FNe {
    public static final C62822Ol8 LIZ;

    static {
        C221108m2.LIZIZ(C38867FNf.LJLIL);
        LIZ = C221108m2.LIZIZ(C38869FNh.LJLIL);
    }

    public static boolean LIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "isFirstLaunch.value");
        if (((Boolean) value).booleanValue() && !C36152EGu.LIZIZ(C38868FNg.LJLIL)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (!C38686FGg.LJI || !((Boolean) LIZ.getValue()).booleanValue()) {
            return false;
        }
        return !C36152EGu.LIZIZ(FNZ.LJLIL);
    }
}
