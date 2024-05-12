package X;

/* renamed from: X.1LE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LE extends AbstractC07660Ru {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LE) && this.LIZ == ((C1LE) obj).LIZ;
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
        LIZ.append("LyricsStateChange(isOpen=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1LE(boolean z) {
        this.LIZ = z;
    }
}
