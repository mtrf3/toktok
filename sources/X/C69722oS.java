package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69722oS {
    public final java.util.Map<String, C69802oa> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69722oS)) {
            return false;
        }
        C69722oS c69722oS = (C69722oS) obj;
        return o.LJ(this.LIZ, c69722oS.LIZ) && o.LJ(this.LIZIZ, c69722oS.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueryResult(successIds=");
        LIZ.append(this.LIZ);
        LIZ.append(", failedIds=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C69722oS(java.util.Map<String, C69802oa> map, List<String> list) {
        this.LIZ = map;
        this.LIZIZ = list;
    }
}
