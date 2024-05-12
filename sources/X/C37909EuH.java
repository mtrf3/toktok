package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EuH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37909EuH {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37909EuH)) {
            return false;
        }
        C37909EuH c37909EuH = (C37909EuH) obj;
        return o.LJ(this.LIZ, c37909EuH.LIZ) && o.LJ(this.LIZIZ, c37909EuH.LIZIZ) && o.LJ(this.LIZJ, c37909EuH.LIZJ) && o.LJ(this.LIZLLL, c37909EuH.LIZLLL) && o.LJ(this.LJ, c37909EuH.LJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isCDN: ");
        LIZ.append(this.LIZ);
        LIZ.append(", url: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", accessKey: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", channel: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bundle: ");
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }

    public C37909EuH(Boolean bool, String str, String str2, String str3, String str4) {
        this.LIZ = bool;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
