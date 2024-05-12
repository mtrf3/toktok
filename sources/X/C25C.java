package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25C extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC274115t, Integer, Integer> {
    public static final C25C LJLIL = new C25C();

    public C25C() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(InterfaceC274115t interfaceC274115t, Integer num) {
        InterfaceC274115t intrinsicMeasurable = interfaceC274115t;
        int intValue = num.intValue();
        o.LJIIIZ(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.LJJJI(intValue));
    }
}
