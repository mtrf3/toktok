package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.NCx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58983NCx {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58983NCx)) {
            return false;
        }
        C58983NCx c58983NCx = (C58983NCx) obj;
        return this.LIZ == c58983NCx.LIZ && o.LJ(this.LIZIZ, c58983NCx.LIZIZ);
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
        LIZ.append("Result(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C58983NCx(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
