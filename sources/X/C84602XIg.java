package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84602XIg extends AbstractC65781Prl implements InterfaceC88472Yns<C214318b5, C76800UCe> {
    public static final C84602XIg LJLIL = new C84602XIg();

    public C84602XIg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C214318b5 c214318b5) {
        C214318b5 subscribeTrackEvent = c214318b5;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJI.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
