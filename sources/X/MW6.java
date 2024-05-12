package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MW6 implements Comparable<MW6> {
    public final String LJLIL;
    public int LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MW6)) {
            return false;
        }
        MW6 mw6 = (MW6) obj;
        return o.LJ(this.LJLIL, mw6.LJLIL) && this.LJLILLLLZI == mw6.LJLILLLLZI;
    }

    public final int hashCode() {
        return (this.LJLIL.hashCode() * 31) + this.LJLILLLLZI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AidPosInfo(aid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", minPosition=");
        return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public MW6(String aid) {
        o.LJIIIZ(aid, "aid");
        this.LJLIL = aid;
        this.LJLILLLLZI = Integer.MAX_VALUE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(MW6 mw6) {
        MW6 other = mw6;
        o.LJIIIZ(other, "other");
        return this.LJLILLLLZI - other.LJLILLLLZI;
    }
}
