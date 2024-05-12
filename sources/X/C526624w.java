package X;

import kotlin.jvm.internal.o;

/* renamed from: X.24w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C526624w extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public static final C526624w LJLIL = new C526624w();

    public C526624w() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC07790Sh interfaceC07790Sh2;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        C111074Xn.LIZIZ(num, interfaceC07790Sh, "$this$composed", interfaceC24520xk2, 1220403677);
        if (((Boolean) interfaceC24520xk2.LJIILLIIL(C21500ss.LIZ)).booleanValue()) {
            final long LJ = ((InterfaceC015404g) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIILJJIL)).LJ();
            interfaceC07790Sh2 = new InterfaceC44951pb(LJ) { // from class: X.24o
                public final long LJLIL;

                @Override // X.InterfaceC07790Sh
                public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
                    return C48263Iwt.LIZ(this, interfaceC88472Yns);
                }

                @Override // X.InterfaceC44951pb
                public final /* synthetic */ int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
                    return C79062V1e.LIZIZ(this, interfaceC39181gI, interfaceC274115t, i);
                }

                @Override // X.InterfaceC44951pb
                public final /* synthetic */ int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
                    return C79062V1e.LIZLLL(this, interfaceC39181gI, interfaceC274115t, i);
                }

                @Override // X.InterfaceC44951pb
                public final /* synthetic */ int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
                    return C79062V1e.LIZ(this, interfaceC39181gI, interfaceC274115t, i);
                }

                @Override // X.InterfaceC44951pb
                public final /* synthetic */ int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
                    return C79062V1e.LIZJ(this, interfaceC39181gI, interfaceC274115t, i);
                }

                @Override // X.InterfaceC07790Sh
                public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh3) {
                    return C07780Sg.LIZ(this, interfaceC07790Sh3);
                }

                public final int hashCode() {
                    return C16880lQ.LLJIJIL(this.LJLIL);
                }

                {
                    this.LJLIL = LJ;
                }

                public final boolean equals(Object obj) {
                    C525824o c525824o;
                    if (obj instanceof C525824o) {
                        c525824o = (C525824o) obj;
                    } else {
                        c525824o = null;
                    }
                    if (c525824o == null || this.LJLIL != c525824o.LJLIL) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC07790Sh
                public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
                    o.LJIIIZ(operation, "operation");
                    return operation.invoke(obj, this);
                }

                @Override // X.InterfaceC44951pb
                public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
                    InterfaceC273515n LJJLIL;
                    o.LJIIIZ(measure, "$this$measure");
                    AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
                    int max = Math.max(LJJJIL.LJLIL, measure.LJJIJ(C23430vz.LIZIZ(this.LJLIL)));
                    int max2 = Math.max(LJJJIL.LJLILLLLZI, measure.LJJIJ(C23430vz.LIZ(this.LJLIL)));
                    LJJLIL = measure.LJJLIL(max, max2, C113554cx.LJJJLIIL(), new C525724n(max, LJJJIL, max2));
                    return LJJLIL;
                }
            };
        } else {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        interfaceC24520xk2.LJJIJIIJIL();
        return interfaceC07790Sh2;
    }
}
