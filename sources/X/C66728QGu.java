package X;

/* renamed from: X.QGu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66728QGu extends AbstractC66729QGv {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final int hashCode() {
        int hashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        long j = this.LIZIZ;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.LIZJ;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InstallationTokenResult{token=");
        LIZ.append(this.LIZ);
        LIZ.append(", tokenExpirationTimestamp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tokenCreationTimestamp=");
        return C0H1.LIZJ(LIZ, this.LIZJ, "}", LIZ);
    }

    @Override // X.AbstractC66729QGv
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC66729QGv
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC66729QGv
    public final long LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC66729QGv)) {
            return false;
        }
        AbstractC66729QGv abstractC66729QGv = (AbstractC66729QGv) obj;
        if (this.LIZ.equals(abstractC66729QGv.LIZ()) && this.LIZIZ == abstractC66729QGv.LIZJ() && this.LIZJ == abstractC66729QGv.LIZIZ()) {
            return true;
        }
        return false;
    }

    public C66728QGu(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
