package X;

import kotlin.jvm.internal.IDqS13S0101000;
import kotlin.jvm.internal.o;

/* renamed from: X.1wA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49021wA extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC44861pS, InterfaceC39071g7, C23360vs, InterfaceC273515n> {
    public static final C49021wA LJLIL = new C49021wA();

    public C49021wA() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC273515n invoke(InterfaceC44861pS interfaceC44861pS, InterfaceC39071g7 interfaceC39071g7, C23360vs c23360vs) {
        InterfaceC273515n LJJLIL;
        InterfaceC44861pS layout = interfaceC44861pS;
        InterfaceC39071g7 measurable = interfaceC39071g7;
        long j = c23360vs.LIZ;
        o.LJIIIZ(layout, "$this$layout");
        o.LJIIIZ(measurable, "measurable");
        AbstractC39201gK LJJJIL = measurable.LJJJIL(j);
        int LJJIJ = layout.LJJIJ(C0SK.LIZ * 2);
        LJJLIL = layout.LJJLIL(LJJJIL.LJJZZIII() - LJJIJ, LJJJIL.LJJZZI() - LJJIJ, C113554cx.LJJJLIIL(), new IDqS13S0101000(LJJJIL, LJJIJ, 4));
        return LJJLIL;
    }
}
