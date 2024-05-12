package X;

import X.InterfaceC23340vq;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.265, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass265<T extends InterfaceC23340vq> implements InterfaceC39641h2, InterfaceC39651h3<AnonymousClass265<T>> {
    public final InterfaceC88472Yns<InterfaceC23340vq, Boolean> LJLIL;
    public final InterfaceC88472Yns<InterfaceC23340vq, Boolean> LJLILLLLZI;
    public final C17R<AnonymousClass265<T>> LJLJI;
    public AnonymousClass265<T> LJLJJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final Object getValue() {
        return this;
    }

    @Override // X.InterfaceC39651h3
    public final C17R<AnonymousClass265<T>> getKey() {
        return this.LJLJI;
    }

    public final boolean LIZ(C38711fX c38711fX) {
        InterfaceC88472Yns<InterfaceC23340vq, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null && interfaceC88472Yns.invoke(c38711fX).booleanValue()) {
            return true;
        }
        AnonymousClass265<T> anonymousClass265 = this.LJLJJI;
        if (anonymousClass265 == null) {
            return false;
        }
        return anonymousClass265.LIZ(c38711fX);
    }

    public final boolean LIZIZ(C38711fX c38711fX) {
        AnonymousClass265<T> anonymousClass265 = this.LJLJJI;
        if (anonymousClass265 != null && anonymousClass265.LIZIZ(c38711fX)) {
            return true;
        }
        InterfaceC88472Yns<InterfaceC23340vq, Boolean> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns == null) {
            return false;
        }
        return interfaceC88472Yns.invoke(c38711fX).booleanValue();
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLJJI = (AnonymousClass265) scope.LJII(this.LJLJI);
    }

    public AnonymousClass265(IDqS416S0100000 iDqS416S0100000, C17R key) {
        o.LJIIIZ(key, "key");
        this.LJLIL = iDqS416S0100000;
        this.LJLILLLLZI = null;
        this.LJLJI = key;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
