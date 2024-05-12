package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mn8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57850Mn8 {
    public final List<InterfaceC57927MoN> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57850Mn8)) {
            return false;
        }
        C57850Mn8 c57850Mn8 = (C57850Mn8) obj;
        return o.LJ(this.LIZ, c57850Mn8.LIZ) && this.LIZIZ == c57850Mn8.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessContext(dataSize=");
        DIL.LIZIZ(this.LIZ, LIZ, ", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57850Mn8(List<? extends InterfaceC57927MoN> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }

    public static C57850Mn8 LIZ(C57850Mn8 c57850Mn8, List data) {
        boolean z = c57850Mn8.LIZIZ;
        o.LJIIIZ(data, "data");
        return new C57850Mn8(data, z);
    }
}
