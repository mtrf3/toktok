package X;

import kotlin.jvm.internal.o;

/* renamed from: X.24W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24W extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public static final C24W LJLIL = new C24W();

    public C24W() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        final float f = 56;
        return new InterfaceC21480sq(f) { // from class: X.1ZN
            public final float LIZ;

            public final boolean equals(Object obj3) {
                if (this == obj3) {
                    return true;
                }
                return (obj3 instanceof C1ZN) && C23390vv.LIZJ(this.LIZ, ((C1ZN) obj3).LIZ);
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("FixedThreshold(offset=");
                LIZ.append((Object) C23390vv.LIZLLL(this.LIZ));
                LIZ.append(')');
                return X1D.LIZIZ(LIZ);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.LIZ);
            }

            {
                this.LIZ = f;
            }

            @Override // X.InterfaceC21480sq
            public final float LIZ(InterfaceC23370vt interfaceC23370vt, float f2, float f3) {
                o.LJIIIZ(interfaceC23370vt, "<this>");
                return (Math.signum(f3 - f2) * interfaceC23370vt.LJJJJIZL(this.LIZ)) + f2;
            }
        };
    }
}
