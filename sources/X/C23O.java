package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C23O extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe>, InterfaceC24520xk, Integer, C76800UCe> {
    public static final C23O LJLIL = new C23O();

    public C23O() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, Integer num) {
        int i;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, ? extends C76800UCe> innerTextField = interfaceC88471Ynr;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(innerTextField, "innerTextField");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(innerTextField)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 91) != 18 || !interfaceC24520xk2.LIZ()) {
            innerTextField.invoke(interfaceC24520xk2, Integer.valueOf(intValue & 14));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
