package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.DwO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35492DwO {
    public final JQX LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35492DwO)) {
            return false;
        }
        C35492DwO c35492DwO = (C35492DwO) obj;
        return o.LJ(this.LIZ, c35492DwO.LIZ) && o.LJ(this.LIZIZ, c35492DwO.LIZIZ);
    }

    public final int hashCode() {
        JQX jqx = this.LIZ;
        int hashCode = (jqx == null ? 0 : jqx.hashCode()) * 31;
        Integer num = this.LIZIZ;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HolderAndPosition(holder=");
        LIZ.append(this.LIZ);
        LIZ.append(", adapterPos=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C35492DwO(JQX jqx, Integer num) {
        this.LIZ = jqx;
        this.LIZIZ = num;
    }
}
