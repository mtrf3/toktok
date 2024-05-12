package X;

import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.1hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39971hZ extends AbstractC283019e {
    public static C39971hZ LJ;
    public static final EnumC22040tk LJFF = EnumC22040tk.Rtl;
    public static final EnumC22040tk LJI = EnumC22040tk.Ltr;
    public C0VG LIZJ;
    public C07210Qb LIZLLL;

    public C39971hZ() {
        new Rect();
    }

    @Override // X.C04X
    public final int[] LIZ(int i) {
        int i2;
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        try {
            C07210Qb c07210Qb = this.LIZLLL;
            if (c07210Qb != null) {
                C10390ax LIZLLL = c07210Qb.LIZLLL();
                int LJJIIZ = O6R.LJJIIZ(LIZLLL.LIZLLL - LIZLLL.LIZIZ);
                if (i <= 0) {
                    i = 0;
                }
                C0VG c0vg = this.LIZJ;
                if (c0vg != null) {
                    int LJI2 = c0vg.LJI(i);
                    C0VG c0vg2 = this.LIZJ;
                    if (c0vg2 != null) {
                        float LJIIJJI = c0vg2.LJIIJJI(LJI2) + LJJIIZ;
                        C0VG c0vg3 = this.LIZJ;
                        if (c0vg3 != null) {
                            if (LJIIJJI < c0vg3.LJIIJJI(c0vg3.LIZIZ.LJFF - 1)) {
                                C0VG c0vg4 = this.LIZJ;
                                if (c0vg4 != null) {
                                    i2 = c0vg4.LJII(LJIIJJI);
                                } else {
                                    o.LJIJI("layoutResult");
                                    throw null;
                                }
                            } else {
                                C0VG c0vg5 = this.LIZJ;
                                if (c0vg5 != null) {
                                    i2 = c0vg5.LIZIZ.LJFF;
                                } else {
                                    o.LJIJI("layoutResult");
                                    throw null;
                                }
                            }
                            return LIZJ(i, LJ(i2 - 1, LJI) + 1);
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
            o.LJIJI("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.C04X
    public final int[] LIZIZ(int i) {
        int i2;
        if (LIZLLL().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            C07210Qb c07210Qb = this.LIZLLL;
            if (c07210Qb != null) {
                C10390ax LIZLLL = c07210Qb.LIZLLL();
                int LJJIIZ = O6R.LJJIIZ(LIZLLL.LIZLLL - LIZLLL.LIZIZ);
                int length = LIZLLL().length();
                if (length <= i) {
                    i = length;
                }
                C0VG c0vg = this.LIZJ;
                if (c0vg != null) {
                    int LJI2 = c0vg.LJI(i);
                    C0VG c0vg2 = this.LIZJ;
                    if (c0vg2 != null) {
                        float LJIIJJI = c0vg2.LJIIJJI(LJI2) - LJJIIZ;
                        if (LJIIJJI > 0.0f) {
                            C0VG c0vg3 = this.LIZJ;
                            if (c0vg3 != null) {
                                i2 = c0vg3.LJII(LJIIJJI);
                            } else {
                                o.LJIJI("layoutResult");
                                throw null;
                            }
                        } else {
                            i2 = 0;
                        }
                        if (i == LIZLLL().length() && i2 < LJI2) {
                            i2++;
                        }
                        return LIZJ(LJ(i2, LJFF), i);
                    }
                    o.LJIJI("layoutResult");
                    throw null;
                }
                o.LJIJI("layoutResult");
                throw null;
            }
            o.LJIJI("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
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
