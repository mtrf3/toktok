package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V7J extends V7I {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V7J) && o.LJ(this.LIZ, ((V7J) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fail(error=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public V7J(Throwable error) {
        o.LJIIIZ(error, "error");
        this.LIZ = error;
    }
}
