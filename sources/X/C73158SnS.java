package X;

/* JADX INFO: Add missing generic type declarations: [A, B] */
/* renamed from: X.SnS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73158SnS<A, B> extends AbstractC65781Prl implements InterfaceC88471Ynr<A, B, C76800UCe> {
    public final /* synthetic */ InterfaceC73149SnJ LJLIL;
    public final /* synthetic */ InterfaceC73150SnK LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73158SnS(InterfaceC73149SnJ interfaceC73149SnJ, InterfaceC73150SnK interfaceC73150SnK, TBW tbw, TBW tbw2, InterfaceC88473Ynt interfaceC88473Ynt) {
        super(2);
        this.LJLIL = interfaceC73149SnJ;
        this.LJLILLLLZI = interfaceC73150SnK;
        this.LJLJI = tbw;
        this.LJLJJI = tbw2;
        this.LJLJJL = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Object obj, Object obj2) {
        InterfaceC98243tM receiver = this.LJLIL.getReceiver();
        if (receiver != null) {
            this.LJLJJL.invoke(receiver, obj, obj2);
        }
        return C76800UCe.LIZ;
    }
}
