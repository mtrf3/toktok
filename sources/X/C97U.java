package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.97U, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97U {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97U)) {
            return false;
        }
        C97U c97u = (C97U) obj;
        return o.LJ(this.LIZ, c97u.LIZ) && o.LJ(this.LIZIZ, c97u.LIZIZ) && o.LJ(this.LIZJ, c97u.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchItemAvailableCount(totalCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", glovesCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", smokesCount=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C97U(Integer num, Integer num2, Integer num3) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
