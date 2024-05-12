package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetRealtimeLiveCenterOverviewContainer_ProtoDecoder implements InterfaceC31105CIr<GetRealtimeLiveCenterOverviewContainer> {
    public static GetRealtimeLiveCenterOverviewContainer LIZIZ(Q9H q9h) {
        GetRealtimeLiveCenterOverviewContainer getRealtimeLiveCenterOverviewContainer = new GetRealtimeLiveCenterOverviewContainer();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getRealtimeLiveCenterOverviewContainer.detail = _RealtimeLiveCenterDetailData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getRealtimeLiveCenterOverviewContainer.layout = _RealtimeLiveCenterLayoutData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getRealtimeLiveCenterOverviewContainer;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetRealtimeLiveCenterOverviewContainer LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
