package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34301Wg extends AbstractC17560mW {
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34301Wg) && o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(((C34301Wg) obj).LIZJ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerticalTo(y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C34301Wg(float f) {
        super(false, false, 3);
        this.LIZJ = f;
    }
}
