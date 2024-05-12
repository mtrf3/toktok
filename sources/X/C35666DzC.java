package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.DzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35666DzC {
    public final String LIZ;
    public final boolean LIZIZ;
    public final E3H LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35666DzC)) {
            return false;
        }
        C35666DzC c35666DzC = (C35666DzC) obj;
        return o.LJ(this.LIZ, c35666DzC.LIZ) && this.LIZIZ == c35666DzC.LIZIZ && this.LIZJ == c35666DzC.LIZJ && o.LJ(this.LIZLLL, c35666DzC.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.LIZJ.hashCode() + ((hashCode + i) * 31)) * 31;
        Integer num = this.LIZLLL;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SchedulerRegister(tag=");
        LIZ.append(this.LIZ);
        LIZ.append(", regist=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scheduletype=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C35666DzC(String str, boolean z, E3H scheduletype, Integer num) {
        o.LJIIIZ(scheduletype, "scheduletype");
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = scheduletype;
        this.LIZLLL = num;
    }
}
