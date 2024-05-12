package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ETC {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public ETC() {
        this(0, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETC)) {
            return false;
        }
        ETC etc = (ETC) obj;
        return this.LIZ == etc.LIZ && o.LJ(this.LIZIZ, etc.LIZIZ) && o.LJ(this.LIZJ, etc.LIZJ) && o.LJ(this.LIZLLL, etc.LIZLLL) && this.LJ == etc.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IBEMobEventBean(awemeIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", aid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pullType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", coldBoot=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public ETC(int i, String str, Integer num, String str2, boolean z, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        num = (i2 & 4) != 0 ? null : num;
        str2 = (i2 & 8) != 0 ? null : str2;
        z = (i2 & 16) != 0 ? false : z;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
