package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XIf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84601XIf extends AbstractC65781Prl implements InterfaceC88472Yns<C8YS, C76800UCe> {
    public static final C84601XIf LJLIL = new C84601XIf();

    public C84601XIf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8YS c8ys) {
        C8YS subscribeTrackEvent = c8ys;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        if (subscribeTrackEvent.LIZIZ) {
            long j = subscribeTrackEvent.LIZ;
            if (!XIW.LIZ.get()) {
                XIW.LJIIIIZZ.addAndGet(j);
            }
        }
        return C76800UCe.LIZ;
    }
}
