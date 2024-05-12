package X;

/* loaded from: classes14.dex */
public final class V71 extends V7I {
    public final boolean LIZ;
    public final boolean LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V71() {
        /*
            r2 = this;
            r1 = 3
            r0 = 0
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V71.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V71)) {
            return false;
        }
        V71 v71 = (V71) obj;
        return this.LIZ == v71.LIZ && this.LIZIZ == v71.LIZIZ;
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
        LIZ.append("Success(nextHasMore=");
        LIZ.append(this.LIZ);
        LIZ.append(", prevHasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public V71(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public /* synthetic */ V71(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
