package X;

import java.util.Arrays;

/* renamed from: X.Uzb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79007Uzb implements Cloneable {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int[] LJLJJI;

    public final Object clone() {
        return new C79007Uzb(this.LJLIL, this.LJLILLLLZI, (int[]) this.LJLJJI.clone(), this.LJLJI);
    }

    public final int hashCode() {
        int i = this.LJLIL;
        return Arrays.hashCode(this.LJLJJI) + (((((((i * 31) + i) * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder((this.LJLIL + 1) * this.LJLILLLLZI);
        for (int i = 0; i < this.LJLILLLLZI; i++) {
            for (int i2 = 0; i2 < this.LJLIL; i2++) {
                if (LIZ(i2, i)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79007Uzb)) {
            return false;
        }
        C79007Uzb c79007Uzb = (C79007Uzb) obj;
        if (this.LJLIL != c79007Uzb.LJLIL || this.LJLILLLLZI != c79007Uzb.LJLILLLLZI || this.LJLJI != c79007Uzb.LJLJI || !Arrays.equals(this.LJLJJI, c79007Uzb.LJLJJI)) {
            return false;
        }
        return true;
    }

    public C79007Uzb(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.LJLIL = i;
            this.LJLILLLLZI = i2;
            int i3 = (i + 31) / 32;
            this.LJLJI = i3;
            this.LJLJJI = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean LIZ(int i, int i2) {
        if (((this.LJLJJI[(i / 32) + (i2 * this.LJLJI)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.LJLJI);
        int[] iArr = this.LJLJJI;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public C79007Uzb(int i, int i2, int[] iArr, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = iArr;
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.LJLILLLLZI && i5 <= this.LJLIL) {
                    while (i2 < i6) {
                        int i7 = this.LJLJI * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.LJLJJI;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }
}
