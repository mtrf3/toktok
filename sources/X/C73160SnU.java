package X;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
/* renamed from: X.SnU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73160SnU<A, B, C, D> extends AbstractC65781Prl implements InterfaceC88474Ynu<A, B, C, D, C76800UCe> {
    public final /* synthetic */ InterfaceC73149SnJ LJLIL;
    public final /* synthetic */ InterfaceC73150SnK LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ TBW LJLJJLL;
    public final /* synthetic */ InterfaceC88475Ynv LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73160SnU(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, InterfaceC88475Ynv interfaceC88475Ynv) {
        super(4);
        this.LJLIL = interfaceC73149SnJ;
        this.LJLILLLLZI = interfaceC73150SnK;
        this.LJLJI = tbw;
        this.LJLJJI = tbw2;
        this.LJLJJL = tbw3;
        this.LJLJJLL = tbw4;
        this.LJLJL = interfaceC88475Ynv;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC98243tM receiver = this.LJLIL.getReceiver();
        if (receiver != null) {
            this.LJLJL.invoke(receiver, obj, obj2, obj3, obj4);
        }
        return C76800UCe.LIZ;
    }
}
