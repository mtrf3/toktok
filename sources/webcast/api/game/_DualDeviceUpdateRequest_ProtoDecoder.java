package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _DualDeviceUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<DualDeviceUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final DualDeviceUpdateRequest LIZ(Q9H q9h) {
        DualDeviceUpdateRequest dualDeviceUpdateRequest = new DualDeviceUpdateRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            dualDeviceUpdateRequest.updateReason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dualDeviceUpdateRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    dualDeviceUpdateRequest.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return dualDeviceUpdateRequest;
            }
        }
    }
}
