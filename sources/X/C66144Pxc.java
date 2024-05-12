package X;

import com.bytedance.helios.sdk.signal.ClosureSignal;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66144Pxc implements InterfaceC66039Pvv {
    public static final C66144Pxc LIZ = new C66144Pxc();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 0;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        switch (event.LJLJI) {
            case 100100:
                ClosureSignal closureSignal = new ClosureSignal("call camera open", 0L);
                event.LLIL.put("openSignal", closureSignal);
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, closureSignal);
                return;
            case 100101:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera release", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100102:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call startPreview", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100103:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call stopPreview", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100107:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS, EnumC65997PvF.CAMERA, new ClosureSignal("Camera system error", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100200:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera2 onOpened", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100201:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, new ClosureSignal("call camera2 close", C66130PxO.LJ.LJIIJ(event)));
                return;
            case 100206:
                ClosureSignal closureSignal2 = new ClosureSignal("call camera2 open", 0L);
                event.LLIL.put("openSignal", closureSignal2);
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS_METHOD, EnumC65997PvF.CAMERA, closureSignal2);
                return;
            case 100207:
                C65985Pv3.LIZIZ(EnumC66029Pvl.SYS, EnumC65997PvF.CAMERA, new ClosureSignal("Camera2 system error", C66130PxO.LJ.LJIIJ(event)));
                return;
            default:
                return;
        }
    }
}
