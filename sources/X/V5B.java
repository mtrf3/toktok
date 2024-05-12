package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V5B extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final V5B LJLIL = new V5B();

    public V5B() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            String string = FKM.LIZJ().getString(R.string.qpw);
            o.LJIIIIZZ(string, "ApplicationHolder.resour…riesReviewHalfSheet_body)");
            C79053V0v.LIZIZ(string, null, C79212V6y.LIZ(interfaceC24520xk2).LJIIL(), C79212V6y.LIZIZ(interfaceC24520xk2).LJIIJJI, 0L, null, 0, false, 0, false, null, null, null, interfaceC24520xk2, 0, 0, 8178);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
