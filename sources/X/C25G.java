package X;

/* renamed from: X.25G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25G extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C08370Un LJLILLLLZI;
    public final /* synthetic */ Float LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25G(long j, C08370Un c08370Un, Float f, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, int i2) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = c08370Un;
        this.LJLJI = f;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C21640t6.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
