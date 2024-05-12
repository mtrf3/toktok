package X;

import java.util.Arrays;

/* renamed from: X.Uzc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79008Uzc implements Cloneable {
    public int[] LJLIL;
    public int LJLILLLLZI;

    public final Object clone() {
        return new C79008Uzc((int[]) this.LJLIL.clone(), this.LJLILLLLZI);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LJLIL) + (this.LJLILLLLZI * 31);
    }

    public final String toString() {
        char c;
        int i = this.LJLILLLLZI;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.LJLILLLLZI; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (LIZLLL(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public C79008Uzc() {
        this.LJLIL = new int[1];
    }

    public final void LIZ(boolean z) {
        LIZJ(this.LJLILLLLZI + 1);
        if (z) {
            int[] iArr = this.LJLIL;
            int i = this.LJLILLLLZI;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.LJLILLLLZI++;
    }

    public final void LIZJ(int i) {
        int[] iArr = this.LJLIL;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.LJLIL = iArr2;
        }
    }

    public final boolean LIZLLL(int i) {
        if (((1 << (i & 31)) & this.LJLIL[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79008Uzc)) {
            return false;
        }
        C79008Uzc c79008Uzc = (C79008Uzc) obj;
        if (this.LJLILLLLZI != c79008Uzc.LJLILLLLZI || !Arrays.equals(this.LJLIL, c79008Uzc.LJLIL)) {
            return false;
        }
        return true;
    }

    public C79008Uzc(int[] iArr, int i) {
        this.LJLIL = iArr;
        this.LJLILLLLZI = i;
    }

    public final void LIZIZ(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            LIZJ(this.LJLILLLLZI + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                LIZ(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }
}
