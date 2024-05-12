package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.N2i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58708N2i {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58708N2i)) {
            return false;
        }
        C58708N2i c58708N2i = (C58708N2i) obj;
        return o.LJ(this.LIZ, c58708N2i.LIZ) && o.LJ(this.LIZIZ, c58708N2i.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TargetAPIFilter(dataType=");
        LIZ.append(this.LIZ);
        LIZ.append(", entryToken=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C58708N2i(String dataType, List<String> list) {
        o.LJIIIZ(dataType, "dataType");
        this.LIZ = dataType;
        this.LIZIZ = list;
    }
}
