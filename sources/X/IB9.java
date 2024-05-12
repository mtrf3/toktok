package X;

/* loaded from: classes8.dex */
public final class IB9 {
    public boolean LIZ;
    public long LIZIZ;

    public IB9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IB9)) {
            return false;
        }
        IB9 ib9 = (IB9) obj;
        return this.LIZ == ib9.LIZ && this.LIZIZ == ib9.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return C16880lQ.LLJIJIL(this.LIZIZ) + (r0 * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReuseProp(isEffectFirstFrame=");
        LIZ.append(this.LIZ);
        LIZ.append(", startTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public IB9(int i) {
        this.LIZ = true;
        this.LIZIZ = 0L;
    }
}
