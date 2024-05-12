package defpackage;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class c0 {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.LIZ == c0Var.LIZ && this.LIZIZ == c0Var.LIZIZ && o.LJ(this.LIZJ, c0Var.LIZJ) && this.LIZLLL == c0Var.LIZLLL;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        return ((i + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponButtonSettingsVO(strokeWidth=");
        LIZ.append(this.LIZ);
        LIZ.append(", strokeColorRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", solidRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", textColorRes=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public c0(int i, int i2, int i3, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = i3;
    }
}
