package X;

/* loaded from: classes11.dex */
public final class OJG extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC59973NgH> {
    public final /* synthetic */ OJD LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OJG(OJD ojd, CharSequence charSequence, int i) {
        super(0);
        this.LJLIL = ojd;
        this.LJLILLLLZI = charSequence;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC59973NgH invoke() {
        return this.LJLIL.find(this.LJLILLLLZI, this.LJLJI);
    }
}
