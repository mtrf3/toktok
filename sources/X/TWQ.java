package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWQ {
    public final Integer LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public TWQ() {
        this(0, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TWQ)) {
            return false;
        }
        TWQ twq = (TWQ) obj;
        return o.LJ(this.LIZ, twq.LIZ) && this.LIZIZ == twq.LIZIZ && this.LIZJ == twq.LIZJ && this.LIZLLL == twq.LIZLLL && this.LJ == twq.LJ;
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
        return ((hashCode + i) * 31) + (this.LJ ? 1 : 0);
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
        LIZ.append(", isDirectlyApply=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public TWQ(int i, int i2, Integer num) {
        num = (i2 & 1) != 0 ? -1 : num;
        i = (i2 & 2) != 0 ? 0 : i;
        int i3 = (i2 & 4) == 0 ? 0 : -1;
        this.LIZ = num;
        this.LIZIZ = i;
        this.LIZJ = i3;
        this.LIZLLL = false;
        this.LJ = false;
    }
}
