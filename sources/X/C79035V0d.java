package X;

/* renamed from: X.V0d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79035V0d {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextSizeRange(min=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZ));
        LIZ.append(", max=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZIZ));
        LIZ.append(", mid=");
        LIZ.append((Object) C23520w8.LIZLLL(this.LIZJ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79035V0d)) {
            return false;
        }
        C79035V0d c79035V0d = (C79035V0d) obj;
        if (C23520w8.LIZ(this.LIZ, c79035V0d.LIZ) && C23520w8.LIZ(this.LIZIZ, c79035V0d.LIZIZ) && C23520w8.LIZ(this.LIZJ, c79035V0d.LIZJ)) {
            return true;
        }
        return false;
    }

    public C79035V0d(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }

    public static C79035V0d LIZ(C79035V0d c79035V0d, long j, long j2, long j3, int i) {
        long j4 = j3;
        long j5 = j;
        long j6 = j2;
        if ((i & 1) != 0) {
            j5 = c79035V0d.LIZ;
        }
        if ((i & 2) != 0) {
            j6 = c79035V0d.LIZIZ;
        }
        if ((i & 4) != 0) {
            j4 = c79035V0d.LIZJ;
        }
        return new C79035V0d(j5, j6, j4);
    }
}
