package X;

/* renamed from: X.QdB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67425QdB extends AbstractC67431QdH {
    public final long LIZ;
    public final long LIZIZ;
    public final java.util.Set<EnumC67424QdA> LIZJ;

    public final int hashCode() {
        long j = this.LIZ;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.LIZIZ;
        return this.LIZJ.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfigValue{delta=");
        LIZ.append(this.LIZ);
        LIZ.append(", maxAllowedDelay=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", flags=");
        LIZ.append(this.LIZJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67431QdH
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67431QdH
    public final java.util.Set<EnumC67424QdA> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67431QdH
    public final long LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67431QdH)) {
            return false;
        }
        AbstractC67431QdH abstractC67431QdH = (AbstractC67431QdH) obj;
        if (this.LIZ == abstractC67431QdH.LIZ() && this.LIZIZ == abstractC67431QdH.LIZJ() && this.LIZJ.equals(abstractC67431QdH.LIZIZ())) {
            return true;
        }
        return false;
    }

    public C67425QdB(long j, long j2, java.util.Set set) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = set;
    }
}
