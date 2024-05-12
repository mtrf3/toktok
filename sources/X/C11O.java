package X;

/* renamed from: X.11O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11O {
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static String LIZIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PointerId(value=");
        LIZ.append(j);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        return LIZIZ(this.LIZ);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public /* synthetic */ C11O(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C11O) || j != ((C11O) obj).LIZ) {
            return false;
        }
        return true;
    }
}
