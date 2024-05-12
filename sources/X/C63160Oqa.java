package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oqa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63160Oqa {
    public final boolean LIZ;
    public final C109544Rq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63160Oqa)) {
            return false;
        }
        C63160Oqa c63160Oqa = (C63160Oqa) obj;
        return this.LIZ == c63160Oqa.LIZ && o.LJ(this.LIZIZ, c63160Oqa.LIZIZ);
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
        C109544Rq c109544Rq = this.LIZIZ;
        return i + (c109544Rq == null ? 0 : c109544Rq.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateMessageResult(isSuccess=");
        LIZ.append(this.LIZ);
        LIZ.append(", localMessage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C63160Oqa(C109544Rq c109544Rq, boolean z) {
        this.LIZ = z;
        this.LIZIZ = c109544Rq;
    }
}
