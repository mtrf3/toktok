package X;

/* renamed from: X.FiO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39720FiO implements Comparable<C39720FiO> {
    public final String LJLIL;
    public final long LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnrEntry{stack='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', " stackCost=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLILLLLZI, '}', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C39720FiO c39720FiO) {
        long j = this.LJLILLLLZI;
        long j2 = c39720FiO.LJLILLLLZI;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public C39720FiO(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
