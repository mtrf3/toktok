package X;

/* renamed from: X.aBl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92501aBl extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92501aBl(int i, int i2, String str, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        String str = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        C91736ZzQ.LIZ(this.LJLJJI | 1, this.LJLJJL, interfaceC24520xk, str, interfaceC65784Pro, z);
        return C76800UCe.LIZ;
    }
}
