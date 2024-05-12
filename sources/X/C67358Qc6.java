package X;

/* renamed from: X.Qc6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67358Qc6<T> extends AbstractC67359Qc7<T> {
    public final Integer LIZ;
    public final T LIZIZ;
    public final EnumC67357Qc5 LIZJ;

    public final int hashCode() {
        int hashCode;
        Integer num = this.LIZ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Event{code=");
        LIZ.append(this.LIZ);
        LIZ.append(", payload=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", priority=");
        LIZ.append(this.LIZJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67359Qc7
    public final Integer LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67359Qc7
    public final T LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67359Qc7
    public final EnumC67357Qc5 LIZJ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67359Qc7)) {
            return false;
        }
        AbstractC67359Qc7 abstractC67359Qc7 = (AbstractC67359Qc7) obj;
        Integer num = this.LIZ;
        if (num != null ? num.equals(abstractC67359Qc7.LIZ()) : abstractC67359Qc7.LIZ() == null) {
            if (this.LIZIZ.equals(abstractC67359Qc7.LIZIZ()) && this.LIZJ.equals(abstractC67359Qc7.LIZJ())) {
                return true;
            }
        }
        return false;
    }

    public C67358Qc6(Integer num, T t, EnumC67357Qc5 enumC67357Qc5) {
        this.LIZ = num;
        this.LIZIZ = t;
        if (enumC67357Qc5 != null) {
            this.LIZJ = enumC67357Qc5;
            return;
        }
        throw new NullPointerException("Null priority");
    }
}
