package X;

/* loaded from: classes14.dex */
public final class V7B extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7B(String str, int i) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        String str = this.LJLIL;
        V5Z.LIZLLL(this.LJLILLLLZI | 1, interfaceC24520xk, str);
        return C76800UCe.LIZ;
    }
}
