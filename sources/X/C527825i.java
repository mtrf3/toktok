package X;

/* renamed from: X.25i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C527825i extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ AbstractC16010k1 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC07790Sh LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527825i(AbstractC16010k1 abstractC16010k1, String str, InterfaceC07790Sh interfaceC07790Sh, long j, int i, int i2) {
        super(2);
        this.LJLIL = abstractC16010k1;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC07790Sh;
        this.LJLJJI = j;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C21810tN.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
