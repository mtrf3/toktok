package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3OH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OH {
    public final List<C3L4> LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3OH)) {
            return false;
        }
        C3OH c3oh = (C3OH) obj;
        return o.LJ(this.LIZ, c3oh.LIZ) && this.LIZIZ == c3oh.LIZIZ && this.LIZJ == c3oh.LIZJ && this.LIZLLL == c3oh.LIZLLL && this.LJ == c3oh.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionList:");
        DIL.LIZIZ(this.LIZ, LIZ, " hasMore:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" tabType:");
        LIZ.append(this.LIZJ);
        LIZ.append(" filterType:");
        LIZ.append(this.LIZLLL);
        LIZ.append(" state:");
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }

    public C3OH(boolean z, int i, int i2, int i3, List list) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
