package X;

/* renamed from: X.5in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142655in {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C142655in() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C142655in)) {
            return false;
        }
        C142655in c142655in = (C142655in) obj;
        return this.LIZ == c142655in.LIZ && this.LIZIZ == c142655in.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileConfig(needLTR=");
        LIZ.append(this.LIZ);
        LIZ.append(", needRTL=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C142655in(int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
