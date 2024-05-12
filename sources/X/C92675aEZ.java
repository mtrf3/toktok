package X;

/* renamed from: X.aEZ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92675aEZ extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92675aEZ(boolean z, C92283a8F c92283a8F, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = c92283a8F;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91863a1T.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
        return C76800UCe.LIZ;
    }
}
