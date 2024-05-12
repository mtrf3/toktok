package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8G {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M8G)) {
            return false;
        }
        M8G m8g = (M8G) obj;
        return o.LJ(this.LIZ, m8g.LIZ) && o.LJ(this.LIZIZ, m8g.LIZIZ) && this.LIZJ == m8g.LIZJ && this.LIZLLL == m8g.LIZLLL && this.LJ == m8g.LJ && o.LJ(this.LJFF, m8g.LJFF) && this.LJI == m8g.LJI && o.LJ(this.LJII, m8g.LJII) && o.LJ(this.LJIIIIZZ, m8g.LJIIIIZZ) && o.LJ(this.LJIIIZ, m8g.LJIIIZ) && o.LJ(this.LJIIJ, m8g.LJIIJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = (((((C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((LJ + hashCode) * 31) + this.LJI) * 31;
        String str2 = this.LJII;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJIIIIZZ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJIIIZ;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.LJIIJ;
        if (num != null) {
            i = num.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRequestParam(userId=");
        sb.append(this.LIZ);
        sb.append(", secUserId=");
        sb.append(this.LIZIZ);
        sb.append(", type=");
        sb.append(this.LIZJ);
        sb.append(", channelId=");
        sb.append(this.LIZLLL);
        sb.append(", from=");
        sb.append(this.LJ);
        sb.append(", itemId=");
        sb.append(this.LJFF);
        sb.append(", fromPreviousPage=");
        sb.append(this.LJI);
        sb.append(", recType=");
        sb.append(this.LJII);
        sb.append(", videoLinkId=");
        sb.append(this.LJIIIIZZ);
        sb.append(", videoItemId=");
        sb.append(this.LJIIIZ);
        sb.append(", linkSharer=");
        return UC7.LIZ(sb, this.LJIIJ, ')');
    }

    public M8G(String userId, String secUserId, int i, int i2, int i3, String str, int i4, String str2, String str3, String str4, Integer num) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        this.LIZ = userId;
        this.LIZIZ = secUserId;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = str;
        this.LJI = i4;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = num;
    }
}
