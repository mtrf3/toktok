package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCI {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TCI)) {
            return false;
        }
        TCI tci = (TCI) obj;
        return o.LJ(this.LIZ, tci.LIZ) && o.LJ(this.LIZIZ, tci.LIZIZ) && this.LIZJ == tci.LIZJ && this.LIZLLL == tci.LIZLLL && this.LJ == tci.LJ && this.LJFF == tci.LJFF && this.LJI == tci.LJI && o.LJ(this.LJII, tci.LJII) && o.LJ(this.LJIIIIZZ, tci.LJIIIIZZ) && this.LJIIIZ == tci.LJIIIZ;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = (((((((JBR.LIZJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31;
        String str = this.LJII;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i2 + i) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowRelationQueryParam(userId=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", maxTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", count=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", offset=");
        LIZ.append(this.LJ);
        LIZ.append(", sourceType=");
        LIZ.append(this.LJFF);
        LIZ.append(", addressBookAccess=");
        LIZ.append(this.LJI);
        LIZ.append(", pageToken=");
        LIZ.append(this.LJII);
        LIZ.append(", targetUserIds=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", liveSortBy=");
        return b0.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public TCI(int i, int i2, int i3, int i4, long j, String userId, String secUserId, String str, String str2) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        this.LIZ = userId;
        this.LIZIZ = secUserId;
        this.LIZJ = j;
        this.LIZLLL = 20;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = i4;
    }
}
