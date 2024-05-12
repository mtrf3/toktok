package X;

/* renamed from: X.0Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03250Av {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final boolean LIZ() {
        int i;
        int i2;
        int i3;
        int i4 = this.LIZ;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.LIZLLL;
            int i7 = this.LIZIZ;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 0) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.LIZLLL;
            int i9 = this.LIZJ;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.LJ;
            int i11 = this.LIZIZ;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.LJ;
            int i13 = this.LIZJ;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
