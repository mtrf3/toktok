package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150145us {
    public final boolean LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C150145us)) {
            return false;
        }
        C150145us c150145us = (C150145us) obj;
        return this.LIZ == c150145us.LIZ && this.LIZIZ == c150145us.LIZIZ && o.LJ(this.LIZJ, c150145us.LIZJ) && this.LIZLLL == c150145us.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        return ((i + (num == null ? 0 : num.hashCode())) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEEnableResult(enable=");
        LIZ.append(this.LIZ);
        LIZ.append(", disableCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", disableMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hasTimeEffect=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C150145us(boolean z, boolean z2, int i) {
        this(0, null, z, (i & 8) != 0 ? false : z2);
    }

    public C150145us(int i, Integer num, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = z2;
    }
}
