package X;

/* renamed from: X.0cO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11280cO {
    public final long LIZ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GridItemSpan(packedValue=");
        LIZ.append(j);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C11280cO) || j != ((C11280cO) obj).LIZ) {
            return false;
        }
        return true;
    }
}
