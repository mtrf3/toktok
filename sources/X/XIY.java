package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XIY extends AbstractC65781Prl implements InterfaceC88472Yns<XIJ, C76800UCe> {
    public static final XIY LJLIL = new XIY();

    public XIY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(XIJ xij) {
        XIJ subscribeTrackEvent = xij;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LIZJ.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
