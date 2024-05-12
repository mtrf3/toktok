package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0mY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17580mY {
    public float LIZ;
    public float LIZIZ;

    public C17580mY() {
        this(0);
    }

    public final void LIZ() {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17580mY)) {
            return false;
        }
        C17580mY c17580mY = (C17580mY) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c17580mY.LIZ)) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c17580mY.LIZIZ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ) + (Float.floatToIntBits(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PathPoint(x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C17580mY(int i) {
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
    }
}
