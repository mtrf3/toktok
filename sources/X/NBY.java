package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBY {
    public final boolean LIZ;
    public final EnumC58698N1y LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public NBY() {
        this(null, false, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NBY)) {
            return false;
        }
        NBY nby = (NBY) obj;
        return this.LIZ == nby.LIZ && this.LIZIZ == nby.LIZIZ && o.LJ(this.LIZJ, nby.LIZJ) && this.LIZLLL == nby.LIZLLL && this.LJ == nby.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LIZIZ.hashCode() + (r0 * 31)) * 31;
        Integer num = this.LIZJ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ?? r02 = this.LIZLLL;
        int i = r02;
        if (r02 != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.LJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StaticImpressionConfig(useSync=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", customPiv=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isDebugMode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enableCacheIdMap=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public NBY(EnumC58698N1y type, boolean z, boolean z2, int i) {
        Integer num;
        type = (i & 2) != 0 ? EnumC58698N1y.USE_ONE_PIV : type;
        if ((i & 4) != 0) {
            num = 1;
        } else {
            num = null;
        }
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        o.LJIIIZ(type, "type");
        this.LIZ = false;
        this.LIZIZ = type;
        this.LIZJ = num;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
