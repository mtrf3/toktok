package X;

/* renamed from: X.NBl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58945NBl extends AbstractC58939NBf {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58945NBl) && this.LIZ == ((C58945NBl) obj).LIZ;
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
        LIZ.append("MaskVisibilityChanged(isVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C58945NBl(boolean z) {
        this.LIZ = z;
    }
}
