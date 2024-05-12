package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTD)) {
            return false;
        }
        OTD otd = (OTD) obj;
        return o.LJ(this.LIZ, otd.LIZ) && o.LJ(this.LIZIZ, otd.LIZIZ) && o.LJ(this.LIZJ, otd.LIZJ) && o.LJ(this.LIZLLL, otd.LIZLLL) && o.LJ(this.LJ, otd.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthExtraRequestParams(sdkName=");
        LIZ.append(this.LIZ);
        LIZ.append(", responseType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZJ);
        LIZ.append(", codeChallenge=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", redirectUri=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public OTD(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
