package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9BJ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BJ extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C9BJ LJLIL = new C9BJ();

    public C9BJ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Boolean> c43i) {
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                ((C9BK) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(C9BK.class), null)).LJJI();
            } else {
                ((C9BK) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(C9BK.class), null)).Gi();
            }
        }
        return C76800UCe.LIZ;
    }
}
