package X;

/* renamed from: X.aBM, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92476aBM extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ EnumC91839a15 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92476aBM(EnumC91839a15 enumC91839a15, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = enumC91839a15;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91745ZzZ.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
