package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9zB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254739zB {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254739zB)) {
            return false;
        }
        C254739zB c254739zB = (C254739zB) obj;
        return o.LJ(this.LIZ, c254739zB.LIZ) && o.LJ(this.LIZIZ, c254739zB.LIZIZ) && o.LJ(this.LIZJ, c254739zB.LIZJ) && o.LJ(this.LIZLLL, c254739zB.LIZLLL) && o.LJ(this.LJ, c254739zB.LJ) && this.LJFF == c254739zB.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode3 + hashCode) * 31, 31);
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        String str3 = this.LJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LJFF;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PricesWithCurrency(priceIapId=");
        LIZ.append(this.LIZ);
        LIZ.append(", discountedPriceIapId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", price=");
        LIZ.append(this.LIZJ);
        LIZ.append(", discountedPrice=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", discount=");
        LIZ.append(this.LJ);
        LIZ.append(", isLoading=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C254739zB(String priceIapId, String str, String price, String str2, String str3, boolean z) {
        o.LJIIIZ(priceIapId, "priceIapId");
        o.LJIIIZ(price, "price");
        this.LIZ = priceIapId;
        this.LIZIZ = str;
        this.LIZJ = price;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
    }
}
