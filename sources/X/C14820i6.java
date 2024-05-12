package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14820i6 {
    public final C14970iL LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;

    public final C08350Ul LIZJ() {
        int i = this.LIZLLL;
        if (i != -1) {
            return new C08350Ul(C17N.LIZLLL(i, this.LJ));
        }
        return null;
    }

    public final int LIZLLL() {
        return this.LIZ.LIZ();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public final char LIZIZ(int i) {
        C14970iL c14970iL = this.LIZ;
        C14830i7 c14830i7 = c14970iL.LIZIZ;
        if (c14830i7 == null) {
            return c14970iL.LIZ.charAt(i);
        }
        int i2 = c14970iL.LIZJ;
        if (i < i2) {
            return c14970iL.LIZ.charAt(i);
        }
        int i3 = c14830i7.LIZ;
        int i4 = c14830i7.LIZLLL;
        int i5 = c14830i7.LIZJ;
        int i6 = i3 - (i4 - i5);
        if (i < i6 + i2) {
            int i7 = i - i2;
            if (i7 < i5) {
                return c14830i7.LIZIZ[i7];
            }
            return c14830i7.LIZIZ[(i7 - i5) + i4];
        }
        return c14970iL.LIZ.charAt(i - ((i6 - c14970iL.LIZLLL) + i2));
    }

    public final void LJII(int i) {
        if (i >= 0) {
            this.LIZJ = i;
        } else {
            String LJ = KMP.LJ("Cannot set selectionEnd to a negative value: ", i);
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
    }

    public final void LJIIIIZZ(int i) {
        if (i >= 0) {
            this.LIZIZ = i;
        } else {
            String LJ = KMP.LJ("Cannot set selectionStart to a negative value: ", i);
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
    }

    public C14820i6(C08440Uu c08440Uu, long j) {
        this.LIZ = new C14970iL(c08440Uu.LJLIL);
        this.LIZIZ = C08350Ul.LJ(j);
        this.LIZJ = C08350Ul.LIZLLL(j);
        int LJ = C08350Ul.LJ(j);
        int LIZLLL = C08350Ul.LIZLLL(j);
        if (LJ >= 0 && LJ <= c08440Uu.length()) {
            if (LIZLLL >= 0 && LIZLLL <= c08440Uu.length()) {
                if (LJ <= LIZLLL) {
                    return;
                } else {
                    throw new IllegalArgumentException(C48263Iwt.LIZLLL("Do not set reversed range: ", LJ, " > ", LIZLLL));
                }
            } else {
                StringBuilder LJ2 = C7MY.LJ("end (", LIZLLL, ") offset is outside of text region ");
                LJ2.append(c08440Uu.length());
                throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ2));
            }
        }
        StringBuilder LJ3 = C7MY.LJ("start (", LJ, ") offset is outside of text region ");
        LJ3.append(c08440Uu.length());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ3));
    }

    public final void LIZ(int i, int i2) {
        long LIZLLL = C17N.LIZLLL(i, i2);
        this.LIZ.LIZIZ(i, i2, "");
        long LJJJJLL = C47261Igj.LJJJJLL(C17N.LIZLLL(this.LIZIZ, this.LIZJ), LIZLLL);
        LJIIIIZZ(C08350Ul.LJ(LJJJJLL));
        LJII(C08350Ul.LIZLLL(LJJJJLL));
        int i3 = this.LIZLLL;
        if (i3 != -1) {
            long LJJJJLL2 = C47261Igj.LJJJJLL(C17N.LIZLLL(i3, this.LJ), LIZLLL);
            if (C08350Ul.LIZIZ(LJJJJLL2)) {
                this.LIZLLL = -1;
                this.LJ = -1;
            } else {
                this.LIZLLL = C08350Ul.LJ(LJJJJLL2);
                this.LJ = C08350Ul.LIZLLL(LJJJJLL2);
            }
        }
    }

    public final void LJFF(int i, int i2) {
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i < i2) {
                    this.LIZLLL = i;
                    this.LJ = i2;
                    return;
                }
                throw new IllegalArgumentException(C48263Iwt.LIZLLL("Do not set reversed or empty range: ", i, " > ", i2));
            }
            StringBuilder LJ = C7MY.LJ("end (", i2, ") offset is outside of text region ");
            LJ.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
        }
        StringBuilder LJ2 = C7MY.LJ("start (", i, ") offset is outside of text region ");
        LJ2.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ2));
    }

    public final void LJI(int i, int i2) {
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i <= i2) {
                    LJIIIIZZ(i);
                    LJII(i2);
                    return;
                }
                throw new IllegalArgumentException(C48263Iwt.LIZLLL("Do not set reversed range: ", i, " > ", i2));
            }
            StringBuilder LJ = C7MY.LJ("end (", i2, ") offset is outside of text region ");
            LJ.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
        }
        StringBuilder LJ2 = C7MY.LJ("start (", i, ") offset is outside of text region ");
        LJ2.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ2));
    }

    public final void LJ(int i, int i2, String text) {
        o.LJIIIZ(text, "text");
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i <= i2) {
                    this.LIZ.LIZIZ(i, i2, text);
                    LJIIIIZZ(text.length() + i);
                    LJII(text.length() + i);
                    this.LIZLLL = -1;
                    this.LJ = -1;
                    return;
                }
                throw new IllegalArgumentException(C48263Iwt.LIZLLL("Do not set reversed range: ", i, " > ", i2));
            }
            StringBuilder LJ = C7MY.LJ("end (", i2, ") offset is outside of text region ");
            LJ.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
        }
        StringBuilder LJ2 = C7MY.LJ("start (", i, ") offset is outside of text region ");
        LJ2.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ2));
    }
}
