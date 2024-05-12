package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RjK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70354RjK {
    public final Float LIZ;
    public final String LIZIZ;
    public final Float LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C70354RjK() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70354RjK)) {
            return false;
        }
        C70354RjK c70354RjK = (C70354RjK) obj;
        return o.LJ(this.LIZ, c70354RjK.LIZ) && o.LJ(this.LIZIZ, c70354RjK.LIZIZ) && o.LJ(this.LIZJ, c70354RjK.LIZJ) && o.LJ(this.LIZLLL, c70354RjK.LIZLLL) && o.LJ(this.LJ, c70354RjK.LJ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuPriceInfoVO(originPrice=");
        LIZ.append(this.LIZ);
        LIZ.append(", originPriceStr=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", salePrice=");
        LIZ.append(this.LIZJ);
        LIZ.append(", salePriceStr=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", currency=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C70354RjK(Float f, String str, Float f2, String str2, String str3) {
        this.LIZ = f;
        this.LIZIZ = str;
        this.LIZJ = f2;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
