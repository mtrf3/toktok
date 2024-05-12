package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.717, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass717 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final AnonymousClass717 LJLIL = new AnonymousClass717();

    public AnonymousClass717() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        int LIZ = C7EP.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mutli panel set height last:");
        LIZ2.append(LIZ);
        LIZ2.append("  newHeight:");
        LIZ2.append(intValue);
        C71Y.LIZLLL("KeyboardMultiPanelAssem", X1D.LIZIZ(LIZ2));
        if (intValue > 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mutli panel change height ");
            LIZ3.append(intValue);
            C71Y.LIZLLL("KeyboardMultiPanelAssem", X1D.LIZIZ(LIZ3));
            C78886Uxe.LJJLIIIJ(intValue, selectSubscribe.getContainerView());
        }
        return C76800UCe.LIZ;
    }
}
