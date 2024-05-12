package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OrO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63210OrO {
    public final boolean LIZ;
    public final C109544Rq LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63210OrO)) {
            return false;
        }
        C63210OrO c63210OrO = (C63210OrO) obj;
        return this.LIZ == c63210OrO.LIZ && o.LJ(this.LIZIZ, c63210OrO.LIZIZ) && this.LIZJ == c63210OrO.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C109544Rq c109544Rq = this.LIZIZ;
        return ((i + (c109544Rq == null ? 0 : c109544Rq.hashCode())) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveMessageResult(isSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", savedMessage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isNewMsg=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C63210OrO(boolean z, C109544Rq c109544Rq, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = c109544Rq;
        this.LIZJ = z2;
    }
}
