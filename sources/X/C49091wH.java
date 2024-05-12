package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49091wH implements InterfaceC39641h2, InterfaceC39651h3<InterfaceC88472Yns<? super InterfaceC274415w, ? extends C76800UCe>>, InterfaceC88472Yns<InterfaceC274415w, C76800UCe> {
    public final InterfaceC88472Yns<InterfaceC274415w, C76800UCe> LJLIL;
    public InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> LJLILLLLZI;
    public InterfaceC274415w LJLJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final InterfaceC88472Yns<? super InterfaceC274415w, ? extends C76800UCe> getValue() {
        return this;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<InterfaceC88472Yns<? super InterfaceC274415w, ? extends C76800UCe>> getKey() {
        return C0SA.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49091wH(InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> handler) {
        o.LJIIIZ(handler, "handler");
        this.LJLIL = handler;
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns = (InterfaceC88472Yns) scope.LJII(C0SA.LIZ);
        if (!o.LJ(interfaceC88472Yns, this.LJLILLLLZI)) {
            this.LJLILLLLZI = interfaceC88472Yns;
        }
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC274415w interfaceC274415w) {
        InterfaceC274415w interfaceC274415w2 = interfaceC274415w;
        this.LJLJI = interfaceC274415w2;
        this.LJLIL.invoke(interfaceC274415w2);
        InterfaceC88472Yns<? super InterfaceC274415w, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(interfaceC274415w2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
