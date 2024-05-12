package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WS extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1WS)) {
            return false;
        }
        C1WS c1ws = (C1WS) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c1ws.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c1ws.LIZLLL));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + (Float.floatToIntBits(this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LineTo(x=");
        LIZ.append(this.LIZJ);
        LIZ.append(", y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C1WS(float f, float f2) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
