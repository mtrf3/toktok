package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVN {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Integer LIZLLL;

    public GVN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GVN)) {
            return false;
        }
        GVN gvn = (GVN) obj;
        return o.LJ(this.LIZ, gvn.LIZ) && o.LJ(this.LIZIZ, gvn.LIZIZ) && o.LJ(this.LIZJ, gvn.LIZJ) && o.LJ(this.LIZLLL, gvn.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Integer num = this.LIZLLL;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPostMobPara(groupId=");
        LIZ.append(this.LIZ);
        LIZ.append(", authorId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", awemeType=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public GVN(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = null;
    }
}
