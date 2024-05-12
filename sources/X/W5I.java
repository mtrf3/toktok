package X;

import android.content.Context;

/* loaded from: classes15.dex */
public final class W5I {
    public static final Class<?> LIZ = W5I.class;
    public static C81706W4w LIZIZ;
    public static C81721W5l LIZJ;
    public static volatile boolean LIZLLL;
    public static boolean LJ;

    static {
        boolean z;
        WCX.LJJIJ.getClass();
        if (WCX.LJI.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
        LJ = true;
    }

    public static void LIZLLL() {
        C81721W5l c81721W5l;
        if (LIZIZ == null) {
            C60700Ns0.LIZJ.getClass();
            C62822Ol8 c62822Ol8 = C60700Ns0.LIZIZ;
            if (c62822Ol8.getValue() != null) {
                LIZIZ = (C81706W4w) ((W4P) c62822Ol8.getValue());
            }
        }
        if (LIZIZ == null && (c81721W5l = LIZJ) != null) {
            LIZIZ = c81721W5l.LIZ();
        }
    }

    public static W6J LIZ() {
        return W8E.LJII().LJI();
    }

    public static C81705W4v LIZJ() {
        LIZLLL();
        C81706W4w c81706W4w = LIZIZ;
        c81706W4w.getClass();
        return new C81705W4v(c81706W4w.LIZ, c81706W4w.LIZJ, c81706W4w.LIZIZ, c81706W4w.LIZLLL);
    }

    public static void LIZIZ(Context context, W9G w9g) {
        C81939WDv.LIZIZ();
        boolean z = LIZLLL;
        Class<?> cls = LIZ;
        if (z) {
            W58.LIZLLL(cls, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!LJ) {
                C81939WDv.LIZIZ();
                return;
            }
        } else {
            LIZLLL = true;
        }
        try {
            C81939WDv.LIZIZ();
            if (C81713W5d.LIZIZ != null) {
                C81713W5d.LIZJ = true;
            } else {
                try {
                    C39633Fgz.LIZLLL(context);
                    C81713W5d.LIZJ = true;
                } catch (Throwable th) {
                    W58.LJIJ(C81713W5d.LIZ, th, "Could not initialize SoLoader", new Object[0]);
                }
            }
            C81939WDv.LIZIZ();
        } catch (Exception e) {
            W58.LJIJ(cls, e, "Could not initialize SoLoader", new Object[0]);
            C81939WDv.LIZIZ();
        }
        Context LLLLL = C16880lQ.LLLLL(context);
        if (w9g == null) {
            W8E.LJIILJJIL(LLLLL);
        } else {
            W8E.LJIILL(w9g);
        }
        C81939WDv.LIZIZ();
        C81721W5l c81721W5l = new C81721W5l(LLLLL);
        LIZJ = c81721W5l;
        W5G.initialize(c81721W5l);
        C81939WDv.LIZIZ();
        C81939WDv.LIZIZ();
    }
}
