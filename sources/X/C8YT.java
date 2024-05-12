package X;

import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8YT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YT extends AbstractC65781Prl implements InterfaceC88472Yns<C8YS, C76800UCe> {
    public static final C8YT LJLIL = new C8YT();

    public C8YT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8YS c8ys) {
        C8YS subscribeTrackEvent = c8ys;
        o.LJIIIZ(subscribeTrackEvent, "$this$subscribeTrackEvent");
        SZE.LIZLLL("assem_vm_subscribe_event", 1.0f, new AqS153S0100000_3(subscribeTrackEvent, 1756));
        return C76800UCe.LIZ;
    }
}
