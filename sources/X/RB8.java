package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RB8 {
    public final RBE LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RB8)) {
            return false;
        }
        RB8 rb8 = (RB8) obj;
        return this.LIZ == rb8.LIZ && this.LIZIZ == rb8.LIZIZ && o.LJ(this.LIZJ, rb8.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.LIZJ;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidationRuleResult(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", validationStatus=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public RB8(RBE type, boolean z, String str) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
