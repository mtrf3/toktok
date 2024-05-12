package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17480mO {
    public static final C43401n6 LIZ;

    static {
        final float f = 50;
        InterfaceC17460mM interfaceC17460mM = new InterfaceC17460mM(f) { // from class: X.1W2
            public final float LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1W2) && o.LJ(Float.valueOf(this.LIZ), Float.valueOf(((C1W2) obj).LIZ));
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.LIZ);
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CornerSize(size = ");
                LIZ2.append(this.LIZ);
                LIZ2.append("%)");
                return X1D.LIZIZ(LIZ2);
            }

            {
                this.LIZ = f;
                if (f >= 0.0f && f <= 100.0f) {
                } else {
                    throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
                }
            }

            @Override // X.InterfaceC17460mM
            public final float LIZ(long j, InterfaceC23370vt density) {
                o.LJIIIZ(density, "density");
                return (this.LIZ / 100.0f) * C10430b1.LIZJ(j);
            }
        };
        LIZ = new C43401n6(interfaceC17460mM, interfaceC17460mM, interfaceC17460mM, interfaceC17460mM);
    }

    public static final C43401n6 LIZ(float f) {
        C1W1 c1w1 = new C1W1(f);
        return new C43401n6(c1w1, c1w1, c1w1, c1w1);
    }

    public static C43401n6 LIZJ(float f, float f2) {
        return LIZIZ(f, f2, 0, 0);
    }

    public static final C43401n6 LIZIZ(float f, float f2, float f3, float f4) {
        return new C43401n6(new C1W1(f), new C1W1(f2), new C1W1(f3), new C1W1(f4));
    }
}
