package X;

/* renamed from: X.A4u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25648A4u extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ A4T LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ V7H LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25648A4u(A4T a4t, InterfaceC07790Sh interfaceC07790Sh, V7H v7h, int i, int i2) {
        super(2);
        this.LJLIL = a4t;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = v7h;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5R.LJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
