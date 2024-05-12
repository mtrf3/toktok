package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JP4 {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C50764Jw8<ClickSearchResponse> LIZLLL;
    public final boolean LJ;

    public JP4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JP4)) {
            return false;
        }
        JP4 jp4 = (JP4) obj;
        return this.LIZ == jp4.LIZ && o.LJ(this.LIZIZ, jp4.LIZIZ) && o.LJ(this.LIZJ, jp4.LIZJ) && o.LJ(this.LIZLLL, jp4.LIZLLL) && this.LJ == jp4.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C50764Jw8<ClickSearchResponse> c50764Jw8 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c50764Jw8 != null ? c50764Jw8.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickSearchData(awemeIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", aid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", query=");
        LIZ.append(this.LIZJ);
        LIZ.append(", result=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", useAnimation=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ JP4(int i) {
        this(-1, null, null, null, true);
    }

    public JP4(int i, String str, String str2, C50764Jw8<ClickSearchResponse> c50764Jw8, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c50764Jw8;
        this.LJ = z;
    }
}
