package X;

/* renamed from: X.QcV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67383QcV extends AbstractC67413Qcz {
    public final long LIZ;
    public final AbstractC67354Qc2 LIZIZ;
    public final AbstractC67375QcN LIZJ;

    public final int hashCode() {
        long j = this.LIZ;
        return this.LIZJ.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PersistedEvent{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", transportContext=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", event=");
        LIZ.append(this.LIZJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67413Qcz
    public final AbstractC67375QcN LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67413Qcz
    public final long LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67413Qcz
    public final AbstractC67354Qc2 LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67413Qcz)) {
            return false;
        }
        AbstractC67413Qcz abstractC67413Qcz = (AbstractC67413Qcz) obj;
        if (this.LIZ == abstractC67413Qcz.LIZIZ() && this.LIZIZ.equals(abstractC67413Qcz.LIZJ()) && this.LIZJ.equals(abstractC67413Qcz.LIZ())) {
            return true;
        }
        return false;
    }

    public C67383QcV(long j, AbstractC67354Qc2 abstractC67354Qc2, AbstractC67375QcN abstractC67375QcN) {
        this.LIZ = j;
        if (abstractC67354Qc2 != null) {
            this.LIZIZ = abstractC67354Qc2;
            if (abstractC67375QcN != null) {
                this.LIZJ = abstractC67375QcN;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }
}
