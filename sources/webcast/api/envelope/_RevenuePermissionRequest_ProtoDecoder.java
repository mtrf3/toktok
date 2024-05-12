package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RevenuePermissionRequest_ProtoDecoder implements InterfaceC31105CIr<RevenuePermissionRequest> {
    @Override // X.InterfaceC31105CIr
    public final RevenuePermissionRequest LIZ(Q9H q9h) {
        RevenuePermissionRequest revenuePermissionRequest = new RevenuePermissionRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            revenuePermissionRequest.secAnchorId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        revenuePermissionRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    revenuePermissionRequest.needBizs = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return revenuePermissionRequest;
            }
        }
    }
}
