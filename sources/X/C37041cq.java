package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37041cq extends AbstractC261010s {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37041cq)) {
            return false;
        }
        C37041cq c37041cq = (C37041cq) obj;
        return this.LIZ == c37041cq.LIZ && o.LJ(this.LIZIZ, c37041cq.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LIZIZ.hashCode() + (r0 * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchError(noAvailableData=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C37041cq(boolean z, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZ = z;
        this.LIZIZ = errorMsg;
    }
}
