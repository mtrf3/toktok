package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QVA {
    public final boolean LIZ;
    public final QV9 LIZIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QVA) {
                QVA qva = (QVA) obj;
                if (this.LIZ != qva.LIZ || !o.LJ(this.LIZIZ, qva.LIZIZ)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        QV9 qv9 = this.LIZIZ;
        return i + (qv9 != null ? qv9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PatchResult(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", syncCursor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public QVA(boolean z, QV9 qv9) {
        this.LIZ = z;
        this.LIZIZ = qv9;
    }
}
