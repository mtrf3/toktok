package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20E extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC12670ed, Boolean> {
    public static final C20E LJLIL = new C20E();

    public C20E() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC12670ed interfaceC12670ed) {
        boolean z;
        InterfaceC12670ed it = interfaceC12670ed;
        o.LJIIIZ(it, "it");
        if (it.LJI() == EnumC12660ec.PREVIEW_PAGE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
