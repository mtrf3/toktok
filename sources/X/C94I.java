package X;

/* renamed from: X.94I, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94I {
    public final long LIZ = 16;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94I)) {
            return false;
        }
        C94I c94i = (C94I) obj;
        return this.LIZ == c94i.LIZ && this.LIZIZ == c94i.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Threshold(minimum=");
        LIZ.append(this.LIZ);
        LIZ.append(", maximum=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C94I(long j) {
        this.LIZIZ = j;
    }
}
