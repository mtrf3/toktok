package X;

import defpackage.e1;

/* renamed from: X.HaL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44317HaL {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final int LIZLLL;
    public static final long LJ;
    public static final float LJFF;

    static {
        float f;
        float f2;
        C44735Hh5 c44735Hh5 = C44172HVg.LJIILJJIL;
        c44735Hh5.LIZ();
        int i = c44735Hh5.LIZ;
        LIZ = i;
        LIZIZ = (int) (i / 0.75f);
        LIZJ = C221108m2.LIZIZ(C44736Hh6.LJLIL);
        LIZLLL = (int) (LIZ() / 0.75f);
        if (e1.LIZ(31744, "now_make_selfie_taking_easier_countdown_longer", true, false)) {
            f = 4.8f;
        } else {
            f = 3.0f;
        }
        LJ = (f * 1000) - 700;
        if (C44318HaM.LIZ()) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        LJFF = f2;
        C74275TDb.LIZ(18.0f);
    }

    public static final int LIZ() {
        return ((Number) LIZJ.getValue()).intValue();
    }
}
