package X;

/* renamed from: X.aJ0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92950aJ0 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92276a88 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92950aJ0(C92276a88 c92276a88, boolean z, String str, boolean z2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.LJLIL = c92276a88;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1);
        return C76800UCe.LIZ;
    }
}