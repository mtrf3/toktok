package X;

import android.graphics.Insets;
import defpackage.b0;

/* renamed from: X.0Ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07310Ql {
    public static final C07310Ql LJ = new C07310Ql(0, 0, 0, 0);
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final Insets LIZLLL() {
        return C07300Qk.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Insets{left=");
        LIZ.append(this.LIZ);
        LIZ.append(", top=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", right=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bottom=");
        return b0.LIZJ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public static C07310Ql LIZJ(Insets insets) {
        return LIZIZ(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C07310Ql.class != obj.getClass()) {
            return false;
        }
        C07310Ql c07310Ql = (C07310Ql) obj;
        if (this.LIZLLL == c07310Ql.LIZLLL && this.LIZ == c07310Ql.LIZ && this.LIZJ == c07310Ql.LIZJ && this.LIZIZ == c07310Ql.LIZIZ) {
            return true;
        }
        return false;
    }

    public static C07310Ql LIZ(C07310Ql c07310Ql, C07310Ql c07310Ql2) {
        return LIZIZ(Math.max(c07310Ql.LIZ, c07310Ql2.LIZ), Math.max(c07310Ql.LIZIZ, c07310Ql2.LIZIZ), Math.max(c07310Ql.LIZJ, c07310Ql2.LIZJ), Math.max(c07310Ql.LIZLLL, c07310Ql2.LIZLLL));
    }

    public C07310Ql(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }

    public static C07310Ql LIZIZ(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return LJ;
        }
        return new C07310Ql(i, i2, i3, i4);
    }
}
