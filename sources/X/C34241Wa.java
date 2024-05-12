package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34241Wa extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34241Wa)) {
            return false;
        }
        C34241Wa c34241Wa = (C34241Wa) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c34241Wa.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c34241Wa.LIZLLL));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + (Float.floatToIntBits(this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeLineTo(dx=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C34241Wa(float f, float f2) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
