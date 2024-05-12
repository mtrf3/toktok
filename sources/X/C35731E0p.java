package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E0p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35731E0p {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35731E0p)) {
            return false;
        }
        C35731E0p c35731E0p = (C35731E0p) obj;
        return o.LJ(this.LIZ, c35731E0p.LIZ) && o.LJ(this.LIZIZ, c35731E0p.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BidMatcher(bid=");
        LIZ.append(this.LIZ);
        LIZ.append(", source=");
        return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C35731E0p(String bid, String str) {
        o.LJIIJ(bid, "bid");
        this.LIZ = bid;
        this.LIZIZ = str;
    }
}
