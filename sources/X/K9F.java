package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9F {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final KAU LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K9F)) {
            return false;
        }
        K9F k9f = (K9F) obj;
        return o.LJ(this.LIZ, k9f.LIZ) && o.LJ(this.LIZIZ, k9f.LIZIZ) && o.LJ(this.LIZJ, k9f.LIZJ) && this.LIZLLL == k9f.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        KAU kau = this.LIZLLL;
        return hashCode3 + (kau != null ? kau.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSearchBarMutableData(lastSearchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", lastSearchType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lastSearchKeyword=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pageState=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public K9F(String str, String str2, String str3, KAU kau) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = kau;
    }
}
