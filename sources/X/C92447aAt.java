package X;

import java.util.List;

/* renamed from: X.aAt, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92447aAt extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92447aAt(int i, InterfaceC24760y8 interfaceC24760y8, List list, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC24760y8;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91736ZzQ.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1);
        return C76800UCe.LIZ;
    }
}
