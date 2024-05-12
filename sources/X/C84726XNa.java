package X;

/* renamed from: X.XNa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84726XNa {
    public boolean LIZ = false;
    public boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84726XNa)) {
            return false;
        }
        C84726XNa c84726XNa = (C84726XNa) obj;
        return this.LIZ == c84726XNa.LIZ && this.LIZIZ == c84726XNa.LIZIZ;
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
        LIZ.append("NotificationContext(isActive=");
        LIZ.append(this.LIZ);
        LIZ.append(", isShown=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }
}
