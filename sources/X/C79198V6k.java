package X;

/* renamed from: X.V6k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79198V6k extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C32541Pm LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79198V6k(C32541Pm c32541Pm, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i2, int i3) {
        super(2);
        this.LJLIL = c32541Pm;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C79181V5t.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
