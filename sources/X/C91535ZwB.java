package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZwB, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91535ZwB extends AbstractC65781Prl implements InterfaceC88472Yns<C91464Zv2, C91464Zv2> {
    public static final C91535ZwB LJLIL = new C91535ZwB();

    public C91535ZwB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C91464Zv2 invoke(C91464Zv2 setState) {
        o.LJIIIZ(setState, "$this$setState");
        EnumC91294ZsI status = EnumC91294ZsI.LOADING;
        C61878OQg powerItems = C61878OQg.INSTANCE;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(powerItems, "powerItems");
        return new C91464Zv2(status, powerItems);
    }
}
