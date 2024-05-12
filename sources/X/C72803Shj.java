package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Shj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72803Shj extends AbstractC72800Shg {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72803Shj)) {
            return false;
        }
        C72803Shj c72803Shj = (C72803Shj) obj;
        return this.LIZ == c72803Shj.LIZ && o.LJ(this.LIZIZ, c72803Shj.LIZIZ) && o.LJ(this.LIZJ, c72803Shj.LIZJ) && o.LJ(this.LIZLLL, c72803Shj.LIZLLL) && this.LJ == c72803Shj.LJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropSearchRecommendList(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorDesc=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", listCount=");
        return C08380Uo.LIZ(LIZ, this.LJ, ")", LIZ);
    }

    public C72803Shj(int i, String str, String str2, String duration, int i2) {
        o.LJIIIZ(duration, "duration");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = duration;
        this.LJ = i2;
    }
}
