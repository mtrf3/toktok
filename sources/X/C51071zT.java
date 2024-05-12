package X;

import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51071zT extends AbstractC014804a implements InterfaceC44951pb {
    public final InterfaceC09420Yo LJLILLLLZI;

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
        return this.LJLILLLLZI.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51071zT(X.InterfaceC09420Yo r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "paddingValues"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51071zT.<init>(X.0Yo):void");
    }

    public final boolean equals(Object obj) {
        C51071zT c51071zT;
        if (!(obj instanceof C51071zT) || (c51071zT = (C51071zT) obj) == null) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, c51071zT.LJLILLLLZI);
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
        float f = 0;
        if (Float.compare(this.LJLILLLLZI.LIZJ(measure.getLayoutDirection()), f) >= 0 && Float.compare(this.LJLILLLLZI.LIZLLL(), f) >= 0 && Float.compare(this.LJLILLLLZI.LIZ(measure.getLayoutDirection()), f) >= 0 && Float.compare(this.LJLILLLLZI.LIZIZ(), f) >= 0) {
            int LJJIJ = measure.LJJIJ(this.LJLILLLLZI.LIZ(measure.getLayoutDirection())) + measure.LJJIJ(this.LJLILLLLZI.LIZJ(measure.getLayoutDirection()));
            int LJJIJ2 = measure.LJJIJ(this.LJLILLLLZI.LIZIZ()) + measure.LJJIJ(this.LJLILLLLZI.LIZLLL());
            AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LJJIJIIJIL(-LJJIJ, -LJJIJ2, j));
            LJJLIL = measure.LJJLIL(C78555UsJ.LJIIJJI(LJJJIL.LJLIL + LJJIJ, j), C78555UsJ.LJIIJ(LJJJIL.LJLILLLLZI + LJJIJ2, j), C113554cx.LJJJLIIL(), new IDqS28S0300000(LJJJIL, measure, this, 17));
            return LJJLIL;
        }
        "Padding must be non-negative".toString();
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
