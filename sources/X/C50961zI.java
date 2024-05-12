package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1zI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50961zI extends AbstractC014804a implements InterfaceC44951pb {
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final boolean LJLJJLL;

    public C50961zI() {
        throw null;
    }

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
        return C16880lQ.LLJILJIL(this.LJLJJLL) + C47959Irz.LIZIZ(this.LJLJJL, C47959Irz.LIZIZ(this.LJLJJI, C47959Irz.LIZIZ(this.LJLJI, Float.floatToIntBits(this.LJLILLLLZI) * 31, 31), 31), 31);
    }

    public final boolean equals(Object obj) {
        C50961zI c50961zI;
        if (obj instanceof C50961zI) {
            c50961zI = (C50961zI) obj;
        } else {
            c50961zI = null;
        }
        if (c50961zI == null || !C23390vv.LIZJ(this.LJLILLLLZI, c50961zI.LJLILLLLZI) || !C23390vv.LIZJ(this.LJLJI, c50961zI.LJLJI) || !C23390vv.LIZJ(this.LJLJJI, c50961zI.LJLJJI) || !C23390vv.LIZJ(this.LJLJJL, c50961zI.LJLJJL) || this.LJLJJLL != c50961zI.LJLJJLL) {
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
        int LJJIJ = measure.LJJIJ(this.LJLJJI) + measure.LJJIJ(this.LJLILLLLZI);
        int LJJIJ2 = measure.LJJIJ(this.LJLJJL) + measure.LJJIJ(this.LJLJI);
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LJJIJIIJIL(-LJJIJ, -LJJIJ2, j));
        LJJLIL = measure.LJJLIL(C78555UsJ.LJIIJJI(LJJJIL.LJLIL + LJJIJ, j), C78555UsJ.LJIIJ(LJJJIL.LJLILLLLZI + LJJIJ2, j), C113554cx.LJJJLIIL(), new IDqS28S0300000(this, LJJJIL, measure, 16));
        return LJJLIL;
    }

    public C50961zI(float f, float f2, float f3, float f4) {
        super(g1.LIZ);
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = true;
        if ((f >= 0.0f || C23390vv.LIZJ(f, Float.NaN)) && ((f2 >= 0.0f || C23390vv.LIZJ(f2, Float.NaN)) && ((f3 >= 0.0f || C23390vv.LIZJ(f3, Float.NaN)) && (f4 >= 0.0f || C23390vv.LIZJ(f4, Float.NaN))))) {
            return;
        }
        "Padding must be non-negative".toString();
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
