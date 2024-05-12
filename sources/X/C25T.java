package X;

/* renamed from: X.25T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25T extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Float LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25T(int i, long j, Float f, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = i;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL != null) {
                interfaceC24520xk2.LJJIIJ(-452622131);
                C24410xZ.LIZ(new C24620xu[]{C21610t3.LIZ.LIZIZ(this.LJLIL)}, this.LJLILLLLZI, interfaceC24520xk2, ((this.LJLJI >> 6) & 112) | 8);
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(-452621951);
                C24410xZ.LIZ(new C24620xu[]{C21610t3.LIZ.LIZIZ(Float.valueOf(C11850dJ.LIZLLL(this.LJLJJI)))}, this.LJLILLLLZI, interfaceC24520xk2, ((this.LJLJI >> 6) & 112) | 8);
                interfaceC24520xk2.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
