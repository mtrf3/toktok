package X;

/* renamed from: X.45t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038545t {
    public boolean LIZ;

    public C1038545t() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1038545t) && this.LIZ == ((C1038545t) obj).LIZ;
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
        LIZ.append("NaviTipState(shown=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1038545t(int i) {
        this.LIZ = false;
    }
}
