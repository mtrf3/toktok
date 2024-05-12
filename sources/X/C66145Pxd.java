package X;

import com.bytedance.helios.sdk.signal.ClosureSignal;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66145Pxd implements InterfaceC66039Pvv {
    public static final C66145Pxd LIZ = new C66145Pxd();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 0;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        switch (event.LJLJI) {
            case 100400:
                ClosureSignal closureSignal = new ClosureSignal("call audio start", C66132PxQ.LJ.LJIIJ(event));
                event.LLIL.put("openSignal", closureSignal);
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, closureSignal);
                return;
            case 100401:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call stop", C66132PxQ.LJ.LJIIJ(event)));
                return;
            case 100402:
            default:
                return;
            case 100403:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call release", C66132PxQ.LJ.LJIIJ(event)));
                return;
        }
    }
}
