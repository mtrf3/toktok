package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WO extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final float LJII;
    public final float LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1WO)) {
            return false;
        }
        C1WO c1wo = (C1WO) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1wo.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1wo.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c1wo.LJ)) && this.LJFF == c1wo.LJFF && this.LJI == c1wo.LJI && o.LJ(Float.valueOf(this.LJII), Float.valueOf(c1wo.LJII)) && o.LJ(Float.valueOf(this.LJIIIIZZ), Float.valueOf(c1wo.LJIIIIZZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31);
        boolean z = this.LJFF;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.LJI) {
            i = 0;
        }
        return Float.floatToIntBits(this.LJIIIIZZ) + C47959Irz.LIZIZ(this.LJII, (i3 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArcTo(horizontalEllipseRadius=");
        LIZ.append(this.LIZJ);
        LIZ.append(", verticalEllipseRadius=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", theta=");
        LIZ.append(this.LJ);
        LIZ.append(", isMoreThanHalf=");
        LIZ.append(this.LJFF);
        LIZ.append(", isPositiveArc=");
        LIZ.append(this.LJI);
        LIZ.append(", arcStartX=");
        LIZ.append(this.LJII);
        LIZ.append(", arcStartY=");
        return C74221TAz.LIZLLL(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C1WO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = f4;
        this.LJIIIIZZ = f5;
    }
}
