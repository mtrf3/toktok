package X;

/* renamed from: X.1LJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LJ extends AbstractC07660Ru {
    public final boolean LIZ;

    public C1LJ() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LJ) && this.LIZ == ((C1LJ) obj).LIZ;
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
        LIZ.append("StartKaraokeSuccess(startByEnter=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1LJ(boolean z) {
        this.LIZ = z;
    }
}
