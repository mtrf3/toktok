package X;

import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public final class HMZ extends AbstractC65781Prl implements InterfaceC88472Yns<C43933HMb, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ HMY LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ n<Boolean> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HMZ(boolean z, HMY hmy, int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, n<Boolean> nVar) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = hmy;
        this.LJLJI = i;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = nVar;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C43933HMb c43933HMb) {
        C43933HMb info = c43933HMb;
        o.LJIIIZ(info, "info");
        if (this.LJLIL) {
            C45804HyK.LJJLIIIJJI(this.LJLILLLLZI.LIZ, info.LJLJJL, this.LJLJI, 0, 24);
        }
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(info.LJLJJL));
        }
        this.LJLJJL.LJ(Boolean.FALSE);
        return C76800UCe.LIZ;
    }
}
