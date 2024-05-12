package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20B extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Integer, InterfaceC88472Yns<? super AbstractC274515x, ? extends C76800UCe>, InterfaceC273515n> {
    public final /* synthetic */ InterfaceC516520z LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20B(InterfaceC516520z interfaceC516520z, long j, int i, int i2) {
        super(3);
        this.LJLIL = interfaceC516520z;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final InterfaceC273515n invoke(Integer num, Integer num2, InterfaceC88472Yns<? super AbstractC274515x, ? extends C76800UCe> interfaceC88472Yns) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        InterfaceC88472Yns<? super AbstractC274515x, ? extends C76800UCe> placement = interfaceC88472Yns;
        o.LJIIIZ(placement, "placement");
        return this.LJLIL.LJJLIL(C78555UsJ.LJIIJJI(intValue + this.LJLJI, this.LJLILLLLZI), C78555UsJ.LJIIJ(intValue2 + this.LJLJJI, this.LJLILLLLZI), C113554cx.LJJJLIIL(), placement);
    }
}
