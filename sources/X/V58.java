package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V58 extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC10180ac, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V58(InterfaceC07790Sh interfaceC07790Sh, float f) {
        super(3);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC10180ac item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if ((intValue & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            C79057V0z.LJ(C09290Yb.LJIIIIZZ(this.LJLIL, this.LJLILLLLZI), interfaceC24520xk2, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
