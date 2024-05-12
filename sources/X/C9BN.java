package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9BN, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BN extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C9BN LJLIL = new C9BN();

    public C9BN() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Integer> c43i) {
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            C26045AKb c26045AKb = new C26045AKb(selectSubscribe.getContainerView());
            c26045AKb.LJIIIIZZ(((Number) c43i2.LIZ).intValue());
            c26045AKb.LJIIJ();
            ((C9BP) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(C9BP.class), null)).r3();
        }
        return C76800UCe.LIZ;
    }
}
