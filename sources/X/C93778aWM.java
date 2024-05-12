package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aWM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93778aWM {
    public final EnumC93777aWL LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93778aWM)) {
            return false;
        }
        C93778aWM c93778aWM = (C93778aWM) obj;
        return o.LJ(this.LIZ, c93778aWM.LIZ) && Float.compare(this.LIZIZ, c93778aWM.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(direction=");
        LIZ.append(this.LIZ);
        LIZ.append(", distance=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int i;
        EnumC93777aWL enumC93777aWL = this.LIZ;
        if (enumC93777aWL != null) {
            i = enumC93777aWL.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C93778aWM(EnumC93777aWL direction, float f) {
        o.LJIIIZ(direction, "direction");
        this.LIZ = direction;
        this.LIZIZ = f;
    }
}
