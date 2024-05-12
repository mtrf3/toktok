package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ESM<T> {
    public final Integer LIZ;
    public final String LIZIZ;
    public final T LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    public ESM() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ESM)) {
            return false;
        }
        ESM esm = (ESM) obj;
        return o.LJ(this.LIZ, esm.LIZ) && o.LJ(this.LIZIZ, esm.LIZIZ) && o.LJ(this.LIZJ, esm.LIZJ) && o.LJ(this.LIZLLL, esm.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
        T t = this.LIZJ;
        if (t != null) {
            i = t.hashCode();
        }
        return this.LIZLLL.hashCode() + ((LJ + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FloatingViewActionConfig(icon=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZJ);
        LIZ.append(", action=");
        return C06540Nm.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ESM(String str, Object obj, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = obj;
        this.LIZLLL = interfaceC65784Pro;
    }
}
