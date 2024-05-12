package X;

/* renamed from: X.Uzq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79022Uzq {
    public static final C79022Uzq LJI = new C79022Uzq(4201, 4096, 1);
    public static final C79022Uzq LJII = new C79022Uzq(1033, 1024, 1);
    public static final C79022Uzq LJIIIIZZ = new C79022Uzq(67, 64, 1);
    public static final C79022Uzq LJIIIZ = new C79022Uzq(19, 16, 1);
    public static final C79022Uzq LJIIJ = new C79022Uzq(285, 256, 0);
    public static final C79022Uzq LJIIJJI = new C79022Uzq(301, 256, 1);
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final C79024Uzs LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.LJ));
        sb.append(',');
        return UPJ.LIZLLL(sb, this.LIZLLL, ')');
    }

    public final int LIZ(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.LIZ;
        int[] iArr2 = this.LIZIZ;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.LIZLLL - 1)];
    }

    public C79022Uzq(int i, int i2, int i3) {
        this.LJ = i;
        this.LIZLLL = i2;
        this.LJFF = i3;
        this.LIZ = new int[i2];
        this.LIZIZ = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.LIZ[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.LIZIZ[this.LIZ[i6]] = i6;
        }
        this.LIZJ = new C79024Uzs(this, new int[]{0});
        new C79024Uzs(this, new int[]{1});
    }
}
