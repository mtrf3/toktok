package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105534Cf {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;

    public C105534Cf() {
        this(0, 0, 31, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105534Cf)) {
            return false;
        }
        C105534Cf c105534Cf = (C105534Cf) obj;
        return this.LIZ == c105534Cf.LIZ && this.LIZIZ == c105534Cf.LIZIZ && this.LIZJ == c105534Cf.LIZJ && o.LJ(this.LIZLLL, c105534Cf.LIZLLL) && this.LJ == c105534Cf.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        return ((i + (num == null ? 0 : num.hashCode())) * 31) + (this.LJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GridPageParams(autoMatchWidth=");
        LIZ.append(this.LIZ);
        LIZ.append(", marginStartAndEnd=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", minSpaceWidth=");
        LIZ.append(this.LIZJ);
        LIZ.append(", itemWidth=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", forceAdaptParentWidth=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C105534Cf(int i, int i2, int i3, Integer num, boolean z, boolean z2) {
        z = (i3 & 1) != 0 ? false : z;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        num = (i3 & 8) != 0 ? null : num;
        z2 = (i3 & 16) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = num;
        this.LJ = z2;
    }
}
