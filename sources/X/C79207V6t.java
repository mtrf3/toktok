package X;

/* renamed from: X.V6t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79207V6t extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C79188V6a LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ InterfaceC07790Sh LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79207V6t(C79188V6a c79188V6a, boolean z, float f, float f2, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = c79188V6a;
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = f2;
        this.LJLJJL = interfaceC07790Sh;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C79175V5n.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
