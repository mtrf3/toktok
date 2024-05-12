package X;

import kotlin.jvm.internal.IDqS0S0301000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.23q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523423q extends F9E implements InterfaceC44951pb {
    public final C18690oL LJLIL;
    public final int LJLILLLLZI;
    public final C14770i1 LJLJI;
    public final InterfaceC65784Pro<C18830oZ> LJLJJI;

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
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI};
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
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C23360vs.LIZ(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(LJJJIL.LJLILLLLZI, C23360vs.LJI(j));
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, min, C113554cx.LJJJLIIL(), new IDqS0S0301000(measure, this, LJJJIL, min, 4));
        return LJJLIL;
    }

    public C523423q(C18690oL c18690oL, int i, C14770i1 c14770i1, IDqS420S0100000 iDqS420S0100000) {
        this.LJLIL = c18690oL;
        this.LJLILLLLZI = i;
        this.LJLJI = c14770i1;
        this.LJLJJI = iDqS420S0100000;
    }
}
