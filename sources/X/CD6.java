package X;

/* loaded from: classes6.dex */
public final class CD6 {
    public final PVU LIZ;

    public static int LIZIZ(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public CD6(PVU pvu) {
        this.LIZ = pvu;
    }

    public static int LIZ(int i) {
        return LIZIZ(i << 3);
    }

    public final void LIZJ(int i) {
        if (i >= 0) {
            LJ(i);
        } else {
            LJFF(i);
        }
    }

    public final void LJ(int i) {
        while ((i & (-128)) != 0) {
            this.LIZ.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.LIZ.writeByte(i);
    }

    public final void LJFF(long j) {
        while (((-128) & j) != 0) {
            this.LIZ.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.LIZ.writeByte((int) j);
    }

    public final void LIZLLL(int i, int i2) {
        LJ((i << 3) | i2);
    }
}
