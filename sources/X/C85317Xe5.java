package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Xe5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85317Xe5 {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public C85317Xe5() {
        this(0, null, null, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85317Xe5)) {
            return false;
        }
        C85317Xe5 c85317Xe5 = (C85317Xe5) obj;
        return this.LIZ == c85317Xe5.LIZ && o.LJ(this.LIZIZ, c85317Xe5.LIZIZ) && o.LJ(this.LIZJ, c85317Xe5.LIZJ) && this.LIZLLL == c85317Xe5.LIZLLL && o.LJ(this.LJ, c85317Xe5.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (i3 + hashCode2) * 31, 31);
        String str3 = this.LJ;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return LIZJ + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Extras(pageOrder=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keyWord=");
        LIZ.append(this.LIZJ);
        LIZ.append(", searchSessionId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", index=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C85317Xe5(int i, String str, String str2, long j, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = str3;
    }
}
