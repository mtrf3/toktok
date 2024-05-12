package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3QL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QL {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3QL)) {
            return false;
        }
        C3QL c3ql = (C3QL) obj;
        return this.LIZ == c3ql.LIZ && o.LJ(this.LIZIZ, c3ql.LIZIZ) && this.LIZJ == c3ql.LIZJ && o.LJ(this.LIZLLL, c3ql.LIZLLL) && this.LJ == c3ql.LJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJ) + C79062V1e.LJ(this.LIZLLL, (C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31) + this.LIZJ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("business ");
        LIZ.append(this.LIZ);
        LIZ.append(' ');
        LIZ.append(this.LIZIZ);
        LIZ.append(" content ");
        LIZ.append(this.LIZJ);
        LIZ.append(' ');
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public C3QL(int i, long j, String businessID, int i2, String searchContent) {
        o.LJIIIZ(businessID, "businessID");
        o.LJIIIZ(searchContent, "searchContent");
        this.LIZ = i;
        this.LIZIZ = businessID;
        this.LIZJ = i2;
        this.LIZLLL = searchContent;
        this.LJ = j;
    }
}
