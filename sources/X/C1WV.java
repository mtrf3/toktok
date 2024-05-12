package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WV extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1WV)) {
            return false;
        }
        C1WV c1wv = (C1WV) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1wv.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1wv.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c1wv.LJ)) && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c1wv.LJFF));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJFF) + C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReflectiveCurveTo(x1=");
        LIZ.append(this.LIZJ);
        LIZ.append(", y1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", x2=");
        LIZ.append(this.LJ);
        LIZ.append(", y2=");
        return C74221TAz.LIZLLL(LIZ, this.LJFF, ')', LIZ);
    }

    public C1WV(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
    }
}
