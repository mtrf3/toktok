package X;

/* loaded from: classes9.dex */
public final class J9H extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AbstractC36569EWv LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9H(AbstractC36569EWv abstractC36569EWv, String str, int i, int i2, String str2) {
        super(0);
        this.LJLIL = abstractC36569EWv;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJJJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
