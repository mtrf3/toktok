package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AbV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26553AbV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26553AbV() {
        /*
            r7 = this;
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26553AbV.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26553AbV)) {
            return false;
        }
        C26553AbV c26553AbV = (C26553AbV) obj;
        return o.LJ(this.LIZ, c26553AbV.LIZ) && o.LJ(this.LIZIZ, c26553AbV.LIZIZ) && o.LJ(this.LIZJ, c26553AbV.LIZJ) && o.LJ(this.LIZLLL, c26553AbV.LIZLLL) && o.LJ(this.LJ, c26553AbV.LJ) && o.LJ(this.LJFF, c26553AbV.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.LJ;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJFF;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingVO(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", deliveryName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shippingFee=");
        LIZ.append(this.LIZJ);
        LIZ.append(", arrivalText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", freeShipping=");
        LIZ.append(this.LJ);
        LIZ.append(", hasValidLogistic=");
        return C78920UyC.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C26553AbV(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = bool;
        this.LJFF = bool2;
    }
}
