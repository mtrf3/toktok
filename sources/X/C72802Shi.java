package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Shi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72802Shi extends AbstractC72800Shg {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72802Shi)) {
            return false;
        }
        C72802Shi c72802Shi = (C72802Shi) obj;
        return this.LIZ == c72802Shi.LIZ && o.LJ(this.LIZIZ, c72802Shi.LIZIZ) && o.LJ(this.LIZJ, c72802Shi.LIZJ) && o.LJ(this.LIZLLL, c72802Shi.LIZLLL) && o.LJ(this.LJ, c72802Shi.LJ) && this.LJFF == c72802Shi.LJFF && o.LJ(this.LJI, c72802Shi.LJI);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJFF) * 31;
        String str5 = this.LJI;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropSearchSuccess(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorDesc=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", searchId=");
        LIZ.append(this.LJ);
        LIZ.append(", effectSize=");
        LIZ.append(this.LJFF);
        LIZ.append(", searchMethod=");
        return JBR.LJFF(LIZ, this.LJI, ")", LIZ);
    }

    public C72802Shi(int i, int i2, String str, String str2, String duration, String str3, String str4) {
        o.LJIIIZ(duration, "duration");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = duration;
        this.LJ = str3;
        this.LJFF = i2;
        this.LJI = str4;
    }
}
