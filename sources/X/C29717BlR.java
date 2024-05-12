package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.BlR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29717BlR {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29717BlR)) {
            return false;
        }
        C29717BlR c29717BlR = (C29717BlR) obj;
        return this.LIZ == c29717BlR.LIZ && o.LJ(this.LIZIZ, c29717BlR.LIZIZ);
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
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClearScreenLayoutEvent(cleared=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C29717BlR(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
