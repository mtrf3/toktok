package X;

/* renamed from: X.O2g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61254O2g {
    public final long LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61254O2g)) {
            return false;
        }
        C61254O2g c61254O2g = (C61254O2g) obj;
        return this.LIZ == c61254O2g.LIZ && this.LIZIZ == c61254O2g.LIZIZ;
    }

    public final int hashCode() {
        return (C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadPerfParams(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", perfFrequency=");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C61254O2g(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
