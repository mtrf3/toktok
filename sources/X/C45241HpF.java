package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HpF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45241HpF<T> {
    public final T LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45241HpF)) {
            return false;
        }
        C45241HpF c45241HpF = (C45241HpF) obj;
        return o.LJ(this.LIZ, c45241HpF.LIZ) && o.LJ(this.LIZIZ, c45241HpF.LIZIZ) && this.LIZJ == c45241HpF.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        T t = this.LIZ;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectResult(originOutput=");
        LIZ.append(this.LIZ);
        LIZ.append(", selectedIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dropEndMessage=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C45241HpF(T t, Integer num, boolean z) {
        this.LIZ = t;
        this.LIZIZ = num;
        this.LIZJ = z;
    }
}
