package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6J extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC10180ac, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public static final V6J LJLIL = new V6J();

    public V6J() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC10180ac items, Integer num, InterfaceC24520xk interfaceC24520xk, Integer num2) {
        int i;
        int intValue = num.intValue();
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue2 = num2.intValue();
        o.LJIIIZ(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            if (interfaceC24520xk2.LJIIIZ(intValue)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue2 |= i;
        }
        if ((intValue2 & 721) != 144 || !interfaceC24520xk2.LIZ()) {
            C21430sl.LIZIZ(String.valueOf(intValue), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC24520xk2, 0, 0, 65534);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
