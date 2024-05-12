package X;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: X.Jdi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49622Jdi extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC55235Lm3 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC80653En LJLJI;
    public final /* synthetic */ Class<T> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49622Jdi(InterfaceC55235Lm3 interfaceC55235Lm3, InterfaceC80653En interfaceC80653En, Class cls, String str) {
        super(0);
        this.LJLIL = interfaceC55235Lm3;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC80653En;
        this.LJLJJI = cls;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C55252LmK tree = this.LJLIL.getTree();
        String str = this.LJLILLLLZI;
        if (str == null) {
            str = "source_default_key";
        }
        tree.LIZIZ(str, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
