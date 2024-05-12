package X;

import android.graphics.RectF;

/* renamed from: X.U8s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76710U8s {
    public final double LIZ;
    public double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76710U8s)) {
            return false;
        }
        C76710U8s c76710U8s = (C76710U8s) obj;
        return Double.compare(this.LIZ, c76710U8s.LIZ) == 0 && Double.compare(this.LIZIZ, c76710U8s.LIZIZ) == 0 && Double.compare(this.LIZJ, c76710U8s.LIZJ) == 0 && Double.compare(this.LIZLLL, c76710U8s.LIZLLL) == 0;
    }

    public final RectF LIZ() {
        double d = this.LIZ;
        double d2 = this.LIZIZ;
        return new RectF((float) d, (float) d2, (float) (d + this.LIZJ), (float) (d2 + this.LIZLLL));
    }

    public final int hashCode() {
        return C16880lQ.LLJI(this.LIZLLL) + C1JX.LIZIZ(this.LIZJ, C1JX.LIZIZ(this.LIZIZ, C16880lQ.LLJI(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegionInfo(x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZJ);
        LIZ.append(", height=");
        return C07670Rv.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76710U8s(double d, double d2, double d3, double d4) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
    }
}
