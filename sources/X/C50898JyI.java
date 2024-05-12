package X;

/* renamed from: X.JyI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50898JyI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C50900JyK.LJLIL);

    public static EnumC50899JyJ LIZ() {
        int intValue = ((Number) LIZ.getValue()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return EnumC50899JyJ.NONE;
                }
                return EnumC50899JyJ.SINGLE;
            }
            return EnumC50899JyJ.DOUBLE;
        }
        return EnumC50899JyJ.NONE;
    }
}
