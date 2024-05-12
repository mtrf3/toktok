package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3O {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3O)) {
            return false;
        }
        K3O k3o = (K3O) obj;
        return o.LJ(this.LIZ, k3o.LIZ) && o.LJ(this.LIZIZ, k3o.LIZIZ) && o.LJ(this.LIZJ, k3o.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectContextMeta(searchId=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchResultId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", listItemId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public K3O(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
