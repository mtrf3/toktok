package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RUz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69645RUz {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69645RUz)) {
            return false;
        }
        C69645RUz c69645RUz = (C69645RUz) obj;
        return o.LJ(this.LIZ, c69645RUz.LIZ) && o.LJ(this.LIZIZ, c69645RUz.LIZIZ) && o.LJ(this.LIZJ, c69645RUz.LIZJ) && o.LJ(this.LIZLLL, c69645RUz.LIZLLL) && o.LJ(this.LJ, c69645RUz.LJ) && o.LJ(this.LJFF, c69645RUz.LJFF) && o.LJ(this.LJI, c69645RUz.LJI);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJFF;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.LJI;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponViewVO(selected=");
        LIZ.append(this.LIZ);
        LIZ.append(", discountText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", thresholdText=");
        LIZ.append(this.LIZJ);
        LIZ.append(", validTimeText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", buttonText=");
        LIZ.append(this.LJ);
        LIZ.append(", promotionReductionType=");
        LIZ.append(this.LJFF);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C69645RUz(Boolean bool, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.LIZ = bool;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = num;
        this.LJI = str5;
    }
}
