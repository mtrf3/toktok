package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RUP {
    public static final /* synthetic */ int LIZLLL = 0;
    public final RUH LIZ;
    public final RUH LIZIZ;
    public final RUH LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RUP)) {
            return false;
        }
        RUP rup = (RUP) obj;
        return o.LJ(this.LIZ, rup.LIZ) && o.LJ(this.LIZIZ, rup.LIZIZ) && o.LJ(this.LIZJ, rup.LIZJ);
    }

    public final int hashCode() {
        RUH ruh = this.LIZ;
        int hashCode = (ruh == null ? 0 : ruh.hashCode()) * 31;
        RUH ruh2 = this.LIZIZ;
        int hashCode2 = (hashCode + (ruh2 == null ? 0 : ruh2.hashCode())) * 31;
        RUH ruh3 = this.LIZJ;
        return hashCode2 + (ruh3 != null ? ruh3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TagVO(icon=");
        LIZ.append(this.LIZ);
        LIZ.append(", background=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tagVOText=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RUP(RUH ruh, RUH ruh2, RUH ruh3) {
        this.LIZ = ruh;
        this.LIZIZ = ruh2;
        this.LIZJ = ruh3;
    }
}
