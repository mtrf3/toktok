package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetDropsStatusRequest_ProtoDecoder implements InterfaceC31105CIr<GetDropsStatusRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetDropsStatusRequest LIZ(Q9H q9h) {
        GetDropsStatusRequest getDropsStatusRequest = new GetDropsStatusRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getDropsStatusRequest.anchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getDropsStatusRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getDropsStatusRequest;
            }
        }
    }
}
