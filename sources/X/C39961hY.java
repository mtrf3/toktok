package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39961hY extends AbstractC283019e {
    public static C39961hY LIZLLL;
    public static final EnumC22040tk LJ = EnumC22040tk.Rtl;
    public static final EnumC22040tk LJFF = EnumC22040tk.Ltr;
    public C0VG LIZJ;

    @Override // X.C04X
    public final int[] LIZ(int i) {
        int LJI;
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        if (i < 0) {
            C0VG c0vg = this.LIZJ;
            if (c0vg != null) {
                LJI = c0vg.LJI(0);
            } else {
                o.LJIJI("layoutResult");
                throw null;
            }
        } else {
            C0VG c0vg2 = this.LIZJ;
            if (c0vg2 != null) {
                LJI = c0vg2.LJI(i);
                if (LJ(LJI, LJ) != i) {
                    LJI++;
                }
            } else {
                o.LJIJI("layoutResult");
                throw null;
            }
        }
        C0VG c0vg3 = this.LIZJ;
        if (c0vg3 != null) {
            if (LJI >= c0vg3.LIZIZ.LJFF) {
                return null;
            }
            return LIZJ(LJ(LJI, LJ), LJ(LJI, LJFF) + 1);
        }
        o.LJIJI("layoutResult");
        throw null;
    }

    @Override // X.C04X
    public final int[] LIZIZ(int i) {
        int LJI;
        if (LIZLLL().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > LIZLLL().length()) {
            C0VG c0vg = this.LIZJ;
            if (c0vg != null) {
                LJI = c0vg.LJI(LIZLLL().length());
            } else {
                o.LJIJI("layoutResult");
                throw null;
            }
        } else {
            C0VG c0vg2 = this.LIZJ;
            if (c0vg2 != null) {
                LJI = c0vg2.LJI(i);
                if (LJ(LJI, LJFF) + 1 != i) {
                    LJI--;
                }
            } else {
                o.LJIJI("layoutResult");
                throw null;
            }
        }
        if (LJI < 0) {
            return null;
        }
        return LIZJ(LJ(LJI, LJ), LJ(LJI, LJFF) + 1);
    }

    public final int LJ(int i, EnumC22040tk enumC22040tk) {
        C0VG c0vg = this.LIZJ;
        if (c0vg != null) {
            int LJIIJ = c0vg.LJIIJ(i);
            C0VG c0vg2 = this.LIZJ;
            if (c0vg2 != null) {
                if (enumC22040tk != c0vg2.LJIILIIL(LJIIJ)) {
                    C0VG c0vg3 = this.LIZJ;
                    if (c0vg3 != null) {
                        return c0vg3.LJIIJ(i);
                    }
                    o.LJIJI("layoutResult");
                    throw null;
                }
                if (this.LIZJ != null) {
                    return r1.LJFF(i, false) - 1;
                }
                o.LJIJI("layoutResult");
                throw null;
            }
            o.LJIJI("layoutResult");
            throw null;
        }
        o.LJIJI("layoutResult");
        throw null;
    }
}
