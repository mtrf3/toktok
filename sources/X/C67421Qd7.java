package X;

/* renamed from: X.Qd7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67421Qd7 extends AbstractC67420Qd6 {
    public final InterfaceC67370QcI LIZ;
    public final java.util.Map<EnumC67357Qc5, AbstractC67431QdH> LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SchedulerConfig{clock=");
        LIZ.append(this.LIZ);
        LIZ.append(", values=");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67420Qd6
    public final InterfaceC67370QcI LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67420Qd6
    public final java.util.Map<EnumC67357Qc5, AbstractC67431QdH> LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67420Qd6)) {
            return false;
        }
        AbstractC67420Qd6 abstractC67420Qd6 = (AbstractC67420Qd6) obj;
        if (this.LIZ.equals(abstractC67420Qd6.LIZ()) && this.LIZIZ.equals(abstractC67420Qd6.LIZJ())) {
            return true;
        }
        return false;
    }

    public C67421Qd7(InterfaceC67370QcI interfaceC67370QcI, java.util.Map<EnumC67357Qc5, AbstractC67431QdH> map) {
        if (interfaceC67370QcI != null) {
            this.LIZ = interfaceC67370QcI;
            if (map != null) {
                this.LIZIZ = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }
}
