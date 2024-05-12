package X;

import defpackage.b0;

/* loaded from: classes14.dex */
public final class U9K {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U9K)) {
            return false;
        }
        U9K u9k = (U9K) obj;
        return this.LIZ == u9k.LIZ && this.LIZIZ == u9k.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StateNode(from=");
        LIZ.append(this.LIZ);
        LIZ.append(", to=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public U9K(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
