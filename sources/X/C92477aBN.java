package X;

import java.util.List;

/* renamed from: X.aBN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92477aBN extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ C1ZD LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92477aBN(List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC70422pa interfaceC70422pa, C1ZD c1zd, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
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
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C91673ZyP.LIZ(Boolean.valueOf(C91671ZyN.LIZ), null, Boolean.valueOf(C91671ZyN.LIZIZ), C91671ZyN.LIZIZ(), C1DJ.LJ(interfaceC24520xk2, -819891762, new C92473aBJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL)), interfaceC24520xk2, 24576, 2);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
