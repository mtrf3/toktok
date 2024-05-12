package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.4Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107734Kr extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C107734Kr LJLIL = new C107734Kr();

    public C107734Kr() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Integer> c43i) {
        Integer LIZ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null) {
            int intValue = LIZ.intValue();
            C26045AKb c26045AKb = new C26045AKb(selectSubscribe.getContainerView());
            c26045AKb.LJIIIIZZ(intValue);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
