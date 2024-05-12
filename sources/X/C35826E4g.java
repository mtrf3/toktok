package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.E4g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35826E4g {
    public final String LIZ;
    public final String[] LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35826E4g)) {
            return false;
        }
        C35826E4g c35826E4g = (C35826E4g) obj;
        return o.LJ(this.LIZ, c35826E4g.LIZ) && o.LJ(this.LIZIZ, c35826E4g.LIZIZ) && o.LJ(this.LIZJ, c35826E4g.LIZJ) && o.LJ(this.LIZLLL, c35826E4g.LIZLLL) && o.LJ(this.LJ, c35826E4g.LJ) && this.LJFF == c35826E4g.LJFF && this.LJI == c35826E4g.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String[] strArr = this.LIZIZ;
        int hashCode2 = (hashCode + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        return C16880lQ.LLJIJIL(this.LJI) + ((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJFF) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SnapshotEntity(uri='");
        LIZ.append(this.LIZ);
        LIZ.append("', queryKeys='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', content='");
        LIZ.append(this.LIZJ);
        LIZ.append("', head='");
        LIZ.append(this.LIZLLL);
        LIZ.append("', version=");
        LIZ.append(this.LJ);
        LIZ.append(", sdk=");
        LIZ.append(this.LJFF);
        LIZ.append(", expireTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C35826E4g(String urlWithQuery, String[] strArr, String str, String str2, String str3, int i, long j) {
        o.LJIIJ(urlWithQuery, "urlWithQuery");
        this.LIZ = urlWithQuery;
        this.LIZIZ = strArr;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = j;
    }
}
