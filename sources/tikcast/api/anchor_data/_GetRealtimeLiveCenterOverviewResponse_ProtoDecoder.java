package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetRealtimeLiveCenterOverviewResponse_ProtoDecoder implements InterfaceC31105CIr<GetRealtimeLiveCenterOverviewResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetRealtimeLiveCenterOverviewResponse LIZ(Q9H q9h) {
        GetRealtimeLiveCenterOverviewResponse getRealtimeLiveCenterOverviewResponse = new GetRealtimeLiveCenterOverviewResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getRealtimeLiveCenterOverviewResponse.data = _GetRealtimeLiveCenterOverviewContainer_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getRealtimeLiveCenterOverviewResponse;
            }
        }
    }
}
