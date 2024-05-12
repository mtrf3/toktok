package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetRealtimeLiveCenterOverviewRequest_ProtoDecoder implements InterfaceC31105CIr<GetRealtimeLiveCenterOverviewRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetRealtimeLiveCenterOverviewRequest LIZ(Q9H q9h) {
        GetRealtimeLiveCenterOverviewRequest getRealtimeLiveCenterOverviewRequest = new GetRealtimeLiveCenterOverviewRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            getRealtimeLiveCenterOverviewRequest.needLayout = q9h.LJIIJ();
                        }
                    } else {
                        getRealtimeLiveCenterOverviewRequest.needDetail = q9h.LJIIJ();
                    }
                } else {
                    getRealtimeLiveCenterOverviewRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getRealtimeLiveCenterOverviewRequest;
            }
        }
    }
}
