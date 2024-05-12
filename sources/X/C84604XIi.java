package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84604XIi extends AbstractC65781Prl implements InterfaceC88472Yns<C55224Lls, C76800UCe> {
    public static final C84604XIi LJLIL = new C84604XIi();

    public C84604XIi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C55224Lls c55224Lls) {
        C55224Lls subscribeTrackEvent = c55224Lls;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJIIIZ.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
