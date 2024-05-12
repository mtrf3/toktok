package X;

import java.util.List;

/* renamed from: X.aEa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92676aEa extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ List<Integer> LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJJLL;
    public final /* synthetic */ C31431Lf LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92676aEa(boolean z, boolean z2, InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC70422pa interfaceC70422pa, List<Integer> list, InterfaceC35811ar<Integer> interfaceC35811ar2, C31431Lf c31431Lf) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = list;
        this.LJLJJLL = interfaceC35811ar2;
        this.LJLJL = c31431Lf;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!this.LJLIL && this.LJLILLLLZI && this.LJLJI.getValue().intValue() != -1) {
            XKX.LIZLLL(this.LJLJJI, C78613UtF.LIZJ, null, new C93087aLD(this.LJLJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, null), 2);
        }
        return C76800UCe.LIZ;
    }
}
