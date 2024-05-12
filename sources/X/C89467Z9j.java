package X;

import java.util.List;

/* renamed from: X.Z9j, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89467Z9j extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C89468Z9k LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ List LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89467Z9j(C89468Z9k c89468Z9k, int i, boolean z, boolean z2, float f, List list) {
        super(0);
        this.LJLIL = c89468Z9k;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = f;
        this.LJLJJLL = list;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC83659WsR interfaceC83659WsR = this.LJLIL.LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LIZJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }
}
