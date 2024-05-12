package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ST8 {
    public final STF LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final ST6 LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ST8)) {
            return false;
        }
        ST8 st8 = (ST8) obj;
        return this.LIZ == st8.LIZ && this.LIZIZ == st8.LIZIZ && o.LJ(this.LIZJ, st8.LIZJ) && o.LJ(this.LIZLLL, st8.LIZLLL) && o.LJ(this.LJ, st8.LJ) && o.LJ(this.LJFF, st8.LJFF) && o.LJ(this.LJI, st8.LJI) && o.LJ(this.LJII, st8.LJII) && o.LJ(this.LJIIIIZZ, st8.LJIIIIZZ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        ST6 st6 = this.LJI;
        int hashCode6 = (hashCode5 + (st6 == null ? 0 : st6.hashCode())) * 31;
        String str4 = this.LJII;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.LJIIIIZZ;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ processCode: ");
        LIZ.append(this.LIZ);
        LIZ.append(" \n statusCode: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" \n statusMsg: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" \n percentage: ");
        LIZ.append(this.LJFF);
        LIZ.append(" \n result: ");
        LIZ.append(this.LJI);
        LIZ.append(" \n jobType: ");
        return JBR.LJFF(LIZ, this.LJII, " }", LIZ);
    }

    public ST8(STF processCode, int i, String str, String str2, String str3, Integer num, ST6 st6, String str4, Integer num2, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        str = (i2 & 4) != 0 ? null : str;
        str2 = (i2 & 8) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        num = (i2 & 32) != 0 ? null : num;
        st6 = (i2 & 64) != 0 ? null : st6;
        str4 = (i2 & 128) != 0 ? null : str4;
        num2 = (i2 & 256) != 0 ? null : num2;
        o.LJIIIZ(processCode, "processCode");
        this.LIZ = processCode;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = st6;
        this.LJII = str4;
        this.LJIIIIZZ = num2;
    }
}
