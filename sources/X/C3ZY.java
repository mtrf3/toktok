package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.3ZY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZY {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3ZY)) {
            return false;
        }
        C3ZY c3zy = (C3ZY) obj;
        return o.LJ(this.LIZ, c3zy.LIZ) && o.LJ(this.LIZIZ, c3zy.LIZIZ) && o.LJ(this.LIZJ, c3zy.LIZJ) && this.LIZLLL == c3zy.LIZLLL && o.LJ(this.LJ, c3zy.LJ) && o.LJ(this.LJFF, c3zy.LJFF) && o.LJ(this.LJI, c3zy.LJI);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJI;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMContactUpdateEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", nick_name=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", unique_id=");
        LIZ.append(this.LIZJ);
        LIZ.append(", follow_status=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatar_thumb=");
        LIZ.append(this.LJ);
        LIZ.append(", avatar_medium=");
        LIZ.append(this.LJFF);
        LIZ.append(", column_user_share_status=");
        return s0.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C3ZY(String str, String str2, int i, Integer num, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = num;
    }
}
