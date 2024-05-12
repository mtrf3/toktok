package X;

/* renamed from: X.aJw, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93008aJw extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92309a8f LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC07790Sh LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93008aJw(C92309a8f c92309a8f, String str, String str2, InterfaceC07790Sh interfaceC07790Sh, boolean z, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.LJLIL = c92309a8f;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = interfaceC07790Sh;
        this.LJLJJL = z;
        this.LJLJJLL = str3;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1);
        return C76800UCe.LIZ;
    }
}
