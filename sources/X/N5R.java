package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5R {
    public String LIZ;
    public Object LIZIZ;
    public final String LIZJ;

    public N5R() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N5R)) {
            return false;
        }
        N5R n5r = (N5R) obj;
        return o.LJ(this.LIZ, n5r.LIZ) && o.LJ(this.LIZIZ, n5r.LIZIZ) && o.LJ(this.LIZJ, n5r.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MiniAppData(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", extraParams=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", openFrom=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public N5R(int i) {
        this.LIZ = "";
        this.LIZIZ = null;
        this.LIZJ = "";
    }
}
