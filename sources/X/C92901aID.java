package X;

/* renamed from: X.aID, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92901aID extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC91996a3c LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92901aID(InterfaceC91996a3c interfaceC91996a3c, InterfaceC88472Yns<? super InterfaceC91996a3c, C76800UCe> interfaceC88472Yns, boolean z, int i, int i2) {
        super(2);
        this.LJLIL = interfaceC91996a3c;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91998a3e.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
