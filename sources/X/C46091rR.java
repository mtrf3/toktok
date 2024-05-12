package X;

/* renamed from: X.1rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46091rR extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC32701Qc, C76800UCe> LJLIL;
    public final /* synthetic */ C0DV LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ float LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46091rR(InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns, C0DV c0dv, long j, float f) {
        super(0);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = c0dv;
        this.LJLJI = j;
        this.LJLJJI = f;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C39191gJ c39191gJ = AbstractC274515x.LIZ;
        InterfaceC88472Yns<InterfaceC32701Qc, C76800UCe> interfaceC88472Yns = this.LJLIL;
        C0DV c0dv = this.LJLILLLLZI;
        long j = this.LJLJI;
        float f = this.LJLJJI;
        if (interfaceC88472Yns == null) {
            AbstractC538029g LIZJ = c0dv.LIZJ();
            c39191gJ.getClass();
            AbstractC274515x.LJ(LIZJ, j, f);
        } else {
            AbstractC538029g LIZJ2 = c0dv.LIZJ();
            c39191gJ.getClass();
            AbstractC274515x.LJIIJ(LIZJ2, j, f, interfaceC88472Yns);
        }
        return C76800UCe.LIZ;
    }
}
