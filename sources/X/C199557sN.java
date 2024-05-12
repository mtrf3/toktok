package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199557sN<PO> extends C199567sO<PO> {
    public final String LIZJ;
    public final PO LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199557sN)) {
            return false;
        }
        C199557sN c199557sN = (C199557sN) obj;
        return o.LJ(this.LIZJ, c199557sN.LIZJ) && o.LJ(this.LIZLLL, c199557sN.LIZLLL) && this.LJ == c199557sN.LJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZJ.hashCode() * 31;
        PO po = this.LIZLLL;
        return C16880lQ.LLJIJIL(this.LJ) + ((hashCode + (po == null ? 0 : po.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultCacheEntry(key=");
        LIZ.append(this.LIZJ);
        LIZ.append(", v=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", updateTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C199557sN(long j, Object obj, String key) {
        super(obj, j);
        o.LJIIIZ(key, "key");
        this.LIZJ = key;
        this.LIZLLL = obj;
        this.LJ = j;
    }
}
