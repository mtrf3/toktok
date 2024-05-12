package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49261wY extends AbstractC65781Prl implements InterfaceC65784Pro<C0SU> {
    public static final C49261wY LJLIL = new C49261wY();

    public C49261wY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C0SU invoke() {
        return new C0SU() { // from class: X.1Ln
            @Override // X.C0SU
            public final C0SW LIZ(C0X9 interactionSource, InterfaceC24520xk interfaceC24520xk) {
                o.LJIIIZ(interactionSource, "interactionSource");
                interfaceC24520xk.LJJIIJ(1683566979);
                InterfaceC35811ar LJFF = C1O1.LJFF(interactionSource, interfaceC24520xk, 0);
                interfaceC24520xk.LJJIIJ(1206586544);
                interfaceC24520xk.LJJIIJ(-492369756);
                Object LJIILL = interfaceC24520xk.LJIILL();
                InterfaceC24520xk.LIZ.getClass();
                Object obj = C24500xi.LIZIZ;
                if (LJIILL == obj) {
                    LJIILL = C78966Uyw.LJJJIL(Boolean.FALSE);
                    interfaceC24520xk.LJJIII(LJIILL);
                }
                interfaceC24520xk.LJJIJIIJIL();
                InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
                interfaceC24520xk.LJJIIJ(511388516);
                boolean LJIJJ = interfaceC24520xk.LJIJJ(interactionSource) | interfaceC24520xk.LJIJJ(interfaceC35811ar);
                Object LJIILL2 = interfaceC24520xk.LJIILL();
                if (LJIJJ || LJIILL2 == obj) {
                    LJIILL2 = new C2DX(interactionSource, interfaceC35811ar, null);
                    interfaceC24520xk.LJJIII(LJIILL2);
                }
                interfaceC24520xk.LJJIJIIJIL();
                C24610xt.LJ(interactionSource, (InterfaceC88471Ynr) LJIILL2, interfaceC24520xk);
                interfaceC24520xk.LJJIJIIJIL();
                InterfaceC35811ar LJIIL = C78949Uyf.LJIIL(interactionSource, interfaceC24520xk, 0);
                interfaceC24520xk.LJJIIJ(1157296644);
                boolean LJIJJ2 = interfaceC24520xk.LJIJJ(interactionSource);
                Object LJIILL3 = interfaceC24520xk.LJIILL();
                if (LJIJJ2 || LJIILL3 == obj) {
                    LJIILL3 = new C0SW(LJFF, interfaceC35811ar, LJIIL) { // from class: X.1Lm
                        public final InterfaceC24760y8<Boolean> LJLIL;
                        public final InterfaceC24760y8<Boolean> LJLILLLLZI;
                        public final InterfaceC24760y8<Boolean> LJLJI;

                        @Override // X.C0SW
                        public final void LIZ(InterfaceC43021mU interfaceC43021mU) {
                            o.LJIIIZ(interfaceC43021mU, "<this>");
                            interfaceC43021mU.LJJLIIIIJ();
                            if (this.LJLIL.getValue().booleanValue()) {
                                C14720hw.LJIIIIZZ(interfaceC43021mU, C11850dJ.LIZIZ(C11850dJ.LIZIZ, 0.3f), 0L, interfaceC43021mU.LIZIZ(), 0.0f, null, 122);
                            } else {
                                if (!this.LJLILLLLZI.getValue().booleanValue() && !this.LJLJI.getValue().booleanValue()) {
                                    return;
                                }
                                C14720hw.LJIIIIZZ(interfaceC43021mU, C11850dJ.LIZIZ(C11850dJ.LIZIZ, 0.1f), 0L, interfaceC43021mU.LIZIZ(), 0.0f, null, 122);
                            }
                        }

                        {
                            o.LJIIIZ(LJFF, "isPressed");
                            o.LJIIIZ(interfaceC35811ar, "isHovered");
                            o.LJIIIZ(LJIIL, "isFocused");
                            this.LJLIL = LJFF;
                            this.LJLILLLLZI = interfaceC35811ar;
                            this.LJLJI = LJIIL;
                        }
                    };
                    interfaceC24520xk.LJJIII(LJIILL3);
                }
                interfaceC24520xk.LJJIJIIJIL();
                C31501Lm c31501Lm = (C31501Lm) LJIILL3;
                interfaceC24520xk.LJJIJIIJIL();
                return c31501Lm;
            }
        };
    }
}
