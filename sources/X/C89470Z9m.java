package X;

/* renamed from: X.Z9m, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89470Z9m extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C89468Z9k LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89470Z9m(C89468Z9k c89468Z9k, int i, int i2) {
        super(0);
        this.LJLIL = c89468Z9k;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83659WsR interfaceC83659WsR = this.LJLIL.LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LIZ(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
