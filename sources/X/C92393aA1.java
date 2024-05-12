package X;

/* renamed from: X.aA1, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92393aA1 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ C91668ZyK LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ C91675ZyR LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92393aA1(Boolean bool, C91668ZyK c91668ZyK, Boolean bool2, C91675ZyR c91675ZyR, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, int i2) {
        super(2);
        this.LJLIL = bool;
        this.LJLILLLLZI = c91668ZyK;
        this.LJLJI = bool2;
        this.LJLJJI = c91675ZyR;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91673ZyP.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
