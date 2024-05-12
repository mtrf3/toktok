package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0SK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SK {
    public static final float LIZ = 30;
    public static final InterfaceC07790Sh LIZIZ;
    public static final InterfaceC07790Sh LIZJ;

    static {
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        LIZIZ = C78840Uwu.LJI(c1m1, new InterfaceC11790dD() { // from class: X.1Lj
            @Override // X.InterfaceC11790dD
            public final AbstractC11540co LIZ(long j, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
                o.LJIIIZ(layoutDirection, "layoutDirection");
                o.LJIIIZ(density, "density");
                float LJJIJ = density.LJJIJ(C0SK.LIZ);
                return new C1QT(new C10390ax(0.0f, -LJJIJ, C10430b1.LIZLLL(j), C10430b1.LIZIZ(j) + LJJIJ));
            }
        });
        LIZJ = C78840Uwu.LJI(c1m1, new InterfaceC11790dD() { // from class: X.1Lk
            @Override // X.InterfaceC11790dD
            public final AbstractC11540co LIZ(long j, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
                o.LJIIIZ(layoutDirection, "layoutDirection");
                o.LJIIIZ(density, "density");
                float LJJIJ = density.LJJIJ(C0SK.LIZ);
                return new C1QT(new C10390ax(-LJJIJ, 0.0f, C10430b1.LIZLLL(j) + LJJIJ, C10430b1.LIZIZ(j)));
            }
        });
    }

    public static final InterfaceC07790Sh LIZ(InterfaceC07790Sh interfaceC07790Sh, C0UT c0ut) {
        InterfaceC07790Sh interfaceC07790Sh2;
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        if (c0ut == C0UT.Vertical) {
            interfaceC07790Sh2 = LIZJ;
        } else {
            interfaceC07790Sh2 = LIZIZ;
        }
        return interfaceC07790Sh.LLLIIIL(interfaceC07790Sh2);
    }
}
