package X;

/* loaded from: classes14.dex */
public final class V5I extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5I(int i, int i2, boolean z, int i3, int i4) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5F.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
