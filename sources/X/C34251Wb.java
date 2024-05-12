package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34251Wb extends AbstractC17560mW {
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34251Wb)) {
            return false;
        }
        C34251Wb c34251Wb = (C34251Wb) obj;
        return o.LJ(Float.valueOf(this.LIZJ), Float.valueOf(c34251Wb.LIZJ)) && o.LJ(Float.valueOf(this.LIZLLL), Float.valueOf(c34251Wb.LIZLLL));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + (Float.floatToIntBits(this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelativeMoveTo(dx=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dy=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C34251Wb(float f, float f2) {
        super(false, false, 3);
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
