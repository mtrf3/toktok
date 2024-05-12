package X;

import android.graphics.Point;

/* renamed from: X.12t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C266312t {
    public static final /* synthetic */ int LJFF = 0;
    public final int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final boolean LIZJ(int i) {
        if (i == 0) {
            i = this.LIZIZ;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(int i) {
        if (i == 0) {
            i = this.LIZIZ;
        }
        if (i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public C266312t(boolean z, int i) {
        int i2;
        this.LIZ = i;
        if (z) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        this.LIZIZ = i2;
    }

    public static Point LIZIZ(C266312t c266312t, boolean z, int i, int i2, int i3, int i4) {
        int i5 = c266312t.LIZ;
        int i6 = i + i5;
        int i7 = i3 + i5;
        C22970vF.LIZIZ();
        C22970vF.LIZ();
        int i8 = c266312t.LIZIZ;
        int LJIIJJI = C87277YNd.LJIIJJI(10);
        if (c266312t.LIZJ(i8)) {
            if (z) {
                LJIIJJI += i7;
            }
        } else if (!z) {
            LJIIJJI += i6;
        }
        int LJIIJJI2 = C87277YNd.LJIIJJI(10);
        if (c266312t.LIZLLL(i8) && z) {
            LJIIJJI2 = (LJIIJJI2 + i4) - i2;
        }
        return new Point(LJIIJJI, LJIIJJI2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r12 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point LIZ(int r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            int r3 = X.C22970vF.LIZIZ()
            int r2 = X.C22970vF.LIZ()
            int r5 = r6.LIZ
            int r5 = r5 + r7
            if (r3 <= r2) goto L46
            r4 = 1
        Le:
            if (r11 != 0) goto L12
            int r11 = r6.LIZIZ
        L12:
            r1 = 10
            int r0 = X.C87277YNd.LJIIJJI(r1)
            int r3 = r3 - r0
            boolean r0 = r6.LIZJ(r11)
            if (r0 == 0) goto L41
            if (r12 == 0) goto L43
            int r3 = r3 - r7
        L22:
            if (r4 == 0) goto L3a
            int r0 = X.C87277YNd.LJIIJJI(r1)
        L28:
            int r2 = r2 - r0
            boolean r0 = r6.LIZLLL(r11)
            if (r0 == 0) goto L38
            if (r12 == 0) goto L38
            int r2 = r2 - r8
        L32:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r3, r2)
            return r0
        L38:
            int r2 = r2 - r10
            goto L32
        L3a:
            r0 = 40
            int r0 = X.C87277YNd.LJIIJJI(r0)
            goto L28
        L41:
            if (r12 == 0) goto L44
        L43:
            int r3 = r3 - r5
        L44:
            int r3 = r3 - r9
            goto L22
        L46:
            r4 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C266312t.LIZ(int, int, int, int, int, boolean):android.graphics.Point");
    }

    public final void LJ(int i, int i2, int i3, int i4, int i5, int i6, InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        int i7;
        boolean z;
        int i8 = i2;
        int i9 = i;
        Point LIZ = LIZ(i3, i4, i5, i6, 1, true);
        int i10 = LIZ.y;
        if (i8 > i10 && i9 > LIZ.x) {
            i7 = 4;
        } else if (i8 <= i10 && i9 > LIZ.x) {
            i7 = 3;
        } else if (i8 > i10 && i9 < LIZ.x) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        this.LIZIZ = i7;
        Point LIZ2 = LIZ(i3, i4, i5, i6, 0, true);
        Point LIZIZ = LIZIZ(this, true, i3, i4, i5, i6);
        int i11 = LIZIZ.x;
        if (i9 < i11) {
            i9 = i11;
            z = true;
        } else {
            z = false;
        }
        int i12 = LIZIZ.y;
        if (i8 < i12) {
            i8 = i12;
            z = true;
        }
        int i13 = LIZ2.x;
        if (i9 > i13) {
            i9 = i13;
            z = true;
        }
        int i14 = LIZ2.y;
        if (i8 > i14) {
            i8 = i14;
        } else if (!z) {
            return;
        }
        interfaceC88471Ynr.invoke(Integer.valueOf(i9), Integer.valueOf(i8));
    }
}
