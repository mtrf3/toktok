package X;

/* renamed from: X.aKF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93027aKF extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC91781a09 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93027aKF(String str, InterfaceC91781a09 interfaceC91781a09, int i, int i2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC91781a09;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C92099a5H.LIZJ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
