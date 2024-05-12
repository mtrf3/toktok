package X;

/* renamed from: X.221, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass221 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass221(int i, int i2, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C15980jy.LIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
