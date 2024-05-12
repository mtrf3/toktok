package X;

/* renamed from: X.25H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25H extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ Float LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25H(int i, long j, Float f, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = f;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            C24410xZ.LIZ(new C24620xu[]{C21620t4.LIZ.LIZIZ(new C11850dJ(this.LJLIL))}, C1DJ.LJ(interfaceC24520xk2, -1132188434, new C25T(this.LJLJJI, this.LJLIL, this.LJLILLLLZI, this.LJLJI)), interfaceC24520xk2, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
