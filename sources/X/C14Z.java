package X;

import java.util.Arrays;

/* renamed from: X.14Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14Z {
    public static boolean LJIILL = false;
    public static int LJIILLIIL = 1000;
    public boolean LIZ;
    public int LIZIZ;
    public final C44651p7 LIZJ;
    public boolean LJI;
    public int LJIIIZ;
    public final C14X LJIIJJI;
    public int LJIILIIL;
    public C38731fZ LJIILJJIL;
    public int LIZLLL = 32;
    public int LJ = 32;
    public boolean[] LJII = new boolean[32];
    public int LJIIIIZZ = 1;
    public int LJIIJ = 32;
    public C270014e[] LJIIL = new C270014e[LJIILLIIL];
    public C38731fZ[] LJFF = new C38731fZ[32];

    public final void LJIIIIZZ() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C38731fZ c38731fZ = this.LJFF[i];
            c38731fZ.LIZ.LJFF = c38731fZ.LIZIZ;
        }
    }

    public final void LJIJ() {
        C14X c14x;
        int i = 0;
        while (true) {
            c14x = this.LJIIJJI;
            C270014e[] c270014eArr = c14x.LIZJ;
            if (i >= c270014eArr.length) {
                break;
            }
            C270014e c270014e = c270014eArr[i];
            if (c270014e != null) {
                c270014e.LIZJ();
            }
            i++;
        }
        C269714b c269714b = c14x.LIZIZ;
        C270014e[] c270014eArr2 = this.LJIIL;
        int i2 = this.LJIILIIL;
        c269714b.getClass();
        if (i2 > c270014eArr2.length) {
            i2 = c270014eArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C270014e c270014e2 = c270014eArr2[i3];
            int i4 = c269714b.LIZ;
            Object[] objArr = (Object[]) c269714b.LIZIZ;
            if (i4 < objArr.length) {
                objArr[i4] = c270014e2;
                c269714b.LIZ = i4 + 1;
            }
        }
        this.LJIILIIL = 0;
        Arrays.fill(this.LJIIJJI.LIZJ, (Object) null);
        this.LIZIZ = 0;
        C44651p7 c44651p7 = this.LIZJ;
        c44651p7.LJII = 0;
        c44651p7.LIZIZ = 0.0f;
        this.LJIIIIZZ = 1;
        for (int i5 = 0; i5 < this.LJIIIZ; i5++) {
        }
        for (int i6 = 0; i6 < this.LJIIIZ; i6++) {
            C38731fZ c38731fZ = this.LJFF[i6];
            if (c38731fZ != null) {
                this.LJIIJJI.LIZ.LJFF(c38731fZ);
            }
            this.LJFF[i6] = null;
        }
        this.LJIIIZ = 0;
        this.LJIILJJIL = new C38731fZ(this.LJIIJJI);
    }

    public final C38731fZ LJIIJJI() {
        Object obj;
        C14X c14x = this.LJIIJJI;
        C269714b c269714b = c14x.LIZ;
        int i = c269714b.LIZ;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) c269714b.LIZIZ;
            obj = objArr[i2];
            objArr[i2] = null;
            c269714b.LIZ = i2;
        } else {
            obj = null;
        }
        C38731fZ c38731fZ = (C38731fZ) obj;
        if (c38731fZ == null) {
            return new C38731fZ(c14x);
        }
        c38731fZ.LIZ = null;
        c38731fZ.LIZLLL.clear();
        c38731fZ.LIZIZ = 0.0f;
        c38731fZ.LJ = false;
        return c38731fZ;
    }

    public final C270014e LJIIL() {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C270014e LIZ = LIZ(EnumC269914d.SLACK);
        int i = this.LIZIZ + 1;
        this.LIZIZ = i;
        this.LJIIIIZZ++;
        LIZ.LIZJ = i;
        this.LJIIJJI.LIZJ[i] = LIZ;
        return LIZ;
    }

    public final void LJIILJJIL() {
        int i = this.LIZLLL * 2;
        this.LIZLLL = i;
        this.LJFF = (C38731fZ[]) Arrays.copyOf(this.LJFF, i);
        C14X c14x = this.LJIIJJI;
        c14x.LIZJ = (C270014e[]) Arrays.copyOf(c14x.LIZJ, this.LIZLLL);
        int i2 = this.LIZLLL;
        this.LJII = new boolean[i2];
        this.LJ = i2;
        this.LJIIJ = i2;
    }

    public final void LJIILL() {
        if (this.LIZJ.LJ()) {
            LJIIIIZZ();
            return;
        }
        if (this.LJI) {
            for (int i = 0; i < this.LJIIIZ; i++) {
                if (!this.LJFF[i].LJ) {
                    LJIILLIIL(this.LIZJ);
                    return;
                }
            }
            LJIIIIZZ();
            return;
        }
        LJIILLIIL(this.LIZJ);
    }

    public C14Z() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C38731fZ c38731fZ = this.LJFF[i];
            if (c38731fZ != null) {
                this.LJIIJJI.LIZ.LJFF(c38731fZ);
            }
            this.LJFF[i] = null;
        }
        C14X c14x = new C14X();
        this.LJIIJJI = c14x;
        this.LIZJ = new C44651p7(c14x);
        this.LJIILJJIL = new C38731fZ(c14x);
    }

    public static int LJIILIIL(C017905f c017905f) {
        C270014e c270014e = c017905f.LJIIIIZZ;
        if (c270014e != null) {
            return (int) (c270014e.LJFF + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[]] */
    public final C270014e LIZ(EnumC269914d enumC269914d) {
        C269714b c269714b = this.LJIIJJI.LIZIZ;
        int i = c269714b.LIZ;
        C270014e c270014e = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r1 = (Object[]) c269714b.LIZIZ;
            ?? r0 = r1[i2];
            r1[i2] = 0;
            c269714b.LIZ = i2;
            c270014e = r0;
        }
        C270014e c270014e2 = c270014e;
        if (c270014e2 == null) {
            c270014e2 = new C270014e(enumC269914d);
            c270014e2.LJIIIZ = enumC269914d;
        } else {
            c270014e2.LIZJ();
            c270014e2.LJIIIZ = enumC269914d;
        }
        int i3 = this.LJIILIIL;
        int i4 = LJIILLIIL;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            LJIILLIIL = i5;
            this.LJIIL = (C270014e[]) Arrays.copyOf(this.LJIIL, i5);
        }
        C270014e[] c270014eArr = this.LJIIL;
        int i6 = this.LJIILIIL;
        this.LJIILIIL = i6 + 1;
        c270014eArr[i6] = c270014e2;
        return c270014e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        if (r1.LJIIL <= 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        if (r1.LJIIL <= 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r1.LJIIL <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r1.LJIIL <= 1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C38731fZ r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14Z.LIZJ(X.1fZ):void");
    }

    public final void LJII(C38731fZ c38731fZ) {
        int i;
        if (c38731fZ.LJ) {
            c38731fZ.LIZ.LIZLLL(this, c38731fZ.LIZIZ);
        } else {
            C38731fZ[] c38731fZArr = this.LJFF;
            int i2 = this.LJIIIZ;
            c38731fZArr[i2] = c38731fZ;
            C270014e c270014e = c38731fZ.LIZ;
            c270014e.LIZLLL = i2;
            this.LJIIIZ = i2 + 1;
            c270014e.LJ(this, c38731fZ);
        }
        if (this.LIZ) {
            int i3 = 0;
            while (i3 < this.LJIIIZ) {
                if (this.LJFF[i3] == null) {
                    System.out.println("WTF");
                }
                C38731fZ c38731fZ2 = this.LJFF[i3];
                if (c38731fZ2 != null && c38731fZ2.LJ) {
                    c38731fZ2.LIZ.LIZLLL(this, c38731fZ2.LIZIZ);
                    this.LJIIJJI.LIZ.LJFF(c38731fZ2);
                    this.LJFF[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.LJIIIZ;
                        if (i4 >= i) {
                            break;
                        }
                        C38731fZ[] c38731fZArr2 = this.LJFF;
                        int i6 = i4 - 1;
                        C38731fZ c38731fZ3 = c38731fZArr2[i4];
                        c38731fZArr2[i6] = c38731fZ3;
                        C270014e c270014e2 = c38731fZ3.LIZ;
                        if (c270014e2.LIZLLL == i4) {
                            c270014e2.LIZLLL = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.LJFF[i5] = null;
                    }
                    this.LJIIIZ = i - 1;
                    i3--;
                }
                i3++;
            }
            this.LIZ = false;
        }
    }

    public final C270014e LJIIIZ(int i) {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C270014e LIZ = LIZ(EnumC269914d.ERROR);
        int i2 = this.LIZIZ + 1;
        this.LIZIZ = i2;
        this.LJIIIIZZ++;
        LIZ.LIZJ = i2;
        LIZ.LJ = i;
        this.LJIIJJI.LIZJ[i2] = LIZ;
        C44651p7 c44651p7 = this.LIZJ;
        c44651p7.LJIIIIZZ.LJLIL = LIZ;
        Arrays.fill(LIZ.LJIIIIZZ, 0.0f);
        LIZ.LJIIIIZZ[LIZ.LJ] = 1.0f;
        c44651p7.LJIIIZ(LIZ);
        return LIZ;
    }

    public final C270014e LJIIJ(Object obj) {
        C270014e c270014e = null;
        if (obj == null) {
            return null;
        }
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        if (obj instanceof C017905f) {
            C017905f c017905f = (C017905f) obj;
            c270014e = c017905f.LJIIIIZZ;
            if (c270014e == null) {
                c017905f.LJIIJ();
                c270014e = c017905f.LJIIIIZZ;
            }
            int i = c270014e.LIZJ;
            if (i != -1) {
                if (i > this.LIZIZ || this.LJIIJJI.LIZJ[i] == null) {
                    if (i != -1) {
                        c270014e.LIZJ();
                    }
                }
            }
            int i2 = this.LIZIZ + 1;
            this.LIZIZ = i2;
            this.LJIIIIZZ++;
            c270014e.LIZJ = i2;
            c270014e.LJIIIZ = EnumC269914d.UNRESTRICTED;
            this.LJIIJJI.LIZJ[i2] = c270014e;
        }
        return c270014e;
    }

    public final void LJIILLIIL(C44651p7 c44651p7) {
        int i = 0;
        while (true) {
            float f = 0.0f;
            if (i >= this.LJIIIZ) {
                break;
            }
            C38731fZ c38731fZ = this.LJFF[i];
            if (c38731fZ.LIZ.LJIIIZ == EnumC269914d.UNRESTRICTED || c38731fZ.LIZIZ >= 0.0f) {
                i++;
            } else {
                boolean z = false;
                int i2 = 0;
                do {
                    i2++;
                    float f2 = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.LJIIIZ; i6++) {
                        C38731fZ c38731fZ2 = this.LJFF[i6];
                        if (c38731fZ2.LIZ.LJIIIZ != EnumC269914d.UNRESTRICTED && !c38731fZ2.LJ && c38731fZ2.LIZIZ < f) {
                            int LJIIJ = c38731fZ2.LIZLLL.LJIIJ();
                            int i7 = 0;
                            while (i7 < LJIIJ) {
                                C270014e LJFF = c38731fZ2.LIZLLL.LJFF(i7);
                                float LIZJ = c38731fZ2.LIZLLL.LIZJ(LJFF);
                                if (LIZJ > f) {
                                    int i8 = 0;
                                    do {
                                        float f3 = LJFF.LJII[i8] / LIZJ;
                                        if ((f3 < f2 && i8 == i5) || i8 > i5) {
                                            i4 = LJFF.LIZJ;
                                            i5 = i8;
                                            f2 = f3;
                                            i3 = i6;
                                        }
                                        i8++;
                                    } while (i8 < 9);
                                }
                                i7++;
                                f = 0.0f;
                            }
                        }
                    }
                    if (i3 != -1) {
                        C38731fZ c38731fZ3 = this.LJFF[i3];
                        c38731fZ3.LIZ.LIZLLL = -1;
                        c38731fZ3.LJI(this.LJIIJJI.LIZJ[i4]);
                        C270014e c270014e = c38731fZ3.LIZ;
                        c270014e.LIZLLL = i3;
                        c270014e.LJ(this, c38731fZ3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.LJIIIIZZ / 2) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                } while (!z);
            }
        }
        LJIIZILJ(c44651p7);
        LJIIIIZZ();
    }

    public final void LJIIZILJ(C38731fZ c38731fZ) {
        for (int i = 0; i < this.LJIIIIZZ; i++) {
            this.LJII[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= this.LJIIIIZZ * 2) {
                return;
            }
            C270014e c270014e = c38731fZ.LIZ;
            if (c270014e != null) {
                this.LJII[c270014e.LIZJ] = true;
            }
            C270014e LIZ = c38731fZ.LIZ(this.LJII);
            if (LIZ != null) {
                boolean[] zArr = this.LJII;
                int i3 = LIZ.LIZJ;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.LJIIIZ; i5++) {
                    C38731fZ c38731fZ2 = this.LJFF[i5];
                    if (c38731fZ2.LIZ.LJIIIZ != EnumC269914d.UNRESTRICTED && !c38731fZ2.LJ && c38731fZ2.LIZLLL.LJI(LIZ)) {
                        float LIZJ = c38731fZ2.LIZLLL.LIZJ(LIZ);
                        if (LIZJ < 0.0f) {
                            float f2 = (-c38731fZ2.LIZIZ) / LIZJ;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C38731fZ c38731fZ3 = this.LJFF[i4];
                    c38731fZ3.LIZ.LIZLLL = -1;
                    c38731fZ3.LJI(LIZ);
                    C270014e c270014e2 = c38731fZ3.LIZ;
                    c270014e2.LIZLLL = i4;
                    c270014e2.LJ(this, c38731fZ3);
                }
            } else {
                return;
            }
        }
    }

    public final void LIZLLL(C270014e c270014e, int i) {
        int i2 = c270014e.LIZLLL;
        if (i2 == -1) {
            c270014e.LIZLLL(this, i);
            for (int i3 = 0; i3 < this.LIZIZ + 1; i3++) {
            }
            return;
        }
        if (i2 != -1) {
            C38731fZ c38731fZ = this.LJFF[i2];
            if (c38731fZ.LJ) {
                c38731fZ.LIZIZ = i;
                return;
            }
            if (c38731fZ.LIZLLL.LJIIJ() == 0) {
                c38731fZ.LJ = true;
                c38731fZ.LIZIZ = i;
                return;
            }
            C38731fZ LJIIJJI = LJIIJJI();
            if (i < 0) {
                LJIIJJI.LIZIZ = -i;
                LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            } else {
                LJIIJJI.LIZIZ = i;
                LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, -1.0f);
            }
            LIZJ(LJIIJJI);
            return;
        }
        C38731fZ LJIIJJI2 = LJIIJJI();
        LJIIJJI2.LIZ = c270014e;
        float f = i;
        c270014e.LJFF = f;
        LJIIJJI2.LIZIZ = f;
        LJIIJJI2.LJ = true;
        LIZJ(LJIIJJI2);
    }

    public final void LJ(C270014e c270014e, C270014e c270014e2, int i, int i2) {
        if (i2 == 8 && c270014e2.LJI && c270014e.LIZLLL == -1) {
            c270014e.LIZLLL(this, c270014e2.LJFF + i);
            return;
        }
        C38731fZ LJIIJJI = LJIIJJI();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            LJIIJJI.LIZIZ = i;
        }
        if (!z) {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, -1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, 1.0f);
        } else {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, -1.0f);
        }
        if (i2 != 8) {
            LJIIJJI.LIZIZ(this, i2);
        }
        LIZJ(LJIIJJI);
    }

    public final void LJFF(C270014e c270014e, C270014e c270014e2, int i, int i2) {
        C38731fZ LJIIJJI = LJIIJJI();
        C270014e LJIIL = LJIIL();
        LJIIL.LJ = 0;
        LJIIJJI.LIZJ(c270014e, c270014e2, LJIIL, i);
        if (i2 != 8) {
            LJIIJJI.LIZLLL.LJIIIIZZ(LJIIIZ(i2), (int) (LJIIJJI.LIZLLL.LIZJ(LJIIL) * (-1.0f)));
        }
        LIZJ(LJIIJJI);
    }

    public final void LJI(C270014e c270014e, C270014e c270014e2, int i, int i2) {
        C38731fZ LJIIJJI = LJIIJJI();
        C270014e LJIIL = LJIIL();
        LJIIL.LJ = 0;
        LJIIJJI.LIZLLL(c270014e, c270014e2, LJIIL, i);
        if (i2 != 8) {
            LJIIJJI.LIZLLL.LJIIIIZZ(LJIIIZ(i2), (int) (LJIIJJI.LIZLLL.LIZJ(LJIIL) * (-1.0f)));
        }
        LIZJ(LJIIJJI);
    }

    public final void LIZIZ(C270014e c270014e, C270014e c270014e2, int i, float f, C270014e c270014e3, C270014e c270014e4, int i2, int i3) {
        C38731fZ LJIIJJI = LJIIJJI();
        if (c270014e2 == c270014e3) {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e4, 1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, -2.0f);
        } else if (f == 0.5f) {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, -1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e3, -1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e4, 1.0f);
            if (i > 0 || i2 > 0) {
                LJIIJJI.LIZIZ = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, -1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, 1.0f);
            LJIIJJI.LIZIZ = i;
        } else if (f >= 1.0f) {
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e4, -1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e3, 1.0f);
            LJIIJJI.LIZIZ = -i2;
        } else {
            float f2 = 1.0f - f;
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e, f2 * 1.0f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e2, f2 * (-1.0f));
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e3, (-1.0f) * f);
            LJIIJJI.LIZLLL.LJIIIIZZ(c270014e4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                LJIIJJI.LIZIZ = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            LJIIJJI.LIZIZ(this, i3);
        }
        LIZJ(LJIIJJI);
    }
}
