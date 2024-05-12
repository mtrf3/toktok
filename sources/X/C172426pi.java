package X;

/* renamed from: X.6pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172426pi extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ XJL<C172456pl> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172426pi(XKS xks, String str, String str2) {
        super(0);
        this.LJLIL = xks;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        XJL<C172456pl> xjl = this.LJLIL;
        C172456pl c172456pl = new C172456pl(true, 2, "", this.LJLILLLLZI, this.LJLJI);
        C3C5.m7constructorimpl(c172456pl);
        xjl.resumeWith(c172456pl);
        return C76800UCe.LIZ;
    }
}
