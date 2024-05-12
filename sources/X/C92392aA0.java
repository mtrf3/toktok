package X;

import kotlin.jvm.internal.IDqS12S0101000_31;

/* renamed from: X.aA0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92392aA0 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C91672ZyO LJLIL;
    public final /* synthetic */ EnumC23500w6 LJLILLLLZI;
    public final /* synthetic */ C68322mC<C92121a5d> LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92392aA0(C91672ZyO c91672ZyO, EnumC23500w6 enumC23500w6, C68322mC<C92121a5d> c68322mC, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.LJLIL = c91672ZyO;
        this.LJLILLLLZI = enumC23500w6;
        this.LJLJI = c68322mC;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C24410xZ.LIZ(new C24620xu[]{C91667ZyJ.LIZ.LIZIZ(this.LJLIL), AnonymousClass057.LJIIJ.LIZIZ(this.LJLILLLLZI), C91674ZyQ.LIZ.LIZIZ(this.LJLJI.element), C23290vl.LIZ.LIZIZ(C92120a5c.LIZIZ)}, C1DJ.LJ(interfaceC24520xk2, -819894041, new IDqS12S0101000_31(this.LJLJJL, (InterfaceC88471Ynr) this.LJLJJI, 0)), interfaceC24520xk2, 56);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
