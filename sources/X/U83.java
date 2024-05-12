package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U83 {
    public final U85 LIZ;
    public final long LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U83)) {
            return false;
        }
        U83 u83 = (U83) obj;
        return this.LIZ == u83.LIZ && this.LIZIZ == u83.LIZIZ && o.LJ(this.LIZJ, u83.LIZJ) && o.LJ(this.LIZLLL, u83.LIZLLL) && o.LJ(this.LJ, u83.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Long l = this.LIZJ;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkLayerAppLogInfo(roleType=");
        LIZ.append(this.LIZ);
        LIZ.append(", requestTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", currentLinkMicId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", remoteLinkMicId=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public U83(U85 roleType, long j, Long l, String str, String str2) {
        o.LJIIIZ(roleType, "roleType");
        this.LIZ = roleType;
        this.LIZIZ = j;
        this.LIZJ = l;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
