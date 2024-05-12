package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84597XIb extends AbstractC65781Prl implements InterfaceC88472Yns<SZD, C76800UCe> {
    public static final C84597XIb LJLIL = new C84597XIb();

    public C84597XIb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZD szd) {
        SZD subscribeTrackEvent = szd;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LIZLLL.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
