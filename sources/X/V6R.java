package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6R extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC10180ac, InterfaceC24520xk, Integer, C76800UCe> {
    public static final V6R LJLIL = new V6R();

    public V6R() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC10180ac item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if ((intValue & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            C79057V0z.LJ(C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, 8), interfaceC24520xk2, 6);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
