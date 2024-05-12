package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.2B6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B6 extends AbstractC48141uk {
    public final C0Q2<C23490w5> LJLIL;
    public final InterfaceC70422pa LJLILLLLZI;
    public InterfaceC88471Ynr<? super C23490w5, ? super C23490w5, C76800UCe> LJLJI;
    public C0NZ LJLJJI;

    public C2B6(C1J4 animSpec, InterfaceC70422pa scope) {
        o.LJIIIZ(animSpec, "animSpec");
        o.LJIIIZ(scope, "scope");
        this.LJLIL = animSpec;
        this.LJLILLLLZI = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS receiver, InterfaceC39071g7 interfaceC39071g7, long j) {
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(receiver, "$receiver");
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
        long LIZIZ = C78996UzQ.LIZIZ(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI);
        C0NZ c0nz = this.LJLJJI;
        if (c0nz == null) {
            c0nz = new C0NZ(new C07070Pn(new C23490w5(LIZIZ), C0QD.LJII, new C23490w5(C78996UzQ.LIZIZ(1, 1))), LIZIZ);
        } else if (!C23490w5.LIZ(LIZIZ, ((C23490w5) c0nz.LIZ.LJ.getValue()).LIZ)) {
            c0nz.LIZIZ = c0nz.LIZ.LIZJ().LIZ;
            XKX.LIZLLL(this.LJLILLLLZI, null, null, new C2B7(c0nz, LIZIZ, this, null), 3);
        }
        this.LJLJJI = c0nz;
        long j2 = c0nz.LIZ.LIZJ().LIZ;
        LJJLIL = receiver.LJJLIL((int) (j2 >> 32), C23490w5.LIZIZ(j2), C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 103));
        return LJJLIL;
    }
}
