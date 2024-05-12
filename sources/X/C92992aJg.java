package X;

/* renamed from: X.aJg, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92992aJg extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92992aJg(float f, int i, int i2, long j, long j2, InterfaceC07790Sh interfaceC07790Sh) {
        super(2);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = f;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        InterfaceC07790Sh interfaceC07790Sh = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        C92057a4b.LIZ(this.LJLJJI, this.LJLJJL | 1, this.LJLJJLL, j, j2, interfaceC24520xk, interfaceC07790Sh);
        return C76800UCe.LIZ;
    }
}
