package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDD {
    public String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public NDD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NDD)) {
            return false;
        }
        NDD ndd = (NDD) obj;
        return o.LJ(this.LIZ, ndd.LIZ) && this.LIZIZ == ndd.LIZIZ && o.LJ(this.LIZJ, ndd.LIZJ) && this.LIZLLL == ndd.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode + i2) * 31, 31);
        if (!this.LIZLLL) {
            i = 0;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenUrlData(openUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", forbiddenOpen3rdApp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", backUrlTag=");
        LIZ.append(this.LIZJ);
        LIZ.append(", useAdxDeepLink=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public NDD(int i) {
        this.LIZ = "";
        this.LIZIZ = false;
        this.LIZJ = "";
        this.LIZLLL = false;
    }
}
