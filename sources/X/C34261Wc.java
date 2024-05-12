package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34261Wc extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34261Wc)) {
            return false;
        }
        C34261Wc c34261Wc = (C34261Wc) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c34261Wc.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c34261Wc.LIZLLL)) && o.LJ(Float.valueOf(this.LJ), Float.valueOf(c34261Wc.LJ)) && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c34261Wc.LJFF));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJFF) + C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, Float.floatToIntBits(this.LIZJ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeQuadTo(dx1=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy1=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", dx2=");
        LIZ.append(this.LJ);
        LIZ.append(", dy2=");
        return C74221TAz.LIZLLL(LIZ, this.LJFF, ')', LIZ);
    }

    public C34261Wc(float f, float f2, float f3, float f4) {
        super(false, true, 1);
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = f4;
    }
}
