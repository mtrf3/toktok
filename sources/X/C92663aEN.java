package X;

/* renamed from: X.aEN, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92663aEN extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92108a5Q LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92663aEN(C92108a5Q c92108a5Q, C92283a8F c92283a8F, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = c92108a5Q;
        this.LJLILLLLZI = c92283a8F;
        this.LJLJI = bool;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91856a1M.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}