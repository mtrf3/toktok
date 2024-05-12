package X;

/* loaded from: classes13.dex */
public final class T27 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ T26 LJLILLLLZI;
    public final /* synthetic */ InterfaceC07790Sh LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T27(String str, T26 t26, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = t26;
        this.LJLJI = interfaceC07790Sh;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V59.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
