package defpackage;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class d0 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.LIZ == d0Var.LIZ && this.LIZIZ == d0Var.LIZIZ && this.LIZJ == d0Var.LIZJ && this.LIZLLL == d0Var.LIZLLL && o.LJ(this.LJ, d0Var.LJ);
    }

    public final int hashCode() {
        int i = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponSettingsVO(solidColorRes=");
        LIZ.append(this.LIZ);
        LIZ.append(", strokeWidth=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strokeColorRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dashColorRes=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", discountText=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public d0(int i, int i2, int i3, int i4, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = str;
    }
}
