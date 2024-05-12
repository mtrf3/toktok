package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V1f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79063V1f implements InterfaceC44951pb {
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
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJLIL);
    }

    public C79063V1f(long j) {
        this.LJLIL = j;
    }

    public final boolean equals(Object obj) {
        C79063V1f c79063V1f;
        if (obj instanceof C79063V1f) {
            c79063V1f = (C79063V1f) obj;
        } else {
            c79063V1f = null;
        }
        if (c79063V1f == null || this.LJLIL != c79063V1f.LJLIL) {
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
        LJJLIL = measure.LJJLIL(max, max2, C113554cx.LJJJLIIL(), new C79064V1g(max, LJJJIL, max2));
        return LJJLIL;
    }
}
