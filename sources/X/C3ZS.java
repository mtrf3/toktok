package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ZS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZS {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final String LJII;
    public final long LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3ZS)) {
            return false;
        }
        C3ZS c3zs = (C3ZS) obj;
        return this.LIZ == c3zs.LIZ && o.LJ(this.LIZIZ, c3zs.LIZIZ) && o.LJ(this.LIZJ, c3zs.LIZJ) && o.LJ(this.LIZLLL, c3zs.LIZLLL) && o.LJ(this.LJ, c3zs.LJ) && o.LJ(this.LJFF, c3zs.LJFF) && o.LJ(this.LJI, c3zs.LJI) && o.LJ(this.LJII, c3zs.LJII) && this.LJIIIIZZ == c3zs.LJIIIIZZ;
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.LIZIZ;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJFF;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJI;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.LJII;
        return C16880lQ.LLJIJIL(this.LJIIIIZZ) + ((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMUserBaseInfoUpdateEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", avatar_thumb=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avatar_medium=");
        LIZ.append(this.LIZJ);
        LIZ.append(", nick_name=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", unique_id=");
        LIZ.append(this.LJ);
        LIZ.append(", follow_status=");
        LIZ.append(this.LJFF);
        LIZ.append(", maf_status=");
        LIZ.append(this.LJI);
        LIZ.append(", rec_type=");
        LIZ.append(this.LJII);
        LIZ.append(", update_time=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C3ZS(long j, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, long j2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = num;
        this.LJI = num2;
        this.LJII = str5;
        this.LJIIIIZZ = j2;
    }
}
