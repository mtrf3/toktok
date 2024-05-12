package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1W1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W1 implements InterfaceC17460mM {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1W1) && C23390vv.LIZJ(this.LIZ, ((C1W1) obj).LIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CornerSize(size = ");
        LIZ.append(this.LIZ);
        LIZ.append(".dp)");
        return X1D.LIZIZ(LIZ);
    }

    public C1W1(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC17460mM
    public final float LIZ(long j, InterfaceC23370vt density) {
        o.LJIIIZ(density, "density");
        return density.LJJJJIZL(this.LIZ);
    }
}
