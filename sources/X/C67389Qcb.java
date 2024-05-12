package X;

/* renamed from: X.Qcb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67389Qcb extends AbstractC67416Qd2 {
    public final EnumC67392Qce LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        int hashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        long j = this.LIZIZ;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackendResponse{status=");
        LIZ.append(this.LIZ);
        LIZ.append(", nextRequestWaitMillis=");
        return C0H1.LIZJ(LIZ, this.LIZIZ, "}", LIZ);
    }

    @Override // X.AbstractC67416Qd2
    public final long LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67416Qd2
    public final EnumC67392Qce LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67416Qd2)) {
            return false;
        }
        AbstractC67416Qd2 abstractC67416Qd2 = (AbstractC67416Qd2) obj;
        if (this.LIZ.equals(abstractC67416Qd2.LIZIZ()) && this.LIZIZ == abstractC67416Qd2.LIZ()) {
            return true;
        }
        return false;
    }

    public C67389Qcb(EnumC67392Qce enumC67392Qce, long j) {
        if (enumC67392Qce != null) {
            this.LIZ = enumC67392Qce;
            this.LIZIZ = j;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
