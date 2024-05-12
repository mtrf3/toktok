package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ZN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZN {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3ZN)) {
            return false;
        }
        C3ZN c3zn = (C3ZN) obj;
        return this.LIZ == c3zn.LIZ && o.LJ(this.LIZIZ, c3zn.LIZIZ) && o.LJ(this.LIZJ, c3zn.LIZJ) && o.LJ(this.LIZLLL, c3zn.LIZLLL) && o.LJ(this.LJ, c3zn.LJ) && o.LJ(this.LJFF, c3zn.LJFF) && o.LJ(this.LJI, c3zn.LJI) && o.LJ(this.LJII, c3zn.LJII) && this.LJIIIIZZ == c3zn.LJIIIIZZ && o.LJ(this.LJIIIZ, c3zn.LJIIIZ) && o.LJ(this.LJIIJ, c3zn.LJIIJ) && o.LJ(this.LJIIJJI, c3zn.LJIIJJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LIZLLL;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJ;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.LJFF;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num2 = this.LJI;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str5 = this.LJII;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJIIIIZZ, (i7 + hashCode7) * 31, 31);
        String str6 = this.LJIIIZ;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i8 = (LIZJ + hashCode8) * 31;
        String str7 = this.LJIIJ;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str8 = this.LJIIJJI;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IMUserBaseInfoEntity(uid=");
        sb.append(this.LIZ);
        sb.append(", avatar_thumb=");
        sb.append(this.LIZIZ);
        sb.append(", avatar_medium=");
        sb.append(this.LIZJ);
        sb.append(", nick_name=");
        sb.append(this.LIZLLL);
        sb.append(", unique_id=");
        sb.append(this.LJ);
        sb.append(", follow_status=");
        sb.append(this.LJFF);
        sb.append(", maf_status=");
        sb.append(this.LJI);
        sb.append(", rec_type=");
        sb.append(this.LJII);
        sb.append(", update_time=");
        sb.append(this.LJIIIIZZ);
        sb.append(", sort_weight=");
        sb.append(this.LJIIIZ);
        sb.append(", initial_letter=");
        sb.append(this.LJIIJ);
        sb.append(", extra=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    public C3ZN(long j, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, long j2, String str6, String str7, String str8) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = num;
        this.LJI = num2;
        this.LJII = str5;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
    }
}
