package X;

/* renamed from: X.9BW, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BW {
    public final boolean LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9BW)) {
            return false;
        }
        C9BW c9bw = (C9BW) obj;
        return this.LIZ == c9bw.LIZ && this.LIZIZ == c9bw.LIZIZ && this.LIZJ == c9bw.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.LIZIZ, r0 * 31, 31);
        if (!this.LIZJ) {
            i = 0;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeepLinkMobParams(isLongLink=");
        LIZ.append(this.LIZ);
        LIZ.append(", shortToLongDuration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isShortToLongEndOnBackground=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C9BW(boolean z, long j, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = z2;
    }
}
