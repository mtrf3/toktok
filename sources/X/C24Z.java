package X;

/* renamed from: X.24Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24Z extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C21370sf LJLIL;
    public final /* synthetic */ EnumC21820tO LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<EnumC21820tO, InterfaceC24520xk, Integer, C11850dJ> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC88476Ynw<Float, C11850dJ, C11850dJ, Float, InterfaceC24520xk, Integer, C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24Z(C21370sf c21370sf, EnumC21820tO enumC21820tO, long j, long j2, InterfaceC88473Ynt<? super EnumC21820tO, ? super InterfaceC24520xk, ? super Integer, C11850dJ> interfaceC88473Ynt, boolean z, InterfaceC88476Ynw<? super Float, ? super C11850dJ, ? super C11850dJ, ? super Float, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88476Ynw, int i) {
        super(2);
        this.LJLIL = c21370sf;
        this.LJLILLLLZI = enumC21820tO;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = z;
        this.LJLJL = interfaceC88476Ynw;
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1);
        return C76800UCe.LIZ;
    }
}
