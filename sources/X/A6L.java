package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6L extends A6M {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A6L) && o.LJ(this.LIZ, ((A6L) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(throwable=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public A6L(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        this.LIZ = throwable;
    }
}
