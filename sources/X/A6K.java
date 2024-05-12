package X;

import defpackage.b0;

/* loaded from: classes5.dex */
public final class A6K extends A6M {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A6K) && this.LIZ == ((A6K) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IapError(errorCode=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public A6K(int i) {
        this.LIZ = i;
    }
}
