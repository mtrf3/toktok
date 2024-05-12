package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Dw7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35475Dw7 {
    public final String LIZ;
    public final List<C54705LdV> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35475Dw7)) {
            return false;
        }
        C35475Dw7 c35475Dw7 = (C35475Dw7) obj;
        return o.LJ(this.LIZ, c35475Dw7.LIZ) && o.LJ(this.LIZIZ, c35475Dw7.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<C54705LdV> list = this.LIZIZ;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExploreData(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", skylightItemList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35475Dw7(String str, List<C54705LdV> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
