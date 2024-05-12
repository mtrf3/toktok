package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0V2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V2 {
    public final C22060tm LIZ;
    public final C22100tq LIZIZ;
    public final long LIZJ;
    public final C22160tw LIZLLL;
    public final C0V8 LJ;
    public final C22030tj LJFF;
    public final C21970td LJI;
    public final C21890tV LJII;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C22060tm c22060tm = this.LIZ;
        int i7 = 0;
        if (c22060tm != null) {
            i = c22060tm.LIZ;
        } else {
            i = 0;
        }
        int i8 = i * 31;
        C22100tq c22100tq = this.LIZIZ;
        if (c22100tq != null) {
            i2 = c22100tq.LIZ;
        } else {
            i2 = 0;
        }
        int LIZJ = JBR.LIZJ(this.LIZJ, (i8 + i2) * 31, 31);
        C22160tw c22160tw = this.LIZLLL;
        if (c22160tw != null) {
            i3 = c22160tw.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (LIZJ + i3) * 31;
        C0V8 c0v8 = this.LJ;
        if (c0v8 != null) {
            i4 = c0v8.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        C22030tj c22030tj = this.LJFF;
        if (c22030tj != null) {
            i5 = c22030tj.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        C21970td c21970td = this.LJI;
        if (c21970td != null) {
            i6 = c21970td.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        C21890tV c21890tV = this.LJII;
        if (c21890tV != null) {
            i7 = c21890tV.hashCode();
        }
        return i12 + i7;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ParagraphStyle(textAlign=");
        LIZ.append(this.LIZ);
        LIZ.append(", textDirection=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lineHeight=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZJ));
        LIZ.append(", textIndent=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", platformStyle=");
        LIZ.append(this.LJ);
        LIZ.append(", lineHeightStyle=");
        LIZ.append(this.LJFF);
        LIZ.append(", lineBreak=");
        LIZ.append(this.LJI);
        LIZ.append(", hyphens=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C0V2 LIZ(C0V2 c0v2) {
        long j;
        if (c0v2 == null) {
            return this;
        }
        if (C79043V0l.LJIILL(c0v2.LIZJ)) {
            j = this.LIZJ;
        } else {
            j = c0v2.LIZJ;
        }
        C22160tw c22160tw = c0v2.LIZLLL;
        if (c22160tw == null) {
            c22160tw = this.LIZLLL;
        }
        C22060tm c22060tm = c0v2.LIZ;
        if (c22060tm == null) {
            c22060tm = this.LIZ;
        }
        C22100tq c22100tq = c0v2.LIZIZ;
        if (c22100tq == null) {
            c22100tq = this.LIZIZ;
        }
        C0V8 c0v8 = c0v2.LJ;
        C0V8 c0v82 = this.LJ;
        if (c0v82 != null && c0v8 == null) {
            c0v8 = c0v82;
        }
        C22030tj c22030tj = c0v2.LJFF;
        if (c22030tj == null) {
            c22030tj = this.LJFF;
        }
        C21970td c21970td = c0v2.LJI;
        if (c21970td == null) {
            c21970td = this.LJI;
        }
        C21890tV c21890tV = c0v2.LJII;
        if (c21890tV == null) {
            c21890tV = this.LJII;
        }
        return new C0V2(c22060tm, c22100tq, j, c22160tw, c0v8, c22030tj, c21970td, c21890tV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V2)) {
            return false;
        }
        C0V2 c0v2 = (C0V2) obj;
        if (o.LJ(this.LIZ, c0v2.LIZ) && o.LJ(this.LIZIZ, c0v2.LIZIZ) && C23520w8.LIZ(this.LIZJ, c0v2.LIZJ) && o.LJ(this.LIZLLL, c0v2.LIZLLL) && o.LJ(this.LJ, c0v2.LJ) && o.LJ(this.LJFF, c0v2.LJFF) && o.LJ(this.LJI, c0v2.LJI) && o.LJ(this.LJII, c0v2.LJII)) {
            return true;
        }
        return false;
    }

    public C0V2(C22060tm c22060tm, C22100tq c22100tq, long j, C22160tw c22160tw, C0V8 c0v8, C22030tj c22030tj, C21970td c21970td, C21890tV c21890tV) {
        this.LIZ = c22060tm;
        this.LIZIZ = c22100tq;
        this.LIZJ = j;
        this.LIZLLL = c22160tw;
        this.LJ = c0v8;
        this.LJFF = c22030tj;
        this.LJI = c21970td;
        this.LJII = c21890tV;
        if (C23520w8.LIZ(j, C23520w8.LIZJ) || C23520w8.LIZJ(j) >= 0.0f) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lineHeight can't be negative (");
        LIZ.append(C23520w8.LIZJ(j));
        LIZ.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }
}
