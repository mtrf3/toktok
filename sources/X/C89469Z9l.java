package X;

/* renamed from: X.Z9l, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89469Z9l extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C89468Z9k LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89469Z9l(C89468Z9k c89468Z9k, long j, String str, String str2, String str3) {
        super(0);
        this.LJLIL = c89468Z9k;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83659WsR interfaceC83659WsR = this.LJLIL.LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LJIIIIZZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
