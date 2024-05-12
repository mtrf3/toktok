package X;

import kotlin.jvm.internal.o;

/* renamed from: X.21h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC517321h implements InterfaceC39641h2, InterfaceC44911pX {
    public final InterfaceC14650hp LJLIL;
    public InterfaceC14650hp LJLILLLLZI;
    public InterfaceC274415w LJLJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public AbstractC517321h(C33651Tt defaultParent) {
        o.LJIIIZ(defaultParent, "defaultParent");
        this.LJLIL = defaultParent;
    }

    @Override // X.InterfaceC44911pX
    public final void LJJIZ(AbstractC538029g coordinates) {
        o.LJIIIZ(coordinates, "coordinates");
        this.LJLJI = coordinates;
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLILLLLZI = (InterfaceC14650hp) scope.LJII(C14640ho.LIZ);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
