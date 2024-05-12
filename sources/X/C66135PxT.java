package X;

import com.bytedance.helios.sdk.signal.ClosureSignal;
import kotlin.jvm.internal.o;

/* renamed from: X.PxT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66135PxT implements InterfaceC66039Pvv {
    public static final C66135PxT LIZ = new C66135PxT();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLJI;
        if (i != 100400) {
            switch (i) {
                case 100404:
                    C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call stop end", C66132PxQ.LJ.LJIIJ(event)));
                    return;
                case 100405:
                    C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call release end", C66132PxQ.LJ.LJIIJ(event)));
                    return;
                default:
                    switch (i) {
                        case 100850:
                            C66150Pxi.LIZ.put("ar", event);
                            return;
                        case 100851:
                            C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call VEAudio close", 0L));
                            return;
                        case 100852:
                            C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call Tools-audio stop", 0L));
                            return;
                        case 100853:
                            C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call Tools-audio release", 0L));
                            return;
                        default:
                            return;
                    }
            }
        }
        long LJIIJ = C66132PxQ.LJ.LJIIJ(event);
        C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.AUDIO, new ClosureSignal("call audio start end", LJIIJ));
        ClosureSignal closureSignal = (ClosureSignal) event.LLIL.get("openSignal");
        if (closureSignal != null) {
            closureSignal.setTargetObjectHashCode(LJIIJ);
        }
        event.LLIL.put("openSignal", null);
    }
}
