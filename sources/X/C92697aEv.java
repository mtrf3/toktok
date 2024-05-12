package X;

/* renamed from: X.aEv, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92697aEv extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<C23390vv, InterfaceC24520xk, Integer, C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92697aEv(InterfaceC07790Sh interfaceC07790Sh, float f, boolean z, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88473Ynt<? super C23390vv, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i, int i2) {
        super(2);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = f;
        this.LJLJI = z;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91866a1W.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
