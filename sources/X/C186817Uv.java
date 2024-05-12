package X;

/* renamed from: X.7Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186817Uv {
    public final boolean LIZ;

    public C186817Uv() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C186817Uv) && this.LIZ == ((C186817Uv) obj).LIZ;
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
        LIZ.append("PoiReviewCellConfig(canDelete=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C186817Uv(boolean z) {
        this.LIZ = z;
    }
}
