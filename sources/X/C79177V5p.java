package X;

import kotlin.jvm.internal.AqS42S0301000_13;

/* renamed from: X.V5p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79177V5p extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC24760y8<C11850dJ> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<C23360vs, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC09420Yo LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<C0YY, InterfaceC24520xk, Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79177V5p(InterfaceC24760y8<C11850dJ> interfaceC24760y8, InterfaceC88472Yns<? super C23360vs, C76800UCe> interfaceC88472Yns, InterfaceC09420Yo interfaceC09420Yo, InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(2);
        this.LJLIL = interfaceC24760y8;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC09420Yo;
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            C24410xZ.LIZ(new C24620xu[]{C21610t3.LIZ.LIZIZ(Float.valueOf(C11850dJ.LIZLLL(this.LJLIL.getValue().LIZ)))}, C1DJ.LJ(interfaceC24520xk2, 1863250529, new AqS42S0301000_13(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, 1)), interfaceC24520xk2, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
