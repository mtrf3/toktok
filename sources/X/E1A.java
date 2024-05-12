package X;

/* loaded from: classes7.dex */
public final class E1A {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public E1A() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1A)) {
            return false;
        }
        E1A e1a = (E1A) obj;
        return this.LIZ == e1a.LIZ && this.LIZIZ == e1a.LIZIZ;
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
        LIZ.append("SampleConfig(normalEnabled=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorEnabled=");
        return C19U.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public E1A(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
