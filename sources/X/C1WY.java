package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WY extends AbstractC17560mW {
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
        if (!(obj instanceof C1WY)) {
            return false;
        }
        C1WY c1wy = (C1WY) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1wy.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1wy.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c1wy.LJ)) && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c1wy.LJFF)) && o.LJ(Float.valueOf(this.LJI), Float.valueOf(c1wy.LJI)) && o.LJ(Float.valueOf(this.LJII), Float.valueOf(c1wy.LJII));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJII) + C47959Irz.LIZIZ(this.LJI, C47959Irz.LIZIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeCurveTo(dx1=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", dx2=");
        LIZ.append(this.LJ);
        LIZ.append(", dy2=");
        LIZ.append(this.LJFF);
        LIZ.append(", dx3=");
        LIZ.append(this.LJI);
        LIZ.append(", dy3=");
        return C74221TAz.LIZLLL(LIZ, this.LJII, ')', LIZ);
    }

    public C1WY(float f, float f2, float f3, float f4, float f5, float f6) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
        this.LJI = f5;
        this.LJII = f6;
    }
}
