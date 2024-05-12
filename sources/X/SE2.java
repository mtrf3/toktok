package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SE2 {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SE2() {
        /*
            r2 = this;
            r1 = 0
            r0 = 15
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SE2.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SE2)) {
            return false;
        }
        SE2 se2 = (SE2) obj;
        return o.LJ(this.LIZ, se2.LIZ) && o.LJ(this.LIZIZ, se2.LIZIZ) && o.LJ(this.LIZJ, se2.LIZJ) && o.LJ(this.LIZLLL, se2.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LIZLLL;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcRect(start=");
        LIZ.append(this.LIZ);
        LIZ.append(", top=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", end=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bottom=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ SE2(Integer num, Integer num2, int i) {
        this((i & 1) != 0 ? null : num, null, (i & 4) != 0 ? null : num2, null);
    }

    public SE2(Integer num, Integer num2, Integer num3, Integer num4) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
        this.LIZLLL = num4;
    }
}
