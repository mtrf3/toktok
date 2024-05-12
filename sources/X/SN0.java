package X;

/* loaded from: classes13.dex */
public final class SN0 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SN0)) {
            return false;
        }
        SN0 sn0 = (SN0) obj;
        return this.LIZ == sn0.LIZ && this.LIZIZ == sn0.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RestrictionViewStatus(isEnabled=");
        LIZ.append(this.LIZ);
        LIZ.append(", isVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public SN0(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
