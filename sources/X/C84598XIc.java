package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84598XIc extends AbstractC65781Prl implements InterfaceC88472Yns<SZD, C76800UCe> {
    public static final C84598XIc LJLIL = new C84598XIc();

    public C84598XIc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZD szd) {
        SZD subscribeTrackEvent = szd;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJIIJ.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
