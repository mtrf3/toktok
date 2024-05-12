package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06440Nc {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06440Nc)) {
            return false;
        }
        C06440Nc c06440Nc = (C06440Nc) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c06440Nc.LIZ)) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c06440Nc.LIZIZ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlingResult(distanceCoefficient=");
        LIZ.append(this.LIZ);
        LIZ.append(", velocityCoefficient=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C06440Nc(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
