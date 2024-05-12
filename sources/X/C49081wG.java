package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49081wG implements InterfaceC39641h2, InterfaceC44901pW {
    public InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> LJLIL;
    public InterfaceC274415w LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC44901pW
    public final void LJIJJ(AbstractC538029g abstractC538029g) {
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns;
        this.LJLILLLLZI = abstractC538029g;
        if (abstractC538029g.LIZLLL()) {
            InterfaceC274415w interfaceC274415w = this.LJLILLLLZI;
            if (interfaceC274415w != null && interfaceC274415w.LIZLLL() && (interfaceC88472Yns = this.LJLIL) != null) {
                interfaceC88472Yns.invoke(this.LJLILLLLZI);
                return;
            }
            return;
        }
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns2 = this.LJLIL;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(null);
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(scope, "scope");
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns2 = (InterfaceC88472Yns) scope.LJII(C0SA.LIZ);
        if (interfaceC88472Yns2 == null && (interfaceC88472Yns = this.LJLIL) != null) {
            interfaceC88472Yns.invoke(null);
        }
        this.LJLIL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
