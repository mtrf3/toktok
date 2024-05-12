package X;

/* loaded from: classes12.dex */
public final class P6E {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public P6S LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public P3Y LJII;

    public final byte[] LIZ() {
        P3Y p3y = this.LJII;
        if (p3y instanceof P3Z) {
            return ((P3Z) p3y).LJFF;
        }
        return null;
    }

    public final float[] LIZIZ() {
        P3Y p3y = this.LJII;
        if (p3y instanceof P6C) {
            return ((P6C) p3y).LJI;
        }
        return null;
    }

    public final P6Y LIZJ() {
        P3Y p3y = this.LJII;
        if (p3y instanceof P6D) {
            return ((P6D) p3y).LJFF;
        }
        return null;
    }

    public final int LIZLLL() {
        P3Y p3y = this.LJII;
        if (p3y instanceof P6C) {
            return ((P6C) p3y).LJFF;
        }
        return 0;
    }

    public static int LJII(EnumC63901P6b enumC63901P6b) {
        switch (C63902P6c.LIZ[enumC63901P6b.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case 5:
            case 6:
                return 39;
            case 7:
                return 41;
            case 8:
                return 42;
            case 9:
                return 256;
            default:
                return 0;
        }
    }

    public P6E(int i, int i2, long j) {
        this.LJ = true;
        this.LJII = new P3Y(0, 0, 0);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
    }

    public final void LJ(byte[] bArr, int i, EnumC63901P6b enumC63901P6b, int i2) {
        this.LJII = new P3Z(this.LIZ, this.LIZIZ, this.LIZJ, bArr, i, enumC63901P6b, i2);
    }

    public final void LJI(P6Y p6y, int i, EnumC63901P6b enumC63901P6b, int i2) {
        this.LJII = new P6D(this.LIZ, this.LIZIZ, this.LIZJ, p6y, i, enumC63901P6b, i2);
    }

    public P6E(byte[] bArr, EnumC63901P6b enumC63901P6b, int i, int i2, int i3) {
        this(i, i2, 0L);
        LJ(bArr, i3, enumC63901P6b, 0);
    }

    public final void LJFF(int i, int i2, float[] fArr, EnumC63901P6b enumC63901P6b, int i3) {
        this.LJII = new P6C(this.LIZ, this.LIZIZ, this.LIZJ, i, i2, fArr, enumC63901P6b, i3);
    }
}
