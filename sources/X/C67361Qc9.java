package X;

/* renamed from: X.Qc9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67361Qc9 extends AbstractC67363QcB {
    public final AbstractC67354Qc2 LIZ;
    public final String LIZIZ;
    public final AbstractC67359Qc7<?> LIZJ;
    public final InterfaceC67369QcH<?, byte[]> LIZLLL;
    public final C67365QcD LJ;

    public final int hashCode() {
        return ((((((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode()) * 1000003) ^ this.LIZLLL.hashCode()) * 1000003) ^ this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendRequest{transportContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", transportName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", event=");
        LIZ.append(this.LIZJ);
        LIZ.append(", transformer=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", encoding=");
        LIZ.append(this.LJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67363QcB
    public final C67365QcD LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC67363QcB
    public final AbstractC67359Qc7<?> LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67363QcB
    public final InterfaceC67369QcH<?, byte[]> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67363QcB
    public final AbstractC67354Qc2 LIZLLL() {
        return this.LIZ;
    }

    @Override // X.AbstractC67363QcB
    public final String LJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67363QcB)) {
            return false;
        }
        AbstractC67363QcB abstractC67363QcB = (AbstractC67363QcB) obj;
        if (this.LIZ.equals(abstractC67363QcB.LIZLLL()) && this.LIZIZ.equals(abstractC67363QcB.LJ()) && this.LIZJ.equals(abstractC67363QcB.LIZIZ()) && this.LIZLLL.equals(abstractC67363QcB.LIZJ()) && this.LJ.equals(abstractC67363QcB.LIZ())) {
            return true;
        }
        return false;
    }

    public C67361Qc9(AbstractC67354Qc2 abstractC67354Qc2, String str, AbstractC67359Qc7 abstractC67359Qc7, InterfaceC67369QcH interfaceC67369QcH, C67365QcD c67365QcD) {
        this.LIZ = abstractC67354Qc2;
        this.LIZIZ = str;
        this.LIZJ = abstractC67359Qc7;
        this.LIZLLL = interfaceC67369QcH;
        this.LJ = c67365QcD;
    }
}
