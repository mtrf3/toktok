package X;

import java.util.List;

/* renamed from: X.aEL, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92661aEL extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<C91872a1c> LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92661aEL(List<C91872a1c> list, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91856a1M.LIZIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
