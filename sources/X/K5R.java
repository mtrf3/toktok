package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5R {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public SearchResultParam LJ;
    public String LJFF;
    public String LJI;

    public K5R() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K5R)) {
            return false;
        }
        K5R k5r = (K5R) obj;
        return this.LIZ == k5r.LIZ && this.LIZIZ == k5r.LIZIZ && this.LIZJ == k5r.LIZJ && this.LIZLLL == k5r.LIZLLL && o.LJ(this.LJ, k5r.LJ) && o.LJ(this.LJFF, k5r.LJFF) && o.LJ(this.LJI, k5r.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.LIZJ;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (((i3 + i4) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        SearchResultParam searchResultParam = this.LJ;
        int hashCode = (i5 + (searchResultParam == null ? 0 : searchResultParam.hashCode())) * 31;
        String str = this.LJFF;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecreateInfo(shouldRecreate=");
        LIZ.append(this.LIZ);
        LIZ.append(", shouldOpenResult=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shouldOpenSug=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shouldOpenSquare=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", recreateSearchResultParam=");
        LIZ.append(this.LJ);
        LIZ.append(", recreateSugKeyword=");
        LIZ.append(this.LJFF);
        LIZ.append(", recreateTab=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public K5R(int i) {
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }
}
