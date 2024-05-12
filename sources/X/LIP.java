package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LIP {
    public final String LIZ;
    public final boolean LIZIZ;
    public String LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LIP)) {
            return false;
        }
        LIP lip = (LIP) obj;
        return o.LJ(this.LIZ, lip.LIZ) && this.LIZIZ == lip.LIZIZ && o.LJ(this.LIZJ, lip.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LIZJ;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InsertAwemeIdsParam(insertIds=");
        LIZ.append(this.LIZ);
        LIZ.append(", insertAsc=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", insertRelations=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public LIP(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
