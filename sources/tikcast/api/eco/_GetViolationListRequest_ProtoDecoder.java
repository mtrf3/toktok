package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetViolationListRequest_ProtoDecoder implements InterfaceC31105CIr<GetViolationListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetViolationListRequest LIZ(Q9H q9h) {
        GetViolationListRequest getViolationListRequest = new GetViolationListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            getViolationListRequest.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        getViolationListRequest.lastId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getViolationListRequest.violationListType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return getViolationListRequest;
            }
        }
    }
}
