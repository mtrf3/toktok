package X;

/* renamed from: X.V0y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79056V0y extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79056V0y(boolean z, boolean z2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5N.LJFF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
        return C76800UCe.LIZ;
    }
}
