package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84596XIa extends AbstractC65781Prl implements InterfaceC88472Yns<SZD, C76800UCe> {
    public static final C84596XIa LJLIL = new C84596XIa();

    public C84596XIa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SZD szd) {
        SZD subscribeTrackEvent = szd;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJII.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
