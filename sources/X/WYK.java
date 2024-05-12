package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYK extends WYN {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WYK) && o.LJ(this.LIZ, ((WYK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FAIL(throwable=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public WYK(Throwable th) {
        this.LIZ = th;
    }
}
