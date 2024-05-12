package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FPe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38918FPe implements Comparable<C38918FPe> {
    public final String LJLIL;
    public final OJD LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38918FPe)) {
            return false;
        }
        C38918FPe c38918FPe = (C38918FPe) obj;
        return o.LJ(this.LJLIL, c38918FPe.LJLIL) && o.LJ(this.LJLILLLLZI, c38918FPe.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        OJD ojd = this.LJLILLLLZI;
        return hashCode + (ojd != null ? ojd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(": [");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C38918FPe c38918FPe) {
        C38918FPe other = c38918FPe;
        o.LJIIJ(other, "other");
        return other.LJLILLLLZI.getPattern().length() - this.LJLILLLLZI.getPattern().length();
    }

    public C38918FPe(String bid, OJD ojd) {
        o.LJIIJ(bid, "bid");
        this.LJLIL = bid;
        this.LJLILLLLZI = ojd;
    }
}
