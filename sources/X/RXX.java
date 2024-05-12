package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXX {
    public final Float LIZ;
    public final Float LIZIZ;
    public final String LIZJ;

    public RXX() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RXX)) {
            return false;
        }
        RXX rxx = (RXX) obj;
        return o.LJ(this.LIZ, rxx.LIZ) && o.LJ(this.LIZIZ, rxx.LIZIZ) && o.LJ(this.LIZJ, rxx.LIZJ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.LIZIZ;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.LIZJ;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuPriceDaInfoVO(salePrice=");
        LIZ.append(this.LIZ);
        LIZ.append(", originalPrice=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", currency=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public RXX(Float f, Float f2, String str) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = str;
    }
}
