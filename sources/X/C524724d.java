package X;

import kotlin.jvm.internal.o;

/* renamed from: X.24d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C524724d extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07150Pv<EnumC21820tO>, InterfaceC24520xk, Integer, C1J4<Float>> {
    public static final C524724d LJLIL = new C524724d();

    public C524724d() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C1J4<Float> invoke(InterfaceC07150Pv<EnumC21820tO> interfaceC07150Pv, InterfaceC24520xk interfaceC24520xk, Integer num) {
        C1J4<Float> c48361v6;
        InterfaceC07150Pv<EnumC21820tO> animateFloat = interfaceC07150Pv;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(animateFloat, "$this$animateFloat");
        interfaceC24520xk2.LJJIIJ(-1079955085);
        EnumC21820tO enumC21820tO = EnumC21820tO.Focused;
        EnumC21820tO enumC21820tO2 = EnumC21820tO.UnfocusedEmpty;
        boolean LIZ = animateFloat.LIZ(enumC21820tO, enumC21820tO2);
        C1J1 c1j1 = C1J1.LIZ;
        if (LIZ) {
            c48361v6 = C1JI.LJJIJIIJIL(67, 0, c1j1, 2);
        } else if (animateFloat.LIZ(enumC21820tO2, enumC21820tO) || animateFloat.LIZ(EnumC21820tO.UnfocusedNotEmpty, enumC21820tO2)) {
            c48361v6 = new C48361v6<>(83, 67, c1j1);
        } else {
            c48361v6 = C1JI.LJJIJIIJI(0.0f, 0.0f, null, 7);
        }
        interfaceC24520xk2.LJJIJIIJIL();
        return c48361v6;
    }
}
