package X;

/* renamed from: X.25X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25X extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25X(int i, long j, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = z;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C21700tC.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
        return C76800UCe.LIZ;
    }
}
