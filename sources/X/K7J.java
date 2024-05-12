package X;

import kotlin.jvm.internal.o;

@FI7("search_middle_page_show_keyboard_when_back")
/* loaded from: classes9.dex */
public final class K7J {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(K7L.LJLIL);

    public static final boolean LIZ(K7D enterMiddleBy) {
        o.LJIIIZ(enterMiddleBy, "enterMiddleBy");
        int i = K7I.LIZ[enterMiddleBy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || ((Number) LIZ.getValue()).intValue() < 4) {
                    return true;
                }
            } else if (((Number) LIZ.getValue()).intValue() < 3) {
                return true;
            }
        } else if (((Number) LIZ.getValue()).intValue() < 2) {
            return true;
        }
        return false;
    }
}
