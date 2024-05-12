package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WT extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1WT)) {
            return false;
        }
        C1WT c1wt = (C1WT) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1wt.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1wt.LIZLLL));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + (Float.floatToIntBits(this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MoveTo(x=");
        LIZ.append(this.LIZJ);
        LIZ.append(", y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C1WT(float f, float f2) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
