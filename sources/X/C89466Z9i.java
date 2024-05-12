package X;

import java.util.List;

/* renamed from: X.Z9i, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89466Z9i extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C89468Z9k LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ List LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89466Z9i(C89468Z9k c89468Z9k, boolean z, float f, List list) {
        super(0);
        this.LJLIL = c89468Z9k;
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = list;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83659WsR interfaceC83659WsR = this.LJLIL.LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        }
        return C76800UCe.LIZ;
    }
}
