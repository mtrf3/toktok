package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3M {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3M)) {
            return false;
        }
        K3M k3m = (K3M) obj;
        return o.LJ(this.LIZ, k3m.LIZ) && o.LJ(this.LIZIZ, k3m.LIZIZ) && o.LJ(this.LIZJ, k3m.LIZJ) && this.LIZLLL == k3m.LIZLLL && o.LJ(this.LJ, k3m.LJ) && o.LJ(this.LJFF, k3m.LJFF) && o.LJ(this.LJI, k3m.LJI) && o.LJ(this.LJII, k3m.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LIZLLL) * 31;
        String str4 = this.LJ;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJI;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJII;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEffectMobParam(searchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", propId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", docId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", creationId=");
        LIZ.append(this.LJ);
        LIZ.append(", searchMethod=");
        LIZ.append(this.LJFF);
        LIZ.append(", propPageEnterFrom=");
        LIZ.append(this.LJI);
        LIZ.append(", propPageEnterMethod=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public K3M(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
    }
}
