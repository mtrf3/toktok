package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0O1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0O1 {
    public final float LIZ;
    public final float LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O1)) {
            return false;
        }
        C0O1 c0o1 = (C0O1) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c0o1.LIZ)) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c0o1.LIZIZ)) && this.LIZJ == c0o1.LIZJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FlingInfo(initialVelocity=");
        LIZ.append(this.LIZ);
        LIZ.append(", distance=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C0O1(long j, float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = j;
    }
}
