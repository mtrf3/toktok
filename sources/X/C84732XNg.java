package X;

/* renamed from: X.XNg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84732XNg {
    public boolean LIZ = false;
    public boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84732XNg)) {
            return false;
        }
        C84732XNg c84732XNg = (C84732XNg) obj;
        return this.LIZ == c84732XNg.LIZ && this.LIZIZ == c84732XNg.LIZIZ;
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
        return C19U.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }
}
