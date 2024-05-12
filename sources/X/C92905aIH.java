package X;

import java.util.List;

/* renamed from: X.aIH, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92905aIH extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<InterfaceC91996a3c> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92905aIH(List<? extends InterfaceC91996a3c> list, String str, InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns, int i) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            List<InterfaceC91996a3c> list = this.LJLIL;
            if (list == null || list.isEmpty()) {
                interfaceC24520xk2.LJJIIJ(1983318533);
                C91998a3e.LIZIZ(new C92254a7m(this.LJLILLLLZI), null, false, interfaceC24520xk2, 384, 2);
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(1983318837);
                C10160aa.LIZ(null, null, C70657RoD.LIZ(0.0f, 4, 1), false, null, null, null, false, new C92904aIG(this.LJLIL, this.LJLJI, this.LJLJJI), interfaceC24520xk2, 384, 251);
                interfaceC24520xk2.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
