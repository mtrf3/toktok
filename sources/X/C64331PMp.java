package X;

/* renamed from: X.PMp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64331PMp {
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64331PMp)) {
            return false;
        }
        C64331PMp c64331PMp = (C64331PMp) obj;
        return this.LIZ == c64331PMp.LIZ && this.LIZIZ == c64331PMp.LIZIZ && this.LIZJ == c64331PMp.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return C16880lQ.LLJIJIL(this.LIZJ) + ((i + i2) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForegroundState(pid=");
        LIZ.append(this.LIZ);
        LIZ.append(", foreground=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", time=");
        return C0H1.LIZJ(LIZ, this.LIZJ, ")", LIZ);
    }

    public C64331PMp(int i, long j, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
