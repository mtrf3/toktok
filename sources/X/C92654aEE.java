package X;

/* renamed from: X.aEE, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92654aEE extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92654aEE(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL) {
            this.LJLILLLLZI.invoke();
        }
        return C76800UCe.LIZ;
    }
}
