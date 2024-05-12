package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XId, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84599XId extends AbstractC65781Prl implements InterfaceC88472Yns<SZD, C76800UCe> {
    public static final C84599XId LJLIL = new C84599XId();

    public C84599XId() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZD szd) {
        SZD subscribeTrackEvent = szd;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJIIJJI.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
