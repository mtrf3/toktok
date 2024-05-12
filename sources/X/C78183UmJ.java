package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UmJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78183UmJ {
    public final boolean LIZ;
    public final C78163Ulz LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78183UmJ)) {
            return false;
        }
        C78183UmJ c78183UmJ = (C78183UmJ) obj;
        return this.LIZ == c78183UmJ.LIZ && o.LJ(this.LIZIZ, c78183UmJ.LIZIZ);
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
        C78163Ulz c78163Ulz = this.LIZIZ;
        return i + (c78163Ulz == null ? 0 : c78163Ulz.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", error=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C78183UmJ(boolean z, C78163Ulz c78163Ulz) {
        this.LIZ = z;
        this.LIZIZ = c78163Ulz;
    }
}
