package X;

import X.C07160Pw;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS4S0100100;
import kotlin.jvm.internal.o;

/* renamed from: X.2BA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BA extends AbstractC48141uk {
    public final C07160Pw<EnumC06630Nv>.a<C23490w5, C1JN> LJLIL;
    public final C07160Pw<EnumC06630Nv>.a<C23450w1, C1JN> LJLILLLLZI;
    public final InterfaceC24760y8<C1I8> LJLJI;
    public final InterfaceC24760y8<C1I8> LJLJJI;
    public final InterfaceC24760y8<InterfaceC07760Se> LJLJJL;
    public InterfaceC07760Se LJLJJLL;
    public final IDqS416S0100000 LJLJL;

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS receiver, InterfaceC39071g7 interfaceC39071g7, long j) {
        long j2;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(receiver, "$receiver");
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
        long LIZIZ = C78996UzQ.LIZIZ(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI);
        long j3 = ((C23490w5) this.LJLIL.LIZ(this.LJLJL, new IDqS4S0100100(this, LIZIZ, 2)).getValue()).LIZ;
        long j4 = ((C23450w1) this.LJLILLLLZI.LIZ(C48111uh.LJLIL, new IDqS4S0100100(this, LIZIZ, 3)).getValue()).LIZ;
        InterfaceC07760Se interfaceC07760Se = this.LJLJJLL;
        if (interfaceC07760Se == null) {
            j2 = C23450w1.LIZIZ;
        } else {
            j2 = new C23450w1(interfaceC07760Se.q(LIZIZ, j3, EnumC23500w6.Ltr)).LIZ;
        }
        LJJLIL = receiver.LJJLIL((int) (j3 >> 32), C23490w5.LIZIZ(j3), C113554cx.LJJJLIIL(), new C48101ug(LJJJIL, j2, j4));
        return LJJLIL;
    }

    public C2BA(C07160Pw.a sizeAnimation, C07160Pw.a offsetAnimation, InterfaceC24760y8 expand, InterfaceC24760y8 shrink, InterfaceC35811ar interfaceC35811ar) {
        o.LJIIIZ(sizeAnimation, "sizeAnimation");
        o.LJIIIZ(offsetAnimation, "offsetAnimation");
        o.LJIIIZ(expand, "expand");
        o.LJIIIZ(shrink, "shrink");
        this.LJLIL = sizeAnimation;
        this.LJLILLLLZI = offsetAnimation;
        this.LJLJI = expand;
        this.LJLJJI = shrink;
        this.LJLJJL = interfaceC35811ar;
        this.LJLJL = new IDqS416S0100000(this, 116);
    }
}
