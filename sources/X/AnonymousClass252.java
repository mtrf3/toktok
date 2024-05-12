package X;

import kotlin.jvm.internal.o;

/* renamed from: X.252, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass252 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC274115t, Integer, Integer> {
    public static final AnonymousClass252 LJLIL = new AnonymousClass252();

    public AnonymousClass252() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(InterfaceC274115t interfaceC274115t, Integer num) {
        InterfaceC274115t intrinsicMeasurable = interfaceC274115t;
        int intValue = num.intValue();
        o.LJIIIZ(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.LJJLJLI(intValue));
    }
}
