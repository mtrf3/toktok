package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IGt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46343IGt {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C46342IGs.LJLIL);

    public static boolean LIZ(String str) {
        if ((!o.LJ(str, "others_homepage") && !o.LJ(str, "personal_homepage") && !o.LJ(str, "general_search") && !o.LJ(str, "single_song")) || (((Number) LIZ.getValue()).intValue() & 1) != 1) {
            return false;
        }
        return true;
    }
}
