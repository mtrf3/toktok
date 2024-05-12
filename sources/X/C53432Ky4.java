package X;

import android.content.Context;

/* renamed from: X.Ky4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53432Ky4 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52715KmV.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53411Kxj.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C53410Kxi.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C53409Kxh.LJLIL);

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZLLL() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final boolean LJ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static int LIZIZ() {
        int i;
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = EF7.LIZIZ();
        }
        int LJ = C60996Nwm.LJ(LJIIIIZZ);
        if (LJ <= C7MY.LIZIZ(730)) {
            i = 2;
        } else if (LJ <= C7MY.LIZIZ(890)) {
            i = 3;
        } else {
            i = 4;
        }
        if (IRL.LIZ()) {
            return i + 1;
        }
        return i;
    }

    public static int LIZJ() {
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = EF7.LIZIZ();
        }
        int LIZ2 = (C47135Ieh.LIZ(8, C60996Nwm.LJIIIIZZ(LJIIIIZZ)) / O6R.LJJIIZ(C32151Nz.LJIIZILJ(88))) + 1;
        if (LIZ2 < 0) {
            return 5;
        }
        return LIZ2;
    }
}
