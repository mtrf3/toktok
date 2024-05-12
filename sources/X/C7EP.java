package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.7EP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EP {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C7ER.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C7ES.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C7EU.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C7ET.LJLIL);
    public static int LJ;
    public static int LJFF;

    static {
        C221108m2.LIZIZ(C7EQ.LJLIL);
    }

    public static int LIZ() {
        int i = LJ;
        if (i <= 0) {
            return LIZJ(false);
        }
        return i;
    }

    public static Keva LIZIZ() {
        Object value = LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static int LIZJ(boolean z) {
        if (z) {
            return LIZIZ().getInt("keyboard_height_landscape", ((Number) LIZ.getValue()).intValue());
        }
        return LIZIZ().getInt("keyboard_height_portrait", ((Number) LIZIZ.getValue()).intValue());
    }

    public static void LIZLLL(int i) {
        if (i != LJ) {
            LJ = i;
            if (i <= 100) {
                return;
            }
            LIZIZ().storeInt("keyboard_height_portrait", i);
        }
    }
}
