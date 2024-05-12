package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EGz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36157EGz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EH0.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C36156EGy.LJLIL);
    public static boolean LIZJ;

    public static boolean LIZ() {
        if (!C38686FGg.LJ) {
            return false;
        }
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "isFirstLaunch.value");
        if (!((Boolean) value).booleanValue() || !LIZJ) {
            return false;
        }
        C62822Ol8 c62822Ol8 = LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 3) {
            return false;
        }
        return true;
    }
}
