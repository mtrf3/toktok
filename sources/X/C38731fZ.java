package X;

import defpackage.i0;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.1fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38731fZ implements C14Y {
    public C270014e LIZ;
    public float LIZIZ;
    public C14W LIZLLL;
    public final ArrayList<C270014e> LIZJ = new ArrayList<>();
    public boolean LJ = false;

    public boolean LJ() {
        if (this.LIZ == null && this.LIZIZ == 0.0f && this.LIZLLL.LJIIJ() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            X.14e r0 = r9.LIZ
            java.lang.String r2 = ""
            if (r0 != 0) goto L91
            java.lang.String r0 = "0"
            java.lang.String r1 = defpackage.i0.LJFF(r2, r0)
        Lc:
            java.lang.String r0 = " = "
            java.lang.String r6 = defpackage.i0.LJFF(r1, r0)
            float r0 = r9.LIZIZ
            r5 = 0
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L8f
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            float r0 = r9.LIZIZ
            r1.append(r0)
            java.lang.String r6 = X.X1D.LIZIZ(r1)
            r7 = 1
        L2b:
            X.14W r0 = r9.LIZLLL
            int r4 = r0.LJIIJ()
        L31:
            if (r5 >= r4) goto La3
            X.14W r0 = r9.LIZLLL
            X.14e r1 = r0.LJFF(r5)
            if (r1 != 0) goto L3e
        L3b:
            int r5 = r5 + 1
            goto L31
        L3e:
            X.14W r0 = r9.LIZLLL
            float r3 = r0.LJ(r5)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L49
            goto L3b
        L49:
            java.lang.String r2 = r1.toString()
            if (r7 != 0) goto L7f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L5c
            java.lang.String r0 = "- "
            java.lang.String r6 = defpackage.i0.LJFF(r6, r0)
        L59:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
        L5c:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L68
            java.lang.String r6 = defpackage.i0.LJFF(r6, r2)
        L66:
            r7 = 1
            goto L3b
        L68:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r6 = X.X1D.LIZIZ(r1)
            goto L66
        L7f:
            if (r0 <= 0) goto L88
            java.lang.String r0 = " + "
            java.lang.String r6 = defpackage.i0.LJFF(r6, r0)
            goto L5c
        L88:
            java.lang.String r0 = " - "
            java.lang.String r6 = defpackage.i0.LJFF(r6, r0)
            goto L59
        L8f:
            r7 = 0
            goto L2b
        L91:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            X.14e r0 = r9.LIZ
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            goto Lc
        La3:
            if (r7 != 0) goto Lab
            java.lang.String r0 = "0.0"
            java.lang.String r6 = defpackage.i0.LJFF(r6, r0)
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38731fZ.toString():java.lang.String");
    }

    public C38731fZ() {
    }

    public C38731fZ(final C14X c14x) {
        this.LIZLLL = new C14W(this, c14x) { // from class: X.1fY
            public int LIZ;
            public final C38731fZ LIZIZ;
            public final C14X LIZJ;
            public int LIZLLL = 8;
            public int[] LJ = new int[8];
            public int[] LJFF = new int[8];
            public float[] LJI = new float[8];
            public int LJII = -1;
            public int LJIIIIZZ = -1;
            public boolean LJIIIZ;

            @Override // X.C14W
            public final void LIZIZ() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] * (-1.0f);
                    i = this.LJFF[i];
                }
            }

            @Override // X.C14W
            public final void clear() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    C270014e c270014e = this.LIZJ.LIZJ[this.LJ[i]];
                    if (c270014e != null) {
                        c270014e.LIZIZ(this.LIZIZ);
                    }
                    i = this.LJFF[i];
                }
                this.LJII = -1;
                this.LJIIIIZZ = -1;
                this.LJIIIZ = false;
                this.LIZ = 0;
            }

            public final String toString() {
                int i = this.LJII;
                String str = "";
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    String LJFF = i0.LJFF(str, " -> ");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LJFF);
                    LIZ.append(this.LJI[i]);
                    LIZ.append(" : ");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ);
                    LIZ2.append(this.LIZJ.LIZJ[this.LJ[i]]);
                    str = X1D.LIZIZ(LIZ2);
                    i = this.LJFF[i];
                }
                return str;
            }

            @Override // X.C14W
            public final int LJIIJ() {
                return this.LIZ;
            }

            @Override // X.C14W
            public final void LIZ(float f) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] / f;
                    i = this.LJFF[i];
                }
            }

            @Override // X.C14W
            public final float LIZJ(C270014e c270014e) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c270014e.LIZJ) {
                        return this.LJI[i];
                    }
                    i = this.LJFF[i];
                }
                return 0.0f;
            }

            @Override // X.C14W
            public final float LJ(int i) {
                int i2 = this.LJII;
                for (int i3 = 0; i2 != -1 && i3 < this.LIZ; i3++) {
                    if (i3 == i) {
                        return this.LJI[i2];
                    }
                    i2 = this.LJFF[i2];
                }
                return 0.0f;
            }

            @Override // X.C14W
            public final C270014e LJFF(int i) {
                int i2 = this.LJII;
                for (int i3 = 0; i2 != -1 && i3 < this.LIZ; i3++) {
                    if (i3 == i) {
                        return this.LIZJ.LIZJ[this.LJ[i2]];
                    }
                    i2 = this.LJFF[i2];
                }
                return null;
            }

            @Override // X.C14W
            public final boolean LJI(C270014e c270014e) {
                int i = this.LJII;
                if (i == -1) {
                    return false;
                }
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c270014e.LIZJ) {
                        return true;
                    }
                    i = this.LJFF[i];
                }
                return false;
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c14x;
            }

            @Override // X.C14W
            public final float LIZLLL(C38731fZ c38731fZ, boolean z) {
                float LIZJ = LIZJ(c38731fZ.LIZ);
                LJIIIZ(c38731fZ.LIZ, z);
                C14W c14w = c38731fZ.LIZLLL;
                int LJIIJ = c14w.LJIIJ();
                for (int i = 0; i < LJIIJ; i++) {
                    C270014e LJFF = c14w.LJFF(i);
                    LJII(LJFF, c14w.LIZJ(LJFF) * LIZJ, z);
                }
                return LIZJ;
            }

            @Override // X.C14W
            public final void LJIIIIZZ(C270014e c270014e, float f) {
                if (f == 0.0f) {
                    LJIIIZ(c270014e, true);
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c270014e.LIZJ;
                    this.LJFF[0] = -1;
                    c270014e.LJIIL++;
                    c270014e.LIZ(this.LIZIZ);
                    this.LIZ++;
                    if (!this.LJIIIZ) {
                        int i2 = this.LJIIIIZZ + 1;
                        this.LJIIIIZZ = i2;
                        int[] iArr = this.LJ;
                        if (i2 >= iArr.length) {
                            this.LJIIIZ = true;
                            this.LJIIIIZZ = iArr.length - 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i3 = -1;
                for (int i4 = 0; i != -1 && i4 < this.LIZ; i4++) {
                    int i5 = this.LJ[i];
                    int i6 = c270014e.LIZJ;
                    if (i5 == i6) {
                        this.LJI[i] = f;
                        return;
                    }
                    if (i5 < i6) {
                        i3 = i;
                    }
                    i = this.LJFF[i];
                }
                int i7 = this.LJIIIIZZ;
                int i8 = i7 + 1;
                if (this.LJIIIZ) {
                    int[] iArr2 = this.LJ;
                    if (iArr2[i7] != -1) {
                        i7 = iArr2.length;
                    }
                } else {
                    i7 = i8;
                }
                int[] iArr3 = this.LJ;
                if (i7 >= iArr3.length && this.LIZ < iArr3.length) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr4 = this.LJ;
                        if (i9 >= iArr4.length) {
                            break;
                        }
                        if (iArr4[i9] == -1) {
                            i7 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                int[] iArr5 = this.LJ;
                if (i7 >= iArr5.length) {
                    i7 = iArr5.length;
                    int i10 = this.LIZLLL * 2;
                    this.LIZLLL = i10;
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = i7 - 1;
                    this.LJI = Arrays.copyOf(this.LJI, i10);
                    this.LJ = Arrays.copyOf(this.LJ, this.LIZLLL);
                    this.LJFF = Arrays.copyOf(this.LJFF, this.LIZLLL);
                }
                this.LJ[i7] = c270014e.LIZJ;
                this.LJI[i7] = f;
                if (i3 != -1) {
                    int[] iArr6 = this.LJFF;
                    iArr6[i7] = iArr6[i3];
                    iArr6[i3] = i7;
                } else {
                    this.LJFF[i7] = this.LJII;
                    this.LJII = i7;
                }
                c270014e.LJIIL++;
                c270014e.LIZ(this.LIZIZ);
                int i11 = this.LIZ + 1;
                this.LIZ = i11;
                if (!this.LJIIIZ) {
                    this.LJIIIIZZ++;
                }
                int[] iArr7 = this.LJ;
                if (i11 >= iArr7.length) {
                    this.LJIIIZ = true;
                }
                if (this.LJIIIIZZ >= iArr7.length) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = iArr7.length - 1;
                }
            }

            @Override // X.C14W
            public final float LJIIIZ(C270014e c270014e, boolean z) {
                int i = this.LJII;
                if (i == -1) {
                    return 0.0f;
                }
                int i2 = 0;
                int i3 = -1;
                while (i != -1 && i2 < this.LIZ) {
                    if (this.LJ[i] == c270014e.LIZJ) {
                        if (i == this.LJII) {
                            this.LJII = this.LJFF[i];
                        } else {
                            int[] iArr = this.LJFF;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            c270014e.LIZIZ(this.LIZIZ);
                        }
                        c270014e.LJIIL--;
                        this.LIZ--;
                        this.LJ[i] = -1;
                        if (this.LJIIIZ) {
                            this.LJIIIIZZ = i;
                        }
                        return this.LJI[i];
                    }
                    i2++;
                    i3 = i;
                    i = this.LJFF[i];
                }
                return 0.0f;
            }

            @Override // X.C14W
            public final void LJII(C270014e c270014e, float f, boolean z) {
                if (f > -0.001f && f < 0.001f) {
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c270014e.LIZJ;
                    this.LJFF[0] = -1;
                    c270014e.LJIIL++;
                    c270014e.LIZ(this.LIZIZ);
                    this.LIZ++;
                    if (!this.LJIIIZ) {
                        int i2 = this.LJIIIIZZ + 1;
                        this.LJIIIIZZ = i2;
                        int[] iArr = this.LJ;
                        if (i2 >= iArr.length) {
                            this.LJIIIZ = true;
                            this.LJIIIIZZ = iArr.length - 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i3 = -1;
                for (int i4 = 0; i != -1 && i4 < this.LIZ; i4++) {
                    int i5 = this.LJ[i];
                    int i6 = c270014e.LIZJ;
                    if (i5 == i6) {
                        float[] fArr = this.LJI;
                        float f2 = fArr[i] + f;
                        if (f2 > -0.001f && f2 < 0.001f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        if (f2 == 0.0f) {
                            if (i == this.LJII) {
                                this.LJII = this.LJFF[i];
                            } else {
                                int[] iArr2 = this.LJFF;
                                iArr2[i3] = iArr2[i];
                            }
                            if (z) {
                                c270014e.LIZIZ(this.LIZIZ);
                            }
                            if (this.LJIIIZ) {
                                this.LJIIIIZZ = i;
                            }
                            c270014e.LJIIL--;
                            this.LIZ--;
                            return;
                        }
                        return;
                    }
                    if (i5 < i6) {
                        i3 = i;
                    }
                    i = this.LJFF[i];
                }
                int i7 = this.LJIIIIZZ;
                int i8 = i7 + 1;
                if (this.LJIIIZ) {
                    int[] iArr3 = this.LJ;
                    if (iArr3[i7] != -1) {
                        i7 = iArr3.length;
                    }
                } else {
                    i7 = i8;
                }
                int[] iArr4 = this.LJ;
                if (i7 >= iArr4.length && this.LIZ < iArr4.length) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr5 = this.LJ;
                        if (i9 >= iArr5.length) {
                            break;
                        }
                        if (iArr5[i9] == -1) {
                            i7 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                int[] iArr6 = this.LJ;
                if (i7 >= iArr6.length) {
                    i7 = iArr6.length;
                    int i10 = this.LIZLLL * 2;
                    this.LIZLLL = i10;
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = i7 - 1;
                    this.LJI = Arrays.copyOf(this.LJI, i10);
                    this.LJ = Arrays.copyOf(this.LJ, this.LIZLLL);
                    this.LJFF = Arrays.copyOf(this.LJFF, this.LIZLLL);
                }
                this.LJ[i7] = c270014e.LIZJ;
                this.LJI[i7] = f;
                if (i3 != -1) {
                    int[] iArr7 = this.LJFF;
                    iArr7[i7] = iArr7[i3];
                    iArr7[i3] = i7;
                } else {
                    this.LJFF[i7] = this.LJII;
                    this.LJII = i7;
                }
                c270014e.LJIIL++;
                c270014e.LIZ(this.LIZIZ);
                this.LIZ++;
                if (!this.LJIIIZ) {
                    this.LJIIIIZZ++;
                }
                int i11 = this.LJIIIIZZ;
                int[] iArr8 = this.LJ;
                if (i11 >= iArr8.length) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = iArr8.length - 1;
                }
            }
        };
    }

    @Override // X.C14Y
    public C270014e LIZ(boolean[] zArr) {
        return LJFF(zArr, null);
    }

    public final void LJI(C270014e c270014e) {
        C270014e c270014e2 = this.LIZ;
        if (c270014e2 != null) {
            this.LIZLLL.LJIIIIZZ(c270014e2, -1.0f);
            this.LIZ.LIZLLL = -1;
            this.LIZ = null;
        }
        float LJIIIZ = this.LIZLLL.LJIIIZ(c270014e, true) * (-1.0f);
        this.LIZ = c270014e;
        if (LJIIIZ == 1.0f) {
            return;
        }
        this.LIZIZ /= LJIIIZ;
        this.LIZLLL.LIZ(LJIIIZ);
    }

    public final void LIZIZ(C14Z c14z, int i) {
        this.LIZLLL.LJIIIIZZ(c14z.LJIIIZ(i), 1.0f);
        this.LIZLLL.LJIIIIZZ(c14z.LJIIIZ(i), -1.0f);
    }

    public final C270014e LJFF(boolean[] zArr, C270014e c270014e) {
        EnumC269914d enumC269914d;
        int LJIIJ = this.LIZLLL.LJIIJ();
        C270014e c270014e2 = null;
        float f = 0.0f;
        for (int i = 0; i < LJIIJ; i++) {
            float LJ = this.LIZLLL.LJ(i);
            if (LJ < 0.0f) {
                C270014e LJFF = this.LIZLLL.LJFF(i);
                if ((zArr == null || !zArr[LJFF.LIZJ]) && LJFF != c270014e && (((enumC269914d = LJFF.LJIIIZ) == EnumC269914d.SLACK || enumC269914d == EnumC269914d.ERROR) && LJ < f)) {
                    f = LJ;
                    c270014e2 = LJFF;
                }
            }
        }
        return c270014e2;
    }

    public final void LJII(C14Z c14z, C270014e c270014e, boolean z) {
        if (!c270014e.LJI) {
            return;
        }
        float LIZJ = this.LIZLLL.LIZJ(c270014e);
        this.LIZIZ = (c270014e.LJFF * LIZJ) + this.LIZIZ;
        this.LIZLLL.LJIIIZ(c270014e, z);
        if (z) {
            c270014e.LIZIZ(this);
        }
        if (this.LIZLLL.LJIIJ() == 0) {
            this.LJ = true;
            c14z.LIZ = true;
        }
    }

    public void LJIIIIZZ(C14Z c14z, C38731fZ c38731fZ, boolean z) {
        float LIZLLL = this.LIZLLL.LIZLLL(c38731fZ, z);
        this.LIZIZ = (c38731fZ.LIZIZ * LIZLLL) + this.LIZIZ;
        if (z) {
            c38731fZ.LIZ.LIZIZ(this);
        }
        if (this.LIZ != null && this.LIZLLL.LJIIJ() == 0) {
            this.LJ = true;
            c14z.LIZ = true;
        }
    }

    public final void LIZJ(C270014e c270014e, C270014e c270014e2, C270014e c270014e3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJIIIIZZ(c270014e, -1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e2, 1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e3, 1.0f);
        } else {
            this.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e2, -1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e3, -1.0f);
        }
    }

    public final void LIZLLL(C270014e c270014e, C270014e c270014e2, C270014e c270014e3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJIIIIZZ(c270014e, -1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e2, 1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e3, -1.0f);
        } else {
            this.LIZLLL.LJIIIIZZ(c270014e, 1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e2, -1.0f);
            this.LIZLLL.LJIIIIZZ(c270014e3, 1.0f);
        }
    }
}
