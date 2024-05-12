package X;

/* renamed from: X.25L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25L extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25L(float f, int i, int i2, long j, long j2, InterfaceC07790Sh interfaceC07790Sh) {
        super(2);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        float f = this.LJLIL;
        InterfaceC07790Sh interfaceC07790Sh = this.LJLILLLLZI;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        C21660t8.LIZ(f, this.LJLJJL | 1, this.LJLJJLL, j, j2, interfaceC24520xk, interfaceC07790Sh);
        return C76800UCe.LIZ;
    }
}
