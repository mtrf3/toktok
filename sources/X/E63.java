package X;

import com.bytedance.keva.Keva;
import defpackage.m0;

/* loaded from: classes7.dex */
public final class E63 {
    public static final Keva LIZ = Keva.getRepo("tooltip_protection");
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E62.LJLIL);

    static {
        LIZJ();
    }

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static int LIZ() {
        if (!LIZJ()) {
            return 0;
        }
        if (((RBX) HG3.LJIILL()).isLogin() && !LIZIZ()) {
            return LIZ.getInt("new_user_mode_days", 0);
        }
        return 4;
    }

    public static boolean LIZIZ() {
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        return m0.LIZLLL("new_user_", ((RBX) HG3.LJIILL()).getCurSecUserId(), LIZ, false);
    }
}
