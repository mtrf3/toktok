package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E0d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35719E0d {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35719E0d)) {
            return false;
        }
        C35719E0d c35719E0d = (C35719E0d) obj;
        return o.LJ(this.LIZ, c35719E0d.LIZ) && o.LJ(this.LIZIZ, c35719E0d.LIZIZ) && this.LIZJ == c35719E0d.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRelationState(buttonTextRes=");
        LIZ.append(this.LIZ);
        LIZ.append(", displayState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", clickable=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C35719E0d(Integer num, Integer num2, boolean z) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = z;
    }
}
