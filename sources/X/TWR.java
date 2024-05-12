package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWR {
    public final Integer LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;

    public TWR() {
        this(null, 0, 0, 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TWR)) {
            return false;
        }
        TWR twr = (TWR) obj;
        return o.LJ(this.LIZ, twr.LIZ) && this.LIZIZ == twr.LIZIZ && this.LIZJ == twr.LIZJ && this.LIZLLL == twr.LIZLLL && this.LJ == twr.LJ && this.LJFF == twr.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (((((num == null ? 0 : num.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.LJ) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuestApplyInfo(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", seiVersion=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZJ);
        LIZ.append(", followAnchor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", linkJoinType=");
        LIZ.append(this.LJ);
        LIZ.append(", isDirectlyApply=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public TWR(Integer num, int i, int i2, int i3, int i4) {
        num = (i4 & 1) != 0 ? -1 : num;
        i = (i4 & 2) != 0 ? 0 : i;
        i2 = (i4 & 4) != 0 ? -1 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        this.LIZ = num;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = false;
        this.LJ = i3;
        this.LJFF = false;
    }
}
