package X;

import kotlin.jvm.internal.IDqS0S0200100;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2B8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B8 extends AbstractC48141uk {
    public final C07160Pw<EnumC06630Nv>.a<C23450w1, C1JN> LJLIL;
    public final InterfaceC24760y8<C1I3> LJLILLLLZI;
    public final InterfaceC24760y8<C1I3> LJLJI;
    public final IDqS416S0100000 LJLJJI;

    public C2B8(C07160Pw<EnumC06630Nv>.a<C23450w1, C1JN> lazyAnimation, InterfaceC24760y8<C1I3> slideIn, InterfaceC24760y8<C1I3> slideOut) {
        o.LJIIIZ(lazyAnimation, "lazyAnimation");
        o.LJIIIZ(slideIn, "slideIn");
        o.LJIIIZ(slideOut, "slideOut");
        this.LJLIL = lazyAnimation;
        this.LJLILLLLZI = slideIn;
        this.LJLJI = slideOut;
        this.LJLJJI = new IDqS416S0100000(this, 107);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS receiver, InterfaceC39071g7 interfaceC39071g7, long j) {
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(receiver, "$receiver");
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
        LJJLIL = receiver.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS0S0200100(this, LJJJIL, C78996UzQ.LIZIZ(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI), 0));
        return LJJLIL;
    }
}
