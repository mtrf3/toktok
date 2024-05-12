package X;

/* renamed from: X.0Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09110Xj {
    public int LIZIZ;
    public long LIZJ;
    public final int LIZLLL = 64;
    public final int LJ = 16;
    public final byte[] LIZ = new byte[64];

    public abstract void LIZ(byte[] bArr);

    public abstract byte[] LIZIZ(long j);

    public abstract void LIZJ();

    public abstract void LIZLLL(byte[] bArr);

    public final byte[] LJ() {
        byte[] bArr = new byte[this.LJ];
        byte[] LIZIZ = LIZIZ(this.LIZJ);
        int i = 0;
        while (i < LIZIZ.length) {
            int i2 = this.LIZLLL;
            int i3 = this.LIZIZ;
            int i4 = i2 - i3;
            C78949Uyf.LJIIIZ(LIZIZ, i, i3, this.LIZ, i4);
            LIZLLL(this.LIZ);
            this.LIZIZ = 0;
            i += i4;
        }
        LIZ(bArr);
        LIZJ();
        return bArr;
    }

    public final void LJFF(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 > 0) {
            int min = Math.min(this.LIZLLL - this.LIZIZ, i3);
            C78949Uyf.LJIIIZ(bArr, i2, this.LIZIZ, this.LIZ, min);
            i3 -= min;
            i2 += min;
            int i4 = this.LIZIZ + min;
            this.LIZIZ = i4;
            int i5 = this.LIZLLL;
            if (i4 >= i5) {
                this.LIZIZ = i4 - i5;
                LIZLLL(this.LIZ);
            }
        }
        this.LIZJ += i;
    }
}
