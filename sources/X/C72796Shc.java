package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Shc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72796Shc extends AbstractC72800Shg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72796Shc)) {
            return false;
        }
        C72796Shc c72796Shc = (C72796Shc) obj;
        return o.LJ(this.LIZ, c72796Shc.LIZ) && o.LJ(this.LIZIZ, c72796Shc.LIZIZ) && o.LJ(this.LIZJ, c72796Shc.LIZJ) && o.LJ(this.LIZLLL, c72796Shc.LIZLLL) && o.LJ(this.LJ, c72796Shc.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.LJ;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropSearch(enterMethod=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchKeyword=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", searchId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSuccess=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", duration=");
        return JBR.LJFF(LIZ, this.LJ, ")", LIZ);
    }

    public C72796Shc(String str, String searchKeyword, String str2, String str3, String duration) {
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(duration, "duration");
        this.LIZ = str;
        this.LIZIZ = searchKeyword;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = duration;
    }
}
