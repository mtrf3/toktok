package X;

/* renamed from: X.Qd8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67422Qd8 extends AbstractC67423Qd9 {
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;

    public final int hashCode() {
        long j = this.LIZIZ;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.LIZJ) * 1000003) ^ this.LIZLLL) * 1000003;
        long j2 = this.LJ;
        return this.LJFF ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventStoreConfig{maxStorageSizeInBytes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", loadBatchSize=");
        LIZ.append(this.LIZJ);
        LIZ.append(", criticalSectionEnterTimeoutMs=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", eventCleanUpAge=");
        LIZ.append(this.LJ);
        LIZ.append(", maxBlobByteSizePerRow=");
        return C08380Uo.LIZ(LIZ, this.LJFF, "}", LIZ);
    }

    @Override // X.AbstractC67423Qd9
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67423Qd9
    public final long LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC67423Qd9
    public final int LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67423Qd9
    public final int LIZLLL() {
        return this.LJFF;
    }

    @Override // X.AbstractC67423Qd9
    public final long LJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67423Qd9)) {
            return false;
        }
        AbstractC67423Qd9 abstractC67423Qd9 = (AbstractC67423Qd9) obj;
        if (this.LIZIZ == abstractC67423Qd9.LJ() && this.LIZJ == abstractC67423Qd9.LIZJ() && this.LIZLLL == abstractC67423Qd9.LIZ() && this.LJ == abstractC67423Qd9.LIZIZ() && this.LJFF == abstractC67423Qd9.LIZLLL()) {
            return true;
        }
        return false;
    }

    public C67422Qd8(long j, int i, int i2, long j2, int i3) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j2;
        this.LJFF = i3;
    }
}
