package X;

/* renamed from: X.0AU, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AU {
    public long LIZ;
    public C0AU LIZIZ;

    public final void LIZJ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C0AU();
        }
    }

    public final void LJI() {
        this.LIZ = 0L;
        C0AU c0au = this.LIZIZ;
        if (c0au != null) {
            c0au.LJI();
        }
    }

    public final String toString() {
        if (this.LIZIZ == null) {
            return Long.toBinaryString(this.LIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.toString());
        LIZ.append("xx");
        LIZ.append(Long.toBinaryString(this.LIZ));
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(int i) {
        if (i >= 64) {
            C0AU c0au = this.LIZIZ;
            if (c0au != null) {
                c0au.LIZ(i - 64);
                return;
            }
            return;
        }
        this.LIZ &= ~(1 << i);
    }

    public final int LIZIZ(int i) {
        C0AU c0au = this.LIZIZ;
        if (c0au == null) {
            if (i >= 64) {
                return Long.bitCount(this.LIZ);
            }
            return Long.bitCount(this.LIZ & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.LIZ & ((1 << i) - 1));
        }
        return Long.bitCount(this.LIZ) + c0au.LIZIZ(i - 64);
    }

    public final boolean LIZLLL(int i) {
        if (i >= 64) {
            LIZJ();
            return this.LIZIZ.LIZLLL(i - 64);
        }
        if ((this.LIZ & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(int i) {
        boolean z;
        if (i >= 64) {
            LIZJ();
            return this.LIZIZ.LJFF(i - 64);
        }
        long j = 1 << i;
        long j2 = this.LIZ;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.LIZ = j3;
        long j4 = j - 1;
        this.LIZ = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C0AU c0au = this.LIZIZ;
        if (c0au != null) {
            if (c0au.LIZLLL(0)) {
                LJII(63);
            }
            this.LIZIZ.LJFF(0);
        }
        return z;
    }

    public final void LJII(int i) {
        if (i >= 64) {
            LIZJ();
            this.LIZIZ.LJII(i - 64);
        } else {
            this.LIZ |= 1 << i;
        }
    }

    public final void LJ(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            LIZJ();
            this.LIZIZ.LJ(i - 64, z);
            return;
        }
        long j = this.LIZ;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.LIZ = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            LJII(i);
        } else {
            LIZ(i);
        }
        if (!z2 && this.LIZIZ == null) {
            return;
        }
        LIZJ();
        this.LIZIZ.LJ(0, z2);
    }
}
