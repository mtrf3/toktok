package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14970iL {
    public String LIZ;
    public C14830i7 LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final int LIZ() {
        C14830i7 c14830i7 = this.LIZIZ;
        if (c14830i7 == null) {
            return this.LIZ.length();
        }
        return (c14830i7.LIZ - (c14830i7.LIZLLL - c14830i7.LIZJ)) + (this.LIZ.length() - (this.LIZLLL - this.LIZJ));
    }

    public final String toString() {
        C14830i7 c14830i7 = this.LIZIZ;
        if (c14830i7 == null) {
            return this.LIZ;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.LIZ, 0, this.LIZJ);
        sb.append(c14830i7.LIZIZ, 0, c14830i7.LIZJ);
        char[] cArr = c14830i7.LIZIZ;
        int i = c14830i7.LIZLLL;
        sb.append(cArr, i, c14830i7.LIZ - i);
        String str = this.LIZ;
        sb.append((CharSequence) str, this.LIZLLL, str.length());
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public C14970iL(String text) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
        this.LIZJ = -1;
        this.LIZLLL = -1;
    }

    public final void LIZIZ(int i, int i2, String text) {
        o.LJIIIZ(text, "text");
        if (i <= i2) {
            if (i >= 0) {
                C14830i7 c14830i7 = this.LIZIZ;
                if (c14830i7 == null) {
                    int max = Math.max(255, text.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.LIZ.length() - i2, 64);
                    int i3 = i - min;
                    C78857UxB.LJJJZ(this.LIZ, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    C78857UxB.LJJJZ(this.LIZ, cArr, i4, i2, i5);
                    C78857UxB.LJJJZ(text, cArr, min, 0, text.length());
                    this.LIZIZ = new C14830i7(cArr, text.length() + min, i4);
                    this.LIZJ = i3;
                    this.LIZLLL = i5;
                    return;
                }
                int i6 = this.LIZJ;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 < 0 || i8 > c14830i7.LIZ - (c14830i7.LIZLLL - c14830i7.LIZJ)) {
                    this.LIZ = toString();
                    this.LIZIZ = null;
                    this.LIZJ = -1;
                    this.LIZLLL = -1;
                    LIZIZ(i, i2, text);
                    return;
                }
                int length = text.length() - (i8 - i7);
                int i9 = c14830i7.LIZLLL - c14830i7.LIZJ;
                if (length > i9) {
                    int i10 = length - i9;
                    int i11 = c14830i7.LIZ;
                    do {
                        i11 *= 2;
                    } while (i11 - c14830i7.LIZ < i10);
                    char[] cArr2 = new char[i11];
                    C61898ORa.LJIJ(c14830i7.LIZIZ, cArr2, 0, 0, c14830i7.LIZJ);
                    int i12 = c14830i7.LIZ;
                    int i13 = c14830i7.LIZLLL;
                    int i14 = i12 - i13;
                    int i15 = i11 - i14;
                    C61898ORa.LJIJ(c14830i7.LIZIZ, cArr2, i15, i13, i14 + i13);
                    c14830i7.LIZIZ = cArr2;
                    c14830i7.LIZ = i11;
                    c14830i7.LIZLLL = i15;
                }
                int i16 = c14830i7.LIZJ;
                if (i7 < i16 && i8 <= i16) {
                    int i17 = i16 - i8;
                    char[] cArr3 = c14830i7.LIZIZ;
                    C61898ORa.LJIJ(cArr3, cArr3, c14830i7.LIZLLL - i17, i8, i16);
                    c14830i7.LIZJ = i7;
                    c14830i7.LIZLLL -= i17;
                } else if (i7 < i16 && i8 >= i16) {
                    c14830i7.LIZLLL = (c14830i7.LIZLLL - i16) + i8;
                    c14830i7.LIZJ = i7;
                } else {
                    int i18 = c14830i7.LIZLLL;
                    int i19 = i18 - i16;
                    int i20 = i7 + i19;
                    char[] cArr4 = c14830i7.LIZIZ;
                    C61898ORa.LJIJ(cArr4, cArr4, i16, i18, i20);
                    c14830i7.LIZJ += i20 - i18;
                    c14830i7.LIZLLL = i19 + i8;
                }
                C78857UxB.LJJJZ(text, c14830i7.LIZIZ, c14830i7.LIZJ, 0, text.length());
                c14830i7.LIZJ = text.length() + c14830i7.LIZJ;
                return;
            }
            String LJ = KMP.LJ("start must be non-negative, but was ", i);
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
        String LIZLLL = C48263Iwt.LIZLLL("start index must be less than or equal to end index: ", i, " > ", i2);
        LIZLLL.toString();
        throw new IllegalArgumentException(LIZLLL);
    }
}
