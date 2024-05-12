package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EY3 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC65784Pro<? extends Integer>, InterfaceC88472Yns<? super Integer, ? extends C76800UCe>, C76800UCe> {
    public static final EY3 LJLIL = new EY3();

    public EY3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC65784Pro<? extends Integer> interfaceC65784Pro, InterfaceC88472Yns<? super Integer, ? extends C76800UCe> interfaceC88472Yns) {
        InterfaceC65784Pro<? extends Integer> get = interfaceC65784Pro;
        InterfaceC88472Yns<? super Integer, ? extends C76800UCe> set = interfaceC88472Yns;
        o.LJIIIZ(get, "get");
        o.LJIIIZ(set, "set");
        set.invoke(Integer.valueOf(Math.max(get.invoke().intValue() - 1, 0)));
        return C76800UCe.LIZ;
    }
}
