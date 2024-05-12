package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N3T {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N3T)) {
            return false;
        }
        N3T n3t = (N3T) obj;
        return o.LJ(this.LIZ, n3t.LIZ) && o.LJ(this.LIZIZ, n3t.LIZIZ) && o.LJ(this.LIZJ, n3t.LIZJ) && o.LJ(this.LIZLLL, n3t.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECBizSceneModel(ecBizScene=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", module=");
        LIZ.append(this.LIZJ);
        LIZ.append(", ecBizClz=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public N3T(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
