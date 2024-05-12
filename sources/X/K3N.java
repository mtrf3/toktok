package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3N {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3N)) {
            return false;
        }
        K3N k3n = (K3N) obj;
        return o.LJ(this.LIZ, k3n.LIZ) && o.LJ(this.LIZIZ, k3n.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectExtraInfo(searchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", docId=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public K3N(String searchId, String str) {
        o.LJIIIZ(searchId, "searchId");
        this.LIZ = searchId;
        this.LIZIZ = str;
    }
}
