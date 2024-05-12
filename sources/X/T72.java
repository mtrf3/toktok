package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T72 extends AbstractC65781Prl implements InterfaceC88472Yns<C74117T6z, C74117T6z> {
    public static final T72 LJLIL = new T72();

    public T72() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C74117T6z invoke(C74117T6z setState) {
        o.LJIIIZ(setState, "$this$setState");
        EnumC74116T6y event = EnumC74116T6y.PUBLISH_SUCCEED;
        o.LJIIIZ(event, "event");
        return new C74117T6z(event);
    }
}
