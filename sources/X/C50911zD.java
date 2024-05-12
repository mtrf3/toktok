package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50911zD extends AbstractC014804a implements InterfaceC44951pb {
    public final EnumC09390Yl LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC88471Ynr<C23490w5, EnumC23500w6, C23450w1> LJLJJI;
    public final Object LJLJJL;

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
        return this.LJLJJL.hashCode() + C07250Qf.LIZ(this.LJLJI, this.LJLILLLLZI.hashCode() * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C50911zD)) {
            return false;
        }
        C50911zD c50911zD = (C50911zD) obj;
        if (this.LJLILLLLZI != c50911zD.LJLILLLLZI || this.LJLJI != c50911zD.LJLJI || !o.LJ(this.LJLJJL, c50911zD.LJLJJL)) {
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
        int LJIIIZ;
        int LJII;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        EnumC09390Yl enumC09390Yl = this.LJLILLLLZI;
        EnumC09390Yl enumC09390Yl2 = EnumC09390Yl.Vertical;
        int i = 0;
        if (enumC09390Yl != enumC09390Yl2) {
            LJIIIZ = 0;
        } else {
            LJIIIZ = C23360vs.LJIIIZ(j);
        }
        EnumC09390Yl enumC09390Yl3 = this.LJLILLLLZI;
        EnumC09390Yl enumC09390Yl4 = EnumC09390Yl.Horizontal;
        if (enumC09390Yl3 == enumC09390Yl4) {
            i = C23360vs.LJIIIIZZ(j);
        }
        int i2 = Integer.MAX_VALUE;
        if (this.LJLILLLLZI != enumC09390Yl2 && this.LJLJI) {
            LJII = Integer.MAX_VALUE;
        } else {
            LJII = C23360vs.LJII(j);
        }
        if (this.LJLILLLLZI == enumC09390Yl4 || !this.LJLJI) {
            i2 = C23360vs.LJI(j);
        }
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LIZJ(LJIIIZ, LJII, i, i2));
        int LJIIL = C78842Uww.LJIIL(LJJJIL.LJLIL, C23360vs.LJIIIZ(j), C23360vs.LJII(j));
        int LJIIL2 = C78842Uww.LJIIL(LJJJIL.LJLILLLLZI, C23360vs.LJIIIIZZ(j), C23360vs.LJI(j));
        LJJLIL = measure.LJJLIL(LJIIL, LJIIL2, C113554cx.LJJJLIIL(), new C50901zC(this, LJIIL, LJJJIL, LJIIL2, measure));
        return LJJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C50911zD(EnumC09390Yl direction, boolean z, InterfaceC88471Ynr<? super C23490w5, ? super EnumC23500w6, C23450w1> interfaceC88471Ynr, Object align, InterfaceC88472Yns<? super C04Z, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
        o.LJIIIZ(direction, "direction");
        o.LJIIIZ(align, "align");
        this.LJLILLLLZI = direction;
        this.LJLJI = z;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = align;
    }
}
