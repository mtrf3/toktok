package X;

/* loaded from: classes8.dex */
public final class I79 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I79(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        super(0);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.invoke(Boolean.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
