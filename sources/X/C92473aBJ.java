package X;

import java.util.List;
import kotlin.jvm.internal.IDqS33S0300000_31;
import kotlin.jvm.internal.IDqS9S0400000_31;

/* renamed from: X.aBJ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92473aBJ extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ C1ZD LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92473aBJ(List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC70422pa interfaceC70422pa, C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC24760y8;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = c1zd;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC07790Sh LIZLLL;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            LIZLLL = C78996UzQ.LIZLLL(C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, 1), C11850dJ.LJFF, C11710d5.LIZ);
            C79057V0z.LJ(LIZLLL, interfaceC24520xk2, 0);
            C91736ZzQ.LIZIZ(this.LJLIL, this.LJLILLLLZI, new IDqS9S0400000_31((InterfaceC88472Yns) this.LJLJI, (InterfaceC88472Yns<? super Integer, C76800UCe>) this.LJLJJI, (InterfaceC70422pa) this.LJLJJL, (C1ZD) this.LJLJJLL, (InterfaceC65784Pro<C76800UCe>) 1), new IDqS33S0300000_31(this.LJLJJI, (InterfaceC70422pa) this.LJLJJL, (C1ZD) this.LJLJJLL, (InterfaceC65784Pro<C76800UCe>) 1), interfaceC24520xk2, 8);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
