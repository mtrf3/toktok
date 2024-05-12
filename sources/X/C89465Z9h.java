package X;

/* renamed from: X.Z9h, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89465Z9h extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C89468Z9k LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89465Z9h(C89468Z9k c89468Z9k, int i, float f, boolean z) {
        super(0);
        this.LJLIL = c89468Z9k;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83659WsR interfaceC83659WsR = this.LJLIL.LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LJIIIZ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
