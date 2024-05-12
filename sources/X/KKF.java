package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKF {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KKF)) {
            return false;
        }
        KKF kkf = (KKF) obj;
        return o.LJ(this.LIZ, kkf.LIZ) && this.LIZIZ == kkf.LIZIZ && o.LJ(this.LIZJ, kkf.LIZJ) && o.LJ(this.LIZLLL, kkf.LIZLLL) && o.LJ(this.LJ, kkf.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSearchResultMobData(imprId=");
        LIZ.append(this.LIZ);
        LIZ.append(", queryRank=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZJ);
        LIZ.append(", questionId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", groupId=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public KKF(String str, int i, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
