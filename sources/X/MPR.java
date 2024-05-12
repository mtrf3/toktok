package X;

/* loaded from: classes10.dex */
public final class MPR implements MRU {
    public final boolean LIZ;

    public MPR() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MPR) && this.LIZ == ((MPR) obj).LIZ;
    }

    public final int hashCode() {
        boolean z = this.LIZ;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReqParam(markRead=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public MPR(boolean z) {
        this.LIZ = z;
    }
}
