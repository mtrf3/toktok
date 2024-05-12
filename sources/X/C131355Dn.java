package X;

/* renamed from: X.5Dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131355Dn implements InterfaceC131465Dy {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C131355Dn) && this.LIZ == ((C131355Dn) obj).LIZ;
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
        LIZ.append("Refresh(onlyRefreshFile=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C131355Dn(boolean z) {
        this.LIZ = z;
    }
}
