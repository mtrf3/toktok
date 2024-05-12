package X;

/* renamed from: X.226, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass226 extends AbstractC65781Prl implements InterfaceC88472Yns<C1V9, C1V9> {
    public final /* synthetic */ InterfaceC32651Px LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass226(InterfaceC32651Px interfaceC32651Px, String str, String str2) {
        super(1);
        this.LJLIL = interfaceC32651Px;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C1V9 invoke(C1V9 c1v9) {
        return C1VA.LJIILIIL(c1v9, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }
}
