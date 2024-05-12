package X;

import com.bytedance.helios.sdk.signal.ClosureSignal;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PxS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66134PxS implements InterfaceC66039Pvv {
    public static final C66134PxS LIZ = new C66134PxS();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        switch (event.LJLJI) {
            case 100100:
                long LJIIJ = C66130PxO.LJ.LJIIJ(event);
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera open end", LJIIJ));
                ClosureSignal closureSignal = (ClosureSignal) event.LLIL.get("openSignal");
                if (closureSignal != null) {
                    closureSignal.setTargetObjectHashCode(LJIIJ);
                }
                event.LLIL.put("openSignal", null);
                return;
            case 100102:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call startPreview end", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100103:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call stopPreview end", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100106:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera release end", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100205:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera2 close end", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100206:
                long LJIIJ2 = C66130PxO.LJ.LJIIJ(event);
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera2 open end", LJIIJ2));
                ClosureSignal closureSignal2 = (ClosureSignal) event.LLIL.get("openSignal");
                if (closureSignal2 != null) {
                    closureSignal2.setTargetObjectHashCode(LJIIJ2);
                }
                event.LLIL.put("openSignal", null);
                return;
            case 100800:
                C66150Pxi.LIZ.put("cr", event);
                return;
            case 100801:
                ConcurrentHashMap<String, C66120PxE> concurrentHashMap = C66150Pxi.LIZ;
                C66120PxE c66120PxE = concurrentHashMap.get("cr");
                if (c66120PxE != null && c66120PxE.LJLJI == 100800) {
                    return;
                }
                concurrentHashMap.put("cr", event);
                return;
            case 100802:
                C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call VECamera close", 0L));
                return;
            case 100803:
                C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call TECamera disconnect", 0L));
                return;
            case 100804:
                C65985Pv3.LIZIZ(EnumC66029Pvl.CUSTOM_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call Tools-camera close", 0L));
                return;
            default:
                return;
        }
    }
}
