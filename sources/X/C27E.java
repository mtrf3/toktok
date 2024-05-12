package X;

/* renamed from: X.27E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27E extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ C25860zu LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27E(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C25860zu c25860zu, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, int i2) {
        super(2);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c25860zu;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C25820zq.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
