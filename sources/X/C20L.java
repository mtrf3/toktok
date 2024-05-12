package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20L extends AbstractC65781Prl implements InterfaceC88474Ynu<C1QK, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public static final C20L LJLIL = new C20L();

    public C20L() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(C1QK c1qk, Integer num, InterfaceC24520xk interfaceC24520xk, Integer num2) {
        int i;
        int i2;
        int i3;
        C1QK interval = c1qk;
        int intValue = num.intValue();
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue2 = num2.intValue();
        o.LJIIIZ(interval, "interval");
        if ((intValue2 & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(interval)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (interfaceC24520xk2.LJIIIZ(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 731) != 146 || !interfaceC24520xk2.LIZ()) {
            interval.LIZLLL.invoke(new InterfaceC11440ce() { // from class: X.1QQ
            }, Integer.valueOf(intValue), interfaceC24520xk2, Integer.valueOf((i & 112) | 6));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
