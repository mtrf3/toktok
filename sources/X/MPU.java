package X;

/* loaded from: classes10.dex */
public final class MPU implements MRU {
    public final boolean LIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MPU) && this.LIZ == ((MPU) obj).LIZ;
    }

    public final int hashCode() {
        boolean z = this.LIZ;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RefreshParam(force=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
