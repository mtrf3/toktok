package X;

/* renamed from: X.6fR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166056fR extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC166046fQ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166056fR(InterfaceC166046fQ interfaceC166046fQ, String str, int i) {
        super(1);
        this.LJLIL = interfaceC166046fQ;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        this.LJLIL.LIZIZ(this.LJLJI, intValue, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
