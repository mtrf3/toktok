package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.JPw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49128JPw {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49128JPw)) {
            return false;
        }
        C49128JPw c49128JPw = (C49128JPw) obj;
        return o.LJ(this.LIZ, c49128JPw.LIZ) && o.LJ(this.LIZIZ, c49128JPw.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InternalIndexInfo(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", offset=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C49128JPw(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
