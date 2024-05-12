package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M11 {
    public final boolean LIZ;
    public final M1L LIZIZ;
    public final Integer LIZJ;

    public M11() {
        this(false, (M1L) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M11)) {
            return false;
        }
        M11 m11 = (M11) obj;
        return this.LIZ == m11.LIZ && this.LIZIZ == m11.LIZIZ && o.LJ(this.LIZJ, m11.LIZJ);
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
        M1L m1l = this.LIZIZ;
        int hashCode = (i + (m1l == null ? 0 : m1l.hashCode())) * 31;
        Integer num = this.LIZJ;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DotConfig(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", style=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", count=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ M11(boolean z, M1L m1l, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : m1l, (Integer) null);
    }

    public M11(boolean z, M1L m1l, Integer num) {
        this.LIZ = z;
        this.LIZIZ = m1l;
        this.LIZJ = num;
    }
}
