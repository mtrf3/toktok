package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20F extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC12670ed, Boolean> {
    public static final C20F LJLIL = new C20F();

    public C20F() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC12670ed interfaceC12670ed) {
        boolean z;
        InterfaceC12670ed it = interfaceC12670ed;
        o.LJIIIZ(it, "it");
        if (it.LJI() == EnumC12660ec.PREVIEW_AND_VIDEO_BROADCAST_PAGE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}