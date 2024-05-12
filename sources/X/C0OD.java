package X;

/* renamed from: X.0OD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OD {
    public int LIZ;
    public int[] LIZIZ = new int[16];
    public int[] LIZJ = new int[16];
    public int[] LIZLLL;
    public int LJ;

    public C0OD() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.LIZLLL = iArr;
    }

    public final int LIZ(int i) {
        int i2 = this.LIZ + 1;
        int[] iArr = this.LIZIZ;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            C61898ORa.LJIJI(iArr, iArr2, 0, 14);
            C61898ORa.LJIJI(this.LIZJ, iArr3, 0, 14);
            this.LIZIZ = iArr2;
            this.LIZJ = iArr3;
        }
        int i4 = this.LIZ;
        this.LIZ = i4 + 1;
        int length2 = this.LIZLLL.length;
        if (this.LJ >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            C61898ORa.LJIJI(this.LIZLLL, iArr4, 0, 14);
            this.LIZLLL = iArr4;
        }
        int i8 = this.LJ;
        int[] iArr5 = this.LIZLLL;
        this.LJ = iArr5[i8];
        int[] iArr6 = this.LIZIZ;
        iArr6[i4] = i;
        this.LIZJ[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i10] <= i9) {
                break;
            }
            LIZIZ(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    public final void LIZIZ(int i, int i2) {
        int[] iArr = this.LIZIZ;
        int[] iArr2 = this.LIZJ;
        int[] iArr3 = this.LIZLLL;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
