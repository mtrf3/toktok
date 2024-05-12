package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6J extends A6I {
    public final A6M LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A6J) && o.LJ(this.LIZ, ((A6J) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(error=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public A6J(A6M a6m) {
        this.LIZ = a6m;
    }
}
