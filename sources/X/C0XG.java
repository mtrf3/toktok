package X;

/* renamed from: X.0XG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XG {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0XG)) {
            return false;
        }
        C0XG c0xg = (C0XG) obj;
        return this.LIZ == c0xg.LIZ && this.LIZIZ == c0xg.LIZIZ && this.LIZJ == c0xg.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        boolean z = this.LIZJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BidiRun(start=");
        LIZ.append(this.LIZ);
        LIZ.append(", end=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isRtl=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C0XG(int i, int i2, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
    }
}
