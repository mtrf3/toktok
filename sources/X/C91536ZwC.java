package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZwC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91536ZwC extends AbstractC65781Prl implements InterfaceC88472Yns<C91464Zv2, C91464Zv2> {
    public static final C91536ZwC LJLIL = new C91536ZwC();

    public C91536ZwC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C91464Zv2 invoke(C91464Zv2 setState) {
        o.LJIIIZ(setState, "$this$setState");
        EnumC91294ZsI status = EnumC91294ZsI.FAILED;
        C61878OQg powerItems = C61878OQg.INSTANCE;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(powerItems, "powerItems");
        return new C91464Zv2(status, powerItems);
    }
}
