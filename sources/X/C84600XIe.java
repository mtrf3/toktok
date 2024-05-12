package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84600XIe extends AbstractC65781Prl implements InterfaceC88472Yns<C212888Xc, C76800UCe> {
    public static final C84600XIe LJLIL = new C84600XIe();

    public C84600XIe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C212888Xc c212888Xc) {
        C212888Xc subscribeTrackEvent = c212888Xc;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJFF.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
