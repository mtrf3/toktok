package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50931zF extends AbstractC014804a implements InterfaceC44951pb {
    public final EnumC09390Yl LJLILLLLZI;
    public final float LJLJI;

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
        return Float.floatToIntBits(this.LJLJI) + (this.LJLILLLLZI.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C50931zF)) {
            return false;
        }
        C50931zF c50931zF = (C50931zF) obj;
        if (this.LJLILLLLZI != c50931zF.LJLILLLLZI || this.LJLJI != c50931zF.LJLJI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50931zF(EnumC09390Yl direction, float f, InterfaceC88472Yns<? super C04Z, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
        o.LJIIIZ(direction, "direction");
        this.LJLILLLLZI = direction;
        this.LJLJI = f;
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        int LJIIIZ;
        int LJII;
        int LJIIIIZZ;
        int LJI;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        if (C23360vs.LIZLLL(j) && this.LJLILLLLZI != EnumC09390Yl.Vertical) {
            LJIIIZ = C78842Uww.LJIIL(O6R.LJJIIZ(C23360vs.LJII(j) * this.LJLJI), C23360vs.LJIIIZ(j), C23360vs.LJII(j));
            LJII = LJIIIZ;
        } else {
            LJIIIZ = C23360vs.LJIIIZ(j);
            LJII = C23360vs.LJII(j);
        }
        if (C23360vs.LIZJ(j) && this.LJLILLLLZI != EnumC09390Yl.Horizontal) {
            LJIIIIZZ = C78842Uww.LJIIL(O6R.LJJIIZ(C23360vs.LJI(j) * this.LJLJI), C23360vs.LJIIIIZZ(j), C23360vs.LJI(j));
            LJI = LJIIIIZZ;
        } else {
            LJIIIIZZ = C23360vs.LJIIIIZZ(j);
            LJI = C23360vs.LJI(j);
        }
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LIZJ(LJIIIZ, LJII, LJIIIIZZ, LJI));
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 189));
        return LJJLIL;
    }
}
