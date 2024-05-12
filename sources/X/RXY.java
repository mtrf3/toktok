package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RXY)) {
            return false;
        }
        RXY rxy = (RXY) obj;
        return o.LJ(this.LIZ, rxy.LIZ) && o.LJ(this.LIZIZ, rxy.LIZIZ) && o.LJ(this.LIZJ, rxy.LIZJ) && this.LIZLLL == rxy.LIZLLL && o.LJ(this.LJ, rxy.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str4 = this.LJ;
        return i2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriceInfoWithCurrency(originPrice=");
        LIZ.append(this.LIZ);
        LIZ.append(", availablePrice=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", currency=");
        LIZ.append(this.LIZJ);
        LIZ.append(", currencyShowLeft=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", pricePrefix=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public RXY(String str, String str2, String str3, boolean z, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = str4;
    }
}
