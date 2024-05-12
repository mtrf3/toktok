package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34281We extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34281We)) {
            return false;
        }
        C34281We c34281We = (C34281We) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c34281We.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c34281We.LIZLLL));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + (Float.floatToIntBits(this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeReflectiveQuadTo(dx=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C34281We(float f, float f2) {
        super(false, true, 1);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
