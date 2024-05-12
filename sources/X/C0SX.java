package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0SX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SX {
    public final float LIZ;
    public final AbstractC11740d8 LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BorderStroke(width=");
        C0SV.LIZ(this.LIZ, LIZ, ", brush=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SX)) {
            return false;
        }
        C0SX c0sx = (C0SX) obj;
        if (C23390vv.LIZJ(this.LIZ, c0sx.LIZ) && o.LJ(this.LIZIZ, c0sx.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C0SX(float f, C32691Qb c32691Qb) {
        this.LIZ = f;
        this.LIZIZ = c32691Qb;
    }
}
