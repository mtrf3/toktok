package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RcQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69926RcQ {
    public final java.util.Map<String, RYM> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69926RcQ)) {
            return false;
        }
        C69926RcQ c69926RcQ = (C69926RcQ) obj;
        return o.LJ(this.LIZ, c69926RcQ.LIZ) && this.LIZIZ == c69926RcQ.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        java.util.Map<String, RYM> map = this.LIZ;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyTogetherState(feedStates=");
        LIZ.append(this.LIZ);
        LIZ.append(", loading=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C69926RcQ(java.util.Map<String, RYM> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }
}
