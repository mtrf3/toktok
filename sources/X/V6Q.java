package X;

import java.util.List;

/* loaded from: classes14.dex */
public final class V6Q extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ List<A4Y> LJLILLLLZI;
    public final /* synthetic */ A4T LJLJI;
    public final /* synthetic */ InterfaceC07790Sh LJLJJI;
    public final /* synthetic */ V53 LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6Q(boolean z, List<A4Y> list, A4T a4t, InterfaceC07790Sh interfaceC07790Sh, V53 v53, int i, int i2) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = list;
        this.LJLJI = a4t;
        this.LJLJJI = interfaceC07790Sh;
        this.LJLJJL = v53;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5R.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
