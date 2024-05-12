package X;

/* renamed from: X.4ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117114ih {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public C117114ih() {
        this(0, 0, 0, 0, false, 0, false, 511);
    }

    public C117114ih(int i, int i2, int i3, int i4, boolean z, int i5, boolean z2, int i6) {
        int i7;
        int i8;
        i = (i6 & 1) != 0 ? 0 : i;
        i2 = (i6 & 2) != 0 ? 0 : i2;
        i3 = (i6 & 4) != 0 ? 0 : i3;
        if ((i6 & 8) != 0) {
            i7 = 80;
        } else {
            i7 = 0;
        }
        i4 = (i6 & 16) != 0 ? 80 : i4;
        if ((i6 & 32) != 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        z = (i6 & 64) != 0 ? false : z;
        i5 = (i6 & 128) != 0 ? 0 : i5;
        z2 = (i6 & 256) != 0 ? false : z2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i7;
        this.LJ = i4;
        this.LJFF = i8;
        this.LJI = z;
        this.LJII = i5;
        this.LJIIIIZZ = z2;
    }
}
