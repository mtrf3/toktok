package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16610kz {
    public ViewParent LIZ;
    public ViewParent LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public int[] LJ;

    public C16610kz(View view) {
        this.LIZJ = view;
    }

    public final ViewParent LJIIIIZZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    public final boolean LJIIIZ(int i) {
        if (LJIIIIZZ(i) != null) {
            return true;
        }
        return false;
    }

    public final void LJIIJ(boolean z) {
        if (this.LIZLLL) {
            C16360ka.LJJIFFI(this.LIZJ);
        }
        this.LIZLLL = z;
    }

    public final void LJIIL(int i) {
        ViewParent LJIIIIZZ = LJIIIIZZ(i);
        if (LJIIIIZZ != null) {
            View view = this.LIZJ;
            if (LJIIIIZZ instanceof C1V0) {
                ((C1V0) LJIIIIZZ).LJIILJJIL(i, view);
            } else if (i == 0) {
                try {
                    C16590kx.LJI(LJIIIIZZ, view);
                } catch (AbstractMethodError unused) {
                }
            }
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.LIZIZ = null;
                return;
            }
            this.LIZ = null;
        }
    }

    public final boolean LIZIZ(float f, float f2) {
        ViewParent LJIIIIZZ;
        if (!this.LIZLLL || (LJIIIIZZ = LJIIIIZZ(0)) == null) {
            return false;
        }
        try {
            return C16590kx.LIZIZ(LJIIIIZZ, this.LIZJ, f, f2);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.LJIIIZ(r9)
            r6 = 1
            if (r0 == 0) goto L8
            return r6
        L8:
            boolean r0 = r7.LIZLLL
            r5 = 0
            if (r0 == 0) goto L53
            android.view.View r0 = r7.LIZJ
            android.view.ViewParent r4 = r0.getParent()
            android.view.View r3 = r7.LIZJ
        L15:
            if (r4 == 0) goto L53
            android.view.View r2 = r7.LIZJ
            boolean r1 = r4 instanceof X.C1V0
            if (r1 == 0) goto L40
            r0 = r4
            X.1V0 r0 = (X.C1V0) r0
            boolean r0 = r0.LJJLIIJ(r3, r2, r8, r9)
        L24:
            if (r0 == 0) goto L47
            if (r9 == 0) goto L3d
            if (r9 == r6) goto L3a
        L2a:
            android.view.View r0 = r7.LIZJ
            if (r1 == 0) goto L34
            X.1V0 r4 = (X.C1V0) r4
            r4.LJIILL(r3, r0, r8, r9)
        L33:
            return r6
        L34:
            if (r9 != 0) goto L33
            X.C16590kx.LJ(r4, r3, r0, r8)     // Catch: java.lang.AbstractMethodError -> L33
            goto L33
        L3a:
            r7.LIZIZ = r4
            goto L2a
        L3d:
            r7.LIZ = r4
            goto L2a
        L40:
            if (r9 != 0) goto L47
            boolean r0 = X.C16590kx.LJFF(r4, r3, r2, r8)     // Catch: java.lang.AbstractMethodError -> L47
            goto L24
        L47:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L4e
            r3 = r4
            android.view.View r3 = (android.view.View) r3
        L4e:
            android.view.ViewParent r4 = r4.getParent()
            goto L15
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16610kz.LJIIJJI(int, int):boolean");
    }

    public final boolean LIZ(float f, float f2, boolean z) {
        ViewParent LJIIIIZZ;
        if (!this.LIZLLL || (LJIIIIZZ = LJIIIIZZ(0)) == null) {
            return false;
        }
        try {
            return C16590kx.LIZ(LJIIIIZZ, this.LIZJ, f, f2, z);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public final boolean LIZLLL(int i, int i2, int[] iArr, int[] iArr2) {
        return LIZJ(i, i2, 0, iArr, iArr2);
    }

    public final boolean LIZJ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent LJIIIIZZ;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!this.LIZLLL || (LJIIIIZZ = LJIIIIZZ(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.LIZJ.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr3 == null) {
                if (this.LJ == null) {
                    this.LJ = new int[2];
                }
                iArr3 = this.LJ;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.LIZJ;
            if (LJIIIIZZ instanceof C1V0) {
                ((C1V0) LJIIIIZZ).LJJIIJ(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                try {
                    C16590kx.LIZJ(LJIIIIZZ, view, i, i2, iArr3);
                } catch (AbstractMethodError unused) {
                }
            }
            if (iArr2 != null) {
                this.LIZJ.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        }
        if (iArr2 == null) {
            return false;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        return false;
    }

    public final boolean LJFF(int i, int i2, int i3, int i4, int[] iArr) {
        return LJII(i, i2, i3, i4, iArr, 0, null);
    }

    public final void LJ(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJII(i, i2, i3, i4, null, i5, iArr);
    }

    public final boolean LJI(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return LJII(i, i2, i3, i4, iArr, i5, null);
    }

    public final boolean LJII(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent LJIIIIZZ;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!this.LIZLLL || (LJIIIIZZ = LJIIIIZZ(i5)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr != null) {
                this.LIZJ.getLocationInWindow(iArr);
                i6 = iArr[0];
                i7 = iArr[1];
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (iArr3 == null) {
                if (this.LJ == null) {
                    this.LJ = new int[2];
                }
                iArr3 = this.LJ;
                iArr3[0] = 0;
                iArr3[1] = 0;
            }
            View view = this.LIZJ;
            if (LJIIIIZZ instanceof InterfaceC43251mr) {
                ((InterfaceC43251mr) LJIIIIZZ).LJJIJIL(view, i, i2, i3, i4, i5, iArr3);
            } else {
                iArr3[0] = iArr3[0] + i3;
                iArr3[1] = iArr3[1] + i4;
                if (LJIIIIZZ instanceof C1V0) {
                    ((C1V0) LJIIIIZZ).LJJ(view, i, i2, i3, i4, i5);
                } else if (i5 == 0) {
                    try {
                        C16590kx.LIZLLL(LJIIIIZZ, view, i, i2, i3, i4);
                    } catch (AbstractMethodError unused) {
                    }
                }
            }
            if (iArr != null) {
                this.LIZJ.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i7;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }
}
