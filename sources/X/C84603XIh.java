package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84603XIh extends AbstractC65781Prl implements InterfaceC88472Yns<C8VH, C76800UCe> {
    public static final C84603XIh LJLIL = new C84603XIh();

    public C84603XIh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8VH c8vh) {
        C8VH subscribeTrackEvent = c8vh;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJ.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
