package X;

import kotlin.jvm.internal.IDqS4S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.1wC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49041wC extends F9E implements InterfaceC44951pb {
    public final C31431Lf LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final C0SP LJLJJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.InterfaceC44951pb
    public final int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (this.LJLJI) {
            return interfaceC274115t.LJJLJLI(Integer.MAX_VALUE);
        }
        return interfaceC274115t.LJJLJLI(i);
    }

    @Override // X.InterfaceC44951pb
    public final int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (this.LJLJI) {
            return interfaceC274115t.LJJJI(Integer.MAX_VALUE);
        }
        return interfaceC274115t.LJJJI(i);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        C0UT c0ut;
        int LJI;
        int i;
        boolean z;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        if (this.LJLJI) {
            c0ut = C0UT.Vertical;
        } else {
            c0ut = C0UT.Horizontal;
        }
        C78983UzD.LJIIIZ(j, c0ut);
        if (this.LJLJI) {
            LJI = Integer.MAX_VALUE;
        } else {
            LJI = C23360vs.LJI(j);
        }
        if (this.LJLJI) {
            i = C23360vs.LJII(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C23360vs.LIZ(j, 0, i, 0, LJI, 5));
        int i2 = LJJJIL.LJLIL;
        int LJII = C23360vs.LJII(j);
        if (i2 > LJII) {
            i2 = LJII;
        }
        int i3 = LJJJIL.LJLILLLLZI;
        int LJI2 = C23360vs.LJI(j);
        if (i3 > LJI2) {
            i3 = LJI2;
        }
        int i4 = LJJJIL.LJLILLLLZI - i3;
        int i5 = LJJJIL.LJLIL - i2;
        if (!this.LJLJI) {
            i4 = i5;
        }
        C0SP c0sp = this.LJLJJI;
        if (i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        c0sp.setEnabled(z);
        C31431Lf c31431Lf = this.LJLIL;
        c31431Lf.LIZJ.setValue(Integer.valueOf(i4));
        if (c31431Lf.LJ() > i4) {
            c31431Lf.LIZ.setValue(Integer.valueOf(i4));
        }
        LJJLIL = measure.LJJLIL(i2, i3, C113554cx.LJJJLIIL(), new IDqS4S0201000(this, i4, LJJJIL, 0));
        return LJJLIL;
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (this.LJLJI) {
            return interfaceC274115t.LJJLIIIJILLIZJL(i);
        }
        return interfaceC274115t.LJJLIIIJILLIZJL(Integer.MAX_VALUE);
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        o.LJIIIZ(interfaceC39181gI, "<this>");
        if (this.LJLJI) {
            return interfaceC274115t.LJJLIIIJLLLLLLLZ(i);
        }
        return interfaceC274115t.LJJLIIIJLLLLLLLZ(Integer.MAX_VALUE);
    }

    public C49041wC(C31431Lf scrollerState, boolean z, boolean z2, C0SP overscrollEffect) {
        o.LJIIIZ(scrollerState, "scrollerState");
        o.LJIIIZ(overscrollEffect, "overscrollEffect");
        this.LJLIL = scrollerState;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = overscrollEffect;
    }
}
