package X;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
/* renamed from: X.SnP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73155SnP<A, B, C, D, E> extends AbstractC65781Prl implements InterfaceC88475Ynv<A, B, C, D, E, C76800UCe> {
    public final /* synthetic */ InterfaceC73149SnJ LJLIL;
    public final /* synthetic */ InterfaceC73150SnK LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ TBW LJLJJLL;
    public final /* synthetic */ TBW LJLJL;
    public final /* synthetic */ InterfaceC88476Ynw LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73155SnP(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, TBW tbw5, InterfaceC88476Ynw interfaceC88476Ynw) {
        super(5);
        this.LJLIL = interfaceC73149SnJ;
        this.LJLILLLLZI = interfaceC73150SnK;
        this.LJLJI = tbw;
        this.LJLJJI = tbw2;
        this.LJLJJL = tbw3;
        this.LJLJJLL = tbw4;
        this.LJLJL = tbw5;
        this.LJLJLJ = interfaceC88476Ynw;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InterfaceC98243tM receiver = this.LJLIL.getReceiver();
        if (receiver != null) {
            this.LJLJLJ.invoke(receiver, obj, obj2, obj3, obj4, obj5);
        }
        return C76800UCe.LIZ;
    }
}
