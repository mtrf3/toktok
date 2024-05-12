package X;

/* renamed from: X.237, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass237 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass237(long j, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C18490o1.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
        return C76800UCe.LIZ;
    }
}
