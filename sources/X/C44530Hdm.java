package X;

/* renamed from: X.Hdm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44530Hdm {
    public final boolean LIZ;

    public C44530Hdm() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44530Hdm) && this.LIZ == ((C44530Hdm) obj).LIZ;
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
        LIZ.append("Switches(openHD=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C44530Hdm(boolean z) {
        this.LIZ = z;
    }
}
