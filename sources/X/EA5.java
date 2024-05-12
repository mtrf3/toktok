package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EA5 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EA5)) {
            return false;
        }
        EA5 ea5 = (EA5) obj;
        return o.LJ(this.LIZ, ea5.LIZ) && o.LJ(this.LIZIZ, ea5.LIZIZ) && this.LIZJ == ea5.LIZJ && o.LJ(this.LIZLLL, ea5.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31;
        String str3 = this.LIZLLL;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreRegionCodeAndName(countryCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", localizedCountryName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", userSelectedRegion=");
        LIZ.append(this.LIZJ);
        LIZ.append(", storeRegionSourceApi=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public EA5(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
