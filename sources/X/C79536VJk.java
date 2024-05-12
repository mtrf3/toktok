package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VJk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79536VJk {
    public final EnumC85314Xe2 LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79536VJk)) {
            return false;
        }
        C79536VJk c79536VJk = (C79536VJk) obj;
        return this.LIZ == c79536VJk.LIZ && o.LJ(this.LIZIZ, c79536VJk.LIZIZ) && this.LIZJ == c79536VJk.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiOperation(poiOperationType=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C79536VJk(EnumC85314Xe2 poiOperationType, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(poiOperationType, "poiOperationType");
        this.LIZ = poiOperationType;
        this.LIZIZ = str;
        this.LIZJ = currentTimeMillis;
    }
}
