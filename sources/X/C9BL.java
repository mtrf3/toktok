package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9BL, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BL extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C9BL LJLIL = new C9BL();

    public C9BL() {
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
        }
        return C76800UCe.LIZ;
    }
}
