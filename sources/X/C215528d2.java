package X;

/* renamed from: X.8d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215528d2 {
    public final long LIZ;
    public final long LIZIZ;
    public boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C215528d2)) {
            return false;
        }
        C215528d2 c215528d2 = (C215528d2) obj;
        return this.LIZ == c215528d2.LIZ && this.LIZIZ == c215528d2.LIZIZ && this.LIZJ == c215528d2.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(this.LIZ);
        LIZ.append(',');
        LIZ.append(this.LIZIZ);
        LIZ.append("):failed=");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C215528d2(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
