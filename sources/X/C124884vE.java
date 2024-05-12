package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124884vE {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;
    public final boolean LJ;

    public C124884vE() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124884vE)) {
            return false;
        }
        C124884vE c124884vE = (C124884vE) obj;
        return o.LJ(this.LIZ, c124884vE.LIZ) && o.LJ(this.LIZIZ, c124884vE.LIZIZ) && o.LJ(this.LIZJ, c124884vE.LIZJ) && o.LJ(this.LIZLLL, c124884vE.LIZLLL) && this.LJ == c124884vE.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LIZIZ;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImportParam(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", lastTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", insertIndex=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isAllMute=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shouldSelect=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C124884vE(Long l, Long l2, Integer num, Boolean bool, int i) {
        l = (i & 1) != 0 ? null : l;
        l2 = (i & 2) != 0 ? null : l2;
        num = (i & 4) != 0 ? null : num;
        bool = (i & 8) != 0 ? Boolean.FALSE : bool;
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = num;
        this.LIZLLL = bool;
        this.LJ = false;
    }
}
