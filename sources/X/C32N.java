package X;

/* renamed from: X.32N, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32N {
    public final int LIZ;
    public final int LIZIZ;

    public C32N() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32N)) {
            return false;
        }
        C32N c32n = (C32N) obj;
        return this.LIZ == c32n.LIZ && this.LIZIZ == c32n.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WidthHeightParams(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C32N(int i) {
        this.LIZ = -2;
        this.LIZIZ = -2;
    }
}
