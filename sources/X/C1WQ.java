package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WQ extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1WQ)) {
            return false;
        }
        C1WQ c1wq = (C1WQ) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1wq.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1wq.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c1wq.LJ)) && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c1wq.LJFF)) && o.LJ(Float.valueOf(this.LJI), Float.valueOf(c1wq.LJI)) && o.LJ(Float.valueOf(this.LJII), Float.valueOf(c1wq.LJII));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJII) + C47959Irz.LIZIZ(this.LJI, C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurveTo(x1=");
        LIZ.append(this.LIZJ);
        LIZ.append(", y1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", x2=");
        LIZ.append(this.LJ);
        LIZ.append(", y2=");
        LIZ.append(this.LJFF);
        LIZ.append(", x3=");
        LIZ.append(this.LJI);
        LIZ.append(", y3=");
        return C74221TAz.LIZLLL(LIZ, this.LJII, ')', LIZ);
    }

    public C1WQ(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
    }
}
