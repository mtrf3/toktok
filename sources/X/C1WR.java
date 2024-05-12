package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1WR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WR extends AbstractC17560mW {
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1WR) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(((C1WR) obj).LIZJ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HorizontalTo(x=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1WR(float f) {
        super(false, false, 3);
        this.LIZJ = f;
    }
}
