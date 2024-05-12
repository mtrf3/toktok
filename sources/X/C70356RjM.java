package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RjM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70356RjM {
    public final Float LIZ;
    public final Float LIZIZ;
    public final Float LIZJ;
    public final String LIZLLL;
    public final Float LJ;
    public final Float LJFF;

    public C70356RjM() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70356RjM)) {
            return false;
        }
        C70356RjM c70356RjM = (C70356RjM) obj;
        return o.LJ(this.LIZ, c70356RjM.LIZ) && o.LJ(this.LIZIZ, c70356RjM.LIZIZ) && o.LJ(this.LIZJ, c70356RjM.LIZJ) && o.LJ(this.LIZLLL, c70356RjM.LIZLLL) && o.LJ(this.LJ, c70356RjM.LJ) && o.LJ(this.LJFF, c70356RjM.LJFF);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.LIZIZ;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Float f4 = this.LJ;
        int hashCode5 = (hashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.LJFF;
        return hashCode5 + (f5 != null ? f5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SummaryPriceInfoVO(totalPayment=");
        LIZ.append(this.LIZ);
        LIZ.append(", discountedAmount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", totalTax=");
        LIZ.append(this.LIZJ);
        LIZ.append(", summaryInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shippingPrice=");
        LIZ.append(this.LJ);
        LIZ.append(", shippingPriceAfterCoupon=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C70356RjM(Float f, Float f2, Float f3, String str, Float f4, Float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = str;
        this.LJ = f4;
        this.LJFF = f5;
    }
}
