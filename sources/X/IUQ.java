package X;

/* loaded from: classes9.dex */
public final class IUQ extends Y1Y {
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IUQ)) {
            return false;
        }
        IUQ iuq = (IUQ) obj;
        return this.LIZIZ == iuq.LIZIZ && this.LIZJ == iuq.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + (this.LIZJ ? 1 : 0);
    }

    @Override // X.Y1Y
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Translating(autoTranslate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showCaptionLoadingIcon=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public IUQ(boolean z, boolean z2) {
        super(IQE.TRANSLATING);
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
