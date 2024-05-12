package X;

import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50941zG extends AbstractC014804a implements InterfaceC44951pb {
    public final InterfaceC88472Yns<InterfaceC23370vt, C23450w1> LJLILLLLZI;
    public final boolean LJLJI;

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
        return C16880lQ.LLJILJIL(this.LJLJI) + (this.LJLILLLLZI.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OffsetPxModifier(offset=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", rtlAware=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50941zG(X.InterfaceC88472Yns r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r0 = 1
            r2.LJLJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50941zG.<init>(X.Yns):void");
    }

    public final boolean equals(Object obj) {
        C50941zG c50941zG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50941zG) {
            c50941zG = (C50941zG) obj;
        } else {
            c50941zG = null;
        }
        if (c50941zG != null && o.LJ(this.LJLILLLLZI, c50941zG.LJLILLLLZI) && this.LJLJI == c50941zG.LJLJI) {
            return true;
        }
        return false;
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
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS28S0300000(this, measure, LJJJIL, 15));
        return LJJLIL;
    }
}
