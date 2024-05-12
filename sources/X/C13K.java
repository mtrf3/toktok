package X;

/* renamed from: X.13K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13K {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13K)) {
            return false;
        }
        C13K c13k = (C13K) obj;
        return C10370av.LIZIZ(this.LIZ, c13k.LIZ) && this.LIZIZ == c13k.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PointAtTime(point=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZ));
        LIZ.append(", time=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C13K(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
