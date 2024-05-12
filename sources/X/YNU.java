package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YNU {
    public final long LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YNU)) {
            return false;
        }
        YNU ynu = (YNU) obj;
        return this.LIZ == ynu.LIZ && o.LJ(this.LIZIZ, ynu.LIZIZ) && o.LJ(this.LIZJ, ynu.LIZJ) && this.LIZLLL == ynu.LIZLLL && o.LJ(this.LJ, ynu.LJ);
    }

    public YNU() {
        this(0L, 0, 0, 0L, null);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        Integer num2 = this.LIZJ;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (i2 + hashCode2) * 31, 31);
        String str = this.LJ;
        if (str != null) {
            i = str.hashCode();
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SharePermissionEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", column_user_share_status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ttn_share_status=");
        LIZ.append(this.LIZJ);
        LIZ.append(", update_time=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public YNU(long j, Integer num, Integer num2, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = j2;
        this.LJ = str;
    }
}
