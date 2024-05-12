package X;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* renamed from: X.SnT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73159SnT<A, B, C> extends AbstractC65781Prl implements InterfaceC88473Ynt<A, B, C, C76800UCe> {
    public final /* synthetic */ InterfaceC73149SnJ LJLIL;
    public final /* synthetic */ InterfaceC73150SnK LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ InterfaceC88474Ynu LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73159SnT(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, TBW tbw2, TBW tbw3, InterfaceC88474Ynu interfaceC88474Ynu) {
        super(3);
        this.LJLIL = interfaceC73149SnJ;
        this.LJLILLLLZI = interfaceC73150SnK;
        this.LJLJI = tbw;
        this.LJLJJI = tbw2;
        this.LJLJJL = tbw3;
        this.LJLJJLL = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC98243tM receiver = this.LJLIL.getReceiver();
        if (receiver != null) {
            this.LJLJJLL.invoke(receiver, obj, obj2, obj3);
        }
        return C76800UCe.LIZ;
    }
}
