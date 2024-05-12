package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34271Wd extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34271Wd)) {
            return false;
        }
        C34271Wd c34271Wd = (C34271Wd) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c34271Wd.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c34271Wd.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c34271Wd.LJ)) && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c34271Wd.LJFF));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJFF) + C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeReflectiveCurveTo(dx1=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", dx2=");
        LIZ.append(this.LJ);
        LIZ.append(", dy2=");
        return C74221TAz.LIZLLL(LIZ, this.LJFF, ')', LIZ);
    }

    public C34271Wd(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
    }
}
