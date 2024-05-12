package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25A extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC274115t, Integer, Integer> {
    public static final C25A LJLIL = new C25A();

    public C25A() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(InterfaceC274115t interfaceC274115t, Integer num) {
        InterfaceC274115t intrinsicMeasurable = interfaceC274115t;
        int intValue = num.intValue();
        o.LJIIIZ(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.LJJLIIIJLLLLLLLZ(intValue));
    }
}
