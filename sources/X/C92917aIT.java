package X;

/* renamed from: X.aIT, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92917aIT extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C92258a7q LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92917aIT(C92258a7q c92258a7q, String str, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.LJLIL = c92258a7q;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1);
        return C76800UCe.LIZ;
    }
}
