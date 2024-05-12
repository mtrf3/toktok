package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JdK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49598JdK {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49598JdK)) {
            return false;
        }
        C49598JdK c49598JdK = (C49598JdK) obj;
        return o.LJ(this.LIZ, c49598JdK.LIZ) && o.LJ(this.LIZIZ, c49598JdK.LIZIZ) && o.LJ(this.LIZJ, c49598JdK.LIZJ) && this.LIZLLL == c49598JdK.LIZLLL && this.LJ == c49598JdK.LJ && o.LJ(this.LJFF, c49598JdK.LJFF) && o.LJ(this.LJI, c49598JdK.LJI) && this.LJII == c49598JdK.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (hashCode3 + hashCode) * 31, 31), 31);
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZJ + i2) * 31;
        String str = this.LJFF;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.LJI;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJII) + ((i4 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchVideoParams(event=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fromSearchResult=");
        LIZ.append(this.LJ);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJFF);
        LIZ.append(", previousPagePosition=");
        LIZ.append(this.LJI);
        LIZ.append(", rank=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C49598JdK(String str, Aweme aweme, String enterFrom, long j, boolean z, String str2, String str3, long j2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = enterFrom;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = j2;
    }
}
