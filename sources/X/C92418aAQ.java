package X;

/* renamed from: X.aAQ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92418aAQ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92418aAQ(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, int i) {
        super(0);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.invoke(Integer.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
