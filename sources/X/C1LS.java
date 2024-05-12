package X;

/* renamed from: X.1LS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LS extends AbstractC07660Ru {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LS) && this.LIZ == ((C1LS) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerProgressChange(progress=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1LS(long j) {
        this.LIZ = j;
    }
}
