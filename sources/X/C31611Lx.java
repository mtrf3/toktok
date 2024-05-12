package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31611Lx implements InterfaceC07740Sc {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31611Lx) && o.LJ(Float.valueOf(this.LIZ), Float.valueOf(((C31611Lx) obj).LIZ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Horizontal(bias=");
        return C74221TAz.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C31611Lx(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC07740Sc
    public final int LIZ(int i, int i2, EnumC23500w6 layoutDirection) {
        float f;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        float f2 = (i2 - i) / 2.0f;
        if (layoutDirection == EnumC23500w6.Ltr) {
            f = this.LIZ;
        } else {
            f = (-1) * this.LIZ;
        }
        return O6R.LJJIIZ((1 + f) * f2);
    }
}
