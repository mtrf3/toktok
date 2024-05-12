package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RWs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69690RWs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final RVG LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69690RWs)) {
            return false;
        }
        C69690RWs c69690RWs = (C69690RWs) obj;
        return o.LJ(this.LIZ, c69690RWs.LIZ) && o.LJ(this.LIZIZ, c69690RWs.LIZIZ) && o.LJ(this.LIZJ, c69690RWs.LIZJ) && o.LJ(this.LIZLLL, c69690RWs.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RVG rvg = this.LIZLLL;
        return hashCode3 + (rvg != null ? rvg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriceViewData(realPrice=");
        LIZ.append(this.LIZ);
        LIZ.append(", originalPrice=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", purchaseLimit=");
        LIZ.append(this.LIZJ);
        LIZ.append(", promotionActivityInfoModel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69690RWs(String str, String str2, String str3, RVG rvg) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = rvg;
    }
}
